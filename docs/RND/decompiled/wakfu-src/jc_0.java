/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from JC
 */
public class jc_0
implements jf_0 {
    private final kf_2 aKx;

    public jc_0(kf_2 kf_22) {
        this.aKx = kf_22;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKx.A(dataInput.readFloat(), dataInput.readFloat());
        this.aKx.B(dataInput.readFloat(), dataInput.readFloat());
        this.aKx.C(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKx.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

