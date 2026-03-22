/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoD
 */
public class aod_1
extends aoh_1 {
    public static final String cMo = "crossRing";
    private int cMp;
    private int cMq;
    private final List<int[]> cMr = new ArrayList<int[]>(1);
    public static final aox_1 cMs = new aob_2(new aoa_1("Cross (inner and outer radius)", new aou_1("inner"), new aou_1("outer")));

    @Override
    public aox_1 bEt() {
        return cMs;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMr;
    }

    @Override
    public String bEn() {
        return "crossRing-" + this.cMp + "-" + this.cMq;
    }

    @Override
    public String bEo() {
        return this.cMp + "-" + this.cMq;
    }

    @Override
    public void p(int[] nArray) {
        int n;
        if (nArray == null) {
            throw new IllegalArgumentException("Invalid parameters for cross ring type AOE : 2 parameters awaited, 0 found");
        }
        if (nArray.length != 2) {
            throw new IllegalArgumentException("Invalid parameters for cross ring type AOE : 2 parameters awaited, " + nArray.length + " found");
        }
        this.cMp = Math.min(nArray[0], nArray[1]);
        this.cMq = Math.max(nArray[0], nArray[1]);
        this.cMr.clear();
        for (n = this.cMp; n <= this.cMq; ++n) {
            this.cMr.add(aod_2.bQ(0, -n));
        }
        for (n = this.cMp; n <= this.cMq; ++n) {
            this.cMr.add(aod_2.bQ(0, n));
        }
        for (n = this.cMp; n <= this.cMq; ++n) {
            this.cMr.add(aod_2.bQ(n, 0));
        }
        for (n = this.cMp; n <= this.cMq; ++n) {
            this.cMr.add(aod_2.bQ(-n, 0));
        }
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLs;
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
            return aoy_2.cLE;
        }
        return aoy_2.cLN;
    }
}

