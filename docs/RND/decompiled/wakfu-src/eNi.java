/*
 * Decompiled with CFR 0.152.
 */
public final class eNi
extends Enum<eNi>
implements aoq_1 {
    public static final /* enum */ eNi qWp = new eNi(1, "Bypass : se d\u00e9clenche sur ne d\u00e9clenche rien niveau 1");
    public static final /* enum */ eNi qWq = new eNi(2, "Bypass : ignore la Parade (HP_LOSS)");
    public static final /* enum */ eNi qWr = new eNi(3, "Misc : n'affiche pas la zone de l'effet dans le client");
    public static final /* enum */ eNi qWs = new eNi(4, "Flag : effet Zone (HP_LOSS)");
    public static final /* enum */ eNi qWt = new eNi(5, "Bypass : ne d\u00e9clenche rien niveau 1");
    public static final /* enum */ eNi qWu = new eNi(6, "Bypass : ne d\u00e9clenche rien niveau 2");
    public static final /* enum */ eNi qWv = new eNi(8, "Order : tri les cibles par %PV Restants (croissant)");
    public static final /* enum */ eNi qWw = new eNi(9, "Bypass : n'est pas d\u00e9sappliqu\u00e9 quand le porteur passe OffPlay");
    public static final /* enum */ eNi qWx = new eNi(10, "Flag : bonus de Havre-Monde destin\u00e9 aux membres de la guilde dans le HM");
    public static final /* enum */ eNi qWy = new eNi(11, "Flag : bonus de Havre-Monde destin\u00e9 aux visiteurs");
    public static final /* enum */ eNi qWz = new eNi(12, "Flag : bonus de Havre-Monde destin\u00e9 aux membres de la guilde hors du HM");
    public static final /* enum */ eNi qWA = new eNi(13, "Bypass : ignore la stabilisation pour les effets pousser et tirer");
    public static final /* enum */ eNi qWB = new eNi(14, "Order : tri les cibles par distance (croissant)");
    public static final /* enum */ eNi qWC = new eNi(15, "Bybass : peut \u00eatre ex\u00e9cut\u00e9 sur un fighter KO");
    public static final /* enum */ eNi qWD = new eNi(16, "Misc : transmet son niveau de container \u00e0 ses sous effets");
    public static final /* enum */ eNi qWE = new eNi(17, "Bypass : ignore le maximum PA/PM hors combat");
    public static final /* enum */ eNi qWF = new eNi(18, "Scenario : d\u00e9clenche un \u00e9v\u00e8nement de sc\u00e9nario apr\u00e8s son ex\u00e9cution");
    public static final /* enum */ eNi qWG = new eNi(19, "Bypass : n'applique pas Volont\u00e9");
    public static final /* enum */ eNi qWH = new eNi(20, "Flag : bonus de Guilde");
    public static final /* enum */ eNi qWI = new eNi(21, "Bypass : bonus de Prospection autoris\u00e9 pour les companions");
    public static final /* enum */ eNi qWJ = new eNi(22, "Flag : effet Monocible (HP_LOSS)");
    public static final /* enum */ eNi qWK = new eNi(23, "Flag : effet M\u00eal\u00e9e (HP_LOSS)");
    public static final /* enum */ eNi qWL = new eNi(24, "Flag : effet Distance (HP_LOSS)");
    public static final /* enum */ eNi qWM = new eNi(25, "Order : tri les cibles par %PV Restants (d\u00e9croissant)");
    public static final /* enum */ eNi qWN = new eNi(26, "Order : tri les cibles par distance (d\u00e9croissant)");
    public static final /* enum */ eNi qWO = new eNi(27, "Misc : ne met pas \u00e0 jour la position des fighters invisibles pour l'IA");
    public static final /* enum */ eNi qWP = new eNi(28, "Bypass : ignore l'Armure et la Barri\u00e8re (HP_LOSS)");
    public static final /* enum */ eNi qWQ = new eNi(29, "Flag : effet de vol de vie (HP_GAIN)");
    public static final /* enum */ eNi qWR = new eNi(30, "Bypass : ignore la Volont\u00e9");
    public static final /* enum */ eNi qWS = new eNi(31, "Flag : effet de Bombe");
    public static final /* enum */ eNi qWT = new eNi(32, "Misc : n'envoie pas de notification \u00e0 l'IA");
    public static final /* enum */ eNi qWU = new eNi(33, "Bypass : effet de soin qui n'est pas affect\u00e9 par la propri\u00e9t\u00e9 MORT VIVANT");
    public static final /* enum */ eNi qWV = new eNi(34, "Bypass : la perte de PV n'est pas consid\u00e9r\u00e9e comme indirecte");
    public static final /* enum */ eNi qWW = new eNi(35, "Flag : aura de relique");
    public static final /* enum */ eNi qWX = new eNi(36, "Bypass : ne prend pas en compte les propri\u00e9t\u00e9s de stabilisation des fighters");
    private final byte qWY;
    private final String qWZ;
    private static final /* synthetic */ eNi[] qXa;

    public static eNi[] values() {
        return (eNi[])qXa.clone();
    }

    public static eNi valueOf(String string) {
        return Enum.valueOf(eNi.class, string);
    }

    private eNi(int n2, String string2) {
        this.qWZ = string2;
        this.qWY = (byte)n2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.qWY);
    }

    public byte fBc() {
        return this.qWY;
    }

    @Override
    public String aXB() {
        return this.qWZ;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static eNi RQ(int n) {
        for (eNi eNi2 : eNi.values()) {
            if (eNi2.qWY != n) continue;
            return eNi2;
        }
        return null;
    }

    private static /* synthetic */ eNi[] fBd() {
        return new eNi[]{qWp, qWq, qWr, qWs, qWt, qWu, qWv, qWw, qWx, qWy, qWz, qWA, qWB, qWC, qWD, qWE, qWF, qWG, qWH, qWI, qWJ, qWK, qWL, qWM, qWN, qWO, qWP, qWQ, qWR, qWS, qWT, qWU, qWV, qWW, qWX};
    }

    static {
        qXa = eNi.fBd();
    }
}

