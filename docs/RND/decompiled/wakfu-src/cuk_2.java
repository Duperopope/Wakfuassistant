/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUK
 */
public class cuk_2
extends crs_2 {
    private static final cuk_2 nNs = new cuk_2();
    private bmx_0 efs = null;

    private cuk_2() {
        this.nDR = akg_0.ciW();
        ((aIs)aie_0.cfn().bmC()).a((akg_0)this.nDR);
    }

    public static cuk_2 eSS() {
        return nNs;
    }

    public void k(bmx_0 bmx_02) {
        this.efs = bmx_02;
    }

    public bmx_0 eSR() {
        return this.efs;
    }

    @Override
    protected Qk bbf() {
        return this.efs;
    }

    @Override
    protected void ad(int n, int n2, short s) {
        ckK ckK2 = new ckK();
        ckK2.eY(this.htx.Sn());
        ckK2.nf(this.efs.LV());
        ckK2.aa(n, n2, s);
        aue_0.cVJ().etu().d(ckK2);
    }

    @Override
    protected void eMY() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.htx == bgt_02) {
            bgt_02.a(this.efs);
        }
    }

    @Override
    @Nullable
    protected String eNb() {
        if (this.htx == null) {
            return "";
        }
        bsj_0 bsj_02 = this.htx.dkZ();
        if (bsj_02 == null) {
            return "";
        }
        bgy bgy2 = (bgy)bsj_02.ax(cub_1.eSi().eSj());
        if (bgy2 == null) {
            return "";
        }
        if (this.efs == null) {
            return "";
        }
        if (!bms_0.f(this.efs)) {
            return "";
        }
        float f2 = bgy2.fhi();
        if (f2 >= 1.0f) {
            return aum_0.cWf().c("desc.healRes", (int)f2);
        }
        return "";
    }

    @Override
    protected String eNc() {
        if (this.efs != null) {
            return (String)this.efs.eu("smallIconUrl");
        }
        return null;
    }

    @Override
    protected byte eMZ() {
        return 1;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void eNa() {
        super.eNa();
        if (this.efs != null && this.htx != null) {
            ((akg_0)this.nDR).a(this.efs, this.htx);
        }
    }

    @Override
    public boolean eNm() {
        return bms_0.g(this.efs);
    }
}

