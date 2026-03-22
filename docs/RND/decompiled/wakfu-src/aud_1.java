/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aud
 */
public class aud_1
extends aum_1<atn_1> {
    public static final aud_1 ddR = new aud_1();

    private aud_1() {
    }

    @Override
    protected byte aJr() {
        return 5;
    }

    public atn_1 i(DataInput dataInput, float f2) {
        float f3 = aud_1.u(dataInput, f2);
        float f4 = aud_1.u(dataInput, f2);
        float f5 = aud_1.u(dataInput, f2);
        float f6 = aud_1.u(dataInput, f2);
        float f7 = aud_1.u(dataInput, f2);
        float f8 = aud_1.u(dataInput, f2);
        lw_2 lw_22 = new lw_2();
        lw_22.at(f3);
        lw_22.au(f4);
        lw_22.setAngle(f5);
        lw_22.av(f6);
        lw_22.aw(f7);
        lw_22.ax(f8);
        return new atn_1(lw_22);
    }

    protected boolean a(atn_1 atn_12, atn_1 atn_13) {
        lw_2 lw_22 = atn_12.bMi();
        lw_2 lw_23 = atn_13.bMi();
        return lw_22.aSi() == lw_23.aSi() && lw_22.aSj() == lw_23.aSj() && lw_22.aSk() == lw_23.aSk() && lw_22.aSl() == lw_23.aSl() && lw_22.aSm() == lw_23.aSm() && lw_22.aSn() == lw_23.aSn();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atn_1)object, (atn_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.i(dataInput, f2);
    }
}

