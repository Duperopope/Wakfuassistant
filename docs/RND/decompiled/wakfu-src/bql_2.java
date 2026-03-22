/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bQl
 */
abstract class bql_2 {
    protected int hQx;
    protected bqk_2 kUu;

    protected bql_2(int n, bqk_2 bqk_22) {
        this.hQx = n;
        this.kUu = bqk_22;
    }

    private int dfz() {
        return this.hQx;
    }

    private void BH(int n) {
        this.hQx = n;
    }

    void a(bqk_2 bqk_22) {
        this.kUu = bqk_22;
    }

    public abstract List<bpt_1<?, ?>> ehT();

    public abstract boolean aLB();

    public void clean() {
        this.kUu = null;
    }
}

