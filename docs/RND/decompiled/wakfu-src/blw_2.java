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
 * Renamed from bLw
 */
public class blw_2 {
    public static final blw_2 kta = new blw_2();
    private final TIntObjectHashMap<blv_2> ktb = new TIntObjectHashMap();

    private blw_2() {
    }

    public void a(blv_2 blv_22) {
        this.ktb.put(blv_22.d(), (Object)blv_22);
    }

    public blv_2 HV(int n) {
        return (blv_2)this.ktb.get(n);
    }

    public boolean v(TObjectProcedure<blv_2> tObjectProcedure) {
        return this.ktb.forEachValue(tObjectProcedure);
    }

    public int aVo() {
        return this.ktb.size();
    }

    public String toString() {
        return "SecretManager{m_secrets=" + String.valueOf(this.ktb) + "}";
    }
}

