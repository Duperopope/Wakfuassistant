/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auj
 */
public class auj_2
extends aum_1<atv_2> {
    public static final auj_2 ddX = new auj_2();

    private auj_2() {
    }

    @Override
    protected byte aJr() {
        return 13;
    }

    public atv_2 o(DataInput dataInput, float f2) {
        float f3 = auj_2.u(dataInput, f2);
        float f4 = auj_2.u(dataInput, f2);
        float f5 = auj_2.u(dataInput, f2);
        lh_2 lh_22 = new lh_2();
        lh_22.bg(f3);
        lh_22.bh(f4);
        lh_22.bi(f5);
        return new atv_2(lh_22);
    }

    protected boolean a(atv_2 atv_22, atv_2 atv_23) {
        lh_2 lh_22 = atv_22.bMn();
        lh_2 lh_23 = atv_23.bMn();
        return lh_22.aTa() == lh_23.aTa() && lh_22.aTb() == lh_23.aTb() && lh_22.aTc() == lh_23.aTc();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atv_2)object, (atv_2)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.o(dataInput, f2);
    }
}

