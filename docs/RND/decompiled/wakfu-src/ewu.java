/*
 * Decompiled with CFR 0.152.
 */
public final class ewu
extends Enum<ewu>
implements aoq_1 {
    public static final /* enum */ ewu oGX = new ewu(0, "Pas d'effet (d\u00e9faut)", "Aucun effet n'est ex\u00e9cut\u00e9, mais le co\u00fbt de lancement est consomm\u00e9");
    public static final /* enum */ ewu oGY = new ewu(1, "Pas d'effet, suppression des PA", "Aucun effet n'est ex\u00e9cut\u00e9, co\u00fbt consomm\u00e9 et PA remis \u00e0 0");
    public static final /* enum */ ewu oGZ = new ewu(2, "Pas d'effet, suppression des PA/PM/PW", "AUcun effet n'est ex\u00e9cut\u00e9, co\u00fbt consomm\u00e9 et les PA/PM/PW remis \u00e0 0");
    private final int oHa;
    private final String oHb;
    private final String oHc;
    private static final /* synthetic */ ewu[] oHd;

    public static ewu[] values() {
        return (ewu[])oHd.clone();
    }

    public static ewu valueOf(String string) {
        return Enum.valueOf(ewu.class, string);
    }

    private ewu(int n2, String string2, String string3) {
        this.oHa = n2;
        this.oHb = string2;
        this.oHc = string3;
    }

    public static ewu Ou(int n) {
        for (ewu ewu2 : ewu.values()) {
            if (ewu2.oHa != n) continue;
            return ewu2;
        }
        return oGX;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.oHa);
    }

    @Override
    public String aXB() {
        return this.oHb;
    }

    @Override
    public String aXC() {
        return this.oHc;
    }

    private static /* synthetic */ ewu[] feW() {
        return new ewu[]{oGX, oGY, oGZ};
    }

    static {
        oHd = ewu.feW();
    }
}

