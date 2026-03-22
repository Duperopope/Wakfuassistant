/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auz
 */
public class auz_1
extends aun_1<auxx_1> {
    public static final auz_1 deI = new auz_1();

    private auz_1() {
    }

    @Override
    protected byte aJr() {
        return 2;
    }

    public auxx_1 B(DataInput dataInput, float f2) {
        float f3 = auz_1.u(dataInput, f2);
        float f4 = auz_1.u(dataInput, f2);
        float f5 = auz_1.u(dataInput, f2);
        float f6 = auz_1.u(dataInput, f2);
        float f7 = auz_1.u(dataInput, f2);
        lb_2 lb_22 = new lb_2();
        lb_22.i(f3);
        lb_22.j(f4);
        lb_22.k(f5);
        lb_22.S(f6);
        lb_22.aT(f7);
        return new auxx_1(lb_22);
    }

    protected boolean a(auxx_1 auxx_12, auxx_1 auxx_13) {
        return auxx_12.deG.aIU() == auxx_13.deG.aIU() && auxx_12.deG.aIV() == auxx_13.deG.aIV() && auxx_12.deG.aIW() == auxx_13.deG.aIW() && auxx_12.deG.aRB() == auxx_13.deG.aRB() && auxx_12.deG.aSL() == auxx_13.deG.aSL();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((auxx_1)object, (auxx_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.B(dataInput, f2);
    }
}

