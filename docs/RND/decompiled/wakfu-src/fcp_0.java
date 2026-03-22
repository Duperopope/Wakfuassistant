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
 * Renamed from fcp
 */
public class fcp_0 {
    private final fsm_0 rTy;
    private final short rTz;
    final TIntIntHashMap rTA = new TIntIntHashMap();

    public fcp_0(fsm_0 fsm_02, short s) {
        this.rTy = fsm_02;
        this.rTz = s;
        this.bot();
    }

    private void bot() {
        fbk_0 fbk_02 = fbw_0.rSQ.eE(this.rTz);
        fby_0 fby_02 = fbw_0.rSQ.eG(fbk_02.coj());
        fby_02.V(new fcq_0(this));
    }

    int b(fbl_0 fbl_02) {
        fch_0 fch_02 = new fch_0(fbl_02.coB());
        this.rTy.O(fch_02);
        return GC.a(0, fbl_02.oP() - fch_02.eEl(), new int[0]);
    }

    public boolean b(TIntIntProcedure tIntIntProcedure) {
        return this.rTA.forEachEntry(tIntIntProcedure);
    }

    public boolean fSw() {
        return !this.rTA.isEmpty();
    }
}

