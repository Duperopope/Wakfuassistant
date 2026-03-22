/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVs
 */
class cvs_1
implements fig_2 {
    cvs_1(cvr_1 cvr_12) {
    }

    @Override
    public fif_2 onDialogCloseRequest(String string2) {
        if (!cvr_1.eTM().eTN().aJG()) {
            fiq_2.gCw().d(fik_2.a(string -> fyw_0.gqw().tl("havenWorldResourcesCollectorDialog")).l("question.havenWorldResourcesCollectorClose", new Object[0]).vG(ccp_2.mRM.byf()));
            return fif_2.uAy;
        }
        return fif_2.uAv;
    }
}

