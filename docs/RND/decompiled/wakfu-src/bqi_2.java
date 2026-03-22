/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bQi
 */
public class bqi_2
extends bql_2 {
    final List<bpt_1<?, ?>> kUq = new ArrayList();
    boolean aCx = false;
    private final String kUr;
    final bpp_2 kUs;

    protected bqi_2(String string, int n, bqk_2 bqk_22, bpp_2 bpp_22) {
        super(n, bqk_22);
        this.kUr = string;
        this.kUs = bpp_22;
    }

    public void bkZ() {
        bOY.a(new bqj_2(this), this.kUr, this.hQx, 12);
    }

    @Override
    public List<bpt_1<?, ?>> ehT() {
        return this.kUq;
    }

    @Override
    public boolean aLB() {
        return this.aCx;
    }
}

