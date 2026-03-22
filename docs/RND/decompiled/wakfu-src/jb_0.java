/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from JB
 */
public class jb_0
implements jf_0 {
    private final kg_2 aKw;

    public jb_0(kg_2 kg_22) {
        this.aKw = kg_22;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKw.A(dataInput.readFloat(), dataInput.readFloat());
        this.aKw.B(dataInput.readFloat(), dataInput.readFloat());
        this.aKw.C(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKw.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

