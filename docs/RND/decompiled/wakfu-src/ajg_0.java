/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJg
 */
public final class ajg_0
implements ajf_0 {
    private final String dZZ;
    private final String eaa;
    private final String eab;
    private final String eac;
    private final String ead;
    private final String eae;
    private final sm_0 eaf;

    public ajg_0(sm_0 sm_02, int n) {
        this.eaf = sm_02;
        this.dZZ = String.format("AnimCourse-Mnt%d", n);
        this.eaa = String.format("AnimMarche-Mnt%d", n);
        this.eab = String.format("AnimCourse-Debut-Mnt%d", n);
        this.eac = String.format("AnimCourse-Fin-Mnt%d", n);
        this.ead = String.format("AnimRelique-Saut-Mnt%d", n);
        this.eae = String.format("AnimStatique-Mnt%s", n);
    }

    @Override
    public String chl() {
        return this.dZZ;
    }

    @Override
    public String chm() {
        return this.eaa;
    }

    @Override
    public String chn() {
        return this.eab;
    }

    @Override
    public String cho() {
        return this.eac;
    }

    @Override
    public String chp() {
        return this.eae;
    }

    @Override
    public String chq() {
        return this.ead;
    }

    @Override
    public sm_0 chr() {
        return this.eaf;
    }
}

