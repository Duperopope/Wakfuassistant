/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from aoF
 */
public class aof_1
extends aoh_1 {
    public static final String cMw = "empty";
    private static final List<int[]> cMx = new ArrayList<int[]>(0);
    public static final aox_1 cMy = new aob_2(new aow_1[0]);

    @Override
    public aox_1 bEt() {
        return cMy;
    }

    @Override
    public void p(int[] nArray) {
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLv;
    }

    @Override
    public List<int[]> bEm() {
        return cMx;
    }

    @Override
    public String bEn() {
        return "empty-0";
    }

    @Override
    public String bEo() {
        return null;
    }

    public <T extends anu_1> Iterable<T> a(acd_1 acd_12, acd_1 acd_13, Iterator<T> iterator) {
        return new azi_2();
    }

    @Override
    protected boolean bEk() {
        return true;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        return aoy_2.cLA;
    }
}

