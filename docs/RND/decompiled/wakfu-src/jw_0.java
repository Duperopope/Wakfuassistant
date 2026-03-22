/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jw
 */
public class jw_0
implements jf_0 {
    private final kz_0 aKr;

    public jw_0(kz_0 kz_02) {
        this.aKr = kz_02;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKr.M(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKr.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

