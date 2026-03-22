/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jm
 */
public class jm_0
implements jf_0 {
    private final kp_1 aKh;

    public jm_0(kp_1 kp_12) {
        this.aKh = kp_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKh.H(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKh.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

