/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccB
 */
public class ccb_1
implements adi_1 {
    protected static final Logger lPg = Logger.getLogger(ccb_1.class);
    private static final ccb_1 lPh = new ccb_1();
    private long aDh;
    private String aFD;
    private bhJ lPi;
    private ccc_1 lPj = ccc_1.lPl;
    private short iiM;
    private boolean lPk;

    public static ccb_1 etJ() {
        return lPh;
    }

    public void jd(boolean bl) {
        this.lPk = bl;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public void a(ccc_1 ccc_12) {
        this.lPj = ccc_12;
    }

    public void at(bhJ bhJ2) {
        this.lPi = bhJ2;
    }

    public void cx(short s) {
        this.iiM = s;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 23345: {
                boolean bl = ccz_1.a((cyy_0)aam_22, this);
                if (!bl) {
                    crh_2.eML().bCj();
                    aue_0.cVJ().b(this);
                    ccz_1.etG().jc(true);
                    aue_0.cVJ().a(ccz_1.etG());
                }
                return false;
            }
            case 22147: {
                cys_0 cys_02 = (cys_0)aam_22;
                lPg.info((Object)("R\u00e9sultat de la cr\u00e9ation de perso : success=" + cys_02.eFK() + ", code=" + cys_02.eFL()));
                if (cys_02.eFK()) {
                    String string = bgr_0.dmo().dmx();
                    ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljG, string);
                    aue_0.cVJ().b(cvz_1.eUB());
                    crh_2.eML().cB(true).g(aum_0.cWf().c("loadingWorld.progress", new Object[0]), 0);
                    aIq.cgr().e(() -> crh_2.eML().bCj());
                } else {
                    bgr_0.dmo().lJ(null);
                    crh_2.eML().bCj();
                    ccb_1.cX(cys_02.eFL());
                    cdz_2.setCreateCharacterFlag(false);
                }
                return false;
            }
        }
        return true;
    }

    public static void cX(byte by) {
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCy).l(switch (by) {
            case 102 -> "error.characterCreation.existingName";
            case 103 -> "error.characterCreation.invalidName";
            case 104 -> "error.characterCreation.tooManyCharacters";
            case 106 -> "desc.characterClassDisabled";
            case 105 -> "error.characterCreation.pendingMigrationRequest";
            default -> "error.characterCreation";
        }, new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
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
            csp_1.eOC().db(this.aDh);
            csp_1.eOC().dm(this.aFD);
            csp_1.eOC().a(this.lPj);
            csp_1.eOC().cx(this.iiM);
            csp_1.eOC().at(this.lPi);
            csp_1.eOC().jd(this.lPk);
            aue_0.cVJ().a(csp_1.eOC());
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().b(csp_1.eOC());
            this.aDh = -1L;
            this.aFD = null;
            this.lPj = ccc_1.lPl;
            this.lPi = null;
        }
    }
}

