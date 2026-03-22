/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bpR
 */
public final class bpr_0
extends Enum<bpr_0> {
    public static final /* enum */ bpr_0 iYb = new bpr_0(0, "monsterNoBG");
    public static final /* enum */ bpr_0 iYc = new bpr_0(1, "battleNoBG");
    public static final /* enum */ bpr_0 iYd = new bpr_0(2, "craftFromNoBG");
    public static final /* enum */ bpr_0 iYe = new bpr_0(3, "kamasNoBG");
    public static final /* enum */ bpr_0 iYf = new bpr_0(4, "exploitsNoBG");
    public static final /* enum */ bpr_0 iYg = new bpr_0(5, "caseMarkerNoBG");
    public static final /* enum */ bpr_0 iYh = new bpr_0(6, "collectNoBG");
    public static final /* enum */ bpr_0 iYi = new bpr_0(7, "chestNoBG");
    public static final /* enum */ bpr_0 iYj = new bpr_0(8, "useNoBG");
    public static final /* enum */ bpr_0 iYk = new bpr_0(9, "recycleNoBG");
    public static final bpr_0[] iYl;
    public static final int iYm;
    private final int iYn;
    private final String iYo;
    private static final /* synthetic */ bpr_0[] iYp;

    public static bpr_0[] values() {
        return (bpr_0[])iYp.clone();
    }

    public static bpr_0 valueOf(String string) {
        return Enum.valueOf(bpr_0.class, string);
    }

    private bpr_0(int n2, String string2) {
        this.iYn = n2;
        this.iYo = string2;
    }

    public int wp() {
        return this.iYn;
    }

    public String getStyle() {
        return this.iYo;
    }

    public String dDJ() {
        return "encyclopedia.item.acquisition." + this.name();
    }

    public String dDK() {
        return "encyclopedia.item.acquisition.label." + this.name();
    }

    private static /* synthetic */ bpr_0[] dDL() {
        return new bpr_0[]{iYb, iYc, iYd, iYe, iYf, iYg, iYh, iYi, iYj, iYk};
    }

    static {
        iYp = bpr_0.dDL();
        iYl = bpr_0.values();
        iYm = iYl.length;
    }
}

