/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fds
 */
public class fds_0
extends fdz_0 {
    private final TIntObjectHashMap<fdt_0> rVZ;
    private final ewV rWa;
    private final boolean rWb;

    public fds_0(int n, int n2, eIx eIx2, int n3, byte by, int n4) {
        this(n, n2, eIx2, n3, by, n4, false);
    }

    public fds_0(int n, int n2, eIx eIx2, int n3, byte by, int n4, boolean bl) {
        super(n, n2, eIx2, n3);
        this.rWa = ewV.ez(by);
        this.rVZ = new TIntObjectHashMap(n4, 1.0f);
        this.rWb = bl;
    }

    public void c(fdt_0 fdt_02) {
        int n = fdt_02.d();
        if (this.rVZ.contains(n)) {
            throw new IllegalArgumentException("La d\u00e9finition de l'\u00e9change " + String.valueOf(fdt_02) + " est d\u00e9j\u00e0 enregistr\u00e9e");
        }
        this.rVZ.put(n, (Object)fdt_02);
    }

    public fdt_0 Uj(int n) {
        return (fdt_0)this.rVZ.get(n);
    }

    public boolean W(TObjectProcedure<fdt_0> tObjectProcedure) {
        return this.rVZ.forEachValue(tObjectProcedure);
    }

    public ewV fTv() {
        return this.rWa;
    }

    public boolean fTw() {
        return !this.rWb;
    }

    public String toString() {
        return "IEExchangeParameter{m_id=" + this.d() + "}";
    }
}

