/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aua
 */
public class aua_1
extends aum_1<atj_1> {
    public static final aua_1 ddN = new aua_1();

    private aua_1() {
    }

    @Override
    protected byte aJr() {
        return 3;
    }

    public atj_1 e(DataInput dataInput, float f2) {
        float f3 = aua_1.u(dataInput, f2);
        ls_2 ls_22 = new ls_2();
        ls_22.as(f3);
        return new atj_1(ls_22);
    }

    protected boolean a(atj_1 atj_12, atj_1 atj_13) {
        return atj_12.bMc().aSf() == atj_13.bMc().aSf();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atj_1)object, (atj_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.e(dataInput, f2);
    }
}

