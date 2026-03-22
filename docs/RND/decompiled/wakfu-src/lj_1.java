/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Lj
 */
public class lj_1
implements kl_2 {
    private final kh_2 aPl;

    public lj_1(kh_2 kh_22) {
        this.aPl = kh_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPl.aPt();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        List<kh_1> list = this.aPl.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

