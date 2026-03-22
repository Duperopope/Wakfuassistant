/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auh
 */
public class auh_2
extends aum_1<atr_2> {
    public static final auh_2 ddV = new auh_2();

    private auh_2() {
    }

    @Override
    protected byte aJr() {
        return 8;
    }

    public atr_2 m(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        float f3 = auh_2.u(dataInput, f2);
        float f4 = auh_2.u(dataInput, f2);
        float f5 = auh_2.u(dataInput, f2);
        ld_2 ld_22 = new ld_2();
        ld_22.ap(f3);
        ld_22.aq(f4);
        ld_22.ar(f5);
        ld_22.aF(bl);
        return atr_2.a(ld_22);
    }

    protected boolean a(atr_2 atr_22, atr_2 atr_23) {
        ld_2 ld_22 = atr_22.bMl();
        ld_2 ld_23 = atr_23.bMl();
        return ld_22.aSc() == ld_23.aSc() && ld_22.aSd() == ld_23.aSd() && ld_22.aSe() == ld_23.aSe();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atr_2)object, (atr_2)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.m(dataInput, f2);
    }
}

