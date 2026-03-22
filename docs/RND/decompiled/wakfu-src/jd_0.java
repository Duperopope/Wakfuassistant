/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from JD
 */
public class jd_0
implements jf_0 {
    private final kh_2 aKy;

    public jd_0(kh_2 kh_22) {
        this.aKy = kh_22;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKy.g(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKy.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

