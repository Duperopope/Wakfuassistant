/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cQF
 */
public class cqf_1
extends cpl_1
implements adm_0 {
    private static adm_0 nlp;
    private int ciZ;
    private String erw;
    private bCA nlq;
    private axb_2 nlr = awx_2.dnF;
    private String nls = null;

    @Override
    public cps_1 eLz() {
        return cps_1.niQ;
    }

    protected rw_0 eLF() {
        return this.nlq.bdZ();
    }

    public void s(axb_2 axb_22) {
        this.nlr = axb_22;
    }

    @Override
    public void run() {
        bCA bCA2;
        if (!this.bxO()) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!cqf_1.ac(bgt_02)) {
            return;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        if (nlp != null) {
            bdj_22.c(nlp);
        }
        nlp = this;
        bdj_22.b(nlp);
        this.nlq = bCA2 = (bCA)this.cqO;
        ArrayList<acd_1> arrayList = new ArrayList<acd_1>(bCA2.aVK());
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            acd_1 acd_12 = (acd_1)arrayList.get(i);
            DisplayedScreenElement displayedScreenElement = aaa_0.brC().g(acd_12.getX(), acd_12.getY(), acd_12.bdi(), abd.ccZ);
            if (displayedScreenElement != null) continue;
            nii.error((Object)("walkableElement null sur l'approchPoint=" + String.valueOf(acd_12)));
        }
        if (!bgt_02.b(false, true, (List<acd_1>)arrayList)) {
            bgt_02.ddI().c(nlp);
            if (!bgt_02.i(false, true)) {
                return;
            }
            this.d(this.eLF());
        }
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled() && ((bCA)this.cqO).dNL();
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return !bgt_02.djT() && !bsl_0.jfZ.dFs();
    }

    @Override
    public String getLabel() {
        return this.eMp();
    }

    String eMp() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.nlr.bQk());
        ahv_22.c(this.eLA());
        ahv_22.cev();
        if (!this.isEnabled()) {
            if (this.nls != null && this.nls.length() > 0) {
                ahv_22.ceH().ih(nim).c(this.nls);
            }
            if (!((bCA)this.cqO).dNL()) {
                ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
            }
        }
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        return this.erw != null ? this.erw : "ielt.use";
    }

    @Override
    public String eLA() {
        return aum_0.cWf().c(this.ely(), new Object[0]);
    }

    @Override
    public cpm_1 eLD() {
        return new cqf_1();
    }

    public void qa(String string) {
        this.nls = string;
    }

    @Override
    protected int eLB() {
        return this.ciZ;
    }

    public void CV(int n) {
        this.ciZ = n;
    }

    public void qb(String string) {
        this.erw = string;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(nlp);
        if (this.nlq.T(ads_02.bqg())) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.i(false, true)) {
                return;
            }
            this.d(this.eLF());
        }
    }

    @Override
    public List<flv_0> euZ() {
        return null;
    }

    @Override
    public List<flv_0> eva() {
        if (cqf_1.eLw() != fkc_0.sAp) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fmv_0 fmv_02 = new fmv_0(bgt_02);
        fmv_02.up(Integer.MAX_VALUE);
        fmv_02.ng(((RI)this.cqO).Sn());
        return fmv_02.gdj();
    }
}

