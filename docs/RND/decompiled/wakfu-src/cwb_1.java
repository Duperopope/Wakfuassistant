/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWb
 */
public class cwb_1
implements adi_1 {
    private static final cwb_1 nRv = new cwb_1();
    private alx_2 ikv;
    private bhg_2 nRw;
    private bhd_2 nRx;
    private adp_0 nRy;

    public static cwb_1 eVa() {
        return nRv;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18744: {
                bhe_2 bhe_22 = (bhe_2)((ama_1)aam_22).bCv();
                this.nRw.a(bhe_22);
                return false;
            }
            case 17693: {
                bhf_2 bhf_22 = (bhf_2)((ama_1)aam_22).bCv();
                this.nRw.a(bhf_22);
                return false;
            }
            case 18473: {
                Long l = (Long)((ama_1)aam_22).bCv();
                this.nRw.E(l);
                return false;
            }
            case 17050: {
                this.nRw.dUO();
                return false;
            }
            case 18025: {
                String string = (String)((ama_1)aam_22).bCv();
                this.nRw.mJ(string);
                return false;
            }
        }
        return true;
    }

    public void eVb() {
        if (aue_0.cVJ().c(nRv)) {
            aue_0.cVJ().b(nRv);
            return;
        }
        this.nRx = new bhd_2();
        aue_0.cVJ().a(nRv);
    }

    public void eVc() {
        if (!aue_0.cVJ().c(nRv)) {
            return;
        }
        fse_1.gFu().a((aef_2)this.nRw, "currentMusicName");
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nRw = new bhg_2(this.nRx);
            this.nRw.bkZ();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            this.nRy = (ads_02, anp_22) -> aue_0.cVJ().b(nRv);
            bgt_02.ddI().a(this.nRy);
            this.ikv = string -> {
                if (string.equals("jukeboxDialog")) {
                    aue_0.cVJ().b(nRv);
                }
            };
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.jukebox", cfk_2.class);
            ccj_2.g("jukeboxDialog", 32768L);
            fse_1.gFu().b("jukebox", this.nRw, "jukeboxDialog");
            cAY.eHc().nP(600012L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tl("jukeboxDialog");
            aue_0.cVJ().cVK().ddI().b(this.nRy);
            this.nRy = null;
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.jukebox");
            cAY.eHc().nP(600013L);
            fse_1.gFu().vX("jukebox");
            this.nRw = null;
            this.nRx = null;
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

