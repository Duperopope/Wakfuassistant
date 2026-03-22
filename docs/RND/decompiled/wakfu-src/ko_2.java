/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KO
 */
public class ko_2
implements kl_2 {
    private final kk_1 aOQ;

    public ko_2(kk_1 kk_12) {
        this.aOQ = kk_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aOQ.aPt();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        dataOutput.writeByte(this.aOQ.aPx().aPy());
        float[] fArray2 = this.aOQ.aPu();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aOQ.aPv();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.aOQ.aPw();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        List<kh_1> list = this.aOQ.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

