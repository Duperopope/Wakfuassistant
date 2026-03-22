/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from aea
 */
public final class aea_0
extends Enum<aea_0> {
    public static final /* enum */ aea_0 cmn = new aea_0(0);
    public static final /* enum */ aea_0 cmo = new aea_0(1);
    public static final /* enum */ aea_0 cmp = new aea_0(2);
    public static final /* enum */ aea_0 cmq = new aea_0(3);
    public static final /* enum */ aea_0 cmr = new aea_0(4);
    public static final /* enum */ aea_0 cms = new aea_0(5);
    public static final /* enum */ aea_0 cmt = new aea_0(6);
    public static final /* enum */ aea_0 cmu = new aea_0(7);
    public static final /* enum */ aea_0 cmv = new aea_0(8);
    public static final /* enum */ aea_0 cmw = new aea_0(9);
    public static final /* enum */ aea_0 cmx = new aea_0(10);
    public static final /* enum */ aea_0 cmy = new aea_0(11);
    public static final /* enum */ aea_0 cmz = new aea_0(12);
    public static final /* enum */ aea_0 cmA = new aea_0(13);
    public static final /* enum */ aea_0 cmB = new aea_0(14);
    public static final /* enum */ aea_0 cmC = new aea_0(-1);
    private final int cmD;
    private static final Map<Integer, aea_0> cmE;
    private static final /* synthetic */ aea_0[] cmF;

    public static aea_0[] values() {
        return (aea_0[])cmF.clone();
    }

    public static aea_0 valueOf(String string) {
        return Enum.valueOf(aea_0.class, string);
    }

    private aea_0(int n2) {
        this.cmD = n2;
    }

    public int d() {
        return this.cmD;
    }

    public static aea_0 rZ(int n) {
        return cmE.get(n);
    }

    private static /* synthetic */ aea_0[] bwf() {
        return new aea_0[]{cmn, cmo, cmp, cmq, cmr, cms, cmt, cmu, cmv, cmw, cmx, cmy, cmz, cmA, cmB, cmC};
    }

    static {
        cmF = aea_0.bwf();
        cmE = new HashMap<Integer, aea_0>();
        for (aea_0 aea_02 : aea_0.values()) {
            cmE.put(aea_02.cmD, aea_02);
        }
    }
}

