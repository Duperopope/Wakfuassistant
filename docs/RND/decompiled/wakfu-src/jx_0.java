/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jx
 */
public class jx_0
implements jf_0 {
    private final ka_0 aKs;

    public jx_0(ka_0 ka_02) {
        this.aKs = ka_02;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKs.E(dataInput.readFloat(), dataInput.readFloat());
        this.aKs.F(dataInput.readFloat(), dataInput.readFloat());
        this.aKs.G(dataInput.readFloat(), dataInput.readFloat());
        this.aKs.aF(dataInput.readBoolean());
        JG jG = this.aKs.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

