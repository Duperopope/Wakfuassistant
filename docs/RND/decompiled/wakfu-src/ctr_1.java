/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cTR
 */
public class ctr_1
implements adi_1 {
    private static final Logger nKM = Logger.getLogger(ctr_1.class);
    private static final ctr_1 nKN = new ctr_1();
    private bnl_1 nKO;
    private alx_2 ikv;

    public static ctr_1 eRg() {
        return nKN;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16194: {
                dau_0 dau_02 = (dau_0)aam_22;
                fnC fnC2 = this.nKO.dys().b(fnG.sKm);
                if (fnC2 == null) {
                    fnC2 = new fnC(fnG.sKm);
                    this.nKO.a(fnC2);
                }
                if (dau_02.bCu()) {
                    fnC2.c(fnB.Xq(dau_02.bCo()));
                } else {
                    fnC2.d(fnB.Xq(dau_02.bCo()));
                }
                fse_1.gFu().a((aef_2)dau_02.faq(), "guildPerms");
                return false;
            }
            case 19237: {
                dau_0 dau_03 = (dau_0)aam_22;
                fnC fnC3 = this.nKO.dys().b(fnG.sKl);
                if (fnC3 == null) {
                    fnC3 = new fnC(fnG.sKl);
                    this.nKO.a(fnC3);
                }
                if (dau_03.bCu()) {
                    fnC3.c(fnB.Xq(dau_03.bCo()));
                } else {
                    fnC3.d(fnB.Xq(dau_03.bCo()));
                }
                fse_1.gFu().a((aef_2)dau_03.faq(), "anonymousPerms");
                return false;
            }
            case 18498: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                bgy bgy2 = bgg_0.dlO().lH(string);
                if (bgy2 == null) {
                    aPd.e("error.playerUnknownInDimensionalBag", string);
                    return false;
                }
                this.nKO.a(new fnD(bgy2.Sn(), string));
                return false;
            }
            case 16876: {
                dae_0 dae_03 = (dae_0)aam_22;
                this.nKO.kd(dae_03.bCp());
                return false;
            }
            case 18666: {
                dau_0 dau_04 = (dau_0)aam_22;
                fnD fnD2 = this.nKO.dys().us(dau_04.bCp());
                fnB fnB2 = fnB.Xq(dau_04.bCo());
                if (dau_04.bCu()) {
                    fnD2.c(fnB2);
                } else {
                    fnD2.d(fnB2);
                }
                dau_04.faq().dzo();
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

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cts_2(this);
            fyw_0.gqw().a(this.ikv);
            fnE fnE2 = aue_0.cVJ().cVK().dnw().dyZ();
            if (fnE2 != null) {
                this.nKO = new bnl_1(fnE2);
                fse_1.gFu().f("roomPermissions", this.nKO);
            }
            fse_1.gFu().f("roomViewDisplayed", (Object)null);
            ccj_2.g("dimensionalBagRoomAdministrationDialog", 32768L);
            fyw_0.gqw().d("wakfu.roomAdministration", cgu_2.class);
            cAY.eHc().eHq();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tl("dimensionalBagRoomAdministrationDialog");
            fyw_0.gqw().tl("dimensionalBagRoomIndividualRightsDialog");
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bnv_2 bnv_22 = bgt_02.dnw();
            if (bnv_22 != null) {
                bnv_22.a(this.nKO.dys());
            }
            this.nKO = null;
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("roomPermissions");
            fse_1.gFu().vX("roomViewDisplayed");
            fyw_0.gqw().tc("wakfu.roomAdministration");
            cAY.eHc().eHr();
        }
    }

    public String toString() {
        return "UIDimensionalBagRoomAdministrationFrame{m_dimBagRightsView=" + String.valueOf(this.nKO) + ", m_dialogUnloadListener=" + String.valueOf(this.ikv) + "}";
    }
}

