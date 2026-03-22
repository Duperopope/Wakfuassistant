/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from beF
 */
public class bef_2
extends beh_2 {
    final boolean hNL;
    final String[] hNM;

    public bef_2(enk_0 enk_02, boolean bl, String[] stringArray) {
        super(enk_02);
        this.hNL = bl;
        ArrayList<String> arrayList = new ArrayList<String>(stringArray.length);
        for (int i = 0; i < stringArray.length; ++i) {
            String[] stringArray2;
            for (String string : stringArray2 = ary_2.fT(stringArray[i])) {
                if (arrayList.contains(string)) continue;
                arrayList.add(string);
            }
        }
        this.hNM = arrayList.toArray(new String[arrayList.size()]);
    }

    private bef_2(bef_2 bef_22) {
        super(bef_22.hMZ);
        this.hNL = bef_22.hNL;
        this.hNM = bef_22.hNM;
    }

    public bef_2 deC() {
        return new bef_2(this);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        bdj_22.a(this.hNM, this.hNL);
        bdj_22.dcQ();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bef_2 bef_22 = (bef_2)object;
        if (this.hNL != bef_22.hNL) {
            return false;
        }
        return Arrays.equals(this.hNM, bef_22.hNM);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hNL ? 1 : 0);
        n = 31 * n + (this.hNM != null ? Arrays.hashCode(this.hNM) : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.deC();
    }
}

