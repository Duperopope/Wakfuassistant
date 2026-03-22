/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bje
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bje_1
extends Enum<bje_1> {
    public static final /* enum */ bje_1 ins = new bje_1(Integer.MIN_VALUE, "808080", -1);
    public static final /* enum */ bje_1 int = new bje_1(Integer.MIN_VALUE, "808080", 3);
    public static final /* enum */ bje_1 inu = new bje_1(Integer.MIN_VALUE, "808080", 4);
    public static final /* enum */ bje_1 inv = new bje_1(Integer.MIN_VALUE, "808080", 0);
    public static final /* enum */ bje_1 inw = new bje_1(-20, "6561ff", 0);
    public static final /* enum */ bje_1 inx = new bje_1(-12, "61ff65", 0);
    public static final /* enum */ bje_1 iny = new bje_1(-4, "ffffff", 1);
    public static final /* enum */ bje_1 inz = new bje_1(4, "ffb761", 2);
    public static final /* enum */ bje_1 inA = new bje_1(12, "ff0000", 2);
    public static final /* enum */ bje_1 inB = new bje_1(20, "d200ff", 2);
    public static final /* enum */ bje_1 inC = new bje_1(Integer.MAX_VALUE, "d200ff", 5);
    private final int inD;
    private final String inE;
    private final byte inF;
    private static final Logger inG;
    private static final /* synthetic */ bje_1[] inH;

    public static bje_1[] values() {
        return (bje_1[])inH.clone();
    }

    public static bje_1 valueOf(String string) {
        return Enum.valueOf(bje_1.class, string);
    }

    private bje_1(int n2, String string2, byte by) {
        this.inD = n2;
        this.inE = string2;
        this.inF = by;
    }

    public static bje_1 dp(int n, int n2) {
        int n3 = n2 - n;
        bje_1 bje_12 = null;
        for (bje_1 bje_13 : bje_1.values()) {
            if (bje_13.inD <= n3) {
                bje_12 = bje_13;
                continue;
            }
            if (bje_13.inD > n3) break;
        }
        return bje_12;
    }

    public static bje_1 dq(int n, int n2) {
        if (n <= n2 / 2) {
            return inx;
        }
        if (n <= n2 * 3 / 4) {
            return iny;
        }
        if (n <= n2) {
            return inz;
        }
        return null;
    }

    public String drb() {
        return this.inE;
    }

    public String Dh(int n) {
        switch (this.ordinal()) {
            case 0: {
                try {
                    return auc_0.kG("groupDifficultyChallengeIconPath");
                }
                catch (fu_0 fu_02) {
                    inG.warn((Object)fu_02.getMessage());
                    break;
                }
            }
            default: {
                try {
                    return fo_0.b(auc_0.cVq().bS("groupDifficultyIconsPath"), n, this.inF);
                }
                catch (fu_0 fu_03) {
                    inG.warn((Object)fu_03.getMessage());
                    return null;
                }
            }
        }
        return null;
    }

    private static /* synthetic */ bje_1[] drc() {
        return new bje_1[]{ins, int, inu, inv, inw, inx, iny, inz, inA, inB, inC};
    }

    static {
        inH = bje_1.drc();
        inG = Logger.getLogger(bje_1.class);
    }
}

