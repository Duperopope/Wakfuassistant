/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from bmH
 */
public class bmh_2
extends bmu_1 {
    private final int iDD;

    public bmh_2(bmf_2 bmf_22, int n) {
        super(bmf_22);
        this.iDD = n;
    }

    @Override
    public String dfB() {
        return this.hQx + 1 + "/" + this.dfC();
    }

    @Override
    public int dfC() {
        ArrayList<bmv_1> arrayList = this.iEG.dwP();
        return (int)Math.ceil((float)arrayList.size() / (float)this.iDD);
    }

    @Override
    public int dxh() {
        return this.iDD;
    }

    @Override
    public Collection<bmv_1> dxi() {
        ArrayList<bmv_1> arrayList = this.iEG.dwP();
        int n = this.hQx * this.iDD;
        int n2 = Math.min(arrayList.size(), n + this.iDD);
        ArrayList<bmv_1> arrayList2 = new ArrayList<bmv_1>();
        for (int i = n; i < n2; ++i) {
            arrayList2.add((bmv_1)arrayList.get(i));
        }
        return arrayList2;
    }
}

