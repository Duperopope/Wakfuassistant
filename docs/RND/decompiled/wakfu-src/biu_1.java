/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIU
 */
public final class biu_1
extends Enum<biu_1> {
    public static final /* enum */ biu_1 kiv = new biu_1(0, "singleCharacterIcon");
    public static final /* enum */ biu_1 kiw = new biu_1(1, "optionsIcon");
    public static final /* enum */ biu_1 kix = new biu_1(2, "LaurelIcon");
    public static final /* enum */ biu_1 kiy = new biu_1(3, "LaurelIcon");
    public static final /* enum */ biu_1 kiz = new biu_1(4, "balanceIcon", 5000, 0);
    public static final /* enum */ biu_1 kiA = new biu_1(5, "contactsIcon");
    public static final /* enum */ biu_1 kiB = new biu_1(6, "DongeonIcon");
    public static final /* enum */ biu_1 kiC = new biu_1(7, "ChallengeIcon");
    public static final /* enum */ biu_1 kiD = new biu_1(8, "WeatherIcon");
    public static final /* enum */ biu_1 kiE = new biu_1(9, "questionMark", 15000, 0);
    public static final /* enum */ biu_1 kiF = new biu_1(10, "ChallengeIcon");
    public static final /* enum */ biu_1 kiG = new biu_1(11, "ChallengeIcon", 5000, 1);
    public static final /* enum */ biu_1 kiH = new biu_1(12, "ChallengeIcon", 5000, 2);
    public static final /* enum */ biu_1 kiI = new biu_1(13, "passportPvpCategoryIcon");
    private final byte kiJ;
    private final String kiK;
    private final int kiL;
    private final int kiM;
    private static final /* synthetic */ biu_1[] kiN;

    public static biu_1[] values() {
        return (biu_1[])kiN.clone();
    }

    public static biu_1 valueOf(String string) {
        return Enum.valueOf(biu_1.class, string);
    }

    private biu_1(byte by, String string2) {
        this(by, string2, 5000, 0);
    }

    private biu_1(byte by, String string2, int n2, int n3) {
        this.kiJ = by;
        this.kiK = string2;
        this.kiL = n2;
        this.kiM = n3;
    }

    public byte aJr() {
        return this.kiJ;
    }

    public String dZv() {
        return this.kiK;
    }

    public int getDuration() {
        return this.kiL;
    }

    public int aeV() {
        return this.kiM;
    }

    private static /* synthetic */ biu_1[] dZw() {
        return new biu_1[]{kiv, kiw, kix, kiy, kiz, kiA, kiB, kiC, kiD, kiE, kiF, kiG, kiH, kiI};
    }

    static {
        kiN = biu_1.dZw();
    }
}

