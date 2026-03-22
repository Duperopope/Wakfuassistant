/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUD
 */
public class cud_1
extends crs_2 {
    private static final cud_1 nMZ = new cud_1();
    private ffV iWZ = null;
    private byte lVI;

    private cud_1() {
        this.nDR = aka_0.ciQ();
        ((aIs)aie_0.cfn().bmC()).a((aka_0)this.nDR);
    }

    public static cud_1 eSz() {
        return nMZ;
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
        ckC ckC2 = new ckC();
        ckC2.eY(this.htx.Sn());
        ckC2.mZ(this.iWZ.LV());
        ckC2.dh(this.lVI);
        ckC2.aa(n, n2, s);
        aue_0.cVJ().etu().d(ckC2);
    }

    @Override
    protected void eMY() {
        if (this.htx == aue_0.cVJ().cVK()) {
            aue_0.cVJ().cVK().c(this.iWZ);
        }
    }

    @Override
    protected String eNc() {
        if (this.iWZ != null) {
            return (String)this.iWZ.eu("iconUrl");
        }
        return null;
    }

    @Override
    protected byte eMZ() {
        return 0;
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
        return bms_0.g(this.iWZ);
    }
}

