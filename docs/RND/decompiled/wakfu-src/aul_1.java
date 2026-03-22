/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aul
 */
public class aul_1
extends aum_1<atx_2> {
    public static final aul_1 ddZ = new aul_1();

    private aul_1() {
    }

    @Override
    protected byte aJr() {
        return 10;
    }

    public atx_2 q(DataInput dataInput, float f2) {
        float f3 = aul_1.u(dataInput, f2);
        lj_2 lj_22 = new lj_2();
        lj_22.S(f3);
        return new atx_2(lj_22);
    }

    protected boolean a(atx_2 atx_22, atx_2 atx_23) {
        return atx_22.bMp().aRB() == atx_23.bMp().aRB();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atx_2)object, (atx_2)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.q(dataInput, f2);
    }
}

