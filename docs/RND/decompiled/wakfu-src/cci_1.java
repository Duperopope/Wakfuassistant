/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from ccI
 */
public class cci_1
implements adi_1 {
    protected static final Logger lPA = Logger.getLogger(cci_1.class);
    public static final cci_1 lPB = new cci_1();
    private static final short lPC = 1;

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13465: {
                Optional<eki_0> optional = this.dpJ();
                if (optional.isEmpty()) {
                    return false;
                }
                cpi_0 cpi_02 = (cpi_0)aam_22;
                this.a(optional.get(), cpi_02);
                return false;
            }
            case 13346: {
                Optional<eki_0> optional = this.dpJ();
                if (optional.isEmpty()) {
                    return false;
                }
                cpj_0 cpj_02 = (cpj_0)aam_22;
                this.a(optional.get(), cpj_02);
                return false;
            }
            case 13891: {
                Optional<eki_0> optional = this.dpJ();
                if (optional.isEmpty()) {
                    return false;
                }
                cpn_0 cpn_02 = (cpn_0)aam_22;
                this.a(optional.get(), cpn_02);
                return false;
            }
            case 12038: {
                Optional<eki_0> optional = this.dpJ();
                if (optional.isEmpty()) {
                    return false;
                }
                cpl_0 cpl_02 = (cpl_0)aam_22;
                this.a(aue_0.cVJ().cVK(), optional.get(), cpl_02);
                return false;
            }
            case 12287: {
                Optional<eki_0> optional = this.dpJ();
                if (optional.isEmpty()) {
                    return false;
                }
                cpk_0 cpk_02 = (cpk_0)aam_22;
                this.a(aue_0.cVJ().cVK(), optional.get(), cpk_02);
                return false;
            }
        }
        return true;
    }

    private Optional<eki_0> dpJ() {
        long l = aue_0.cVJ().cVO().xl();
        Optional<eki_0> optional = baj_2.hzf.iJ(l);
        if (optional.isEmpty()) {
            lPA.error((Object)String.format("[CRAFT] Unable to fetch CraftHandler for handle craftMessage for following user %s", l));
        }
        return optional;
    }

    private void a(bgt_0 bgt_02, eki_0 eki_02, cpk_0 cpk_02) {
        eka_0 eka_02 = cpk_02.exy();
        switch (eka_02) {
            case qCF: {
                break;
            }
            case qCA: {
                break;
            }
            case qCB: {
                break;
            }
            case qCz: {
                break;
            }
            case qCE: {
                break;
            }
            case qCG: {
                break;
            }
            case qCH: {
                break;
            }
            case qCJ: {
                break;
            }
            case qCI: {
                break;
            }
            case qCK: {
                break;
            }
            case qCU: {
                aPd.e("error.notEnoughKamas", new Object[0]);
                break;
            }
            case qCT: {
                aPd.e("craft.secured.error.too.rich", new Object[0]);
                break;
            }
            case qCL: {
                String string;
                ctg_1.eQG().qt("6001039.xps");
                cAY.eHc().nP(600125L);
                bmv_1 bmv_12 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
                if (bmv_12 == null) {
                    eKR eKR2 = ctg_1.eQG().eQQ();
                    string = aum_0.cWf().a(15, (long)eKR2.fyZ().azv(), new Object[0]);
                } else {
                    string = bmv_12.getName();
                }
                aPd.f("craft.knownRecipeExecutionFailure", string);
                ctg_1.eQG().cS(cpk_02.bfd());
                return;
            }
            case qCM: {
                ctg_1.eQG().qt("6001039.xps");
                cAY.eHc().nP(600125L);
                aPd.f("craft.unknownRecipeExecutionFailure", new Object[0]);
                ctg_1.eQG().cS((short)1);
                return;
            }
            case qCN: {
                ctg_1.eQG().qt("6001039.xps");
                cAY.eHc().nP(600125L);
                aPd.f("craft.unknownRecipeCantBeCraftedHere", new Object[0]);
                ctg_1.eQG().cS((short)1);
                return;
            }
            case qCy: {
                String string;
                bmv_1 bmv_13 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
                if (bmv_13 == null) {
                    eKR eKR3 = ctg_1.eQG().eQQ();
                    string = aum_0.cWf().a(15, (long)eKR3.fyZ().azv(), new Object[0]);
                } else {
                    string = bmv_13.getName();
                }
                aPd.f("craft.knownRecipeExecutionSuccess", string);
                ctg_1.eQG().cT(cpk_02.bfd());
                return;
            }
            case qCO: {
                aPd.e("craft.errorOccupation", new Object[0]);
                if (aue_0.cVJ().c(ctg_1.eQG())) {
                    aue_0.cVJ().b(ctg_1.eQG());
                }
                return;
            }
            case qCR: {
                aPd.e("craft.secured.craftsman.absent", new Object[0]);
                break;
            }
            case qCS: 
            case qCQ: {
                aPd.e("craft.errorOccupation", new Object[0]);
                break;
            }
            case qCC: {
                aPd.e("craft.data.unreachable", new Object[0]);
                break;
            }
            default: {
                lPA.error((Object)("Reception d'un message d'erreur de craft " + String.valueOf((Object)eka_02) + " non g\u00e9r\u00e9 par le client"));
            }
        }
        ctg_1.eQO();
    }

    private void a(eki_0 eki_02, cpi_0 cpi_02) {
        int n = cpi_02.exx();
        eKW eKW2 = eKQ.qEb.QV(n);
        if (eKW2 == null) {
            lPA.error((Object)("R\u00e9ception d'un message d'apprentissage pour le m\u00e9tier " + n + " inconnu du manager"));
            return;
        }
        eki_02.i(eKW2);
    }

    private void a(eki_0 eki_02, cpj_0 cpj_02) {
        int n = cpj_02.exx();
        int n2 = cpj_02.rX();
        eKW eKW2 = eKQ.qEb.QV(n);
        if (eKW2 == null) {
            lPA.error((Object)("R\u00e9ception d'un message d'apprentissage de recette pour le metier " + n + " inconnu du manager"));
            return;
        }
        eKR eKR2 = eKW2.QZ(n2);
        if (eKR2 == null) {
            lPA.error((Object)("R\u00e9ception d'un message d'apprentissage de la recette " + n + " inconnue du manager"));
            return;
        }
        eki_02.fs(n, n2);
    }

    private void a(eki_0 eki_02, cpn_0 cpn_02) {
        int n = cpn_02.exx();
        long l = cpn_02.exF();
        eki_02.D(n, l);
    }

    private void a(bgt_0 bgt_02, eki_0 eki_02, cpl_0 cpl_02) {
        Object object;
        eKR eKR2;
        long l = cpl_02.exA();
        int n = cpl_02.rX();
        byte by = cpl_02.exB();
        long l2 = cpl_02.Tz();
        bDs bDs2 = (bDs)((Object)bzj_2.eqi().my(l));
        if (!bDs2.aVK().contains(bgt_02.aZw())) {
            lPA.error((Object)("D\u00e9Snchro de position? le joueur " + String.valueOf(bgt_02) + " essaye d'interagir avec la machine " + String.valueOf(bDs2) + " sans se trouver dans le pattern d'activation"));
            return;
        }
        int n2 = bDs2.cms();
        eKW eKW2 = eKQ.qEb.QV(n2);
        if (eKW2 == null) {
            lPA.error((Object)("Le joueur " + String.valueOf(bgt_02) + " essaye d'utiliser la recette " + n + " du m\u00e9tier " + n2 + " alors que celui-ci n'existe pas"));
            return;
        }
        if (by == -1) {
            eKR2 = new eKU(n2, eki_02.PG(n2));
        } else if (by == -2) {
            object = eKW2.QZ(n);
            eKR2 = new eKT((eKR)object, n2, ((eKR)object).dxy());
        } else {
            eKR2 = eKW2.QZ(n);
        }
        if (eKR2 == null) {
            lPA.error((Object)("Le joueur " + String.valueOf(bgt_02) + " essaye d'utiliser la recette " + n + " du m\u00e9tier " + n2 + " alors que celle-ci n'existe pas"));
            return;
        }
        object = new bkk_1(bDs2, eKR2, l2);
        if (((bkk_1)object).dsn()) {
            bgt_02.a((eid_0)object);
            ((bkk_1)object).bIH();
        } else {
            ((bkb_0)object).dsg();
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

