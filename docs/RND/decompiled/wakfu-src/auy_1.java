/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auy
 */
public class auy_1
extends aun_1<auw_1> {
    public static final auy_1 deH = new auy_1();

    private auy_1() {
    }

    @Override
    protected byte aJr() {
        return 1;
    }

    protected boolean a(auw_1 auw_12, auw_1 auw_13) {
        return auw_12.deD.aSq() == auw_13.deD.aSq() && auw_12.deD.aSr() == auw_13.deD.aSr() && auw_12.deD.aSs() == auw_13.deD.aSs() && auw_12.deD.aSu() == auw_13.deD.aSu() && auw_12.deD.aSt() == auw_13.deD.aSt() && auw_12.deD.aSv() == auw_13.deD.aSv() && auw_12.deD.aSw() == auw_13.deD.aSw() && auw_12.deD.aSx() == auw_13.deD.aSx() && auw_12.deD.aSy() == auw_13.deD.aSy() && auw_12.deD.aSz() == auw_13.deD.aSz() && auw_12.deD.aSA() == auw_13.deD.aSA() && auw_12.deD.aSB() == auw_13.deD.aSB() && auw_12.deD.aSC() == auw_13.deD.aSC() && auw_12.deD.aSD() == auw_13.deD.aSD() && auw_12.deD.aSE() == auw_13.deD.aSE() && auw_12.deD.aSF() == auw_13.deD.aSF() && auw_12.deD.aSG() == auw_13.deD.aSG() && auw_12.deD.aSH() == auw_13.deD.aSH() && auw_12.deD.aSo() == auw_13.deD.aSo() && auw_12.deD.aSp() == auw_13.deD.aSp();
    }

    public auw_1 A(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        int n = auy_1.t(dataInput, f2);
        int n2 = auy_1.t(dataInput, f2);
        float f3 = auy_1.u(dataInput, f2);
        float f4 = auy_1.u(dataInput, f2);
        float f5 = auy_1.u(dataInput, f2);
        float f6 = auy_1.u(dataInput, f2);
        float f7 = auy_1.u(dataInput, f2);
        float f8 = auy_1.u(dataInput, f2);
        float f9 = auy_1.u(dataInput, f2);
        float f10 = auy_1.u(dataInput, f2);
        float f11 = auy_1.u(dataInput, f2);
        float f12 = auy_1.u(dataInput, f2);
        float f13 = auy_1.u(dataInput, f2);
        float f14 = auy_1.u(dataInput, f2);
        float f15 = auy_1.u(dataInput, f2);
        float f16 = auy_1.u(dataInput, f2);
        float f17 = auy_1.u(dataInput, f2);
        float f18 = auy_1.u(dataInput, f2);
        float f19 = auy_1.u(dataInput, f2);
        float f20 = auy_1.u(dataInput, f2);
        ly_2 ly_22 = new ly_2();
        ly_22.ay(f19);
        ly_22.az(f20);
        ly_22.nq(n);
        ly_22.nr(n2);
        ly_22.aA(f3);
        ly_22.aB(f5);
        ly_22.aC(f4);
        ly_22.aD(f6);
        ly_22.aE(f7);
        ly_22.aF(f8);
        ly_22.aG(f9);
        ly_22.aH(f10);
        ly_22.aI(f11);
        ly_22.aJ(f12);
        ly_22.aK(f13);
        ly_22.aL(f14);
        ly_22.aM(f15);
        ly_22.aN(f16);
        ly_22.aO(f17);
        ly_22.aP(f18);
        ly_22.aC(bl);
        return new auw_1(ly_22);
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((auw_1)object, (auw_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.A(dataInput, f2);
    }
}

