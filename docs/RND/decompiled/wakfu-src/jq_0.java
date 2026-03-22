/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jq
 */
public class jq_0
implements jf_0 {
    private final kt_1 aKl;

    public jq_0(kt_1 kt_12) {
        this.aKl = kt_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKl.x(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.z(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.A(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.B(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.S(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.T(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.U(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.V(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.W(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.X(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.Y(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.Z(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.aa(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.ab(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.ac(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.ad(dataInput.readFloat(), dataInput.readFloat());
        this.aKl.D(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.E(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.aC(dataInput.readBoolean());
        this.aKl.y(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.C(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKl.w(dataInput.readByte(), dataInput.readByte());
        this.aKl.setName(ig_1.a(dataInput));
        this.aKl.cA(ig_1.a(dataInput));
        JG jG = this.aKl.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

