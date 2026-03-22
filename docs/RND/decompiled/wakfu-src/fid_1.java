/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fID
 */
class fid_1
implements fia_1<fih_2> {
    final /* synthetic */ fib_2 uBN;

    fid_1(fib_2 fib_22) {
        this.uBN = fib_22;
    }

    @Override
    public fes_2 a(fih_2 fih_22) {
        if (fih_22 == null) {
            return null;
        }
        if (fih_22.getText() == null) {
            return null;
        }
        return this.uBN.vD(fih_22.getText());
    }

    @Override
    public void e(fes_2 fes_22) {
        fes_22.gAD();
    }
}

