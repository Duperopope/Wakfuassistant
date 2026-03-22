/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdM
 */
public class bdm_1
extends beh_2 {
    public final String hMp;
    String hMq;

    public bdm_1(enk_0 enk_02, String string) {
        super(enk_02);
        this.hMp = string;
    }

    private bdm_1(bdm_1 bdm_12) {
        super(bdm_12.hMZ);
        this.hMp = bdm_12.hMp;
    }

    public bdm_1 ded() {
        return new bdm_1(this);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        this.hMq = bdj_22.bpE();
        this.a(bdj_22, true);
    }

    public void a(bdj_2 bdj_22, boolean bl) {
        bgy bgy2 = bdj_22.dcP();
        bgy2.CK(Integer.parseInt(this.hMp));
        bgy2.ddI().dU(null);
        if (bl) {
            bgy2.dkr();
        } else {
            bdj_22.lf(this.hMp);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bdm_1 bdm_12 = (bdm_1)object;
        return !(this.hMp != null ? !this.hMp.equals(bdm_12.hMp) : bdm_12.hMp != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMp != null ? this.hMp.hashCode() : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.ded();
    }
}

