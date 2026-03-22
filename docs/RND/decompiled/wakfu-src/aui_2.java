/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aui
 */
public class aui_2
extends aum_1<atu_1> {
    public static final aui_2 ddW = new aui_2();

    private aui_2() {
    }

    @Override
    protected byte aJr() {
        return 9;
    }

    public atu_1 n(DataInput dataInput, float f2) {
        float f3 = aui_2.u(dataInput, f2);
        float f4 = aui_2.u(dataInput, f2);
        float f5 = aui_2.u(dataInput, f2);
        float f6 = aui_2.u(dataInput, f2);
        float f7 = aui_2.u(dataInput, f2);
        float f8 = aui_2.u(dataInput, f2);
        float f9 = aui_2.u(dataInput, f2);
        float f10 = aui_2.u(dataInput, f2);
        float f11 = aui_2.u(dataInput, f2);
        float f12 = aui_2.u(dataInput, f2);
        float f13 = aui_2.u(dataInput, f2);
        float f14 = aui_2.u(dataInput, f2);
        lg_2 lg_22 = new lg_2();
        lg_22.aU(f3);
        lg_22.aV(f4);
        lg_22.aW(f5);
        lg_22.aX(f6);
        lg_22.aY(f7);
        lg_22.aZ(f8);
        lg_22.ba(f9);
        lg_22.bb(f10);
        lg_22.bc(f11);
        lg_22.bd(f12);
        lg_22.be(f13);
        lg_22.bf(f14);
        return new atu_1(lg_22);
    }

    protected boolean a(atu_1 atu_12, atu_1 atu_13) {
        lg_2 lg_22 = atu_12.bMm();
        lg_2 lg_23 = atu_13.bMm();
        return lg_22.aSO() == lg_23.aSO() && lg_22.aSP() == lg_23.aSP() && lg_22.aSQ() == lg_23.aSQ() && lg_22.aSR() == lg_23.aSR() && lg_22.aSS() == lg_23.aSS() && lg_22.aST() == lg_23.aST() && lg_22.aSU() == lg_23.aSU() && lg_22.aSV() == lg_23.aSV() && lg_22.aSW() == lg_23.aSW() && lg_22.aSX() == lg_23.aSX() && lg_22.aSY() == lg_23.aSY() && lg_22.aSZ() == lg_23.aSZ();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atu_1)object, (atu_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.n(dataInput, f2);
    }
}

