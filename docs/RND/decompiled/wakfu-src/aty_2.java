/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from atY
 */
public class aty_2
extends aum_1<atg_1> {
    public static final aty_2 ddL = new aty_2();

    private aty_2() {
    }

    @Override
    protected byte aJr() {
        return 1;
    }

    public atg_1 b(DataInput dataInput, float f2) {
        float f3 = aty_2.u(dataInput, f2);
        float f4 = aty_2.u(dataInput, f2);
        float f5 = aty_2.u(dataInput, f2);
        float f6 = aty_2.u(dataInput, f2);
        byte by = dataInput.readByte();
        ln_2 ln_22 = new ln_2();
        ln_22.S(f3);
        ln_22.a(lo_2.values()[by]);
        ln_22.setOffsetX(f4);
        ln_22.setOffsetY(f5);
        ln_22.T(f6);
        return new atg_1(ln_22);
    }

    protected boolean a(atg_1 atg_12, atg_1 atg_13) {
        ln_2 ln_22 = atg_12.bMa();
        ln_2 ln_23 = atg_13.bMa();
        return ln_22.aRB() == ln_23.aRB() && ln_22.getOffsetX() == ln_23.getOffsetX() && ln_22.getOffsetY() == ln_23.getOffsetY() && ln_22.aRD() == ln_23.aRD();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atg_1)object, (atg_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.b(dataInput, f2);
    }
}

