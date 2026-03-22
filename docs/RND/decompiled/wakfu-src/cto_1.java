/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTo
 */
class cto_1
implements ahz_2 {
    private final Runnable nIM = new ctp_1(this);
    final /* synthetic */ ctn_1 nIN;

    cto_1(ctn_1 ctn_12) {
        this.nIN = ctn_12;
    }

    @Override
    public void ceP() {
    }

    @Override
    public void ceQ() {
    }

    @Override
    public void ceR() {
    }

    @Override
    public void ej(float f2) {
        if (this.nIN.nII == f2) {
            return;
        }
        this.nIN.nII = f2;
        if (this.nIN.nII == 0.0f) {
            abg_2.bUP().a(this.nIM, 50L);
        } else if (this.nIN.nII == 100.0f) {
            abg_2.bUP().h(this.nIM);
            fse_1.gFu().a((aef_2)this.nIN, "bufferingDesc");
        }
    }
}

