/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Ld
 */
public class ld_1
implements kl_2 {
    private final ka_0 aPf;

    public ld_1(ka_0 ka_02) {
        this.aPf = ka_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPf.aQd();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aPf.aQe();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aPf.aQf();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        dataOutput.writeBoolean(this.aPf.aRc());
        List<kh_1> list = this.aPf.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

