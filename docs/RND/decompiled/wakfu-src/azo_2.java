/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  gnu.trove.list.linked.TLinkedList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.list.TLinkable;
import gnu.trove.list.linked.TLinkedList;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from azo
 */
public class azo_2<V> {
    private final TLinkedList<azp_2<V>> dvo = new TLinkedList();
    private final TIntObjectHashMap<azp_2<V>> dvp = new TIntObjectHashMap();
    private int duV;
    private int dvq;
    private int dvr;
    private int dvs;

    public azo_2(int n) {
        this.duV = n;
        this.dvq = 0;
    }

    public void b(int n, V v) {
        azp_2 azp_22 = (azp_2)this.dvp.get(n);
        if (azp_22 == null) {
            azp_22 = new azp_2(n, v);
            this.dvo.addFirst(azp_22);
            this.dvp.put(n, azp_22);
            ++this.dvq;
            if (this.dvq > this.duV) {
                azp_22 = (azp_2)this.dvo.removeLast();
                this.dvp.remove(azp_22.dvt);
                --this.dvq;
            }
        } else {
            this.dvo.remove((Object)azp_22);
            this.dvo.addFirst(azp_22);
            azp_22.dvu = v;
        }
    }

    public void ux(int n) {
        azp_2 azp_22 = (azp_2)this.dvp.get(n);
        if (azp_22 != null) {
            this.dvp.remove(n);
            this.dvo.remove((Object)azp_22);
            --this.dvq;
        }
    }

    public V vK(int n) {
        azp_2 azp_22 = (azp_2)this.dvp.get(n);
        if (azp_22 != null) {
            this.dvo.remove((Object)azp_22);
            this.dvo.addFirst((TLinkable)azp_22);
            ++this.dvr;
            return azp_22.dvu;
        }
        ++this.dvs;
        return null;
    }

    public int aVo() {
        return this.dvq;
    }

    public void clear() {
        this.dvq = 0;
        this.dvp.clear();
        this.dvo.clear();
    }

    public int bTt() {
        return this.dvr;
    }

    public int bTu() {
        return this.dvs;
    }

    public void vP(int n) {
        this.duV = n;
    }

    public int bTv() {
        return this.duV;
    }

    public int bTw() {
        return this.dvo.size() * 100 / this.duV;
    }
}

