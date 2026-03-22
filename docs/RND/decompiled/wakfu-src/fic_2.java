/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIC
 */
class fic_2
implements fia_1<fif_1> {
    final /* synthetic */ fib_2 uBM;

    fic_2(fib_2 fib_22) {
        this.uBM = fib_22;
    }

    @Override
    public fes_2 a(fif_1 fif_12) {
        if (fif_12 == null) {
            return null;
        }
        if (fif_12.byf() == null) {
            return null;
        }
        return this.uBM.vC(fif_12.byf());
    }

    @Override
    public void e(fes_2 fes_22) {
        fes_22.gAD();
    }
}

