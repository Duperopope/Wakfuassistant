/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cRv
 */
public class crv_1
extends cpl_1
implements adm_0 {
    protected acd_1 njX;
    private boolean nml;

    @Override
    public cps_1 eLz() {
        return cps_1.njb;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        bJr bJr2 = bhx_02.doD();
        if (bJr2 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.i(false, true)) {
                return;
            }
            fse_1.gFu().f("voteList", false);
            aue_0.cVJ().a(cyk_2.eYu());
        }
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        if (!(this.cqO instanceof bhx_0)) {
            return false;
        }
        bJr bJr2 = ((bhx_0)this.cqO).doD();
        if (bJr2 == null) {
            return false;
        }
        fjn_0 fjn_02 = bgt_02.ffF();
        if (bJr2.gfT() != fjn_02.Xt()) {
            return false;
        }
        if (bJr2.gfT() == 34) {
            return false;
        }
        fjo_0 fjo_02 = bJr2.gfR();
        if (fjo_02 == null) {
            return false;
        }
        return fjo_02.gbx();
    }

    @Override
    public String getLabel() {
        if (this.isEnabled()) {
            return super.getLabel();
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(this.eLA()).cev().c("\n");
        ahv_22.ceC().ih(nim);
        if (!this.nml) {
            ahv_22.c(aum_0.cWf().c("error.playerNotSubscriptionRight", new Object[0])).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        return "vote";
    }

    @Override
    public cpm_1 eLD() {
        return new crv_1();
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        aue_0.cVJ().a(cyk_2.eYu());
    }

    @Override
    protected int eLB() {
        return crc_2.nmA.nnW;
    }

    @Override
    public boolean isEnabled() {
        boolean bl = super.isEnabled();
        if (!bl) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.a(evv_1.oxb)) {
            return true;
        }
        this.nml = false;
        return false;
    }

    @Override
    @Nullable
    public List<flv_0> euZ() {
        return null;
    }

    @Override
    @Nullable
    public List<flv_0> eva() {
        if (crv_1.eLw() != fkc_0.sAp) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fmw_0 fmw_02 = new fmw_0(bgt_02);
        List<flv_0> list = fmw_02.gdj();
        fmy_0 fmy_02 = new fmy_0(bgt_02, -1L);
        list.addAll(fmy_02.gdj());
        fjo_0 fjo_02 = bgt_02.ffF().ems();
        fkH fkH2 = fjo_02.gbB().gcw();
        if (fkH2 != null) {
            fmy_0 fmy_03 = new fmy_0(bgt_02, fkH2.Sn());
            list.addAll(fmy_03.gdj());
        }
        return list;
    }

    public String toString() {
        return "MRUVoteAction{m_pathDestination=" + String.valueOf(this.njX) + "}";
    }
}

