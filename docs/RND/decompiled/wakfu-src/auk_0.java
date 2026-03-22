/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUK
 */
public class auk_0
implements bj_0 {
    public static final auk_0 hrk = new auk_0();
    public static final byte hrl = 0;
    public static final byte hrm = 1;
    public static final byte hrn = 2;
    public static final byte hro = 3;
    public static final byte hrp = 4;
    public static final byte hrq = 5;
    public static final byte hrr = 6;
    public static final byte hrs = 7;
    public static final byte hrt = 9;
    public static final byte hru = 10;
    public static final byte hrv = 11;
    public static final byte hrw = 12;
    public static final byte hrx = 13;
    public static final byte hry = 39;
    public static final byte hrz = 83;
    public static final byte hrA = 116;
    public static final short hrB = 138;
    public static final short hrC = 137;
    public static final short hrD = 168;

    private auk_0() {
    }

    @Override
    public String a(BK bK, String string, String string2, int n, int n2) {
        return new ahv_2().a(switch (bK) {
            case BK.avt -> auk_0.kN(string);
            default -> auk_0.zU(Bw.m(string));
        }, n, n2, string2).ceL();
    }

    public static String zU(int n) {
        return String.format(auc_0.cVq().bS("textIconsPath"), n);
    }

    public static String kN(String string) {
        return String.format(auc_0.cVq().bS("characteristicsIconsPath"), string);
    }
}

