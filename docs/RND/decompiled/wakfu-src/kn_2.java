/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from KN
 */
public class kn_2 {
    private final kh_1 aOP;

    public kn_2(kh_1 kh_12) {
        this.aOP = kh_12;
    }

    public void b(DataOutput dataOutput) {
        kj_1 kj_12 = this.aOP.aPp();
        km_2 km_22 = new km_2(kj_12);
        km_22.b(dataOutput);
        ki_1 ki_12 = this.aOP.aPq();
        if (ki_12 == null) {
            return;
        }
        kl_2 kl_22 = ih_0.aJV.b(ki_12);
        kl_22.b(dataOutput);
    }
}

