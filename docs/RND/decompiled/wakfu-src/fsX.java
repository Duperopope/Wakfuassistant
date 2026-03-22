/*
 * Decompiled with CFR 0.152.
 */
public abstract class fsX {
    protected final fsd_0 teJ;

    protected fsX(fsd_0 fsd_02) {
        this.teJ = fsd_02;
    }

    public fsd_0 eLi() {
        return this.teJ;
    }

    public acc_1 gli() {
        return this.teJ.gli();
    }

    public abstract fsY glC();

    public boolean b(fsX fsX2) {
        if (this == fsX2) {
            return true;
        }
        if (fsX2 == null || this.getClass() != fsX2.getClass()) {
            return false;
        }
        return this.teJ.equals(fsX2.teJ);
    }
}

