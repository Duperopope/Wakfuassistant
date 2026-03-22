/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KK
 */
public class kk_2 {
    private final JG aON;

    public kk_2(JG jG) {
        this.aON = jG;
    }

    public void b(DataOutput dataOutput) {
        List<kh_1> list = this.aON.aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

