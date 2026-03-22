/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auu
 */
public class auu_1
extends aup_1<aur_1> {
    public static final auu_1 deB = new auu_1();

    private auu_1() {
    }

    @Override
    protected byte aJr() {
        return 1;
    }

    public aur_1 y(DataInput dataInput, float f2) {
        float f3 = auu_1.u(dataInput, f2);
        float f4 = auu_1.u(dataInput, f2);
        la_2 la_22 = new la_2();
        la_22.aR(f3);
        la_22.aS(f4);
        return new aur_1(la_22);
    }

    protected boolean a(aur_1 aur_12, aur_1 aur_13) {
        return aur_12.dey.aSK() == aur_13.dey.aSK() && aur_12.dey.aSJ() == aur_13.dey.aSJ();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((aur_1)object, (aur_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.y(dataInput, f2);
    }
}

