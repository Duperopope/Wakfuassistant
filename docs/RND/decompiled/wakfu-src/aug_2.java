/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from aug
 */
public class aug_2
extends aum_1<atq_2> {
    public static final aug_2 ddU = new aug_2();

    private aug_2() {
    }

    @Override
    protected byte aJr() {
        return 11;
    }

    public atq_2 l(DataInput dataInput, float f2) {
        float f3 = aug_2.u(dataInput, f2);
        lc_2 lc_22 = new lc_2();
        lc_22.at(f3);
        return new atq_2(lc_22);
    }

    protected boolean a(atq_2 atq_22, atq_2 atq_23) {
        return atq_22.bMk().aSi() == atq_23.bMk().aSi();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atq_2)object, (atq_2)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.l(dataInput, f2);
    }
}

