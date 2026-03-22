/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auH
 */
public class auh_1
extends auq_1<auf_1> {
    public static final auh_1 deW = new auh_1();

    private auh_1() {
    }

    @Override
    protected byte aJr() {
        return 1;
    }

    public auf_1 C(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        int n = dataInput.readInt();
        float f3 = auh_1.u(dataInput, f2);
        float f4 = auh_1.u(dataInput, f2);
        float f5 = auh_1.u(dataInput, f2);
        float f6 = auh_1.u(dataInput, f2);
        float f7 = auh_1.u(dataInput, f2);
        float f8 = auh_1.u(dataInput, f2);
        float f9 = auh_1.u(dataInput, f2);
        float f10 = auh_1.u(dataInput, f2);
        float f11 = auh_1.u(dataInput, f2);
        float f12 = auh_1.u(dataInput, f2);
        float f13 = auh_1.u(dataInput, f2);
        float f14 = auh_1.u(dataInput, f2);
        float f15 = auh_1.u(dataInput, f2);
        float f16 = auh_1.u(dataInput, f2);
        float f17 = auh_1.u(dataInput, f2);
        float f18 = auh_1.u(dataInput, f2);
        float f19 = auh_1.u(dataInput, f2);
        float f20 = auh_1.u(dataInput, f2);
        float f21 = auh_1.u(dataInput, f2);
        float f22 = auh_1.u(dataInput, f2);
        float f23 = auh_1.u(dataInput, f2);
        float f24 = auh_1.u(dataInput, f2);
        float f25 = auh_1.u(dataInput, f2);
        float f26 = auh_1.u(dataInput, f2);
        float f27 = auh_1.u(dataInput, f2);
        lp_2 lp_22 = new lp_2();
        lp_22.nh(n);
        lp_22.U(f3);
        lp_22.V(f4);
        lp_22.W(f5);
        lp_22.X(f6);
        lp_22.Y(f7);
        lp_22.Z(f8);
        lp_22.aB(bl);
        lp_22.aa(f9);
        lp_22.ab(f10);
        lp_22.ac(f11);
        lp_22.ad(f12);
        lp_22.ae(f13);
        lp_22.af(f14);
        lp_22.ag(f15);
        lp_22.ah(f16);
        lp_22.ai(f17);
        lp_22.aj(f18);
        lp_22.ak(f25);
        lp_22.al(f26);
        lp_22.am(f27);
        lp_22.O(f19);
        lp_22.P(f20);
        lp_22.Q(f21);
        lp_22.R(f22);
        lp_22.an(f23);
        lp_22.ao(f24);
        return new auf_1(lp_22);
    }

    @Override
    protected boolean a(auf_1 auf_12, auf_1 auf_13) {
        lp_2 lp_22 = auf_12.bMu();
        lp_2 lp_23 = auf_13.bMu();
        return lp_22.aRF() == lp_23.aRF() && lp_22.aRG() == lp_23.aRG() && lp_22.aRH() == lp_23.aRH() && lp_22.aRI() == lp_23.aRI() && lp_22.aRL() == lp_23.aRL() && lp_22.aRJ() == lp_23.aRJ() && lp_22.aRK() == lp_23.aRK() && lp_22.aPH() == lp_23.aPH() && lp_22.aRM() == lp_23.aRM() && lp_22.aRN() == lp_23.aRN() && lp_22.aRO() == lp_23.aRO() && lp_22.aRP() == lp_23.aRP() && lp_22.aRQ() == lp_23.aRQ() && lp_22.aRR() == lp_23.aRR() && lp_22.aRS() == lp_23.aRS() && lp_22.aRT() == lp_23.aRT() && lp_22.aRU() == lp_23.aRU();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((auf_1)object, (auf_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.C(dataInput, f2);
    }
}

