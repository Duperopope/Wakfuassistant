/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePG
 */
public class epg_0
extends epz_0 {
    private static final aox_1 red = new enz_0(new eny_0("Poussage standard", new enx_0("Nombre de case", eNA.qYC), new enx_0("Perte PA si collision (default : 1, 0 = pas de perte)", eNA.qYC)), new eny_0("Poussage dans une direction pr\u00e9cise", new enx_0("Nombre de case", eNA.qYC), new enx_0("Perte PA si collision (default : 1, 0 = pas de perte)", eNA.qYC), new enx_0("Direction particuli\u00e8re : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Oppos\u00e9e \u00e0 la direction de la cible 5:Oppos\u00e9 \u00e0 la cellule cible 6:al\u00e9atoire 7: direction du caster", eNA.qYD)), new eny_0("NE PLUS UTILISER", new enx_0("Nombre de case", eNA.qYC), new enx_0("Perte PA si collision (default : 1, 0 = pas de perte)", eNA.qYC), new enx_0("Direction particuli\u00e8re : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Oppos\u00e9e \u00e0 la direction de la cible 5:Oppos\u00e9 \u00e0 la cellule cible 6:al\u00e9atoire 7: direction du caster", eNA.qYD), new enx_0("Elements des d\u00e9g\u00e2ts de collision (default = EARTH(3))", eNA.qYD)));
    public static final byte ree = 0;
    public static final byte ref = 1;
    public static final byte reg = 2;
    public static final byte reh = 3;
    public static final byte rei = 4;
    public static final byte rej = 5;
    public static final byte rek = 6;
    public static final byte rel = 7;

    @Override
    public aox_1 bEt() {
        return red;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(187);
    }

    public epg_0 fEI() {
        return new epg_0();
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
        return false;
    }

    @Override
    public boolean fDH() {
        return this.bgF != null && !this.fEh() && !this.fEi() && (this.fEy() || !this.fEj()) && !this.fEk();
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
        int n = -1;
        if (((enk_0)this.bgC).fAn() >= 3) {
            short s = this.fHf();
            n = (byte)((enk_0)this.bgC).a(2, s, ene_0.qPu);
        }
        block0 : switch (n) {
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
                abi_12 = this.bgF.baC().bVS();
                break;
            }
            case 5: {
                return this.bgG;
            }
            case 6: {
                switch (ve_0.ao(1, 4)) {
                    case 1: {
                        abi_12 = abi_1.dzq;
                        break block0;
                    }
                    case 2: {
                        abi_12 = abi_1.dzo;
                        break block0;
                    }
                    case 3: {
                        abi_12 = abi_1.dzk;
                        break block0;
                    }
                }
                abi_12 = abi_1.dzm;
                break;
            }
            case 7: {
                abi_12 = this.bgE.bcB();
                break;
            }
            default: {
                abi_12 = this.fEx() ? abi_1.dzt : new acq_1(this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE()).bXb();
            }
        }
        return new acd_1(this.bgF.bcC() + abi_12.bVN().dzz, this.bgF.bcD() + abi_12.bVN().dzA);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEI();
    }
}

