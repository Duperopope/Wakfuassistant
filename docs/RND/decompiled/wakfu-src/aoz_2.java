/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoz
 */
public class aoz_2
extends aoh_1 {
    public static final String cLU = "circle";
    private int brI;
    private final List<int[]> cLV = new ArrayList<int[]>(1);
    public static final aox_1 cLW = new aob_2(new aoa_1("Cercle", new aou_1("rayon")));

    @Override
    public aox_1 bEt() {
        return cLW;
    }

    @Override
    public List<int[]> bEm() {
        return this.cLV;
    }

    @Override
    public String bEn() {
        return "circle-" + this.brI;
    }

    @Override
    public String bEo() {
        return String.valueOf(this.brI);
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null || nArray.length != 1) {
            if (nArray == null || nArray.length == 0) {
                throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cercle : 1 param\u00e8tre attendu, 0 trouv\u00e9(s)");
            }
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cercle : 1 param\u00e8tre attendu, " + nArray.length + " trouv\u00e9(s)");
        }
        this.brI = nArray[0];
        this.cLV.clear();
        for (int i = -this.brI; i <= this.brI; ++i) {
            int n = this.brI - Math.abs(i);
            for (int j = -n; j <= n; ++j) {
                this.cLV.add(aod_2.bQ(i, j));
            }
        }
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLi;
    }

    public int getRadius() {
        return this.brI;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.brI == 0) {
            return aoy_2.cLB;
        }
        return aoy_2.cLF;
    }
}

