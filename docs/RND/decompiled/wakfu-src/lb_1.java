/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Lb
 */
public class lb_1
implements kl_2 {
    private final kz_0 aPd;

    public lb_1(kz_0 kz_02) {
        this.aPd = kz_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aPd.aQl();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        List<kh_1> list = this.aPd.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

