#!/usr/bin/env python3
"""
Wakfu Memory Analyzer v2.0

Analyse memory_monitor.jsonl + heap_profiler.jsonl
"""
import json, os, sys

MEM_PATH = "H:/Code/Wakfuassistant/agent/logs/memory_monitor.jsonl"
HEAP_PATH = "H:/Code/Wakfuassistant/agent/logs/heap_profiler.jsonl"

def load_jsonl(path):
    if not os.path.exists(path):
        return []
    samples = []
    with open(path, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line:
                try:
                    samples.append(json.loads(line))
                except json.JSONDecodeError:
                    pass
    return samples

def analyze_memory(samples):
    if not samples:
        print("[!!] Aucun sample memoire")
        return

    print(f"=== WAKFU MEMORY REPORT v2 ===")
    print(f"Samples: {len(samples)}")
    duration = samples[-1].get("uptime_s", 0)
    print(f"Duree: {duration}s ({duration // 60} min)")
    print()

    heaps = [s.get("heap_used_mb", 0) for s in samples]
    print("=== HEAP ===")
    print(f"  Min: {min(heaps)} MB")
    print(f"  Max: {max(heaps)} MB")
    print(f"  Moyenne: {sum(heaps) // len(heaps)} MB")
    print(f"  Debut: {heaps[0]} MB -> Fin: {heaps[-1]} MB")
    diff = heaps[-1] - heaps[0]
    status = "FUITE CONFIRMEE" if diff > 500 else "FUITE PROBABLE" if diff > 100 else "STABLE"
    print(f"  Delta: {diff:+d} MB ({status})")

    # Vitesse de fuite
    if duration > 0 and diff > 0:
        mb_per_min = (diff * 60) / duration
        print(f"  Vitesse: {mb_per_min:.1f} MB/min")
        if mb_per_min > 0:
            max_heap = max(s.get("heap_max_mb", 4096) for s in samples)
            remaining = max_heap - heaps[-1]
            if remaining > 0:
                mins_left = remaining / mb_per_min
                print(f"  Crash estime dans: {mins_left:.0f} min ({mins_left/60:.1f}h)")
    print()

    # GC
    freezes = [s for s in samples if s.get("gc_delta_time_ms", 0) > 100]
    print(f"=== GC FREEZES (>100ms) ===")
    print(f"  Total: {len(freezes)} sur {len(samples)} samples ({len(freezes)*100//len(samples)}%)")
    if freezes:
        times = [s.get("gc_delta_time_ms", 0) for s in freezes]
        print(f"  Min: {min(times)}ms | Max: {max(times)}ms | Moy: {sum(times)//len(times)}ms")
        print(f"  Top 5 pires:")
        freezes.sort(key=lambda s: -s.get("gc_delta_time_ms", 0))
        for s in freezes[:5]:
            print(f"    {s.get('ts', '?')} - {s['gc_delta_time_ms']}ms @ {s.get('heap_used_mb', '?')}MB ({s.get('heap_pct', '?')}%)")
    print()

    last = samples[-1]
    gc_total = last.get("gc_total_time_ms", 0)
    gc_pct = (gc_total / (duration * 1000)) * 100 if duration > 0 else 0
    print(f"=== GC GLOBAL ===")
    print(f"  Collections: {last.get('gc_total_count', 0)}")
    print(f"  Temps total: {gc_total}ms ({gc_total/1000:.1f}s)")
    print(f"  % temps en GC: {gc_pct:.2f}%")
    severity = "CRITIQUE" if gc_pct > 5 else "ATTENTION" if gc_pct > 2 else "OK"
    print(f"  Verdict: {severity}")
    print()

    # Threads
    threads = [s.get("threads", 0) for s in samples]
    print(f"=== THREADS ===")
    print(f"  Debut: {threads[0]} -> Fin: {threads[-1]} (delta: {threads[-1]-threads[0]:+d})")
    print(f"  Max: {max(threads)}")
    print()

    # Classes
    classes = [s.get("loaded_classes", 0) for s in samples]
    print(f"=== CLASSES ===")
    print(f"  Debut: {classes[0]} -> Fin: {classes[-1]} (delta: {classes[-1]-classes[0]:+d})")

def analyze_profiler(samples):
    if not samples:
        print()
        print("[!!] Pas de donnees heap_profiler.jsonl")
        print("     Relance avec le nouveau HeapProfilerAdvice")
        return

    print()
    print(f"=== HEAP PROFILER ({len(samples)} samples) ===")

    # Memory pools evolution
    first = samples[0]
    last = samples[-1]
    if "memory_pools" in last:
        print()
        print("=== MEMORY POOLS (dernier sample) ===")
        for pool in last["memory_pools"]:
            name = pool.get("name", "?")
            used = pool.get("used_mb", 0)
            mx = pool.get("max_mb", -1)
            bar = ""
            if mx > 0:
                pct = (used * 100) // mx
                bar = f" [{('#' * (pct // 5)):<20}] {pct}%"
            print(f"  {name}: {used} MB / {mx} MB{bar}")

    # Thread groups
    if "thread_groups" in last:
        print()
        print("=== THREAD GROUPS (dernier sample) ===")
        for group, count in sorted(last["thread_groups"].items(), key=lambda x: -x[1]):
            print(f"  {group}: {count}")

    # Alertes
    alerts = [s for s in samples if "alert" in s or "class_alert" in s]
    if alerts:
        print()
        print(f"=== ALERTES ({len(alerts)}) ===")
        for a in alerts[:10]:
            ts = a.get("ts", "?")
            alert = a.get("alert", "")
            calert = a.get("class_alert", "")
            msg = f"{alert} {calert}".strip()
            print(f"  {ts}: {msg}")

    # Heap growth par sample
    growths = [(s.get("ts", "?"), s.get("heap_delta_mb", 0)) for s in samples if s.get("heap_delta_mb", 0) > 50]
    if growths:
        print()
        print(f"=== PICS DE CROISSANCE HEAP (>50MB entre samples) ===")
        for ts, delta in sorted(growths, key=lambda x: -x[1])[:10]:
            print(f"  {ts}: +{delta} MB")

if __name__ == "__main__":
    mem_data = load_jsonl(MEM_PATH)
    heap_data = load_jsonl(HEAP_PATH)
    analyze_memory(mem_data)
    analyze_profiler(heap_data)
