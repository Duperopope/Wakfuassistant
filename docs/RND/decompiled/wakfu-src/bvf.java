/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

public class bvf {
    public static final bvf jrC = new bvf();
    private ezu_1 iod;
    private final TIntObjectHashMap<buT> jrD = new TIntObjectHashMap();

    private bvf() {
    }

    public void bkZ() {
        bjo_1 bjo_12 = (bjo_1)aue_0.cVJ().cVK().dpI();
        this.iod = bjo_12.drl();
        this.dJU();
    }

    public void clean() {
        this.jrD.forEachValue((TObjectProcedure)new bvg(this));
        this.jrD.clear();
    }

    private void dJU() {
        for (ezn ezn2 : ezn.values()) {
            eyr_2 eyr_22 = ezn2.fmw();
            this.jrD.put(eyr_22.d(), (Object)new buT(eyr_22));
        }
    }

    @Nullable
    public buT FD(int n) {
        return (buT)this.jrD.get(n);
    }

    public boolean r(TObjectProcedure<buT> tObjectProcedure) {
        return this.jrD.forEachValue(tObjectProcedure);
    }
}

