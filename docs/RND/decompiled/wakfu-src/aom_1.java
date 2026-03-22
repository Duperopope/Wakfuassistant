/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoM
 */
public class aom_1
extends aoh_1 {
    public static final String cMU = "ring";
    private int cMp;
    private int cMq;
    private final List<int[]> cMV = new ArrayList<int[]>(1);
    public static final aox_1 cMW = new aob_2(new aoa_1("Anneau", new aou_1("rayon int\u00e9rieur"), new aou_1("rayon ext\u00e9rieur")));

    @Override
    public aox_1 bEt() {
        return cMW;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMV;
    }

    @Override
    public String bEn() {
        return "ring-" + this.cMp + "-" + this.cMq;
    }

    @Override
    public String bEo() {
        return this.cMp + " - " + this.cMq;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type ring : 2 param\u00e8tres attendus, 0 trouv\u00e9");
        }
        if (nArray.length != 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type ring : 2 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.cMp = nArray[0] < nArray[1] ? nArray[0] : nArray[1];
        this.cMq = nArray[0] > nArray[1] ? nArray[0] : nArray[1];
        this.cMV.clear();
        for (int i = 0; i <= this.cMq; ++i) {
            for (int j = Math.max(this.cMp - i, 0); j <= Math.max(this.cMq - i, 0); ++j) {
                this.cMV.add(aod_2.bQ(i, j));
                if (j != 0) {
                    this.cMV.add(aod_2.bQ(i, -j));
                }
                if (i == 0) continue;
                this.cMV.add(aod_2.bQ(-i, j));
                if (j == 0) continue;
                this.cMV.add(aod_2.bQ(-i, -j));
            }
        }
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLl;
    }

    public int bEw() {
        return this.cMq;
    }

    public int bEx() {
        return this.cMp;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.cMp == 0 && this.cMq == 0) {
            return aoy_2.cLB;
        }
        if (this.cMp == 0) {
            return aoy_2.cLF;
        }
        return aoy_2.cLG;
    }
}

