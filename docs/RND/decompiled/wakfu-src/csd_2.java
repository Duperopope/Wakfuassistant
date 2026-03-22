/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cSD
 */
public class csd_2
implements adi_1 {
    protected static final Logger nFZ = Logger.getLogger(csd_2.class);
    private static final csd_2 nGa = new csd_2();
    private alx_2 ikv;
    private bfj_2 nGb;

    public static csd_2 eOn() {
        return nGa;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cse_1(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.pd("bookcaseDialog");
            cAY.eHc().nP(600012L);
            fyw_0.gqw().d("wakfu.bookcase", cdv_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("bookcaseDialog");
            fse_1.gFu().vX("bookcase");
            cAY.eHc().nP(600013L);
            fyw_0.gqw().tc("wakfu.bookcase");
        }
    }

    private void addBook(ffV ffV2, short s) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!ffV2.dOg().c(fgg_0.sid)) {
            return;
        }
        bxJ bxJ2 = this.nGb.dfO();
        bDh bDh2 = bxJ2.dNk();
        if (bDh2.Xi() != bgt_02.Sn() && !cpq_1.og(bDh2.Xi())) {
            return;
        }
        if (!bxJ2.dNO().h(ffV2, s)) {
            return;
        }
        fcv_0 fcv_02 = new fcv_0(ffV2.LV(), (byte)s);
        clg clg2 = new clg();
        clg2.ng(bxJ2.Sn());
        clg2.a(fcv_02);
        aue_0.cVJ().etu().d(clg2);
    }

    private void removeBook(short s) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bxJ bxJ2 = this.nGb.dfO();
        bDh bDh2 = bxJ2.dNk();
        if (bDh2.Xi() != bgt_02.Sn() && !cpq_1.og(bDh2.Xi())) {
            return;
        }
        fcy_0 fcy_02 = new fcy_0((byte)s);
        clg clg2 = new clg();
        clg2.ng(this.nGb.dfO().Sn());
        clg2.a(fcy_02);
        aue_0.cVJ().etu().d(clg2);
    }

    private void i(byte by, byte by2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bxJ bxJ2 = this.nGb.dfO();
        bDh bDh2 = bxJ2.dNk();
        if (bDh2.Xi() != bgt_02.Sn() && !cpq_1.og(bDh2.Xi())) {
            return;
        }
        fcz_0 fcz_02 = new fcz_0(by, by2);
        clg clg2 = new clg();
        clg2.ng(this.nGb.dfO().Sn());
        clg2.a(fcz_02);
        aue_0.cVJ().etu().d(clg2);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18133: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                this.addBook(dbl_02.getItem(), dbl_02.bCq());
                return false;
            }
            case 18106: {
                dae_0 dae_02 = (dae_0)aam_22;
                byte by = dae_02.bCn();
                byte by2 = (byte)dae_02.bCq();
                this.i(by, by2);
                return false;
            }
            case 19462: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                this.removeBook(dbl_03.bCq());
                return false;
            }
            case 19777: {
                dbl_0 dbl_04 = (dbl_0)aam_22;
                ffV ffV2 = dbl_04.getItem();
                if (ffV2 != null) {
                    ((bfb_1)ffV2.dOg().fUZ()).dET();
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

    public void a(bxJ bxJ2) {
        this.nGb = new bfj_2(bxJ2);
        fse_1.gFu().f("bookcase", this.nGb);
        aue_0.cVJ().a(this);
    }
}

