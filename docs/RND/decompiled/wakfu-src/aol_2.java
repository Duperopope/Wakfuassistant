/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoL
 */
public class aol_2
extends aoh_1 {
    public static final String cMR = "rectangle or square";
    private int brs;
    private int brt;
    private final List<int[]> cMS = new ArrayList<int[]>(1);
    public static final aox_1 cMT = new aob_2(new aoa_1("Carr\u00e9 plein", new aou_1("Taille d'un c\u00f4t\u00e9 (doit \u00eatre impaire)")), new aoa_1("Rectangle plein", new aou_1("Largeur (doit \u00eatre impaire)"), new aou_1("Hauteur (doit \u00eatre impaire)")));

    @Override
    public aox_1 bEt() {
        return cMT;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMS;
    }

    @Override
    public String bEn() {
        return "rectangle or square-" + this.brs + "x" + this.brt;
    }

    @Override
    public String bEo() {
        if (this.brs == this.brt) {
            return String.valueOf(this.brs);
        }
        return this.brs + " x " + this.brt;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type square : 1 \u00e0 2 param\u00e8tre attendu, 0 trouv\u00e9(s)");
        }
        if (nArray.length > 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type carr\u00e9 : 1 \u00e0 2 param\u00e8tre attendu, " + nArray.length + " trouv\u00e9(s)");
        }
        this.brs = nArray[0];
        this.brt = nArray.length == 1 ? this.brs : nArray[1];
        if (this.brs != 0 && this.brs % 2 == 0) {
            ++this.brs;
        }
        if (this.brt != 0 && this.brt % 2 == 0) {
            ++this.brt;
        }
        int n = (this.brs - 1) / 2;
        int n2 = (this.brt - 1) / 2;
        for (int i = 0; i < this.brs; ++i) {
            for (int j = 0; j < this.brt; ++j) {
                this.cMS.add(aod_2.bQ(i - n, j - n2));
            }
        }
    }

    @Override
    protected boolean bEk() {
        return this.brs == this.brt;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLm;
    }

    public int getWidth() {
        return this.brs;
    }

    public int getHeight() {
        return this.brt;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.brt == 0 && this.brs == 0) {
            return aoy_2.cLB;
        }
        if (this.brt == this.brs) {
            return aoy_2.cLH;
        }
        return aoy_2.cLJ;
    }
}

