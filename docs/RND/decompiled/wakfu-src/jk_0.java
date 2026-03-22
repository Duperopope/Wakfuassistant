/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jk
 */
public class jk_0
implements jf_0 {
    private final kn_1 aKf;

    public jk_0(kn_1 kn_12) {
        this.aKf = kn_12;
    }

    @Override
    public void b(DataInput dataInput) {
        this.aKf.D(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.v(dataInput.readInt(), dataInput.readInt());
        this.aKf.nh(dataInput.readUnsignedShort());
        this.aKf.k(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.l(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.m(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.n(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.o(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.p(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.aB(dataInput.readBoolean());
        this.aKf.q(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.r(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.s(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.u(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.w(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.y(dataInput.readFloat(), dataInput.readFloat());
        int n = dataInput.readUnsignedShort();
        this.aKf.O(dataInput.readFloat());
        this.aKf.P(dataInput.readFloat());
        this.aKf.Q(dataInput.readFloat());
        this.aKf.R(dataInput.readFloat());
        this.aKf.nj(dataInput.readInt());
        this.aKf.ni(dataInput.readInt());
        this.aKf.t(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.v(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.x(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.z(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.A(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.B(dataInput.readFloat(), dataInput.readFloat());
        this.aKf.C(dataInput.readFloat(), dataInput.readFloat());
    }
}

