/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTp
 */
class ctp_1
implements Runnable {
    private float ayP = 0.0f;
    private boolean nIO = true;
    final /* synthetic */ cto_1 nIP;

    ctp_1(cto_1 cto_12) {
        this.nIP = cto_12;
    }

    @Override
    public void run() {
        ahv_2 ahv_22 = new ahv_2();
        this.nIP.nIN.nIK = "1.0,1.0,1.0," + this.ayP;
        ahv_22.c(aum_0.cWf().c("videoLoading", new Object[0]));
        this.nIP.nIN.nIJ = ahv_22.ceL();
        fse_1.gFu().a((aef_2)this.nIP.nIN, "bufferingDesc", "modulationColor");
        if (this.nIO) {
            this.ayP += 0.04f;
            if (this.ayP >= 1.0f) {
                this.ayP = 1.0f;
                this.nIO = false;
            }
        } else {
            this.ayP -= 0.04f;
            if (this.ayP <= 0.0f) {
                this.ayP = 0.0f;
                this.nIO = true;
            }
        }
    }
}

