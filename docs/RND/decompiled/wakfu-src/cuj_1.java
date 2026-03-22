/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUJ
 */
public class cuj_1
extends crs_2 {
    private static final cuj_1 nNr = new cuj_1();
    private ffV iWZ = null;
    private byte lVI;
    private bmx_0 efs = null;

    private cuj_1() {
        this.nDR = aka_0.ciQ();
        ((aIs)aie_0.cfn().bmC()).a((aka_0)this.nDR);
    }

    public static cuj_1 eSQ() {
        return nNr;
    }

    public void k(bmx_0 bmx_02) {
        this.efs = bmx_02;
    }

    public bmx_0 eSR() {
        return this.efs;
    }

    public void h(ffV ffV2, byte by) {
        this.iWZ = ffV2;
        this.lVI = by;
    }

    public ffV getItem() {
        return this.iWZ;
    }

    @Override
    protected Qk bbf() {
        return this.iWZ;
    }

    @Override
    protected void ad(int n, int n2, short s) {
        ckj_0 ckj_02 = new ckj_0();
        ckj_02.eY(this.htx.Sn());
        ckj_02.mZ(this.iWZ.LV());
        ckj_02.dh(this.lVI);
        ckj_02.nf(this.efs.LV());
        ckj_02.aa(n, n2, s);
        aue_0.cVJ().etu().d(ckj_02);
    }

    @Override
    protected void eMY() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.htx == bgt_02) {
            bgt_02.c(this.iWZ);
            bgt_02.a(this.efs);
        }
    }

    @Override
    protected String eNc() {
        if (this.iWZ != null) {
            return (String)this.iWZ.eu("smallIconUrl");
        }
        return null;
    }

    @Override
    protected byte eMZ() {
        return 2;
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
        if (this.iWZ != null && this.htx != null) {
            ((aka_0)this.nDR).a(this.iWZ, this.htx);
        }
    }

    @Override
    protected String eNb() {
        return "";
    }

    @Override
    public boolean eNm() {
        return bms_0.g(this.efs) || bms_0.g(this.iWZ);
    }
}

