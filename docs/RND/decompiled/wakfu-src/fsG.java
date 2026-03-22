/*
 * Decompiled with CFR 0.152.
 */
public class fsG
implements fsd_0<fcb_0> {
    private final fcb_0 tee;
    private final int tef;
    private final int teg;

    public fsG(fcb_0 fcb_02, int n, int n2) {
        this.tee = fcb_02;
        this.tef = n;
        this.teg = n2;
    }

    @Override
    public fsc_0 ekj() {
        return fsc_0.tdV;
    }

    @Override
    public acc_1 gli() {
        return new acc_1(this.tef * 9, this.teg * 9);
    }

    public fcb_0 glo() {
        return this.tee;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fsG fsG2 = (fsG)object;
        return fsE.a(this, fsG2);
    }

    public int hashCode() {
        return fsE.l(this);
    }

    public int glm() {
        return this.tef;
    }

    public int gln() {
        return this.teg;
    }

    public short fRN() {
        return this.tee.fRN();
    }

    @Override
    public long Lx() {
        return 31 * this.tef + this.teg;
    }

    @Override
    public /* synthetic */ fbz_0 ekD() {
        return this.glo();
    }
}

