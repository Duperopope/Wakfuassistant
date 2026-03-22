/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPU
 */
public class cpu_1
extends cpm_1
implements adm_0 {
    private fqy_0 ipI;

    public cpu_1() {
    }

    public cpu_1(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }

    public cpu_1 eLL() {
        return new cpu_1(this.ipI);
    }

    public void b(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }

    @Override
    public String ely() {
        return this.ipI.giw();
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(this.eLA());
        return ahv_22.ceL();
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 != null) {
            return false;
        }
        this.setEnabled(true);
        return true;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Trying to run '" + this.eLz().aXB() + "' but isRunnable returns false!"));
            return;
        }
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.i(false, true)) {
            return;
        }
        bgt_02.ddI().b(this);
        if (bgt_02.b(false, true, bCA2.aVK())) {
            return;
        }
        bgt_02.ddI().c(this);
        if (!bgt_02.ddI().bvE() && bCA2.T(bgt_02.ddI().bqg())) {
            this.eLM();
            return;
        }
        aPd.e("too.far.to.interact", new Object[0]);
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niL;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bCA2.T(bgt_02.ddI().bqg())) {
            return;
        }
        this.eLM();
    }

    @Override
    protected int eLB() {
        return this.ipI.giv();
    }

    protected void eLM() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bxh_0 bxh_02 = (bxh_0)this.cqO;
        bgt_02.ddI().a(bgt_02.aZw().O(bxh_02.bcC(), bxh_02.bcD(), (short)0));
        csk_1.nFj.l(bxh_02);
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eLL();
    }
}

