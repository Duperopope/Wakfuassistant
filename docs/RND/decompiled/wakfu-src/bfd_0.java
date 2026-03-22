/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bfd
 */
public class bfd_0 {
    private final bfa hQv;
    private final int hQw;
    private int hQx;

    public bfd_0(bfa bfa2, int n) {
        this.hQv = bfa2;
        this.hQw = n;
    }

    public void BH(int n) {
        this.hQx = n;
    }

    public int dfz() {
        return this.hQx;
    }

    public String dfB() {
        return this.hQx + "/" + this.dfC();
    }

    public int dfC() {
        int n = (int)Math.ceil((double)this.hQv.dft().size() / (double)this.hQw);
        return Math.max(n, 0);
    }

    public List<bfi_0> dfD() {
        List<bfi_0> list = this.hQv.dft();
        int n = (this.hQx - 1) * this.hQw;
        int n2 = Math.min(list.size(), n + this.hQw);
        ArrayList<bfi_0> arrayList = new ArrayList<bfi_0>();
        for (int i = n; i < n2; ++i) {
            arrayList.add(list.get(i));
        }
        return arrayList;
    }
}

