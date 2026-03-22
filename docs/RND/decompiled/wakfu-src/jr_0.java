/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jr
 */
public class jr_0
implements jf_0 {
    private final ku_1 aKm;

    public jr_0(ku_1 ku_12) {
        this.aKm = ku_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKm.aC(dataInput.readBoolean());
        this.aKm.aD(dataInput.readBoolean());
        this.aKm.aE(dataInput.readBoolean());
        this.aKm.F(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKm.n(dataInput.readByte());
        this.aKm.nk(dataInput.readInt());
        this.aKm.nl(dataInput.readInt());
        this.aKm.setName(ig_1.a(dataInput));
        this.aKm.cA(ig_1.a(dataInput));
        this.aKm.o(dataInput.readByte());
        this.aKm.p(dataInput.readByte());
        JG jG = this.aKm.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

