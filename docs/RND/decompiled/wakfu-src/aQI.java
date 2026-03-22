/*
 * Decompiled with CFR 0.152.
 */
public class aQI
extends aRY {
    public static final int eGy = 1;
    public static final int eGz = 2;
    public static final int eGA = 3;
    public static final int eGB = 4;
    public static final int eGC = 5;
    public static final int eGD = 6;
    public static final int eGE = 7;
    public static final int eGF = 8;
    public static final int eGG = 9;
    public static final int eGH = 10;
    public static final int eGI = 11;
    public static final int eGJ = 12;
    public static final int eGK = 13;
    public static final int eGL = 14;
    public static final int eGM = 15;
    private final int eGN;
    private final String[] eGO;

    public aQI(int n, String ... stringArray) {
        this.eGN = n;
        this.eGO = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eGN) {
            case 1: {
                return this.eGO.length == 1;
            }
            case 2: {
                return this.eGO.length == 0;
            }
            case 3: {
                return this.eGO.length == 1;
            }
            case 4: {
                return this.eGO.length == 7 || this.eGO.length == 9;
            }
            case 5: {
                return this.eGO.length == 1;
            }
            case 6: {
                return this.eGO.length == 2;
            }
            case 7: {
                return this.eGO.length == 2;
            }
            case 8: {
                return this.eGO.length == 3;
            }
            case 9: {
                return this.eGO.length == 2;
            }
            case 10: {
                return this.eGO.length == 1;
            }
            case 11: {
                return this.eGO.length == 4 || this.eGO.length == 6 || this.eGO.length == 2;
            }
            case 12: {
                return this.eGO.length == 2;
            }
            case 13: {
                return this.eGO.length == 2;
            }
            case 14: {
                return this.eGO.length == 4 || this.eGO.length == 6;
            }
            case 15: {
                return this.eGO.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.eGN) {
                case 1: {
                    this.p(ayf_22);
                    break;
                }
                case 5: {
                    this.m(ayf_22);
                    break;
                }
                case 2: {
                    this.cBX();
                    break;
                }
                case 3: {
                    this.o(ayf_22);
                    break;
                }
                case 4: {
                    this.n(ayf_22);
                    break;
                }
                case 6: {
                    this.l(ayf_22);
                    break;
                }
                case 7: {
                    this.k(ayf_22);
                    break;
                }
                case 8: {
                    this.j(ayf_22);
                    break;
                }
                case 9: {
                    this.i(ayf_22);
                    break;
                }
                case 10: {
                    this.h(ayf_22);
                    break;
                }
                case 11: {
                    this.g(ayf_22);
                    break;
                }
                case 12: {
                    this.e(ayf_22);
                    break;
                }
                case 13: {
                    this.f(ayf_22);
                    break;
                }
                case 14: {
                    this.d(ayf_22);
                    break;
                }
                case 15: {
                    this.c(ayf_22);
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de calendrier " + String.valueOf(exception));
        }
    }

    private void c(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)413);
        ns_02.nX(Integer.parseInt(this.eGO[0]));
        ayf_22.d(ns_02);
    }

    private void d(ayf_2 ayf_22) {
        long l = Long.parseLong(this.eGO[0]);
        uw_0 uw_02 = null;
        if (this.eGO.length == 6) {
            uw_02 = new uw_0(0, Integer.parseInt(this.eGO[5]), Integer.parseInt(this.eGO[4]), Integer.parseInt(this.eGO[1]), Integer.parseInt(this.eGO[2]), Integer.parseInt(this.eGO[3]));
        } else if (this.eGO.length == 4) {
            uw_02 = new uw_0(0, 0, 0, Integer.parseInt(this.eGO[1]), Integer.parseInt(this.eGO[2]), Integer.parseInt(this.eGO[3]));
        }
        eTw eTw2 = bse.dEP().ki(l);
        if (eTw2 != null) {
            bse.dEP().b(l, uw_02);
            cwG cwG2 = new cwG();
            cwG2.F(uw_02);
            cwG2.nH(l);
            ayf_22.d(cwG2);
        } else {
            aqh_0.cBI().jI("Evenement " + l + " inconnu");
        }
    }

    private void e(ayf_2 ayf_22) {
        long l = Long.parseLong(this.eGO[0]);
        String string = this.eGO[1];
        eTw eTw2 = bse.dEP().ki(l);
        if (eTw2 != null) {
            eTw2.oA(string);
            cwD cwD2 = new cwD();
            cwD2.oA(string);
            cwD2.nH(l);
            ayf_22.d(cwD2);
        } else {
            aqh_0.cBI().jI("Evenement " + l + " inconnu");
        }
    }

    private void f(ayf_2 ayf_22) {
        long l = Long.parseLong(this.eGO[0]);
        String string = this.eGO[1];
        eTw eTw2 = bse.dEP().ki(l);
        if (eTw2 != null) {
            eTw2.eQ(string);
            cwH cwH2 = new cwH();
            cwH2.eQ(string);
            cwH2.nH(l);
            ayf_22.d(cwH2);
        } else {
            aqh_0.cBI().jI("Evenement " + l + " inconnu");
        }
    }

    private void g(ayf_2 ayf_22) {
        long l = Long.parseLong(this.eGO[0]);
        uw_0 uw_02 = null;
        if (this.eGO.length == 6) {
            uw_02 = new uw_0(0, Integer.parseInt(this.eGO[5]), Integer.parseInt(this.eGO[4]), Integer.parseInt(this.eGO[1]), Integer.parseInt(this.eGO[2]), Integer.parseInt(this.eGO[3]));
        } else if (this.eGO.length == 4) {
            uw_02 = new uw_0(0, 0, 0, Integer.parseInt(this.eGO[1]), Integer.parseInt(this.eGO[2]), Integer.parseInt(this.eGO[3]));
        } else if (this.eGO.length == 2 && this.eGO[1].equals("-1")) {
            uw_02 = null;
        }
        eTw eTw2 = bse.dEP().ki(l);
        if (eTw2 != null) {
            eTw2.P(uw_02);
            cwE cwE2 = new cwE();
            cwE2.F(uw_02);
            cwE2.nH(l);
            ayf_22.d(cwE2);
        } else {
            aqh_0.cBI().jI("Evenement " + l + " inconnu");
        }
    }

    private void h(ayf_2 ayf_22) {
        byte by = Byte.parseByte(this.eGO[0]);
        switch (by) {
            case 0: {
                bse.dEP().clear();
                break;
            }
            default: {
                bse.dEP().bB(by);
            }
        }
        cwz cwz2 = new cwz();
        cwz2.dN(by);
        ayf_22.d(cwz2);
    }

    private void i(ayf_2 ayf_22) {
        cwy cwy2 = new cwy();
        cwy2.nH(Long.parseLong(this.eGO[0]));
        cwy2.oz(this.eGO[1]);
        ayf_22.d(cwy2);
    }

    private void j(ayf_2 ayf_22) {
        cwF cwF2 = new cwF();
        cwF2.nH(Long.parseLong(this.eGO[0]));
        cwF2.dO(Byte.parseByte(this.eGO[1]));
        cwF2.a(Byte.parseByte(this.eGO[2]));
        ayf_22.d(cwF2);
    }

    private void k(ayf_2 ayf_22) {
        cwJ cwJ2 = new cwJ();
        cwJ2.db(Long.parseLong(this.eGO[0]));
        cwJ2.nH(Long.parseLong(this.eGO[1]));
        ayf_22.d(cwJ2);
    }

    private void l(ayf_2 ayf_22) {
        cwK cwK2 = new cwK();
        cwK2.db(Long.parseLong(this.eGO[0]));
        cwK2.nH(Long.parseLong(this.eGO[1]));
        ayf_22.d(cwK2);
    }

    private void m(ayf_2 ayf_22) {
        cwI cwI2 = new cwI();
        cwI2.nI(Long.parseLong(this.eGO[0]));
        ayf_22.d(cwI2);
    }

    private void n(ayf_2 ayf_22) {
        cww cww2 = new cww();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eTw eTw2 = this.eGO.length == 7 ? new eTw(this.eGO[0], this.eGO[1], bgt_02.Sn(), Byte.parseByte(this.eGO[2]), Byte.parseByte(this.eGO[3]), Byte.parseByte(this.eGO[4]), Byte.parseByte(this.eGO[5]), Short.parseShort(this.eGO[6])) : new eTw(this.eGO[0], this.eGO[1], bgt_02.Sn(), Byte.parseByte(this.eGO[2]), Byte.parseByte(this.eGO[3]), Byte.parseByte(this.eGO[4]), Byte.parseByte(this.eGO[5]), Short.parseShort(this.eGO[6]), Byte.parseByte(this.eGO[7]), Byte.parseByte(this.eGO[8]));
        cww2.l(eTw2);
        eTw2.i(bgt_02.Sn(), bgt_02.getName());
        bse.dEP().c(eTw2);
        ayf_22.d(cww2);
    }

    private void o(ayf_2 ayf_22) {
        cwC cwC2 = new cwC();
        cwC2.nH(Long.parseLong(this.eGO[0]));
        ayf_22.d(cwC2);
    }

    private void cBX() {
        bse.dEP().dET();
    }

    private void p(ayf_2 ayf_22) {
        cwB cwB2 = new cwB();
        cwB2.nI(Long.parseLong(this.eGO[0]));
        ayf_22.d(cwB2);
    }
}

