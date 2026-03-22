/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

/*
 * Renamed from bQu
 */
class bqu_2
extends TimerTask {
    final /* synthetic */ String kVx;
    final /* synthetic */ bqr_2 kVy;

    bqu_2(bqr_2 bqr_22, String string) {
        this.kVy = bqr_22;
        this.kVx = string;
    }

    @Override
    public void run() {
        if (this.kVy.kVu == null) {
            return;
        }
        if (!this.kVy.kVu.equals(this.kVx)) {
            return;
        }
        this.kVy.kVu = null;
        fse_1.gFu().a((aef_2)this.kVy, "notificationMessage");
    }
}

