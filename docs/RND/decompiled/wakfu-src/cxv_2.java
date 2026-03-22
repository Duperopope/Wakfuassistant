/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXV
 */
class cxv_2
implements fig_2 {
    final /* synthetic */ cxu_2 nXu;

    cxv_2(cxu_2 cxu_22) {
        this.nXu = cxu_22;
    }

    @Override
    public fif_2 onDialogCloseRequest(String string2) {
        if (this.nXu.eXG()) {
            fiq_2.gCw().d(fik_2.a(string -> fyw_0.gqw().tl("havenWorldResourcesCollectorDialog")).l("question.seedSpreaderClose", new Object[0]).vG(ccp_2.mRM.byf()));
            return fif_2.uAy;
        }
        return fif_2.uAv;
    }
}

