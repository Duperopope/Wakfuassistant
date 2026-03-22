/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from fsy
 */
public abstract class fsy_0<B extends fsx_0> {
    private final TIntObjectHashMap<B> tdK = new TIntObjectHashMap();
    private boolean ciW;

    public void dJ(String string) {
        apl_1 apl_12 = apl_1.dw(fo_0.by(string));
        int n = apl_12.aIA();
        for (int i = 0; i < n; ++i) {
            int n2 = apl_12.aIA();
            B b2 = this.Kk(n2);
            ((fsx_0)b2).r(apl_12);
            this.tdK.put(n2, b2);
        }
        this.ciW = true;
    }

    protected abstract B Kk(int var1);

    public B aag(int n) {
        return (B)((fsx_0)this.tdK.get(n));
    }

    public boolean bgF() {
        return this.ciW;
    }
}

