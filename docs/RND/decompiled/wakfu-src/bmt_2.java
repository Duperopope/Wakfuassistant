/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from bmT
 */
public class bmt_2
extends bmu_1 {
    private final int iEF;

    public bmt_2(bmf_2 bmf_22, int n) {
        super(bmf_22);
        this.iEF = n;
    }

    @Override
    public String dfB() {
        int n = this.hQx * this.iEF;
        int n2 = n + this.iEF - 1;
        String string = n + "-" + n2;
        return aum_0.cWf().c("levelShort.custom", string);
    }

    @Override
    public int dfC() {
        short s;
        int s2 = Integer.MIN_VALUE;
        ArrayList<bmv_1> arrayList = this.iEG.dwP();
        if (arrayList.isEmpty()) {
            return 0;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            bmv_1 bmv_12 = (bmv_1)arrayList.get(i);
            if (bmv_12.dxy() <= s) continue;
            s = bmv_12.dxy();
        }
        return (int)Math.ceil((float)s / (float)this.iEF) + 1;
    }

    @Override
    public int dxh() {
        return this.dxi().size();
    }

    @Override
    public Collection<bmv_1> dxi() {
        return this.dxv();
    }

    private Collection<bmv_1> dxv() {
        ArrayList<bmv_1> arrayList = this.iEG.dwP();
        int n = this.hQx * this.iEF;
        int n2 = n + this.iEF - 1;
        ArrayList<bmv_1> arrayList2 = new ArrayList<bmv_1>();
        int n3 = arrayList.size();
        for (int i = 0; i < n3; ++i) {
            bmv_1 bmv_12 = (bmv_1)arrayList.get(i);
            short s = bmv_12.dxy();
            if (s < n || s > n2) continue;
            arrayList2.add(bmv_12);
        }
        return arrayList2;
    }
}

