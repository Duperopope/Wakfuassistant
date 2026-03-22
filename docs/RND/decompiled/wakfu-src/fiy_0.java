/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiy
 */
public class fiy_0
implements fie_0 {
    private final int ssg;
    private final int ssh;
    private final int ssi;
    private final ua_0 ssj;
    private final ux_0 ssk;
    private final ux_0 ssl;
    private final boolean ssm;

    public fiy_0(int n, int n2, int n3, ux_0 ux_02, ua_0 ua_02, ux_0 ux_03, boolean bl) {
        this.ssg = n;
        this.ssh = n2;
        this.ssj = ua_02;
        this.ssk = ux_02;
        this.ssl = ux_03;
        this.ssm = bl;
        this.ssi = ua_02.aJG() ? 0 : n3;
    }

    @Override
    public int d() {
        return this.ssg;
    }

    @Override
    public int fZN() {
        return this.ssh;
    }

    @Override
    public int cqm() {
        return this.ssi;
    }

    @Override
    public ua_0 fZO() {
        return this.ssj;
    }

    @Override
    public ux_0 fZP() {
        return this.ssk;
    }

    @Override
    public ux_0 fZQ() {
        return this.ssl;
    }

    @Override
    public boolean fZR() {
        return this.ssm;
    }
}

