/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCt
 */
class bct_0
implements adi_0<bcs_0> {
    final /* synthetic */ bcs_0 jHz;

    bct_0(bcs_0 bcs_02) {
        this.jHz = bcs_02;
    }

    @Override
    public void a(bcs_0 bcs_02, boolean bl, boolean bl2) {
        if (!bcs_02.isVisible() || !bcs_02.isSelectable()) {
            return;
        }
        if (bl2) {
            aIp.c(bcs_02);
            return;
        }
        if (bl) {
            if (this.jHz.jHu) {
                bcs_02.dQl();
            }
            if (this.jHz.bqs()) {
                aIp.b(bcs_02);
            }
        } else {
            cxq_1.eWO().a(bcs_02);
            aIp.d(bcs_02);
        }
    }
}

