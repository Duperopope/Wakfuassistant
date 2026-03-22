/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

/*
 * Renamed from bQs
 */
class bqs_2
extends TimerTask {
    final /* synthetic */ bqr_2 kVv;

    bqs_2(bqr_2 bqr_22) {
        this.kVv = bqr_22;
    }

    @Override
    public void run() {
        boolean bl;
        boolean bl2 = bl = !aue_0.cVJ().c(cyr_2.eYA()) || cyr_2.eYA().eYE().ejg() != bqo_2.kUA;
        if (bl || this.kVv.kVk != bqw_2.kVD) {
            this.cancel();
            this.kVv.kVr = null;
            return;
        }
        fse_1.gFu().a((aef_2)this.kVv, "lastRefreshDelayText");
    }
}

