/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntIntProcedure;

/*
 * Renamed from fcn
 */
public class fcn_0 {
    private final faz_0 rTu;
    private final short rTv;
    final TIntIntHashMap rTw = new TIntIntHashMap();

    public fcn_0(faz_0 faz_02, short s) {
        this.rTu = faz_02;
        this.rTv = s;
        this.bot();
    }

    private void bot() {
        fbk_0 fbk_02 = fbw_0.rSQ.eE(this.rTv);
        fby_0 fby_02 = fbw_0.rSQ.eG(fbk_02.coj());
        fby_02.V(new fco_0(this));
    }

    int b(fbl_0 fbl_02) {
        return GC.a(0, fbl_02.oP() - this.rTu.TN(fbl_02.coB()), new int[0]);
    }

    public boolean b(TIntIntProcedure tIntIntProcedure) {
        return this.rTw.forEachEntry(tIntIntProcedure);
    }

    public boolean fSw() {
        return !this.rTw.isEmpty();
    }
}

