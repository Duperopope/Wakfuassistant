/*
 * Decompiled with CFR 0.152.
 */
public class ePF
extends epz_0 {
    private static final aox_1 rdW = new enz_0(new eny_0("Attraction standard", new enx_0("Nombre de case (tire vers le caster)", eNA.qYC), new enx_0("Perte PA si collision (default : 0, 1 = perte)", eNA.qYC)), new eny_0("Tirage dans une direction pr\u00e9cise", new enx_0("Nombre de case", eNA.qYC), new enx_0("Perte PA si collision (default : 0, 1 = perte)", eNA.qYC), new enx_0("Direction particuli\u00e8re : 0:NE 1:SE 2:NW 3:SW 4:Dans la direction de la cible 5:Vers la cellule cible", eNA.qYD)), new eny_0("NE PLUS UTILISER", new enx_0("Nombre de case", eNA.qYC), new enx_0("Perte PA si collision (default : 0, 1 = perte)", eNA.qYC), new enx_0("Direction particuli\u00e8re : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Oppos\u00e9e \u00e0 la direction de la cible 5:Oppos\u00e9 \u00e0 la cellule cible 6:al\u00e9atoire 7: direction du caster", eNA.qYD), new enx_0("Elements des d\u00e9g\u00e2ts de collision (default = EARTH(3))", eNA.qYD)));
    public static final byte rdX = 0;
    public static final byte rdY = 1;
    public static final byte rdZ = 2;
    public static final byte rea = 3;
    public static final byte reb = 4;
    public static final byte rec = 5;

    @Override
    public aox_1 bEt() {
        return rdW;
    }

    public ePF fEG() {
        ePF ePF2 = new ePF();
        ePF2.rdI = false;
        return ePF2;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(188);
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    boolean fDL() {
        return true;
    }

    @Override
    public boolean fDH() {
        return !this.fEh() && !this.fEi() && (this.fEy() || !this.fEj()) && !this.fEk();
    }

    @Override
    boolean fDI() {
        return true;
    }

    @Override
    public esu_0 fDJ() {
        if (this.bgF instanceof esu_0) {
            return (esu_0)this.bgF;
        }
        return null;
    }

    @Override
    acd_1 fDK() {
        abi_1 abi_12;
        if (((enk_0)this.bgC).fAn() < 3) {
            return this.fEH();
        }
        int n = -1;
        if (((enk_0)this.bgC).fAn() >= 3) {
            short s = this.fHf();
            n = (byte)((enk_0)this.bgC).a(2, s, ene_0.qPu);
        }
        switch (n) {
            case 0: {
                abi_12 = abi_1.dzq;
                break;
            }
            case 1: {
                abi_12 = abi_1.dzk;
                break;
            }
            case 2: {
                abi_12 = abi_1.dzo;
                break;
            }
            case 3: {
                abi_12 = abi_1.dzm;
                break;
            }
            case 4: {
                abi_12 = this.bgF.baC();
                break;
            }
            case 5: {
                return this.bgG;
            }
            default: {
                abi_12 = this.fEx() ? abi_1.dzt : new acq_1(this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE()).bXb();
            }
        }
        return new acd_1(this.bgF.bcC() + abi_12.dzz * this.cmT, this.bgF.bcD() + abi_12.dzA * this.cmT);
    }

    private acd_1 fEH() {
        abi_1 abi_12 = new acq_1(this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.fDJ().bcC(), this.fDJ().bcD(), this.fDJ().bcE()).bXb();
        return new acd_1(this.bgE.bcC() + abi_12.dzz, this.bgE.bcD() + abi_12.dzA, this.bgE.bcE());
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEG();
    }
}

