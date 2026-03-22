/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsF
 */
public class fsf_0
implements fsd_0<fca_0> {
    private final fca_0 teb;
    private final int tec;
    private final int ted;

    public fsf_0(fca_0 fca_02, int n, int n2) {
        this.teb = fca_02;
        this.tec = n;
        this.ted = n2;
    }

    @Override
    public fsc_0 ekj() {
        return fsc_0.tdX;
    }

    @Override
    public acc_1 gli() {
        return new acc_1(this.tec, this.ted);
    }

    public fca_0 gll() {
        return this.teb;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fsf_0 fsf_02 = (fsf_0)object;
        return fsE.a(this, fsf_02);
    }

    public int hashCode() {
        return fsE.l(this);
    }

    public int glm() {
        return this.tec;
    }

    public int gln() {
        return this.ted;
    }

    @Override
    public long Lx() {
        return 31 * this.tec + this.ted;
    }

    @Override
    public /* synthetic */ fbz_0 ekD() {
        return this.gll();
    }
}

