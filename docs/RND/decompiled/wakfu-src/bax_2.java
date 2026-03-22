/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bAx
 */
public class bax_2
extends bCA {
    static final Logger jFd = Logger.getLogger(bax_2.class);
    private fdf_0 jFe;

    @Override
    public void dNq() {
        super.dNq();
        if (this.baB == null || this.baB.isEmpty()) {
            return;
        }
        int n = Integer.parseInt(this.baB);
        Optional<bxa_0> optional = bwz_0.jAA.FX(n);
        if (optional.isEmpty()) {
            return;
        }
        bxa_0 bxa_02 = optional.get();
        this.jFe = (fdf_0)fda_0.rWI.a(fdv_0.rZc, bxa_02.coK());
        this.setName(aum_0.cWf().a(89, (long)this.jFe.d(), new Object[0]));
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkU};
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkU;
    }

    @Override
    public cpm_1[] dNh() {
        if (this.jFe == null) {
            return cpm_1.nip;
        }
        if (this.jFe.fTF().isEmpty()) {
            return cpm_1.nip;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bDw bDw2 = new bDw(this.jFe, bgt_02);
        ArrayList<cqp_1> arrayList = new ArrayList<cqp_1>();
        for (fdg_0 fdg_02 : this.jFe.fTF().values()) {
            fqy_0 fqy_02 = fqz_0.giz().YY(fdg_02.clf());
            arrayList.add(bDw2.a(new cqp_1(), fqy_02, fdg_02));
        }
        return arrayList.toArray(cpm_1.nip);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (!(rG instanceof bgt_0)) {
            return false;
        }
        fdg_0 fdg_02 = this.jFe.u(rG, rG, this, ((ru_0)((Object)rG)).bdV());
        bDw bDw2 = new bDw(this.jFe, (bgt_0)rG);
        if (!bDw2.a(rG)) {
            return true;
        }
        if (!bDw2.b(fdg_02)) {
            return false;
        }
        this.b(rw_02);
        this.aVQ();
        this.c(rw_02);
        cAY.eHc().nP(600210L);
        return false;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
    }

    static /* synthetic */ void a(bax_2 bax_22, ayv_2 ayv_22) {
        bax_22.a(ayv_22);
    }
}

