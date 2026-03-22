/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aub
 */
public class aub_1
extends aum_1<atk_1> {
    public static final aub_1 ddO = new aub_1();

    private aub_1() {
    }

    @Override
    protected byte aJr() {
        return 4;
    }

    public atk_1 f(DataInput dataInput, float f2) {
        float f3 = aub_1.u(dataInput, f2);
        float f4 = aub_1.u(dataInput, f2);
        float f5 = aub_1.u(dataInput, f2);
        float f6 = aub_1.u(dataInput, f2);
        float f7 = aub_1.u(dataInput, f2);
        lt_2 lt_22 = new lt_2();
        lt_22.i(f3);
        lt_22.j(f4);
        lt_22.k(f5);
        lt_22.setAlpha(f6);
        lt_22.setSpeed(f7);
        return new atk_1(lt_22);
    }

    protected boolean a(atk_1 atk_12, atk_1 atk_13) {
        lt_2 lt_22 = atk_12.bMd();
        lt_2 lt_23 = atk_13.bMd();
        return lt_22.aIU() == lt_23.aIU() && lt_22.aIV() == lt_23.aIV() && lt_22.aIW() == lt_23.aIW() && lt_22.aIX() == lt_23.aIX() && lt_22.aSa() == lt_23.aSa();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atk_1)object, (atk_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.f(dataInput, f2);
    }
}

