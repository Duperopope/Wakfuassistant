/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KV
 */
public class kv_2
implements kl_2 {
    private final ks_1 aOX;

    public kv_2(ks_1 ks_12) {
        this.aOX = ks_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        List<kh_1> list = this.aOX.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

