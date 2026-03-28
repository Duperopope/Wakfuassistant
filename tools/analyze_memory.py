#!/usr/bin/env python3
"""
Wakfu Memory Analyzer v1.0

Lit memory_monitor.jsonl et genere un rapport:
- Evolution heap au fil du temps
- Detection des GC freezes (delta > 100ms)
- Tendance memoire (fuite ou stable)
- Correlation threads/classes/heap

Usage: python tools/analyze_memory.py
"""
import json, os, sys
from datetime import datetime

JSONL_PATH = "H:/Code/Wakfuassistant/agent/logs/memory_monitor.jsonl"

def load():
    if not os.path.exists(JSONL_PATH):
        print(f"[!!] Fichier non trouve: {JSONL_PATH}")
        print("Lance le jeu avec l agent, joue 30 min, puis relance ce script.")
        sys.exit(1)
    
    samples = []
    with open(JSONL_PATH, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line:
                try:
                    samples.append(json.loads(line))
                except json.JSONDecodeError:
                    pass
    return samples

def analyze(samples):
    if not samples:
        print("[!!] Aucun sample dans le fichier")
        return

    print(f"=== WAKFU MEMORY REPORT ===")
    print(f"Samples: {len(samples)}")
    print(f"Duree: {samples[-1].get('uptime_s', 0)}s ({samples[-1].get('uptime_s', 0)//60} min)")
    print()

    # Heap evolution
    heaps = [s.get("heap_used_mb", 0) for s in samples]
    print(f"=== HEAP ===")
    print(f"  Min: {min(heaps)} MB")
    print(f"  Max: {max(heaps)} MB")
    print(f"  Moyenne: {sum(heaps)//len(heaps)} MB")
    print(f"  Debut: {heaps[0]} MB")
    print(f"  Fin: {heaps[-1]} MB")
    diff = heaps[-1] - heaps[0]
    print(f"  Delta: {diff:+d} MB {'(FUITE PROBABLE)' if diff > 100 else '(stable)'}")
    print()

    # GC freezes
    freezes = [s for s in samples if s.get("gc_delta_time_ms", 0) > 100]
    print(f"=== GC FREEZES (>100ms) ===")
    print(f"  Total: {len(freezes)} sur {len(samples)} samples")
    if freezes:
        max_freeze = max(s.get("gc_delta_time_ms", 0) for s in freezes)
        avg_freeze = sum(s.get("gc_delta_time_ms", 0) for s in freezes) // len(freezes)
        print(f"  Max: {max_freeze}ms")
        print(f"  Moyenne: {avg_freeze}ms")
        print(f"  Pires moments:")
        freezes.sort(key=lambda s: -s.get("gc_delta_time_ms", 0))
        for s in freezes[:10]:
            print(f"    {s.get('ts', '?')} - {s.get('gc_delta_time_ms')}ms @ heap {s.get('heap_used_mb')}MB ({s.get('heap_pct')}%)")
    print()

    # Threads
    thread_counts = [s.get("threads", 0) for s in samples]
    print(f"=== THREADS ===")
    print(f"  Min: {min(thread_counts)}")
    print(f"  Max: {max(thread_counts)}")
    print(f"  Delta: {thread_counts[-1] - thread_counts[0]:+d}")
    print()

    # Classes
    class_counts = [s.get("loaded_classes", 0) for s in samples]
    print(f"=== CLASSES CHARGEES ===")
    print(f"  Debut: {class_counts[0]}")
    print(f"  Fin: {class_counts[-1]}")
    print(f"  Delta: {class_counts[-1] - class_counts[0]:+d}")
    print()

    # GC totaux
    last = samples[-1]
    print(f"=== GC GLOBAL ===")
    print(f"  Collections totales: {last.get('gc_total_count', 0)}")
    print(f"  Temps GC total: {last.get('gc_total_time_ms', 0)}ms")
    duration_s = last.get("uptime_s", 1)
    gc_pct = (last.get("gc_total_time_ms", 0) / (duration_s * 1000)) * 100 if duration_s > 0 else 0
    print(f"  % temps en GC: {gc_pct:.2f}%")
    if gc_pct > 5:
        print(f"  [!!] CRITIQUE: >5% du temps en GC")
    elif gc_pct > 2:
        print(f"  [!] ATTENTION: >2% du temps en GC")
    else:
        print(f"  [OK] GC raisonnable")

if __name__ == "__main__":
    data = load()
    analyze(data)
