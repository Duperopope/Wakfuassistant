/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from VB
 */
public final class vb_0
extends Enum<vb_0> {
    public static final /* enum */ vb_0 bIT = new vb_0(-1, "?");
    public static final /* enum */ vb_0 bIU = new vb_0(0, "fr", Mv.aVk);
    public static final /* enum */ vb_0 bIV = new vb_0(1, "en");
    public static final /* enum */ vb_0 bIW = new vb_0(2, "int");
    public static final /* enum */ vb_0 bIX = new vb_0(3, "de");
    public static final /* enum */ vb_0 bIY = new vb_0(4, "es", Mv.aVm);
    public static final /* enum */ vb_0 bIZ = new vb_0(5, "ru");
    public static final /* enum */ vb_0 bJa = new vb_0(6, "pt", Mv.aVn);
    public static final /* enum */ vb_0 bJb = new vb_0(7, "nl");
    public static final /* enum */ vb_0 bJc = new vb_0(8, "jp");
    public static final /* enum */ vb_0 bJd = new vb_0(9, "it");
    public static final /* enum */ vb_0 bJe = new vb_0(11, "na");
    public static final /* enum */ vb_0 bJf = new vb_0(12, "cn");
    public static final /* enum */ vb_0 bJg = new vb_0(13, "asia");
    public static final /* enum */ vb_0 bJh = new vb_0(14, "tw");
    public static final vb_0 bJi;
    private final int bJj;
    private final String bJk;
    private final Mv bJl;
    private static final /* synthetic */ vb_0[] bJm;

    public static vb_0[] values() {
        return (vb_0[])bJm.clone();
    }

    public static vb_0 valueOf(String string) {
        return Enum.valueOf(vb_0.class, string);
    }

    private vb_0(int n2, String string2) {
        this(n2, string2, Mv.aVy);
    }

    private vb_0(int n2, String string2, Mv mv) {
        this.bJj = n2;
        this.bJk = string2;
        this.bJl = mv;
    }

    public int d() {
        return this.bJj;
    }

    public String getName() {
        return this.bJk;
    }

    public Mv aUXX() {
        return this.bJl;
    }

    public static vb_0 pS(int n) {
        for (vb_0 vb_02 : vb_0.values()) {
            if (n != vb_02.bJj) continue;
            return vb_02;
        }
        return bJi;
    }

    private static /* synthetic */ vb_0[] bkw() {
        return new vb_0[]{bIT, bIU, bIV, bIW, bIX, bIY, bIZ, bJa, bJb, bJc, bJd, bJe, bJf, bJg, bJh};
    }

    static {
        bJm = vb_0.bkw();
        bJi = bIV;
    }
}

