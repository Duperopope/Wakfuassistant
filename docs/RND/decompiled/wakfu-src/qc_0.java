/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qc
 */
public class qc_0 {
    private final int bfd;
    private final ang_2 bfe;
    private final byte bff;
    private final boolean bfg;

    public qc_0(int n, ang_2 ang_22, byte by, boolean bl) {
        this.bfd = n;
        this.bfe = ang_22;
        this.bff = by;
        this.bfg = bl;
    }

    public boolean aZu() {
        return this.bfg;
    }

    public boolean a(qf_0 qf_02, qe_0 qe_02) {
        return this.bfe == null || this.bfe.b(qf_02, qe_02, this, qf_02.bdV());
    }

    public int d() {
        return this.bfd;
    }

    public byte aZv() {
        return this.bff;
    }
}

