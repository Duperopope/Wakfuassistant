/*
 * Decompiled with CFR 0.152.
 */
public abstract class WH
extends ww_0 {
    private final byte[] bOW = new byte[azh_2.vG(324)];

    @Override
    public boolean aJ(int n, int n2) {
        return azh_2.i(this.bOW, (n2 - this.baq) * 18 + n - this.bap);
    }

    @Override
    public void a(apl_1 apl_12) {
        super.a(apl_12);
        apl_12.dx(this.bOW);
    }

    protected final void d(int n, int n2, boolean bl) {
        azh_2.a(this.bOW, (n2 - this.baq) * 18 + n - this.bap, bl);
    }
}

