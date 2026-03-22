/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from ccP
 */
public class ccp_1
implements adi_1 {
    protected static final Logger lPQ = Logger.getLogger(ccp_1.class);
    private static final ccp_1 lPR = new ccp_1();

    public static ccp_1 etW() {
        return lPR;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().b(cco_1.etV());
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().a(cco_1.etV());
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12104: {
                cpY cpY2 = (cpY)aam_22;
                bso_0 bso_02 = bsl_0.jfZ.dFt();
                ffV ffV2 = cpY2.getItem();
                if (bso_02 != null && bso_02.Sn() == cpY2.exN()) {
                    bso_02.a(cpY2.exQ());
                    bso_02.a(cpY2.fD(), ffV2, cpY2.cyg());
                    cup_1.eRM().eRN();
                } else {
                    lPQ.error((Object)"Message d'ajout d'un item dans un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 13027: {
                cup_1.eRM().fY(false);
                cqa_0 cqa_02 = (cqa_0)aam_22;
                bso_0 bso_03 = bsl_0.jfZ.dFt();
                ArrayList<RT> arrayList = new ArrayList<RT>(cqa_02.exR());
                if (bso_03 != null && bso_03.Sn() == cqa_02.exN()) {
                    bso_03.a(cqa_02.exQ());
                    bso_03.a(cqa_02.fD(), (List<RT>)arrayList);
                    cup_1.eRM().eRN();
                } else {
                    lPQ.error((Object)"Message to add an item in an exchange recieved whereas player don't have active exchanger");
                }
                return false;
            }
            case 13170: {
                cpz_0 cpz_02 = (cpz_0)aam_22;
                bso_0 bso_04 = bsl_0.jfZ.dFt();
                ffV ffV3 = cpz_02.getItem();
                if (bso_04 != null && bso_04.Sn() == cpz_02.exN()) {
                    bso_04.a(cpz_02.exQ());
                    bso_04.b(cpz_02.fD(), ffV3, cpz_02.cyg());
                    cup_1.eRM().eRN();
                } else {
                    lPQ.error((Object)"Message de suppression d'un item dans un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 13750: {
                cup_1.eRM().fY(false);
                cqb_0 cqb_02 = (cqb_0)aam_22;
                bso_0 bso_05 = bsl_0.jfZ.dFt();
                if (bso_05 != null && bso_05.Sn() == cqb_02.exN()) {
                    bso_05.a(cqb_02.exQ());
                    bso_05.b(cqb_02.fD(), cqb_02.exR());
                    cup_1.eRM().eRN();
                } else {
                    lPQ.error((Object)"Message to add an item in an exchange recieved whereas player don't have active exchanger");
                }
                return false;
            }
            case 12247: {
                cqc_0 cqc_02 = (cqc_0)aam_22;
                bso_0 bso_06 = bsl_0.jfZ.dFt();
                if (bso_06 != null && bso_06.Sn() == cqc_02.exN()) {
                    bso_06.a(cqc_02.exQ());
                    bso_06.r(cqc_02.fD(), cqc_02.exS());
                    cup_1.eRM().eRN();
                } else {
                    lPQ.error((Object)"Message de mise a jour de kamas dans un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 13407: {
                cqd_0 cqd_02 = (cqd_0)aam_22;
                bso_0 bso_07 = bsl_0.jfZ.dFt();
                if (bso_07 != null && bso_07.Sn() == cqd_02.exN()) {
                    bso_07.c(cqd_02.fD(), cqd_02.aLB());
                } else {
                    lPQ.error((Object)"Message de validation d'un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                }
                return false;
            }
            case 12388: {
                cpv_0 cpv_02 = (cpv_0)aam_22;
                bso_0 bso_08 = bsl_0.jfZ.dFt();
                if (bso_08 == null || bso_08.Sn() != cpv_02.exN()) {
                    lPQ.error((Object)"Message terminant un echange re\u00e7u alors que le player ne poss\u00e8de pas d'\u00e9changeur actif");
                    return false;
                }
                switch (cpv_02.aVT()) {
                    case 0: {
                        bso_08.i(bso_08.dFG());
                        break;
                    }
                    case 1: {
                        bso_08.h(bso_08.dFG());
                        break;
                    }
                    case 2: {
                        bso_08.h(bso_08.dFH());
                        break;
                    }
                    case 3: {
                        bso_08.bfu();
                    }
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
}

