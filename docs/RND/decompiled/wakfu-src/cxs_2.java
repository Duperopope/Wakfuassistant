/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXS
 */
public class cxs_2
extends crx_2 {
    public static final cxs_2 nXl = new cxs_2();

    @Override
    protected void eNv() {
    }

    @Override
    public void eNy() {
    }

    @Override
    protected void ae(acd_1 acd_12) {
        this.nEp.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    protected void eE(int n, int n2) {
        if (!aue_0.cVJ().cVK().djT()) {
            ((bfn_1)this.iWZ.dOg().fUZ()).a(this.iWZ, n, n2);
        }
    }

    @Override
    protected String eNA() {
        return null;
    }

    @Override
    protected int al(acd_1 acd_12) {
        if (this.iWZ == null) {
            return -1;
        }
        if (wa_0.D(acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
            return -1;
        }
        if (wa_0.z(acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
            return -1;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 != null && !bnv_22.a(bgt_02, acd_12.getX(), acd_12.getY())) {
            return -1;
        }
        return 100;
    }

    @Override
    protected void diW() {
    }
}

