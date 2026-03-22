/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jn
 */
public class jn_0
implements jf_0 {
    private final kq_1 aKi;

    public jn_0(kq_1 kq_12) {
        this.aKi = kq_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKi.I(dataInput.readFloat(), dataInput.readFloat());
        this.aKi.J(dataInput.readFloat(), dataInput.readFloat());
        this.aKi.K(dataInput.readFloat(), dataInput.readFloat());
        this.aKi.L(dataInput.readFloat(), dataInput.readFloat());
        this.aKi.D(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKi.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

