/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jy
 */
public class jy_0
implements jf_0 {
    private final kb_1 aKt;

    public jy_0(kb_1 kb_12) {
        this.aKt = kb_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKt.aC(dataInput.readBoolean());
        this.aKt.aD(dataInput.readBoolean());
        this.aKt.aE(dataInput.readBoolean());
        this.aKt.F(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKt.n(dataInput.readByte());
        this.aKt.nk(dataInput.readInt());
        this.aKt.nl(dataInput.readInt());
        JG jG = this.aKt.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

