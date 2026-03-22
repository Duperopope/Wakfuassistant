/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoH
 */
public class aoh_2
extends aoh_1 {
    public static final String cMz = "cone_inv";
    public static final aox_1 cMA = new aob_2(new aoa_1("ConeInv", new aou_1("height")));
    private int brt;
    private final List<int[]> cMB = new ArrayList<int[]>(1);

    @Override
    public aox_1 bEt() {
        return cMA;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMB;
    }

    @Override
    public String bEn() {
        return "cone_inv-" + this.brt;
    }

    @Override
    public String bEo() {
        return String.valueOf(this.brt);
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null || nArray.length != 1) {
            throw new IllegalArgumentException("Invalid parameter count for a cone AOE : 1 parameter expected, " + (nArray == null ? 0 : nArray.length) + " found");
        }
        this.brt = nArray[0];
        this.cMB.clear();
        for (int i = 0; i < this.brt; ++i) {
            for (int j = -i; j <= i; ++j) {
                this.cMB.add(aod_2.bQ(this.brt - 1 - i, j));
            }
        }
    }

    @Override
    protected boolean bEk() {
        return false;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLu;
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
        if (this.brt == 0) {
            return aoy_2.cLB;
        }
        return aoy_2.cLL;
    }
}

