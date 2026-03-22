/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Lh
 */
public class lh_1
implements kl_2 {
    private final kg_2 aPj;

    public lh_1(kg_2 kg_22) {
        this.aPj = kg_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPj.aPS();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aPj.aPT();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aPj.aPU();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        List<kh_1> list = this.aPj.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

