/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDZ
 */
public interface bdz_0 {
    public boolean dbK();

    public void fm(boolean var1);

    default public void dRM() {
        if (this.dbK()) {
            return;
        }
        this.fm(true);
    }

    default public void dRN() {
        if (!this.dbK()) {
            return;
        }
        this.fm(false);
    }

    default public void dLG() {
        if (this.dbK()) {
            this.dRN();
        } else {
            this.dRM();
        }
    }
}

