/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from arx
 */
public final class arx_1
extends Enum<arx_1> {
    public static final /* enum */ arx_1 cTr = new arx_1("none", 0);
    public static final /* enum */ arx_1 cTs = new arx_1("Peau", 1);
    public static final /* enum */ arx_1 cTt = new arx_1("Cheveux", 2);
    public static final /* enum */ arx_1 cTu = new arx_1("SymbolBg", 3);
    public static final /* enum */ arx_1 cTv = new arx_1("SymbolFg", 4);
    public static final /* enum */ arx_1 cTw = new arx_1("SymbolBorder", 5);
    public static final /* enum */ arx_1 cTx = new arx_1("Color_1", 6);
    public static final /* enum */ arx_1 cTy = new arx_1("Color_2", 7);
    public static final /* enum */ arx_1 cTz = new arx_1("Pupille", 8);
    public static final /* enum */ arx_1 cTA = new arx_1("Vetement", 9);
    public static final /* enum */ arx_1 cTB = new arx_1("ColorCostume1", 10);
    public static final /* enum */ arx_1 cTC = new arx_1("ColorCostume2", 11);
    public static final /* enum */ arx_1 cTD = new arx_1("ColorCostume3", 12);
    public static final /* enum */ arx_1 cTE = new arx_1("ColorCostume4", 13);
    public static final /* enum */ arx_1 cTF = new arx_1("ColorCostume5", 14);
    public static final /* enum */ arx_1 cTG = new arx_1("ColorCostume6", 15);
    public static final List<arx_1> cTH;
    private final String cTI;
    private final int cTJ;
    private static final /* synthetic */ arx_1[] cTK;

    public static arx_1[] values() {
        return (arx_1[])cTK.clone();
    }

    public static arx_1 valueOf(String string) {
        return Enum.valueOf(arx_1.class, string);
    }

    private arx_1(String string2, int n2) {
        this.cTI = string2;
        this.cTJ = n2;
    }

    public static arx_1 fS(String string) {
        for (arx_1 arx_12 : arx_1.values()) {
            if (!arx_12.cTI.equalsIgnoreCase(string)) continue;
            return arx_12;
        }
        return cTr;
    }

    public static arx_1 tP(int n) {
        for (arx_1 arx_12 : arx_1.values()) {
            if (arx_12.cTJ != n) continue;
            return arx_12;
        }
        return cTr;
    }

    public String getName() {
        return this.cTI;
    }

    public int bHJ() {
        return this.cTJ;
    }

    public static boolean a(arx_1 arx_12) {
        return cTH.contains((Object)arx_12);
    }

    private static /* synthetic */ arx_1[] bHK() {
        return new arx_1[]{cTr, cTs, cTt, cTu, cTv, cTw, cTx, cTy, cTz, cTA, cTB, cTC, cTD, cTE, cTF, cTG};
    }

    static {
        cTK = arx_1.bHK();
        cTH = List.of(cTB, cTC, cTD, cTE, cTF, cTG);
    }
}

