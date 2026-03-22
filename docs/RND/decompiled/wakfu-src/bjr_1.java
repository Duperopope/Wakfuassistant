/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjr
 */
public class bjr_1 {
    public static final bjr_1 ioi = new bjr_1();
    private boolean ioj = false;

    private bjr_1() {
    }

    public void drn() {
        this.gm(true);
    }

    public boolean drf() {
        return !this.ioj && !bvk.dJZ().bgF();
    }

    public void gm(boolean bl) {
        this.ioj = bl;
        fse_1.gFu().f("guild.isLoading", bl);
    }

    public void bmX() {
        this.ioj = false;
        fse_1.gFu().f("guild.isLoading", false);
    }
}

