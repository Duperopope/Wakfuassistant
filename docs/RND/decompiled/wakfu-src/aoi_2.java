/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoI
 */
public class aoi_2
extends aoh_1 {
    public static final String cMC = "point";
    private static final aoi_2 cMD = new aoi_2();
    private final List<int[]> cME = new ArrayList<int[]>(1);
    public static final aox_1 cMF = new aob_2(new aow_1[0]);

    @Override
    public aox_1 bEt() {
        return cMF;
    }

    public static aoi_2 bEz() {
        return cMD;
    }

    @Override
    public List<int[]> bEm() {
        return this.cME;
    }

    @Override
    public String bEn() {
        return cMC;
    }

    @Override
    public String bEo() {
        return null;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray != null && nArray.length > 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type Point : 0 attendu, " + nArray.length + " fourni(s)");
        }
        this.cME.clear();
        this.cME.add(aod_2.bQ(0, 0));
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLh;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        return aoy_2.cLB;
    }
}

