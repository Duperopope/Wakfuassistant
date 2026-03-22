/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmI
 */
class fmi_0
implements fmm_0<fmh_0> {
    fmi_0() {
    }

    public fmh_0 B(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        return new fmh_0(l, n, n2, bl, iterable);
    }

    @Override
    public flz gdt() {
        return fmh_0.sGX;
    }

    @Override
    public /* synthetic */ flv_0 b(long l, int n, int n2, boolean bl, Iterable iterable) {
        return this.B(l, n, n2, bl, iterable);
    }
}

