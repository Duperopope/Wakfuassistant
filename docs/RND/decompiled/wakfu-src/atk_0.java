/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aTk
 */
public class atk_0
extends aRY {
    private static final Logger eQy = Logger.getLogger(atk_0.class);
    public static final int eQz = 0;
    public static final int eQA = 1;
    public static final int eQB = 2;
    public static final int eQC = 3;
    public static final int eQD = 4;
    public static final int eQE = 5;
    public static final int eQF = 6;
    public static final int eQG = 7;
    private final int eQH;
    private final String[] eQI;

    public atk_0(int n, String ... stringArray) {
        this.eQH = n;
        this.eQI = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eQH) {
            case 1: {
                return this.eQI.length == 0;
            }
            case 0: {
                return true;
            }
            case 2: 
            case 6: {
                return this.eQI.length == 1 || this.eQI.length == 2;
            }
            case 3: 
            case 7: {
                return this.eQI.length == 1;
            }
            case 4: {
                return this.eQI.length == 0;
            }
            case 5: {
                return this.eQI.length == 1;
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
            switch (this.eQH) {
                case 1: {
                    this.cDD();
                    break;
                }
                case 0: {
                    this.cBS();
                    break;
                }
                case 2: {
                    this.b(ayf_22, false);
                    break;
                }
                case 3: {
                    this.c(ayf_22, false);
                    break;
                }
                case 6: {
                    this.b(ayf_22, true);
                    break;
                }
                case 7: {
                    this.c(ayf_22, true);
                    break;
                }
                case 4: {
                    this.aL(ayf_22);
                    break;
                }
                case 5: {
                    this.aM(ayf_22);
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de calendrier " + String.valueOf(exception));
        }
    }

    private void aL(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bml_1 bml_12 = bgt_02.dmz();
        aqh_0.cBI().jF("effets : ");
        for (QD qD : bml_12) {
            try {
                Object EC = qD.bbf();
                int n = EC == null ? 0 : EC.bab();
                aqh_0.cBI().jF("UID : " + qD.Qq() + ", " + qD.getClass().getSimpleName() + " (" + qD.d() + "), id effet : " + qD.bba().aZH() + ", container type : " + eNo.RS(n) + " (" + n + "), id container : " + this.y(qD));
            }
            catch (Exception exception) {
                eQy.error((Object)"Erreur lors de la recuperation d'un effet");
            }
        }
    }

    private void aM(ayf_2 ayf_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bml_1 bml_12 = bgt_02.dmz();
        int n = Integer.parseInt(this.eQI[0]);
        for (QD qD : bml_12) {
            try {
                if (qD.bbf() == null || qD.bbf().bab() != n) continue;
                aqh_0.cBI().jF("UID : " + qD.Qq() + ", " + qD.getClass().getSimpleName() + " (" + qD.bba().avZ() + "), id effet : " + qD.bba().aZH() + ", container type : " + eNo.RS(n) + " (" + n + "), id container : " + this.y(qD));
            }
            catch (Exception exception) {
                eQy.error((Object)"Erreur lors de la recuperation d'un effet");
            }
        }
    }

    private long y(QD qD) {
        Object EC = qD.bbf();
        if (EC instanceof fqE) {
            return ((fqD)((fqE)EC).giP()).d();
        }
        if (EC instanceof ffV) {
            return ((ffV)EC).avr();
        }
        if (EC instanceof fqU) {
            return ((fqU)EC).gjy();
        }
        if (EC instanceof eHH) {
            return ((eHH)EC).fvS().d();
        }
        return EC.QF();
    }

    private void b(ayf_2 ayf_22, boolean bl) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)17);
        ns_02.aN(bl);
        ns_02.R(Short.parseShort(this.eQI[0]));
        if (this.eQI.length == 2) {
            ns_02.R(Short.parseShort(this.eQI[1]));
        }
        ayf_22.d(ns_02);
    }

    private void c(ayf_2 ayf_22, boolean bl) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)185);
        ns_02.aN(bl);
        ns_02.R(Short.parseShort(this.eQI[0]));
        ayf_22.d(ns_02);
    }

    private void cDD() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        List<erh_0> list = bgt_02.dmz().fHG();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            erh_0 erh_02 = list.get(i);
            aqh_0.cBI().jF("UID : " + erh_02.Qq() + ", id Etat : " + erh_02.fGk().gjy() + ", level : " + erh_02.fGk().cmL() + ", remaining time in ms : " + erh_02.fGm() + " ms");
        }
    }

    private void cBS() {
        atk_0.jF("-show | -s : show current states");
        atk_0.jF("-showall | -sa : show current effects");
        atk_0.jF("(-showallof | -sao) containerID : show effects with a container type (state = 1, spell = 11, item = 12, aptitude = 17)");
        atk_0.jF("(-add | -a) Id level? : apply state. Level is at 1 by default");
        atk_0.jF("(-remove | -r) Id : remove state");
        atk_0.jF("(-addall | -aa) Id level? : apply state to all hero in party. Level is at 1 by default");
        atk_0.jF("(-removeall | -ra) Id : remove state to all hero in party");
    }
}

