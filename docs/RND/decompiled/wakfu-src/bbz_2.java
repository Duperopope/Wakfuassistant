/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbZ
 */
public final class bbz_2
extends Enum<bbz_2>
implements aoq_1 {
    public static final /* enum */ bbz_2 hCS = new bbz_2(0, "Aucun (valeur par d\u00e9faut)");
    public static final /* enum */ bbz_2 hCT = new bbz_2(1, "\u00c9pop\u00e9e");
    public static final /* enum */ bbz_2 hCU = new bbz_2(2, "Principale");
    public static final /* enum */ bbz_2 hCV = new bbz_2(3, "Secondaire");
    public static final /* enum */ bbz_2 hCW = new bbz_2(4, "R\u00e9p\u00e9table");
    public static final /* enum */ bbz_2 hCX = new bbz_2(5, "\u00c9v\u00e8nement");
    private final int hCY;
    private final String hCZ;
    private static final /* synthetic */ bbz_2[] hDa;

    public static bbz_2[] values() {
        return (bbz_2[])hDa.clone();
    }

    public static bbz_2 valueOf(String string) {
        return Enum.valueOf(bbz_2.class, string);
    }

    private bbz_2(int n2, String string2) {
        this.hCY = n2;
        this.hCZ = string2;
    }

    public static bbz_2 AJ(int n) {
        for (bbz_2 bbz_22 : bbz_2.values()) {
            if (bbz_22.hCY != n) continue;
            return bbz_22;
        }
        return hCS;
    }

    public int d() {
        return this.hCY;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.hCY);
    }

    @Override
    public String aXB() {
        return this.hCZ;
    }

    @Override
    public String aXC() {
        return "Cat\u00e9gorie dans laquelle la qu\u00eate doit appara\u00eetre";
    }

    private static /* synthetic */ bbz_2[] daA() {
        return new bbz_2[]{hCS, hCT, hCU, hCV, hCW, hCX};
    }

    static {
        hDa = bbz_2.daA();
    }
}

