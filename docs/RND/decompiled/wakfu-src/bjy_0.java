/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJY
 */
public final class bjy_0
extends Enum<bjy_0>
implements aoq_1 {
    public static final /* enum */ bjy_0 kmK = new bjy_0(new bjz_0(1), "Protecteur attaqu\u00e9", "Le protecteur est attaqu\u00e9 par une nation, il propose aux joueurs de le d\u00e9fendre");
    public static final /* enum */ bjy_0 kmL = new bjy_0(new bKa(2), "Protecteur a d\u00e9fendu", "Le protecteur a vaincu ses assaillants (avec ou sans aide)");
    public static final /* enum */ bjy_0 kmM = new bjy_0(new bKb(3), "Protecteur vaincu", "Le protecteur a \u00e9t\u00e9 vaincu et a chang\u00e9 de nation");
    public static final /* enum */ bjy_0 kmN = new bjy_0(new bKc(4), "Message de bienvenue", "Le joueur rencontre un protecteur");
    public static final /* enum */ bjy_0 kmO = new bjy_0(new bKd(5), "Challenge propos\u00e9", "Le protecteur propose un challenge");
    public static final /* enum */ bjy_0 kmP = new bjy_0(new bKe(6), "Changement de pr\u00e9vision meteo", "Les pr\u00e9visions m\u00e9t\u00e9o de la zone ont chang\u00e9");
    public static final /* enum */ bjy_0 kmQ = new bjy_0(new bKf(7), "Changement de satisfaction", "La satisfaction du protecteur a chang\u00e9");
    public static final /* enum */ bjy_0 kmR = new bjy_0(new bKg(8), "D\u00e9but de chaos", "Un chaos a \u00e9t\u00e9 d\u00e9clench\u00e9 dans un territoire");
    public static final /* enum */ bjy_0 kmS = new bjy_0(new bKh(9), "Fin de chaos", "Un chaos a \u00e9t\u00e9 stopp\u00e9 dans un territoire");
    private final bJX kmT;
    private final String kmU;
    private final String kmV;
    private static final /* synthetic */ bjy_0[] kmW;

    public static bjy_0[] values() {
        return (bjy_0[])kmW.clone();
    }

    public static bjy_0 valueOf(String string) {
        return Enum.valueOf(bjy_0.class, string);
    }

    private bjy_0(bJX bJX2, String string2, String string3) {
        this.kmT = bJX2;
        this.kmU = string2;
        this.kmV = string3;
    }

    public static bjy_0 HK(int n) {
        for (bjy_0 bjy_02 : bjy_0.values()) {
            if (n != bjy_02.d()) continue;
            return bjy_02;
        }
        return null;
    }

    public int d() {
        return this.kmT.aGz();
    }

    @Override
    public String aXA() {
        return Integer.toString(this.kmT.aGz());
    }

    @Override
    public String aXB() {
        return this.kmU;
    }

    @Override
    public String aXC() {
        return this.kmV;
    }

    public bjw_0 ebc() {
        return this.kmT.ebb();
    }

    private static /* synthetic */ bjy_0[] ebd() {
        return new bjy_0[]{kmK, kmL, kmM, kmN, kmO, kmP, kmQ, kmR, kmS};
    }

    static {
        kmW = bjy_0.ebd();
    }
}

