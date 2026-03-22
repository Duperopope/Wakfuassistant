/*
 * Decompiled with CFR 0.152.
 */
final class cgh
extends ceK<cqm_0, bsi_0> {
    cgh() {
    }

    public boolean a(cqm_0 cqm_02) {
        int n = cqm_02.bha();
        if (cgj.lTp.lTq.contains(n)) {
            if (cgj.lTp.lTr.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTr.get(n));
            }
            if (cgj.lTp.lTv.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTv.get(n));
            }
            if (cgj.lTp.lTs.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTs.get(n));
            }
            if (cgj.lTp.lTw.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTw.get(n));
            }
            if (cgj.lTp.lTx.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTx.get(n));
            }
            if (cgj.lTp.lTt.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTt.get(n));
            }
            if (cgj.lTp.lTu.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTu.get(n));
            }
            if (cgj.lTp.lTy.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTy.get(n));
            }
            if (cgj.lTp.lTz.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTz.get(n));
            }
            if (cgj.lTp.lTB.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTB.get(n));
            }
            if (cgj.lTp.lTC.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTC.get(n));
            }
            if (cgj.lTp.lTA.get(n) != null) {
                aVi.cWF().a(n, (aft_2)cgj.lTp.lTA.get(n));
            }
        } else {
            return true;
        }
        aeb_2.a(cgj.lTp.lTq, n);
        cgj.lTp.lTr.remove(n);
        cgj.lTp.lTs.remove(n);
        cgj.lTp.lTt.remove(n);
        cgj.lTp.lTu.remove(n);
        cgj.lTp.lTv.remove(n);
        cgj.lTp.lTw.remove(n);
        cgj.lTp.lTA.remove(n);
        cgj.lTp.lTx.remove(n);
        cgj.lTp.lTy.remove(n);
        cgj.lTp.lTz.remove(n);
        cgj.lTp.lTB.remove(n);
        cgj.lTp.lTC.remove(n);
        bsS bsS2 = bsU.dHk().Ft(n);
        aVi.cWF().m(bsS2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqm_0)aam_22);
    }
}

