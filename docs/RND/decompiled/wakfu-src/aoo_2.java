/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoO
 */
public class aoo_2
extends aoh_1 {
    public static final String cNc = "t inv";
    private int cMY;
    private int cMZ;
    private final List<int[]> cNd = new ArrayList<int[]>(1);
    public static final aox_1 cNe = new aob_2(new aoa_1("Zone en T Invers\u00e9 (barre en bas) (order 0: defaut, 1: pied->barre, 2: barre->pied)", new aou_1("largeur de la barre (par rapport au centre : 1 = barre de 3 cellules)"), new aou_1("hauteur du pied (par rapport au centre : 1 = barre de 1)")));

    @Override
    public aox_1 bEt() {
        return cNe;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        switch (this.bEi()) {
            case 1: {
                for (int i = this.cMZ; i >= 0; --i) {
                    aoj_2 aoj_22 = new aoj_2();
                    aoj_22.p(aod_2.bQ(i, 0));
                    arrayList.add(aoj_22);
                }
                int[] nArray = new int[this.cMY * 4];
                for (int i = 1; i <= this.cMY; ++i) {
                    int n = (i - 1) * 4;
                    nArray[n + 0] = 0;
                    nArray[n + 1] = i;
                    nArray[n + 2] = 0;
                    nArray[n + 3] = -i;
                }
                aoj_2 aoj_23 = new aoj_2();
                aoj_23.p(nArray);
                arrayList.add(aoj_23);
                break;
            }
            case 2: {
                int n;
                int[] nArray = new int[this.cMY * 4];
                for (int i = 1; i <= this.cMY; ++i) {
                    n = (i - 1) * 4;
                    nArray[n + 0] = 0;
                    nArray[n + 1] = i;
                    nArray[n + 2] = 0;
                    nArray[n + 3] = -i;
                }
                aoj_2 aoj_24 = new aoj_2();
                aoj_24.p(nArray);
                arrayList.add(aoj_24);
                for (n = 0; n <= this.cMZ; ++n) {
                    aoj_2 aoj_25 = new aoj_2();
                    aoj_25.p(aod_2.bQ(n, 0));
                    arrayList.add(aoj_25);
                }
                break;
            }
            default: {
                arrayList.add(this);
            }
        }
        return arrayList;
    }

    @Override
    public List<int[]> bEm() {
        return this.cNd;
    }

    @Override
    public String bEn() {
        return "t inv-barre:" + this.cMY + "-pied:" + this.cMZ;
    }

    @Override
    public String bEo() {
        return this.cMZ + 1 + " x " + this.cMY;
    }

    @Override
    public void p(int[] nArray) {
        int n;
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type TI : 2 param\u00e8tres attendus, 0 trouv\u00e9");
        }
        if (nArray.length != 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type TI : 2 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.cMY = Math.abs(nArray[0]);
        this.cMZ = Math.abs(nArray[1]);
        this.cNd.clear();
        this.cNd.add(aod_2.bQ(0, 0));
        for (n = 1; n <= this.cMY; ++n) {
            this.cNd.add(aod_2.bQ(0, n));
            this.cNd.add(aod_2.bQ(0, -n));
        }
        for (n = 1; n <= this.cMZ; ++n) {
            this.cNd.add(aod_2.bQ(n, 0));
        }
    }

    @Override
    protected boolean bEk() {
        return false;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLp;
    }

    public int bED() {
        return this.cMY;
    }

    public int bEE() {
        return this.cMZ;
    }

    @Override
    public aoy_2 bEq() {
        if (this.cMY == 0 && this.cMZ == 0) {
            return aoy_2.cLB;
        }
        if (this.cMY == 0) {
            return aoy_2.cLC;
        }
        if (this.cMZ == 0) {
            return aoy_2.cLD;
        }
        if (this.cMY == 1 && this.cMZ == 1) {
            return aoy_2.cLQ;
        }
        return aoy_2.cLG;
    }
}

