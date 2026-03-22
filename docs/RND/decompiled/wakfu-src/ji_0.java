/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Ji
 */
public class ji_0
implements jf_0 {
    private final kk_1 aKd;

    public ji_0(kk_1 kk_12) {
        this.aKd = kk_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKd.g(dataInput.readFloat(), dataInput.readFloat());
        this.aKd.a(kl_1.m(dataInput.readByte()));
        this.aKd.h(dataInput.readFloat(), dataInput.readFloat());
        this.aKd.i(dataInput.readFloat(), dataInput.readFloat());
        this.aKd.j(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKd.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

