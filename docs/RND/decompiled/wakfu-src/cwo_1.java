/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWo
 */
public abstract class cwo_1
extends crw_2 {
    protected ffV iWZ;
    protected bea_0 mZr;
    protected long nSA;
    protected short nSB;
    protected frk nSC;

    protected boolean eVP() {
        if (this.nSC == null) {
            return false;
        }
        fnl fnl2 = this.mZr.dSp();
        this.nSA = this.a(this.mZr.bfd(), this.mZr.dSx(), fnl2.sIv, this.mZr.eAU());
        if (this.nSA == -1L) {
            return false;
        }
        fse_1.gFu().f("stackTax", this.nSA);
        return true;
    }

    private long a(short s, fnm fnm2, double d2, long l) {
        int n = s / fnm2.sID;
        long l2 = Math.round((double)(l * (long)n) * d2);
        if (l2 < 0L) {
            return -1L;
        }
        return frn.sXO.b(aue_0.cVJ().cVK(), this.nSC, l2);
    }

    protected void d(ffV ffV2, short s) {
        this.a(ffV2, s, 0L);
    }

    protected void a(ffV ffV2, short s, long l) {
        this.mZr.setItem(ffV2);
        this.nSB = s;
        this.mZr.ak(this.nSB);
        this.mZr.a(fnm.sIx);
        this.mZr.dSq();
        this.mZr.lk(l);
        this.eVP();
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        this.mZr = new bea_0();
        fse_1.gFu().f("merchantItem", this.mZr);
        fyw_0.gqw().d("wakfu.merchant.tax", cfs_1.class);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        this.nSC = null;
        this.mZr.setItem(null);
        this.mZr.aZp();
        this.mZr = null;
        fse_1.gFu().f("merchantItem", (Object)null);
        fyw_0.gqw().tc("wakfu.merchant.tax");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16200: {
                boolean bl;
                if (this.mZr.getItem() == null) {
                    return false;
                }
                dae_0 dae_02 = (dae_0)aam_22;
                long l = dae_02.bCp();
                long l2 = this.mZr.eAU();
                boolean bl2 = bl = (long)this.mZr.bfd() / (long)this.mZr.dSx().sID * l < 0L;
                if (bl) {
                    l = l2;
                }
                this.mZr.lk(l);
                if (!this.eVP()) {
                    this.mZr.lk(l2);
                }
                fse_1.gFu().a((aef_2)this.mZr, "price");
                return false;
            }
            case 16516: {
                if (this.mZr.getItem() == null) {
                    return false;
                }
                daa_0 daa_02 = (daa_0)aam_22;
                fnl fnl2 = this.mZr.dSp();
                this.mZr.a(daa_02.dSu());
                if (!this.eVP()) {
                    this.mZr.a(fnl2);
                }
                return false;
            }
            case 16236: {
                if (this.mZr.getItem() == null) {
                    return false;
                }
                dab_0 dab_02 = (dab_0)aam_22;
                fnm fnm2 = dab_02.dSx();
                fnm fnm3 = this.mZr.dSx();
                this.mZr.a(fnm2);
                short s = (short)(this.nSB / fnm2.sID * fnm2.sID);
                short s2 = this.mZr.bfd();
                this.mZr.ak(s);
                if (!this.eVP()) {
                    this.mZr.a(fnm3);
                    this.mZr.ak(s2);
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public frk eVQ() {
        return this.nSC;
    }
}

