/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auf
 */
public class auf_2
extends aum_1<atp_1> {
    public static final auf_2 ddT = new auf_2();

    private auf_2() {
    }

    @Override
    protected byte aJr() {
        return 7;
    }

    public atp_1 k(DataInput dataInput, float f2) {
        float f3 = auf_2.u(dataInput, f2);
        lz_1 lz_12 = new lz_1();
        lz_12.aQ(f3);
        return new atp_1(lz_12);
    }

    protected boolean a(atp_1 atp_12, atp_1 atp_13) {
        return atp_12.bMj().aSI() == atp_13.bMj().aSI();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atp_1)object, (atp_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.k(dataInput, f2);
    }
}

