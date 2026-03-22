/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auk
 */
public class auk_1
extends aum_1<atw_1> {
    public static final auk_1 ddY = new auk_1();

    private auk_1() {
    }

    @Override
    protected byte aJr() {
        return 14;
    }

    public atw_1 p(DataInput dataInput, float f2) {
        float f3 = auk_1.u(dataInput, f2);
        float f4 = auk_1.u(dataInput, f2);
        float f5 = auk_1.u(dataInput, f2);
        li_2 li_22 = new li_2();
        li_22.bg(f3);
        li_22.bh(f4);
        li_22.bi(f5);
        return new atw_1(li_22);
    }

    protected boolean a(atw_1 atw_12, atw_1 atw_13) {
        li_2 li_22 = atw_12.bMo();
        li_2 li_23 = atw_13.bMo();
        return li_22.aTa() == li_23.aTa() && li_22.aTb() == li_23.aTb() && li_22.aTc() == li_23.aTc();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atw_1)object, (atw_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.p(dataInput, f2);
    }
}

