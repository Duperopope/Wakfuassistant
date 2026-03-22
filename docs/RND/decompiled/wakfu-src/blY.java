/*
 * Decompiled with CFR 0.152.
 */
public class blY
extends bnx_1 {
    private int iyg = 0;
    private boolean iyh = false;

    @Override
    public int duZ() {
        return this.iyg;
    }

    public void DN(int n) {
        this.iyg = n;
    }

    @Override
    public boolean dva() {
        return this.iyh;
    }

    public void gx(boolean bl) {
        this.iyh = bl;
    }

    @Override
    protected void dvb() {
        if (this.iyg != 0) {
            this.a((fhc_0)fgD.fXh().Vd(this.iyg), true);
        }
        super.dvb();
    }

    public void ad(bhJ bhJ2) {
        this.a(bhJ2, new fhk(), new ffS[0]);
        this.dvb();
        fse_1.gFu().a((aef_2)this, kDd);
    }

    @Override
    protected void a(ffV ffV2, fhy_0 fhy_02) {
    }

    @Override
    protected void b(ffS ffS2, ffV ffV2) {
    }
}

