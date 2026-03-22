/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGZ
 */
public class agz_1 {
    public static final agz_1 dNB = new agz_1(1.0f, 10.0f, 18.0f);
    private float cnP;
    private float dNC;
    private float dNd;
    public static final String dND = "rollOffFactor";
    public static final String dNE = "refDistance";
    public static final String dNF = "maxDistance";

    public agz_1() {
    }

    public agz_1(float f2, float f3, float f4) {
        this.cnP = f2;
        this.dNC = f3;
        this.dNd = f4;
    }

    public float bwH() {
        return this.cnP;
    }

    public float bwI() {
        return this.dNC;
    }

    public float bwF() {
        return this.dNd;
    }

    public static agz_1 i(apd_1 apd_12) {
        agz_1 agz_12 = new agz_1();
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (apd_13.getName().equals(dND)) {
                agz_12.cnP = apd_13.fq("value").bCs();
                continue;
            }
            if (apd_13.getName().equals(dNE)) {
                agz_12.dNC = apd_13.fq("value").bCs();
                continue;
            }
            if (!apd_13.getName().equals(dNF)) continue;
            agz_12.dNd = apd_13.fq("value").bCs();
        }
        return agz_12;
    }

    public static aah_1<agz_1> j(apd_1 apd_12) {
        aah_1<agz_1> aah_12 = new aah_1<agz_1>();
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (!apd_13.getName().equals("rollOff")) continue;
            aah_12.b(apd_13.fq("id").bCo(), agz_1.i(apd_13));
        }
        return aah_12;
    }
}

