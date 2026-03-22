/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 */
import gnu.trove.map.hash.TObjectIntHashMap;

/*
 * Renamed from eyU
 */
public final class eyu_0 {
    private TObjectIntHashMap<fqS> poo;
    private TObjectIntHashMap<fqS> pop;

    public void a(int n, fqS fqS2) {
        if (this.poo == null) {
            this.poo = new TObjectIntHashMap();
        }
        this.poo.adjustOrPutValue((Object)fqS2, n, n);
    }

    public void b(int n, fqS fqS2) {
        if (this.pop == null) {
            this.pop = new TObjectIntHashMap();
        }
        this.pop.adjustOrPutValue((Object)fqS2, n, n);
    }

    public int a(fqS fqS2) {
        if (this.poo == null) {
            return 0;
        }
        return this.poo.get((Object)fqS2);
    }

    public int b(fqS fqS2) {
        if (this.pop == null) {
            return 0;
        }
        return this.pop.get((Object)fqS2);
    }

    public void clear() {
        this.poo = null;
        this.pop = null;
    }

    public int a(exx_2 exx_22, fqS fqS2) {
        if (exx_22 == exx_2.rGj) {
            return this.a(fqS2);
        }
        if (exx_22 == exx_2.rGq) {
            return this.b(fqS2);
        }
        return 0;
    }
}

