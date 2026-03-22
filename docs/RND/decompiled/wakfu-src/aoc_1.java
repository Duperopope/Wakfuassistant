/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoC
 */
public final class aoc_1
extends aoh_1 {
    public static final String cMh = "crossDiag";
    private int cMi;
    private int cMj;
    private int cMk;
    private int cMl;
    private final List<int[]> cMm = new ArrayList<int[]>(1);
    public static final aox_1 cMn = new aob_2(new aoa_1("Croix (deux barres de tailles identiques)", new aou_1("distance centre -> extr\u00e9mit\u00e9")), new aoa_1("Croix (deux barres de tailles diff\u00e9rentes)", new aou_1("distance centre -> Nord/Sud"), new aou_1("distance centre -> Est/Ouest")), new aoa_1("Croix (4 barres de tailles diff\u00e9rentes)", new aou_1("distance centre -> Nord"), new aou_1("distance centre -> Est"), new aou_1("distance centre -> Sud"), new aou_1("distance centre -> Ouest")));

    @Override
    public aox_1 bEt() {
        return cMn;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 param\u00e8tre attendu, 0 trouv\u00e9(s)");
        }
        if (nArray.length != 1 && nArray.length != 2 && nArray.length != 4) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 ou 2 ou 4 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.cMi = nArray[0];
        if (nArray.length == 2) {
            this.cMj = nArray[1];
            this.cMk = this.cMi;
            this.cMl = this.cMj;
        } else if (nArray.length == 4) {
            this.cMj = nArray[1];
            this.cMk = nArray[2];
            this.cMl = nArray[3];
        } else {
            this.cMl = this.cMi;
            this.cMk = this.cMi;
            this.cMj = this.cMi;
        }
        this.cMm.clear();
        this.cMm.add(aod_2.bQ(0, 0));
        this.a(this.cMl, abi_1.dzn);
        this.a(this.cMj, abi_1.dzj);
        this.a(this.cMi, abi_1.dzp);
        this.a(this.cMk, abi_1.dzl);
    }

    private void a(int n, abi_1 abi_12) {
        for (int i = 1; i <= n; ++i) {
            this.cMm.add(aod_2.bQ(abi_12.dzz * i, abi_12.dzA * i));
        }
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMm;
    }

    @Override
    public String bEn() {
        return "crossDiag-h" + this.cMi + "b" + this.cMk + "-g" + this.cMl + "d" + this.cMj;
    }

    @Override
    public String bEo() {
        return String.valueOf(Math.min(Math.min(this.cMl, this.cMj), Math.min(this.cMi, this.cMk)));
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLr;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.cMk == 0 && this.cMi == 0 && this.cMl == 0 && this.cMj == 0) {
            return aoy_2.cLB;
        }
        if (this.cMk == 0 && this.cMi == 0) {
            return aoy_2.cLC;
        }
        if (this.cMl == 0 && this.cMj == 0) {
            return aoy_2.cLD;
        }
        return aoy_2.cLM;
    }
}

