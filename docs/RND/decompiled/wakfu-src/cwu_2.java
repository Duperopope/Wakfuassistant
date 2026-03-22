/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWU
 */
public class cwu_2
implements adi_1 {
    public static final cwu_2 nTW = new cwu_2();
    protected static final Logger nTX = Logger.getLogger(cwu_2.class);
    private alx_2 ikv;

    private cwu_2() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19858: {
                bku_2.koj.ebs();
                return false;
            }
            case 19655: {
                bku_2.koj.ebt();
                return false;
            }
            case 18612: {
                bku_2.koj.ebu();
                return false;
            }
            case 16953: {
                bku_2.koj.ebv();
                return false;
            }
            case 16824: {
                dae_0 dae_02 = (dae_0)aam_22;
                bkw_2 bkw_22 = (bkw_2)dae_02.bCv();
                bku_2.koj.a(bkw_22);
                return false;
            }
            case 17416: {
                dae_0 dae_03 = (dae_0)aam_22;
                bkv_2 bkv_22 = (bkv_2)dae_03.bCv();
                bku_2.koj.a(bkv_22);
                return false;
            }
            case 16104: {
                dae_0 dae_04 = (dae_0)aam_22;
                bso_2 bso_22 = (bso_2)dae_04.bCv();
                bku_2.koj.a(bso_22);
                return false;
            }
            case 16959: {
                dae_0 dae_05 = (dae_0)aam_22;
                bkt_2 bkt_22 = (bkt_2)dae_05.bCv();
                this.a(bkt_22);
                return false;
            }
            case 19726: {
                ama_1 ama_12 = (ama_1)aam_22;
                String string = ama_12.bCt();
                bku_2.koj.mY(string);
                return false;
            }
            case 18157: {
                bku_2.koj.reset();
                return false;
            }
        }
        return true;
    }

    private void a(bkt_2 bkt_22) {
        bkt_22.ebq();
        String string = "pvpLadderEntryDialog" + bkt_22.ebp().Sn();
        fhv_1 fhv_12 = fyw_0.gqw().az(string, ccj_2.pe("pvpLadderEntryDialog"));
        if (fhv_12 != null) {
            fse_1.gFu().a("pvpLadderEntry", (Object)bkt_22, fhv_12.getElementMap());
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cwv_2(this);
            fse_1.gFu().f("nationPvpLadder", bku_2.koj);
            bku_2.koj.reset();
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("nationPvpLadderDialog", 32768L);
            fyw_0.gqw().d("wakfu.nationPvpLadder", cfc_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("nationPvpLadderDialog");
            fyw_0.gqw().tc("wakfu.nationPvpLadder");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

