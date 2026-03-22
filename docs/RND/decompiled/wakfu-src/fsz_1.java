/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSZ
 */
public class fsz_1
extends fss_2 {
    private final int vfj;
    private final int vfk;
    private final int vfl;
    private final int vfm;
    private final int vfn;
    private final int vfo;
    private float azQ = 2.0f;

    public fsz_1(fes_2 fes_22, float f2, int n, int n2, abn abn2) {
        super(null, null, fes_22, n, n2, abn2);
        this.azQ = f2;
        this.vfj = fes_22.getScreenX() + fes_22.getWidth() / 2;
        this.vfk = fes_22.getScreenY() + fes_22.getHeight() / 2;
        this.vfl = fes_22.getWidth();
        this.vfm = fes_22.getHeight();
        this.vfo = (int)((float)this.vfm * this.azQ);
        this.vfn = (int)((float)this.vfl * this.azQ);
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        float f2 = this.tXJ.h(awx_2.dnF.aIU(), awx_2.dnC.aIU(), this.bUi, this.bMn);
        float f3 = this.tXJ.h(awx_2.dnF.aIV(), awx_2.dnC.aIV(), this.bUi, this.bMn);
        float f4 = this.tXJ.h(awx_2.dnF.aIW(), awx_2.dnC.aIW(), this.bUi, this.bMn);
        float f5 = this.tXJ.h(awx_2.dnF.aIX(), awx_2.dnC.aIX(), this.bUi, this.bMn);
        awx_2 awx_22 = new awx_2(f2, f3, f4, f5);
        ((fzc)((Object)this.ved)).setModulationColor(awx_22);
        int n2 = (int)this.tXJ.h(this.vfl, this.vfn, this.bUi, this.bMn);
        int n3 = (int)this.tXJ.h(this.vfm, this.vfo, this.bUi, this.bMn);
        int n4 = this.vfj - n2 / 2;
        int n5 = this.vfk - n3 / 2;
        ((fes_2)this.ved).setSize(n2, n3);
        ((fes_2)this.ved).setPosition(n4, n5);
        return true;
    }

    @Override
    public void cbz() {
        ((fzc)((Object)this.ved)).setModulationColor(awx_2.dnC);
        ((fes_2)this.ved).setSize(this.vfn, this.vfo);
        ((fes_2)this.ved).setPosition(this.vfj - this.vfn / 2, this.vfk - this.vfo / 2);
        super.cbz();
    }
}

