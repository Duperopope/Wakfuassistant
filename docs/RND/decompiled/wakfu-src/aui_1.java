/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auI
 */
public class aui_1
extends auq_1<aug_1> {
    public static final aui_1 deX = new aui_1();

    private aui_1() {
    }

    @Override
    protected boolean a(aug_1 aug_12, aug_1 aug_13) {
        lq_2 lq_22 = aug_12.bMv();
        lq_2 lq_23 = aug_13.bMv();
        return lq_22.aRF() == lq_23.aRF() && lq_22.aRG() == lq_23.aRG() && lq_22.aRH() == lq_23.aRH() && lq_22.aRI() == lq_23.aRI() && lq_22.aRL() == lq_23.aRL() && lq_22.aRJ() == lq_23.aRJ() && lq_22.aRK() == lq_23.aRK() && lq_22.aPH() == lq_23.aPH() && lq_22.aRM() == lq_23.aRM() && lq_22.aRN() == lq_23.aRN() && lq_22.aRO() == lq_23.aRO() && lq_22.aRP() == lq_23.aRP() && lq_22.aRQ() == lq_23.aRQ() && lq_22.aRR() == lq_23.aRR() && lq_22.aRS() == lq_23.aRS() && lq_22.aRT() == lq_23.aRT() && lq_22.aRU() == lq_23.aRU() && lq_22.aSa() == lq_23.aSa() && lq_22.aSb() == lq_23.aSb();
    }

    @Override
    protected byte aJr() {
        return 2;
    }

    public aug_1 D(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        int n = dataInput.readInt();
        float f3 = aui_1.u(dataInput, f2);
        float f4 = aui_1.u(dataInput, f2);
        float f5 = aui_1.u(dataInput, f2);
        float f6 = aui_1.u(dataInput, f2);
        float f7 = aui_1.u(dataInput, f2);
        float f8 = aui_1.u(dataInput, f2);
        float f9 = aui_1.u(dataInput, f2);
        float f10 = aui_1.u(dataInput, f2);
        float f11 = aui_1.u(dataInput, f2);
        float f12 = aui_1.u(dataInput, f2);
        float f13 = aui_1.u(dataInput, f2);
        float f14 = aui_1.u(dataInput, f2);
        float f15 = aui_1.u(dataInput, f2);
        float f16 = aui_1.u(dataInput, f2);
        float f17 = aui_1.u(dataInput, f2);
        float f18 = aui_1.u(dataInput, f2);
        float f19 = aui_1.u(dataInput, f2);
        float f20 = aui_1.u(dataInput, f2);
        lm_2 lm_22 = new lm_2();
        awv_2 awv_22 = new awv_2(lm_22);
        awv_22.b(dataInput);
        float f21 = aui_1.u(dataInput, f2);
        int n2 = aui_1.v(dataInput, f2);
        float f22 = aui_1.u(dataInput, f2);
        float f23 = aui_1.u(dataInput, f2);
        float f24 = aui_1.u(dataInput, f2);
        lq_2 lq_22 = new lq_2();
        lq_22.nh(n);
        lq_22.U(f3);
        lq_22.V(f4);
        lq_22.W(f5);
        lq_22.X(f6);
        lq_22.Y(f7);
        lq_22.Z(f8);
        lq_22.aB(bl);
        lq_22.aa(f9);
        lq_22.ab(f10);
        lq_22.ac(f11);
        lq_22.ad(f12);
        lq_22.ae(f13);
        lq_22.af(f14);
        lq_22.ag(f15);
        lq_22.ah(f16);
        lq_22.ai(f17);
        lq_22.aj(f18);
        lq_22.ak(f22);
        lq_22.al(f23);
        lq_22.am(f24);
        lq_22.an(f19);
        lq_22.ao(f20);
        lq_22.setSpeed(f21);
        lq_22.np(n2);
        return new aug_1(lq_22, lm_22);
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((aug_1)object, (aug_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.D(dataInput, f2);
    }
}

