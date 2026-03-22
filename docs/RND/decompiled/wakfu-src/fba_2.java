/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBA
 */
public class fba_2
extends fbb_2<ffs_1> {
    public static final String TAG = "MapNavigator";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    protected void setMeshCenter() {
        ((ffs_1)this.tUj).aE(this.tUf, this.tUg);
    }

    @Override
    protected void gti() {
        super.gti();
        this.tUr = true;
    }

    @Override
    protected void gtj() {
        this.tUk.L(this.aXn, this.tUf, this.tUg);
        this.tUr = true;
        this.tUs = false;
    }

    @Override
    public void setMapRect(int n, int n2, int n3, int n4) {
        super.setMapRect(n, n2, n3, n4);
        this.setMeshCenter();
    }

    @Override
    protected void gtk() {
        ((ffs_1)this.tUj).setSize(this.ukt.width, this.ukt.height);
        super.gtk();
    }

    @Override
    public void aVI() {
        super.aVI();
        fzb fzb2 = new fzb();
        fzb2.aVI();
        fzb2.setWidget(this);
        this.d(fzb2);
        this.tUj = new ffs_1();
        ((ffs_1)this.tUj).aVI();
        ((ffs_1)this.tUj).z(new awx_2(awx_2.dnF));
        this.tUk = new ffj_2<ffs_1>((ffs_1)this.tUj);
        this.tUt = false;
        this.tSd = false;
        this.tTP = false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tUv.clear();
        this.tUk.clear();
        this.tUk = null;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.tSd) {
            return bl;
        }
        if (this.tUt) {
            this.gtm();
        }
        this.tUk.qy(n);
        if (this.tUs) {
            this.gtj();
        }
        if (this.tUr) {
            this.gtr();
        }
        float f2 = this.getIsoCenterX();
        float f3 = this.getIsoCenterY();
        float f4 = this.getIsoCenterZ();
        float f5 = (f2 - f3) * 86.0f / 2.0f;
        float f6 = -(f2 + f3) * 43.0f / 2.0f + f4 * 10.0f;
        ((ffs_1)this.tUj).bK(f5, f6);
        return true;
    }
}

