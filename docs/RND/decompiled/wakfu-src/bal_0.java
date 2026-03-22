/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAL
 */
public class bal_0
extends bCA
implements eIy {
    static final Logger jFw = Logger.getLogger(bal_0.class);
    int emZ;
    private fdy_0 jFx;
    private final fi_1 jFy = new bam_1(this, 4);

    @Override
    protected fi_1 bey() {
        return this.jFy;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    public int cqx() {
        return this.emZ;
    }

    @Override
    public boolean beq() {
        return false;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        this.c(rw_02);
        return true;
    }

    @Override
    public void dNq() {
        super.dNq();
        this.jFx = (fdy_0)fda_0.rWI.a(fdv_0.rZf, Integer.parseInt(this.baB));
    }

    @Override
    public byte bcN() {
        return 8;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkV;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW};
    }

    @Override
    public cpm_1[] dNh() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkG() && !bgt_02.dkH()) {
            return cpm_1.nip;
        }
        cqq_2 cqq_22 = (cqq_2)cps_1.njl.eLI();
        cqq_22.Mj(this.jFx.clf());
        return new cpm_1[]{cqq_22};
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ht(false);
        this.bi(false);
        this.jFx = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
        this.bi(true);
        this.emZ = 0;
        assert (this.jFx == null);
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(101, (long)this.jFx.d(), new Object[0]);
    }

    public String dPt() {
        return aum_0.cWf().a(102, (long)this.jFx.cqx(), new Object[0]);
    }

    @Override
    public eIw dNx() {
        return null;
    }

    static /* synthetic */ void a(bal_0 bal_02, ayv_2 ayv_22) {
        bal_02.a(ayv_22);
    }
}

