/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jj
 */
public class jj_0
implements jf_0 {
    private final km_1 aKe;

    public jj_0(km_1 km_12) {
        this.aKe = km_12;
    }

    @Override
    public void b(DataInput dataInput) {
        this.aKe.nh(dataInput.readUnsignedShort());
        this.aKe.k(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.l(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.m(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.n(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.o(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.p(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.aB(dataInput.readBoolean());
        this.aKe.q(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.r(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.s(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.u(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.w(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.y(dataInput.readFloat(), dataInput.readFloat());
        int n = dataInput.readUnsignedShort();
        this.aKe.O(dataInput.readFloat());
        this.aKe.P(dataInput.readFloat());
        this.aKe.Q(dataInput.readFloat());
        this.aKe.R(dataInput.readFloat());
        this.aKe.nj(dataInput.readInt());
        this.aKe.ni(dataInput.readInt());
        this.aKe.t(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.v(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.x(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.z(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.A(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.B(dataInput.readFloat(), dataInput.readFloat());
        this.aKe.C(dataInput.readFloat(), dataInput.readFloat());
    }
}

