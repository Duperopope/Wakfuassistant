/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSW
 */
public class fsw_1 {
    fbt_1 vff;
    final fbt_1 vfg;

    public static void W(fbt_1 fbt_12) {
        fsw_1 fsw_12 = new fsw_1(fbt_12);
        fsw_12.run();
    }

    private fsw_1(fbt_1 fbt_12) {
        this.vff = fbt_12;
        this.vfg = (fbt_1)fbt_12.gAK();
        this.vfg.setNonBlocking(true);
        this.vfg.setDisplaySize(null);
        this.vfg.setScaled(true);
        this.vfg.setElementMap(null);
        this.vfg.setId(null);
        fbj_1.getInstance().getLayeredContainer().d(this.vfg, 30000);
    }

    private void run() {
        int n = this.vff.getScreenX();
        int n2 = this.vff.getScreenY();
        this.vfg.setPosition(n, n2);
        fsz_1 fsz_12 = new fsz_1(this.vfg, 3.0f, 0, 250, abn.cdp);
        fsz_12.pp(false);
        fsz_12.acd(8);
        this.vfg.a(fsz_12);
        fsz_12.a(new fsx_1(this));
    }

    void bmX() {
        this.vfg.setVisible(false);
        abg_2.bUP().a((Runnable)new fsy_1(this), 250L, 1);
    }
}

