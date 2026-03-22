/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoE
 */
public class aoe_2
extends aoh_1 {
    public static final String cMt = "Directed rectangle";
    static final aob_2 cMu = new aob_2(new aoa_1("Rectangle directionnel", new aou_1("Distance maximale \u00e0 la ligne centrale"), new aou_1("Longueur")));
    private ArrayList<aoh_1> cMv;
    private int aLS;
    private int aLg;
    private List<int[]> cLV;

    @Override
    public aox_1 bEt() {
        return cMu;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null || nArray.length != 2) {
            int n = nArray == null ? 0 : nArray.length;
            throw new IllegalArgumentException("Deux param\u00e8tres attendus pour une aire d'effet rectangle directionnel, " + n + " trouv\u00e9s");
        }
        if (nArray[0] < 0) {
            throw new IllegalArgumentException("Rectangle directionnel : " + cMu.tm(2).tl(0).bEI() + " doit \u00eatre au moins 0.");
        }
        if (nArray[1] < 1) {
            throw new IllegalArgumentException("Rectangle directionnel : " + cMu.tm(2).tl(0).bEI() + " doit \u00eatre au moins 1.");
        }
        this.aLS = nArray[0];
        this.aLg = nArray[1];
        this.bEy();
    }

    private void bEy() {
        this.cLV = new ArrayList<int[]>();
        for (int i = -this.aLS; i <= this.aLS; ++i) {
            for (int j = 0; j < this.aLg; ++j) {
                this.cLV.add(aod_2.bQ(j, i));
            }
        }
    }

    @Override
    protected boolean bEk() {
        return false;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLq;
    }

    @Override
    public List<int[]> bEm() {
        return this.cLV;
    }

    @Override
    public String bEn() {
        return "Directed rectangle-" + (2 * this.aLS + 1) + "x" + this.aLg;
    }

    @Override
    public String bEo() {
        return String.valueOf(this.aLg);
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        if (this.cMv == null) {
            this.cMv = new ArrayList(1);
            this.cMv.add(this);
        }
        return this.cMv;
    }

    @Override
    public aoy_2 bEq() {
        if (this.aLg == 1) {
            return this.aLS == 0 ? aoy_2.cLB : aoy_2.cLD;
        }
        return this.aLS == 0 ? aoy_2.cLC : aoy_2.cLJ;
    }
}

