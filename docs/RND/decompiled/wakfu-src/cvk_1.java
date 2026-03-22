/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVK
 */
class cvk_1
implements alx_2 {
    final /* synthetic */ cvj_2 nQx;

    cvk_1(cvj_2 cvj_22) {
        this.nQx = cvj_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("interactiveDialogDialog")) {
            if (this.nQx.nQs != null) {
                cjq_0 cjq_02 = new cjq_0();
                cjq_02.KU(this.nQx.nQs.dye());
                aue_0.cVJ().etu().d(cjq_02);
            }
            aue_0.cVJ().b(cvj_2.eUG());
        }
    }
}

