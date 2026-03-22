/*
 * Decompiled with CFR 0.152.
 */
class fmj
implements fmm_0<fmi> {
    fmj() {
    }

    public fmi p(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        return new fmi(l, n, n2, bl, iterable);
    }

    @Override
    public flz gdt() {
        return fmi.sGw;
    }

    @Override
    public /* synthetic */ flv_0 b(long l, int n, int n2, boolean bl, Iterable iterable) {
        return this.p(l, n, n2, bl, iterable);
    }
}

