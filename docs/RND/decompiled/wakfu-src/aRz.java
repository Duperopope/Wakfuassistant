/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.TreeSet;

public final class aRz
extends aRY {
    public static final int eKp = 0;
    public static final int eKq = 2;
    public static final int eKr = 3;
    public static final int eKs = 4;
    public static final int eKt = 5;
    public static final int eKu = 6;
    public static final int eKv = 7;
    public static final int eKw = 8;
    public static final int eKx = 9;
    public static final int eKy = 10;
    public static final int eKz = 11;
    public static final int eKA = 12;
    public static final int eKB = 13;
    public static final int eKC = 14;
    public static final int eKD = 16;
    public static final int eKE = 17;
    public static final int eKF = 18;
    public static final int eKG = 19;
    public static final int eKH = 20;
    public static final int eKI = 21;
    public static final int eKJ = 22;
    private final int eKK;
    private final String[] eKL;

    public aRz(int n, String ... stringArray) {
        this.eKK = n;
        this.eKL = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eKK) {
            case 7: {
                return this.eKL.length == 0 || this.eKL.length == 1;
            }
            case 3: 
            case 9: 
            case 12: 
            case 17: 
            case 22: {
                return this.eKL.length == 0;
            }
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 14: 
            case 18: 
            case 19: 
            case 21: {
                return this.eKL.length == 1;
            }
            case 0: 
            case 16: {
                return this.eKL.length == 2;
            }
            case 20: {
                return this.eKL.length == 3;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        try {
            block1 : switch (this.eKK) {
                case 12: {
                    aRz.cBS();
                    break;
                }
                case 16: {
                    this.L(ayf_22);
                    break;
                }
                case 17: {
                    this.cCR();
                    break;
                }
                case 18: {
                    this.W(ayf_22);
                    break;
                }
                case 7: {
                    this.R(ayf_22);
                    break;
                }
                case 19: {
                    this.X(ayf_22);
                    break;
                }
                case 20: {
                    this.Y(ayf_22);
                    break;
                }
                default: {
                    if (bgt_02.dpI().Ya() <= 0L) {
                        aqh_0.cBI().jI("Il faut avoir une guilde!");
                        return;
                    }
                    switch (this.eKK) {
                        case 0: {
                            this.V(ayf_22);
                            break block1;
                        }
                        case 2: {
                            this.Z(ayf_22);
                            break block1;
                        }
                        case 3: {
                            aRz.aa(ayf_22);
                            break block1;
                        }
                        case 4: {
                            this.U(ayf_22);
                            break block1;
                        }
                        case 5: {
                            this.T(ayf_22);
                            break block1;
                        }
                        case 6: {
                            this.S(ayf_22);
                            break block1;
                        }
                        case 8: {
                            this.Q(ayf_22);
                            break block1;
                        }
                        case 9: {
                            aRz.cCS();
                            break block1;
                        }
                        case 10: {
                            this.P(ayf_22);
                            break block1;
                        }
                        case 11: {
                            this.O(ayf_22);
                            break block1;
                        }
                        case 13: {
                            this.N(ayf_22);
                            break block1;
                        }
                        case 14: {
                            this.M(ayf_22);
                            break block1;
                        }
                        case 21: {
                            this.ab(ayf_22);
                            break block1;
                        }
                        case 22: {
                            aRz.cCQ();
                        }
                    }
                    break;
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me d'une commande" + String.valueOf(exception));
        }
    }

    private static void cCQ() {
        bjn_1 bjn_12 = aue_0.cVJ().cVK().dpI();
        TreeSet treeSet = new TreeSet();
        ((bjo_1)bjn_12).drl().J((TObjectProcedure<ezv_1>)((TObjectProcedure)ezv_12 -> {
            treeSet.add(ezv_12.tJ());
            return true;
        }));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n=== Bonuses bought buy the current guild :\n");
        treeSet.forEach(n -> {
            ezn ezn2 = ezn.Pd(n);
            eyr_2 eyr_22 = ezn2.fmw();
            stringBuilder.append("- ").append(eyr_22.d()).append(" : ").append(eyr_22.dJB().fQu()).append('\n');
        });
        stringBuilder.append("\n=== Bonuses still available to buy :\n");
        for (ezn ezn2 : ezn.values()) {
            eyr_2 eyr_22 = ezn2.fmw();
            if (treeSet.contains(eyr_22.d())) continue;
            stringBuilder.append("- ").append(eyr_22.d()).append(" : ").append(eyr_22.dJB().fQu()).append('\n');
        }
        aRz.jF(stringBuilder.toString());
    }

    private static void cBS() {
        aRz.jF("guild ('help'|'h') : display command help");
        aRz.jF("guild ('point'|'p'|'pt') delta [inWeeklyLimit] : give delta guild points with or without counting them in the weekly limit (default is false)");
        aRz.jF("guild 'money' delta : give delta money");
        aRz.jF("guild 'stats' : show guild stats");
        aRz.jF("guild ('addBonus'|'ab') bonusId : unlock bonus");
        aRz.jF("guild ('removeBonus'|'rb') bonusId : remove bonus");
        aRz.jF("guild ('setLearningFactor'|'slf') factor : modify learning bonus speed");
        aRz.jF("guild ('setMaxSimultaneous' | 'sms') max : modify maximum simultaneous bonus learning");
        aRz.jF("guild 'id' : show guild id");
        aRz.jF("guild 'id' \"guild name\": show guild id for the guild with this name");
        aRz.jF("guild ('maxPerWeek' | 'mpw') maxPerWeek : modify guild points limit per week");
        aRz.jF("guild ('pointEarnedFactor' | 'pef') factor : modify point gain ratio");
        aRz.jF("guild 'info' :  show guild info");
        aRz.jF("guild ('setLevel' | 'sl') level : modify guild level");
        aRz.jF("guild ('changeMessage' | 'cm') \"message\" : modify guild message");
        aRz.jF("guild ('changeDescription' | 'cd') \"desc\" : modify guild description");
        aRz.jF("guild ('changeName' | 'cn') guildId \"newName\" : modify a guild name");
        aRz.jF("guild ('create' | 'cr') : open guild creator ui");
        aRz.jF("guild ('inviteTo' | 'it') guildId : sends an invite to join \"guildId\"");
        aRz.jF("guild ('getRanks' | 'ranks') guildId : show ranks from the given \"guildId\"");
        aRz.jF("guild ('setRank' | 'sr') characterId guildId rankId : change the rank of the given player of the given guild");
        aRz.jF("guild 'bonus' : display the bonuses bought by the guild and the remaining ones");
    }

    private void cCR() {
        if (!aue_0.cVJ().c(cva_1.eTu())) {
            bzX bzX2 = new bzX();
            bzV bzV2 = (bzV)bzX2.dNo();
            cva_1.eTu().a(bzV2, bvd_0.juz);
        }
    }

    private void L(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)167);
        ns_02.nX(Integer.parseInt(this.eKL[0]));
        ns_02.cT(this.eKL[1]);
        ayf_22.d(ns_02);
    }

    private void M(ayf_2 ayf_22) {
        String string = this.eKL[0];
        cwO cwO2 = new cwO(string);
        ayf_22.d(cwO2);
    }

    private void N(ayf_2 ayf_22) {
        String string = this.eKL[0];
        cwQ cwQ2 = new cwQ(string);
        ayf_22.d(cwQ2);
    }

    private void O(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)459);
        ns_02.nX(Integer.parseInt(this.eKL[0]));
        ayf_22.d(ns_02);
    }

    private void P(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)203);
        float f2 = Float.parseFloat(this.eKL[0]);
        ns_02.br(f2);
        ayf_22.d(ns_02);
        ezu_1 ezu_12 = bvk.dJZ().drl();
        if (ezu_12 == null) {
            aqh_0.cBI().jI("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        ezu_12.fPX().ab(f2);
    }

    private static void cCS() {
        ezu_1 ezu_12 = bvk.dJZ().drl();
        if (ezu_12 == null) {
            aqh_0.cBI().jI("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        aRz.jF("Total de point : " + ezu_12.Yj());
        aRz.jF("Points actuels : " + ezu_12.Yh());
        aRz.jF("Limite de points par semaine : " + ezu_12.Yl());
        aRz.jF("Points gagn\u00e9s cette semaine : " + ezu_12.fPY());
    }

    private void Q(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)408);
        int n = Integer.parseInt(this.eKL[0]);
        ns_02.nX(n);
        ayf_22.d(ns_02);
        ezu_1 ezu_12 = bvk.dJZ().drl();
        if (ezu_12 == null) {
            aqh_0.cBI().jI("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        new eyy_2(ezu_12).Tq(n);
    }

    private void R(ayf_2 ayf_22) {
        if (this.eKL.length > 0) {
            String string = this.eKL[0];
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)6);
            ns_02.Q((short)468);
            ns_02.cT(string);
            ayf_22.d(ns_02);
        } else {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02.dpI().Ya() <= 0L) {
                aqh_0.cBI().jI("Il faut avoir une guilde!");
                return;
            }
            aRz.jF("Id de la guilde : " + bgt_02.dpI().Ya());
        }
    }

    private void S(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)93);
        int n = Integer.parseInt(this.eKL[0]);
        ns_02.nX(n);
        ayf_22.d(ns_02);
        ezu_1 ezu_12 = bvk.dJZ().drl();
        if (ezu_12 == null) {
            aqh_0.cBI().jI("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        ezu_12.fPX().TK(n);
    }

    private void T(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)252);
        float f2 = Float.parseFloat(this.eKL[0]);
        ns_02.br(f2);
        ayf_22.d(ns_02);
        ezu_1 ezu_12 = bvk.dJZ().drl();
        if (ezu_12 == null) {
            aqh_0.cBI().jI("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
            return;
        }
        ezu_12.fPX().aa(f2);
    }

    private void U(ayf_2 ayf_22) {
        cwM cwM2 = new cwM(Integer.parseInt(this.eKL[0]));
        ayf_22.d(cwM2);
    }

    private void V(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)364);
        ns_02.nX(Integer.parseInt(this.eKL[0]));
        boolean bl = this.eKL.length >= 2 && Boolean.parseBoolean(this.eKL[1]);
        ns_02.aN(bl);
        ayf_22.d(ns_02);
    }

    private void W(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)250);
        ns_02.nX(Integer.parseInt(this.eKL[0]));
        ayf_22.d(ns_02);
    }

    private void X(ayf_2 ayf_22) {
        int n = Integer.parseInt(this.eKL[0]);
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)444);
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }

    private void Y(ayf_2 ayf_22) {
        long l = Long.parseLong(this.eKL[0]);
        int n = Integer.parseInt(this.eKL[1]);
        long l2 = Long.parseLong(this.eKL[2]);
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)261);
        ns_02.cX(l);
        ns_02.nX(n);
        ns_02.cX(l2);
        ayf_22.d(ns_02);
    }

    private void Z(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)329);
        ns_02.cX(Long.parseLong(this.eKL[0]));
        ayf_22.d(ns_02);
    }

    private static void aa(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)153);
        ayf_22.d(ns_02);
    }

    private void ab(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)437);
        ns_02.nX(Integer.parseInt(this.eKL[0]));
        ayf_22.d(ns_02);
    }
}

