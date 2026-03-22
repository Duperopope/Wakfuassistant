/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fmu
 */
class fmu_0
implements fmm_0<fmt> {
    fmu_0() {
    }

    public fmt u(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        return new fmt(l, n, n2, bl, iterable);
    }

    @Override
    public flz gdt() {
        return fmt.sGG;
    }

    @Override
    public /* synthetic */ flv_0 b(long l, int n, int n2, boolean bl, Iterable iterable) {
        return this.u(l, n, n2, bl, iterable);
    }
}

