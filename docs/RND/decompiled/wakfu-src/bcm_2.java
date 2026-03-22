/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcm
 */
public final class bcm_2
implements PM {
    private final int hEc;
    private final String hEd;
    private long Ns;
    private final boolean hEe;

    bcm_2(bcm_2 bcm_22) {
        this.hEc = bcm_22.hEc;
        this.hEd = bcm_22.hEd;
        this.hEe = bcm_22.hEe;
    }

    bcm_2(int n, String string, boolean bl) {
        this.hEc = n;
        this.hEd = string != null ? string.intern() : null;
        this.hEe = bl;
    }

    @Override
    public int d() {
        return this.hEc;
    }

    public String getName() {
        return this.hEd;
    }

    public long apJ() {
        return this.Ns;
    }

    public boolean cjL() {
        return this.hEe;
    }

    void jh(long l) {
        this.Ns = l;
    }
}

