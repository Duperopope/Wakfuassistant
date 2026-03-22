/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bhr
 */
class bhr_0
implements Runnable {
    final /* synthetic */ bbu_2 igr;
    final /* synthetic */ bhp_0 igs;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bhr_0(bhp_0 bhp_02, bbu_2 bbu_22) {
        this.igs = bhp_02;
        this.igr = bbu_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        ArrayList<Runnable> arrayList = this.igs.igp;
        synchronized (arrayList) {
            if (this.igs.dov()) {
                this.igs.h(this.igr);
            } else {
                cwz_1.eWv().a(new bhs_0(this));
            }
            this.igs.igp.remove(this);
        }
    }
}

