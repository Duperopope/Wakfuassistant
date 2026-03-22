/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJk
 */
public class bjk_0
extends bdf_1 {
    private final fnl_0 klm;
    private final bdj_2 kln;

    public bjk_0(fnl_0 fnl_02) {
        super(aym_2.bSE());
        this.klm = fnl_02;
        this.kln = null;
    }

    public bjk_0(fnl_0 fnl_02, bdj_2 bdj_22) {
        super(aym_2.bSE());
        this.klm = fnl_02;
        this.kln = bdj_22;
    }

    @Override
    public void b(Sl sl) {
    }

    @Override
    public String bne() {
        return this.klm.getName();
    }

    @Override
    public boolean bvN() {
        return this.kln != null && this.kln.bvN();
    }

    @Override
    public boolean isVisible() {
        if (this.klm.geL().gfz()) {
            return false;
        }
        if (this.kln == null) {
            return true;
        }
        boolean bl = this.kln.isVisible() && this.kln.bqo() <= 0;
        return super.isVisible() && bl;
    }

    @Override
    public int bvS() {
        return this.kln.bvO().a(this.kln);
    }

    @Override
    public int bvQ() {
        return this.kln.bvO().a(this.kln);
    }

    @Override
    protected anp_2 a(bnv_2 bnv_22, anp_2 anp_22) {
        return bnv_22.a(this.kln.dcP(), anp_22);
    }

    @Override
    public boolean bqs() {
        return false;
    }

    public String toString() {
        return "PetActor{m_pet=" + String.valueOf(this.klm) + ", m_playerActor=" + String.valueOf(this.kln == null ? null : this.kln.dcP()) + "}";
    }

    public void a(fow_0 fow_02) {
        if (fow_02 != null) {
            fow_02.d(new bjl_0(this));
            this.bpC();
        }
    }
}

