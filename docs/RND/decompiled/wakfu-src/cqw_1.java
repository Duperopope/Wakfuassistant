/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from cQw
 */
public class cqw_1
extends cpl_1
implements adm_0 {
    protected String p;
    protected int ciZ;
    private rw_0 nli;

    public cqw_1() {
    }

    private cqw_1(String string, int n) {
        this.p = string;
        this.ciZ = n;
    }

    public cqw_1 eLN() {
        return new cqw_1(this.p, this.ciZ);
    }

    @Override
    public String ely() {
        return this.p;
    }

    @Override
    public List<flv_0> euZ() {
        if (cqw_1.eLw() != fkc_0.sAp) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fmX fmX2 = new fmX(bgt_02);
        fmX2.ng(((RI)this.cqO).Sn());
        return fmX2.gdj();
    }

    @Override
    public List<flv_0> eva() {
        return null;
    }

    @Override
    public boolean bxO() {
        return !aue_0.cVJ().cVK().djT() && !bsl_0.jfZ.dFs();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.i(false, true)) {
            return;
        }
        bgt_02.ddI().b(this);
        ni_1 ni_12 = (ni_1)this.cqO;
        if (!bgt_02.b(false, true, ni_12.aVK())) {
            bgt_02.ddI().c(this);
            this.eMh();
        }
    }

    private void eMh() {
        this.d(this.nli);
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niR;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.eMh();
    }

    @Override
    protected int eLB() {
        return this.ciZ;
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled() && this.eMi();
    }

    public boolean eMi() {
        return ((bCA)this.cqO).dNL();
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.isEnabled() ? nik : nim);
        String string = this.eMi() ? this.p : "error.playerNotSubscribed";
        ahv_22.c(aum_0.cWf().c(string, new Object[0])).cev();
        return ahv_22.ceL();
    }

    public void setName(String string) {
        this.p = string;
    }

    public void CV(int n) {
        this.ciZ = n;
    }

    public void e(rw_0 rw_02) {
        this.nli = rw_02;
    }

    public String toString() {
        return "MRUGenericInteractiveAction{m_name='" + this.p + "', m_gfxId=" + this.ciZ + ", m_actionToExecute=" + String.valueOf(this.nli) + "}";
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eLN();
    }
}

