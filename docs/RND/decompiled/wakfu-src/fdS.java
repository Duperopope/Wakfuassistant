/*
 * Decompiled with CFR 0.152.
 */
public final class fdS
extends Enum<fdS>
implements aoq_1,
aoy_1 {
    public static final /* enum */ fdS rYo = new fdS(1, fdT.rYL, "Permet de jouer un Script");
    public static final /* enum */ fdS rYp = new fdS(2, fdT.rYP, "Applique un \u00e9tat sur le joueur");
    public static final /* enum */ fdS rYq = new fdS(3, fdT.rYM, "T\u00e9l\u00e9porte le joueur");
    public static final /* enum */ fdS rYr = new fdS(4, fdT.rYN, "Donne un item au joueur depuis une table de loot");
    public static final /* enum */ fdS rYs = new fdS(5, fdT.rYF, "Donne des kamas au joueur");
    public static final /* enum */ fdS rYt = new fdS(6, fdT.rYG, "Active un achievement/qu\u00eate");
    public static final /* enum */ fdS rYu = new fdS(7, fdT.rYH, "Donne une emote au joueur");
    public static final /* enum */ fdS rYv = new fdS(9, fdT.rYJ, "Lance une recustom de perso");
    public static final /* enum */ fdS rYw = new fdS(10, fdT.rYK, "Lance un sc\u00e9nario");
    public static final /* enum */ fdS rYx = new fdS(11, fdT.rYQ, "Ouvre le comptoir de mercenaire");
    public static final /* enum */ fdS rYy = new fdS(12, fdT.rYO, "Donne un item par id au joueur");
    public static final /* enum */ fdS rYz = new fdS(13, fdT.rYR, "Soigne le joueur");
    public static final /* enum */ fdS rYA = new fdS(14, fdT.rYS, "Ouvre la N\u00e9o-carte");
    private final byte rYB;
    private final String rYC;
    private final aox_1 rYD;
    private static final /* synthetic */ fdS[] rYE;

    public static fdS[] values() {
        return (fdS[])rYE.clone();
    }

    public static fdS valueOf(String string) {
        return Enum.valueOf(fdS.class, string);
    }

    private fdS(int n2, aox_1 aox_12, String string2) {
        this.rYB = (byte)n2;
        this.rYC = string2;
        this.rYD = aox_12;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.rYB);
    }

    @Override
    public String aXB() {
        return this.rYC;
    }

    public static fdS Ux(int n) {
        for (fdS fdS2 : fdS.values()) {
            if (fdS2.rYB != n) continue;
            return fdS2;
        }
        return null;
    }

    @Override
    public aox_1 bEt() {
        return this.rYD;
    }

    @Override
    public String aXC() {
        return null;
    }

    public byte aJr() {
        return this.rYB;
    }

    private static /* synthetic */ fdS[] fUk() {
        return new fdS[]{rYo, rYp, rYq, rYr, rYs, rYt, rYu, rYv, rYw, rYx, rYy, rYz, rYA};
    }

    static {
        rYE = fdS.fUk();
    }
}

