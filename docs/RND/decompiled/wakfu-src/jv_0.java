/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jv
 */
public class jv_0
implements jf_0 {
    private final ky_0 aKq;

    public jv_0(ky_0 ky_02) {
        this.aKq = ky_02;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKq.af(dataInput.readFloat(), dataInput.readFloat());
        this.aKq.ag(dataInput.readFloat(), dataInput.readFloat());
        this.aKq.ah(dataInput.readFloat(), dataInput.readFloat());
        this.aKq.g(dataInput.readFloat(), dataInput.readFloat());
        this.aKq.ai(dataInput.readFloat(), dataInput.readFloat());
        float f2 = dataInput.readFloat();
        float f3 = dataInput.readFloat();
        boolean bl = dataInput.readBoolean();
        boolean bl2 = dataInput.readBoolean();
        JG jG = this.aKq.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

