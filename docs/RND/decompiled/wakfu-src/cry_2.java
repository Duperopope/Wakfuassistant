/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRY
 */
class cry_2
extends fmz_1 {
    final /* synthetic */ crx_2 nEu;

    cry_2(crx_2 crx_22) {
        this.nEu = crx_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() == null || !(fiq_12.gBE() instanceof fes_2)) {
            return true;
        }
        fes_2 fes_22 = (fes_2)fiq_12.gBE();
        if (fes_22 == fbj_1.getInstance() || fes_22 != null && fes_22.isNonBlocking()) {
            return true;
        }
        if (fes_22 != null && fes_22.isChildOf("chatWindow")) {
            return false;
        }
        aue_0.cVJ().b(this.nEu);
        return false;
    }
}

