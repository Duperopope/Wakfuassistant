/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsB
 */
public class fsb_0
implements fsd_0<fby_0> {
    public static final fsb_0[] tdT = new fsb_0[0];
    private final fam_0 tdU;

    public fsb_0(fam_0 fam_02) {
        this.tdU = fam_02;
    }

    @Override
    public fsc_0 ekj() {
        return fsc_0.tdW;
    }

    @Override
    public acc_1 gli() {
        return new acc_1(this.tdU.fRc(), this.tdU.fRd());
    }

    public fby_0 fRh() {
        return this.tdU.fRh();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fsb_0 fsb_02 = (fsb_0)object;
        return fsE.a(this, fsb_02);
    }

    public int hashCode() {
        return fsE.l(this);
    }

    @Override
    public long Lx() {
        return this.tdU.ZC();
    }

    public fam_0 glj() {
        return this.tdU;
    }

    @Override
    public /* synthetic */ fbz_0 ekD() {
        return this.fRh();
    }
}

