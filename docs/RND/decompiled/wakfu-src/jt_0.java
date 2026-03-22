/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jt
 */
public class jt_0
implements jf_0 {
    private final kw_0 aKo;

    public jt_0(kw_0 kw_02) {
        this.aKo = kw_02;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKo.ae(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKo.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

