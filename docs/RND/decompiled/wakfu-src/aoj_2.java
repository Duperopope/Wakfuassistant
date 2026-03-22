/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoJ
 */
public class aoj_2
extends aoh_1 {
    public static final String cMG = "forme \u00e0 base de points";
    private static final aoj_2 cMH = new aoj_2();
    private final List<int[]> cMI = new ArrayList<int[]>(1);
    public static final aox_1 cMJ = new aob_2(new aoa_1("Liste de 1 point : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1")), new aoa_1("Liste de 2 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2")), new aoa_1("Liste de 3 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3")), new aoa_1("Liste de 4 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4")), new aoa_1("Liste de 5 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5")), new aoa_1("Liste de 6 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6")), new aoa_1("Liste de 7 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7")), new aoa_1("Liste de 8 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8")), new aoa_1("Liste de 9 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9")), new aoa_1("Liste de 10 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10")), new aoa_1("Liste de 11 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10"), new aou_1("x11"), new aou_1("y11")), new aoa_1("Liste de 12 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10"), new aou_1("x11"), new aou_1("y11"), new aou_1("x12"), new aou_1("y12")), new aoa_1("Liste de 13 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10"), new aou_1("x11"), new aou_1("y11"), new aou_1("x12"), new aou_1("y12"), new aou_1("x13"), new aou_1("y13")), new aoa_1("Liste de 14 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10"), new aou_1("x11"), new aou_1("y11"), new aou_1("x12"), new aou_1("y12"), new aou_1("x13"), new aou_1("y13"), new aou_1("x14"), new aou_1("y14")), new aoa_1("Liste de 15 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10"), new aou_1("x11"), new aou_1("y11"), new aou_1("x12"), new aou_1("y12"), new aou_1("x13"), new aou_1("y13"), new aou_1("x14"), new aou_1("y14"), new aou_1("x15"), new aou_1("y15")), new aoa_1("Liste de 16 points : prendre l'axe sud-est pour construire", new aou_1("x1"), new aou_1("y1"), new aou_1("x2"), new aou_1("y2"), new aou_1("x3"), new aou_1("y3"), new aou_1("x4"), new aou_1("y4"), new aou_1("x5"), new aou_1("y5"), new aou_1("x6"), new aou_1("y6"), new aou_1("x7"), new aou_1("y7"), new aou_1("x8"), new aou_1("y8"), new aou_1("x9"), new aou_1("y9"), new aou_1("x10"), new aou_1("y10"), new aou_1("x11"), new aou_1("y11"), new aou_1("x12"), new aou_1("y12"), new aou_1("x13"), new aou_1("y13"), new aou_1("x14"), new aou_1("y14"), new aou_1("x15"), new aou_1("y15"), new aou_1("x16"), new aou_1("y16")));

    @Override
    public aox_1 bEt() {
        return cMJ;
    }

    public static aoj_2 bEA() {
        return cMH;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMI;
    }

    @Override
    public String bEn() {
        return cMG;
    }

    @Override
    public String bEo() {
        return null;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null || nArray.length % 2 != 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type Point : modulo2 attendu, " + nArray.length + " fourni(s)");
        }
        this.cMI.clear();
        for (int i = 0; i < nArray.length; i += 2) {
            this.cMI.add(aod_2.bQ(nArray[i], nArray[i + 1]));
        }
    }

    @Override
    protected boolean bEk() {
        return false;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLo;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.cMI.size() == 1) {
            return aoy_2.cLB;
        }
        return aoy_2.cLA;
    }
}

