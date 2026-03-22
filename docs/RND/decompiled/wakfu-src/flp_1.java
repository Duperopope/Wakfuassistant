/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLp
 */
public class flp_1
extends fiq_1 {
    private boolean cHn;

    public flp_1(fes_2 fes_22, boolean bl) {
        this.uBe = fes_22;
        this.cHn = bl;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJs;
    }
}

