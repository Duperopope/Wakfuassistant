/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Li
 */
public class li_1
implements kl_2 {
    private final kf_2 aPk;

    public li_1(kf_2 kf_22) {
        this.aPk = kf_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPk.aPS();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aPk.aPT();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aPk.aPU();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        List<kh_1> list = this.aPk.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

