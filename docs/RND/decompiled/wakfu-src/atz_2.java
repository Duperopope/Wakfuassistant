/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from atZ
 */
public class atz_2
extends aum_1<ati_1> {
    public static final atz_2 ddM = new atz_2();

    private atz_2() {
    }

    @Override
    protected byte aJr() {
        return 2;
    }

    public ati_1 d(DataInput dataInput, float f2) {
        float f3 = atz_2.u(dataInput, f2);
        float f4 = atz_2.u(dataInput, f2);
        float f5 = atz_2.u(dataInput, f2);
        lr_2 lr_22 = new lr_2();
        lr_22.ap(f3);
        lr_22.aq(f4);
        lr_22.ar(f5);
        return new ati_1(lr_22);
    }

    protected boolean a(ati_1 ati_12, ati_1 ati_13) {
        lr_2 lr_22 = ati_12.bMb();
        lr_2 lr_23 = ati_13.bMb();
        return lr_22.aSc() == lr_23.aSc() && lr_22.aSd() == lr_23.aSd() && lr_22.aSe() == lr_23.aSe();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((ati_1)object, (ati_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.d(dataInput, f2);
    }
}

