/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoB
 */
public class aob_1
extends aoh_1 {
    public static final String cMa = "cross";
    private int cMb;
    private int cMc;
    private int cMd;
    private int cMe;
    private final List<int[]> cMf = new ArrayList<int[]>(1);
    public static final aox_1 cMg = new aob_2(new aoa_1("Croix (deux barres de tailles identiques)", new aou_1("distance centre -> extr\u00e9mit\u00e9")), new aoa_1("Croix (deux barres de tailles diff\u00e9rentes)", new aou_1("distance centre -> extr\u00e9mit\u00e9 face \u00e0 soi"), new aou_1("distance centre -> extr\u00e9mit\u00e9 sur le c\u00f4t\u00e9")), new aoa_1("Croix (4 barres de tailles diff\u00e9rentes)", new aou_1("distance centre -> extr\u00e9mit\u00e9 face \u00e0 soi vers le haut"), new aou_1("distance centre -> extr\u00e9mit\u00e9 face \u00e0 soi vers le bas"), new aou_1("distance centre -> extr\u00e9mit\u00e9 sur le c\u00f4t\u00e9 vers la gauche"), new aou_1("distance centre -> extr\u00e9mit\u00e9 sur le c\u00f4t\u00e9 vers la droite")));

    @Override
    public aox_1 bEt() {
        return cMg;
    }

    @Override
    public void p(int[] nArray) {
        int n;
        if (nArray == null || nArray.length == 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 param\u00e8tre attendu, 0 trouv\u00e9(s)");
        }
        if (nArray.length != 1 && nArray.length != 2 && nArray.length != 4) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 ou 2 ou 4 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.cMb = nArray[0];
        if (nArray.length == 2) {
            this.cMe = nArray[1];
            this.cMd = this.cMb;
            this.cMc = this.cMe;
        } else if (nArray.length == 4) {
            this.cMd = nArray[1];
            this.cMe = nArray[2];
            this.cMc = nArray[3];
        } else {
            this.cMe = this.cMb;
            this.cMd = this.cMb;
            this.cMc = this.cMb;
        }
        this.cMf.clear();
        this.cMf.add(aod_2.bQ(0, 0));
        for (n = 1; n <= this.cMe; ++n) {
            this.cMf.add(aod_2.bQ(0, -n));
        }
        for (n = 1; n <= this.cMc; ++n) {
            this.cMf.add(aod_2.bQ(0, n));
        }
        for (n = 1; n <= this.cMb; ++n) {
            this.cMf.add(aod_2.bQ(n, 0));
        }
        for (n = 1; n <= this.cMd; ++n) {
            this.cMf.add(aod_2.bQ(-n, 0));
        }
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMf;
    }

    @Override
    public String bEn() {
        return "cross-h" + this.cMb + "b" + this.cMd + "-g" + this.cMe + "d" + this.cMc;
    }

    @Override
    public String bEo() {
        return String.valueOf(Math.min(Math.min(this.cMe, this.cMc), Math.min(this.cMb, this.cMd)));
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLj;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.cMd == 0 && this.cMb == 0 && this.cMe == 0 && this.cMc == 0) {
            return aoy_2.cLB;
        }
        if (this.cMd == 0 && this.cMb == 0) {
            return aoy_2.cLC;
        }
        if (this.cMe == 0 && this.cMc == 0) {
            return aoy_2.cLD;
        }
        return aoy_2.cLE;
    }
}

