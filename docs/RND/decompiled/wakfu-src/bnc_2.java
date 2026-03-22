/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bnc
 */
class bnc_2 {
    private final bnb_2 iFY;
    private int hQx;
    private final int iFZ;

    bnc_2(bnb_2 bnb_22, int n) {
        this.iFY = bnb_22;
        this.iFZ = n;
    }

    void BH(int n) {
        this.hQx = n;
    }

    int dfz() {
        return this.hQx;
    }

    String dfB() {
        return this.hQx + 1 + "/" + this.dfC();
    }

    int dfC() {
        return Math.max((int)Math.ceil((float)this.dxW().size() / (float)this.iFZ), 1);
    }

    private List<bmv_1> dxW() {
        ArrayList<bmv_1> arrayList = new ArrayList<bmv_1>();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        String string = BH.aT(this.iFY.hVA);
        for (bmv_1 bmv_12 : this.iFY.dxV()) {
            short s;
            if (this.iFY.iFU && !bnb_2.a(bgt_02, bmv_12) || !Strings.isNullOrEmpty((String)this.iFY.hVA) && !bmv_12.dah().contains(string) || (s = bmv_12.dxy()) > this.iFY.iFW || s < this.iFY.iFV) continue;
            arrayList.add(bmv_12);
        }
        return arrayList;
    }

    List<bmv_1> dxV() {
        List<bmv_1> list = this.dxW();
        int n = this.hQx * this.iFZ;
        int n2 = Math.min(list.size(), n + this.iFZ);
        ArrayList<bmv_1> arrayList = new ArrayList<bmv_1>();
        for (int i = n; i < n2; ++i) {
            arrayList.add(list.get(i));
        }
        return arrayList;
    }
}

