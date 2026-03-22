/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Js
 */
public class js_0
implements jf_0 {
    private final kv_1 aKn;

    public js_0(kv_1 kv_12) {
        this.aKn = kv_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKn.x(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.z(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.A(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.B(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.S(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.T(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.U(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.V(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.W(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.X(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.Y(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.Z(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.aa(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.ab(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.ac(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.ad(dataInput.readFloat(), dataInput.readFloat());
        this.aKn.D(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.E(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.aC(dataInput.readBoolean());
        this.aKn.y(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.C(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKn.w(dataInput.readByte(), dataInput.readByte());
        JG jG = this.aKn.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

