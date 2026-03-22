/*
 * Decompiled with CFR 0.152.
 */
public final class VI
extends Enum<VI> {
    public static final /* enum */ VI bJF = new VI(0, new String[]{":)", ":]", ":}", "=)", "=]", ":-)", ":o)"}, "AnimSourire");
    public static final /* enum */ VI bJG = new VI(1, new String[]{":(", ":[", ":{", "=(", "=/", ":-(", "._.", "v_v", "\u00e9_\u00e8"}, "AnimTriste");
    public static final /* enum */ VI bJH = new VI(2, new String[]{";)", ";]", ";-)", ",-)", "*-)"}, "AnimClinOeil");
    public static final /* enum */ VI bJI = new VI(3, new String[]{":D", "=D", "8D", "|D", ":-D"}, "AnimGrosSourire");
    public static final /* enum */ VI bJJ = new VI(4, new String[]{":/", "X/", "X'(", ":*(", "X_+", "+_X", ":s", ":S", ":x", ":-s", ":-S", "'x'", "(\u00b0~\u00b0)"}, "AnimMalade");
    public static final /* enum */ VI bJK = new VI(5, new String[]{"xD", "8D", "X3", "XD"}, "AnimMoqueur");
    public static final /* enum */ VI bJL = new VI(6, new String[]{";D", "*o*", "*-*", "*3*", "\u00b03\u00b0", "^3^", "8-)", "8)"}, "AnimAmoureux");
    public static final /* enum */ VI bJM = new VI(7, new String[]{"-_-", "-.-", ":-|", ":|", "'-_-", "'_'", "-.-'", "--'"}, "AnimBlaser");
    public static final /* enum */ VI bJN = new VI(8, new String[]{":@", "\u00e8_\u00e9", ">(", ">:("}, "AnimColere");
    public static final /* enum */ VI bJO = new VI(9, new String[]{":p", ":b", ":P", ":6", ":9", ":-p", ":-b", ":-P"}, "AnimTireLangue");
    public static final /* enum */ VI bJP = new VI(10, new String[]{":O", "D:", ":-O", "O.O", "O_O"}, "AnimPeur");
    public static final /* enum */ VI bJQ = new VI(11, new String[]{":'(", ":'-(", ";_;", "T-T", "T_T", "u_u", "U_U", "q_q", "QQ"}, "AnimPleure");
    public static final /* enum */ VI bJR = new VI(12, new String[]{":$", "^^", "^.^", "^_^", "n_n", "(^^)", "(^.^)", "(^_^)", "^^'"}, "AnimRougit");
    public static final /* enum */ VI bJS = new VI(13, new String[]{":o", ":0", "^^'", "-_-'", "'_'", "'A'", "'o'", "o_o"}, "AnimSueur");
    public static final /* enum */ VI bJT = new VI(14, new String[]{":-E", "\u00e8_\u00e9", "X(", "x(", "x[", "@_@", "OwO", "\u00a4_\u00a4"}, "AnimEnrager");
    public static final /* enum */ VI bJU = new VI(15, new String[]{"??", ":?"}, "AnimInterogation");
    public static final /* enum */ VI bJV = new VI(16, new String[]{"oo*", "oO*", "OO*", "Oo*"}, "AnimIdee");
    public static final /* enum */ VI bJW = new VI(17, new String[]{"{3", ":heart:", "K3|", "K3I"}, "AnimCoeur");
    public static final /* enum */ VI bJX = new VI(18, new String[]{"gg", "GG", "Gg", "gg!", "GG!", "GG!!", "GG!!!"}, "AnimGG");
    public static final /* enum */ VI bJY = new VI(19, new String[]{"loot", "LOOT", "Loot", "loot!", "LOOT!", "LOOOT", "LOOOOT"}, "AnimLoot");
    private final int bJZ;
    private final String[] bKa;
    private final String bKb;
    private final String bKc;
    private static final /* synthetic */ VI[] bKd;

    public static VI[] values() {
        return (VI[])bKd.clone();
    }

    public static VI valueOf(String string) {
        return Enum.valueOf(VI.class, string);
    }

    private VI(int n2, String[] stringArray, String string2) {
        this.bJZ = n2;
        this.bKa = stringArray;
        this.bKb = VI.k(stringArray);
        this.bKc = string2;
    }

    public int d() {
        return this.bJZ;
    }

    public String bkG() {
        return this.bKb;
    }

    public String bkH() {
        return this.bKa[0];
    }

    public String bkI() {
        return this.bKc;
    }

    public static int at(int n, int n2) {
        return n2 * 100 + n;
    }

    public static VI pX(int n) {
        for (VI vI : VI.values()) {
            if (n != vI.bJZ) continue;
            return vI;
        }
        return null;
    }

    public boolean dz(String string) {
        for (String string2 : this.bKa) {
            if (!string2.equals(string)) continue;
            return true;
        }
        return false;
    }

    private static String k(String[] stringArray) {
        Object object = "";
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            object = (String)object + VI.dA(string);
            if (i >= stringArray.length - 1) continue;
            object = (String)object + " ";
        }
        return object;
    }

    private static String dA(String string) {
        return string;
    }

    private static /* synthetic */ VI[] bkJ() {
        return new VI[]{bJF, bJG, bJH, bJI, bJJ, bJK, bJL, bJM, bJN, bJO, bJP, bJQ, bJR, bJS, bJT, bJU, bJV, bJW, bJX, bJY};
    }

    static {
        bKd = VI.bkJ();
    }
}

