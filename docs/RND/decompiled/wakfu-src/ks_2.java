/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KS
 */
public class ks_2
implements kl_2 {
    private final kp_1 aOU;

    public ks_2(kp_1 kp_12) {
        this.aOU = kp_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aOU.aQg();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        List<kh_1> list = this.aOU.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

