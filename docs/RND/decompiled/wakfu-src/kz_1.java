/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KZ
 */
public class kz_1
implements kl_2 {
    private final kw_0 aPb;

    public kz_1(kw_0 kw_02) {
        this.aPb = kw_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPb.aQV();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        List<kh_1> list = this.aPb.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

