/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cYs
 */
public class cys_2
implements adi_1 {
    private static final Logger nYp = Logger.getLogger(cys_2.class);
    private static final cys_2 nYq = new cys_2();
    public static final int nYr = 19;
    public static final int nYs = 2;
    private alx_2 ikv;
    private bnz_1 nYt;
    private ArrayList<bny_1> htw;

    private cys_2() {
    }

    public static cys_2 eXV() {
        return nYq;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19557: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                this.i(dbl_02.getItem(), dbl_02.bCn());
                return false;
            }
            case 17074: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                this.c(dbl_03);
                return false;
            }
            case 17958: {
                for (bny_1 bny_12 : this.htw) {
                    bny_12.Im(1);
                }
                return false;
            }
            case 16673: {
                for (bny_1 bny_13 : this.htw) {
                    bny_13.Im(-1);
                }
                return false;
            }
            case 19795: {
                dae_0 dae_02 = (dae_0)aam_22;
                for (bny_1 bny_14 : this.htw) {
                    bny_14.setAnimation(dae_02.bCt());
                }
                return false;
            }
            case 18420: {
                this.en(cys_2.NC(1));
                return false;
            }
            case 19560: {
                this.en(cys_2.NC(-1));
                return false;
            }
            case 17282: {
                this.em(cys_2.NB(1));
                return false;
            }
            case 19188: {
                this.em(cys_2.NB(-1));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (string.equals("stuffPreviewDebugDialog")) {
                aue_0.cVJ().b(nYq);
            }
        };
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.nYt = new bnz_1();
        this.nYt.In(bgt_02.doZ());
        this.nYt.a(bgt_02, bgt_02.dmL(), new ffS[0]);
        fse_1.gFu().f("stuffPreview", this.nYt);
        this.at(bgt_02);
        fse_1.gFu().f("characterCreation.currentDressStyleIndex", 1);
        fse_1.gFu().f("characterCreation.currentHairStyleIndex", 1);
        fse_1.gFu().f("characterCreation.totalHairStyleIndex", 19);
        fse_1.gFu().f("characterCreation.totalDressStyleIndex", 2);
        fse_1.gFu().f("stuffPreviewDebugCharacters", this.htw);
        fyw_0.gqw().a(this.ikv);
        ccj_2.pd("stuffPreviewDebugDialog");
        cAY.eHc().nP(600012L);
        fyw_0.gqw().d("wakfu.stuffPreviewDebug", chj_1.class);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            chj_1.setDraggedItemId(-1L);
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("stuffPreviewDebugDialog");
            fse_1.gFu().vX("stuffPreview");
            fse_1.gFu().vX("characterCreation.currentDressStyleIndex");
            fse_1.gFu().vX("characterCreation.currentHairStyleIndex");
            fse_1.gFu().vX("stuffPreviewDebugCharacters");
            cAY.eHc().nP(600013L);
            this.nYt = null;
            this.htw = null;
            fyw_0.gqw().tc("wakfu.stuffPreviewDebug");
        }
    }

    private void at(bgt_0 bgt_02) {
        byte[] byArray;
        this.htw = new ArrayList();
        for (byte by : byArray = new byte[]{0, 1}) {
            for (eym eym2 : eyn.fhY()) {
                bny_1 bny_12 = new bny_1();
                bny_12.a(bgt_02, by, eym2);
                this.htw.add(bny_12);
            }
        }
    }

    private void i(ffV ffV2, byte by) {
        for (bny_1 bny_12 : this.htw) {
            bny_12.g(ffV2, by);
        }
        this.nYt.c(ffV2, by);
    }

    private void c(dbl_0 dbl_02) {
        for (bny_1 bny_12 : this.htw) {
            bny_12.cB(dbl_02.bCn());
        }
        this.nYt.cB(dbl_02.bCn());
    }

    public void T(int n, boolean bl) {
        for (bny_1 bny_12 : this.htw) {
            bny_12.DN(n);
            bny_12.ih(bl);
            bny_12.deS();
        }
        this.nYt.In(n);
    }

    private void em(byte by) {
        for (bny_1 bny_12 : this.htw) {
            bhJ bhJ2 = bny_12.egd();
            int n = bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO());
            bhJ2.c((byte)(by > n ? 0 : by - 1), true);
            bhJ2.dpm();
            bny_12.deS();
        }
    }

    private void en(byte by) {
        for (bny_1 bny_12 : this.htw) {
            bhJ bhJ2 = bny_12.egd();
            int n = bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO());
            bhJ2.d((byte)(by > n ? 0 : by - 1), true);
            bny_12.deS();
        }
    }

    private static byte NB(int n) {
        int n2 = fse_1.gFu().dq("characterCreation.currentDressStyleIndex");
        if ((n2 += n) > 2) {
            n2 = 1;
        }
        if (n2 < 1) {
            n2 = 2;
        }
        fse_1.gFu().f("characterCreation.currentDressStyleIndex", n2);
        return (byte)n2;
    }

    private static byte NC(int n) {
        int n2 = fse_1.gFu().dq("characterCreation.currentHairStyleIndex");
        if ((n2 += n) > 19) {
            n2 = 1;
        }
        if (n2 < 1) {
            n2 = 19;
        }
        fse_1.gFu().f("characterCreation.currentHairStyleIndex", n2);
        return (byte)n2;
    }

    public bnx_1 eXW() {
        return this.nYt;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

