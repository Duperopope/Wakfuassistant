/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fgU
 */
public class fgu_0
implements fgr_0 {
    private fgW smd;
    private boolean mhw;

    public fgu_0(fgW fgW2) {
        this.smd = fgW2;
    }

    public fgu_0(fgW fgW2, boolean bl) {
        this.smd = fgW2;
        this.mhw = bl;
    }

    @Override
    public fgW fXu() {
        return this.smd;
    }

    @Override
    public void a(ve_1 ve_12) {
        ve_12.Us = this.smd.aJr();
        ve_12.afO = this.mhw;
    }

    @Override
    public void b(ve_1 ve_12) {
        this.smd = fgW.go(ve_12.Us);
        this.mhw = ve_12.afO;
    }

    @Override
    public void boS() {
        this.mhw = true;
    }

    @Override
    public boolean eBm() {
        return this.mhw || this.smd.fXw();
    }

    @Override
    public fgr_0 fXv() {
        return new fgu_0(this.smd, this.mhw);
    }

    @Override
    public boolean b(fgr_0 fgr_02) {
        return fgr_02 != null && fgr_02.fXu() == this.smd && fgr_02.eBm() == this.mhw;
    }
}

