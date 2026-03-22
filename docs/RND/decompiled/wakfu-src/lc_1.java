/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Lc
 */
public class lc_1
implements kl_2 {
    private final ky_0 aPe;

    public lc_1(ky_0 ky_02) {
        this.aPe = ky_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPe.aQY();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aPe.aQZ();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aPe.aRa();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.aPe.aPt();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.aPe.aRb();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        dataOutput.writeFloat(0.0f);
        dataOutput.writeFloat(0.0f);
        dataOutput.writeBoolean(false);
        dataOutput.writeBoolean(false);
        List<kh_1> list = this.aPe.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

