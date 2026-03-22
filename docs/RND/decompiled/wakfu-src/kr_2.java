/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KR
 */
public class kr_2
implements kl_2 {
    private final ko_1 aOT;

    public kr_2(ko_1 ko_12) {
        this.aOT = ko_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aOT.aQd();
        float[] fArray2 = this.aOT.aQe();
        float[] fArray3 = this.aOT.aQf();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray[1]);
        dataOutput.writeFloat(fArray2[1]);
        dataOutput.writeFloat(fArray3[1]);
        List<kh_1> list = this.aOT.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

