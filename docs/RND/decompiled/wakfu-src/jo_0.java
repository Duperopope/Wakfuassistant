/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jo
 */
public class jo_0
implements jf_0 {
    private final kr_1 aKj;

    public jo_0(kr_1 kr_12) {
        this.aKj = kr_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKj.M(dataInput.readFloat(), dataInput.readFloat());
        this.aKj.P(dataInput.readFloat(), dataInput.readFloat());
        this.aKj.N(dataInput.readFloat(), dataInput.readFloat());
        this.aKj.Q(dataInput.readFloat(), dataInput.readFloat());
        this.aKj.O(dataInput.readFloat(), dataInput.readFloat());
        this.aKj.R(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKj.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

