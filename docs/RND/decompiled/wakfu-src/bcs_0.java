/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bCs
 */
public class bcs_0
extends afk_0 {
    private static final String jHs = "part";
    protected boolean jHt;
    protected boolean jHu;
    private byte bmn = (byte)-1;
    protected boolean jHv;
    protected String jHw;
    protected int bep;
    protected int jHx;
    private static final afr_1[] jHy = new afr_1[]{ais_1.bBp(), aiq_2.bBo(), aiv_2.bBr(), bvc_2.eot(), bvy_1.lsJ};

    public bcs_0() {
        this.aVI();
    }

    @Override
    public void a(@NotNull ni_1 ni_12) {
        super.a(ni_12);
        this.bmn = ~ni_12.bez();
        this.aPc();
    }

    @Override
    public void onInteractiveElementChanges(RH rH) {
        this.aPc();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jHw = "ANMInteractiveElementPath";
        this.jHt = true;
        this.a(new bct_0(this));
        this.bmn = (byte)-1;
        this.bVc = agh_1.dLJ;
    }

    @Override
    public void aVH() {
        super.aVH();
        agZ.bzy().so(this.jHx);
        this.bep = -1;
        this.jHx = -1;
        cxq_1.eWO().a(this);
        this.jHw = "ANMInteractiveElementPath";
        this.bqt();
        this.bpI();
    }

    @Override
    public boolean bqs() {
        boolean bl = super.bqs();
        ni_1 ni_12 = this.aVD();
        if (fse_1.gFu().dp("isAdmin")) {
            return bl && ni_12.bg(true);
        }
        return bl && ni_12.isUsable();
    }

    @Override
    public void aPc() {
        bCA bCA2 = (bCA)this.crg;
        if (bCA2 != null) {
            IsoParticleSystem isoParticleSystem;
            bDb bDb2 = bCA2.dQz();
            if (bDb2.dQF()) {
                acd_1 acd_12 = bDb2.dQG();
                this.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
            } else {
                this.e(bCA2.bcC(), bCA2.bcD(), bCA2.bcE());
            }
            if (this.bmf == Short.MIN_VALUE) {
                this.bmf = (short)(bCA2.dOz() ? (int)bCA2.dQs() : Short.MIN_VALUE);
            }
            byte by = (byte)bCA2.bem();
            if (this.bmf == -1 && by == 0 && (isoParticleSystem = agY.bzw().sk(800220)) != null) {
                isoParticleSystem.r(this.bcC(), this.bcD(), this.bcE());
                agZ.bzy().b(isoParticleSystem);
            }
            this.a(by, bCA2.dQc(), bCA2.dQu(), bCA2.bcB());
            this.bmf = by;
            this.setVisible(bCA2.isVisible());
            this.setSelectable(bCA2.isSelectable());
            this.bT(bCA2.bez());
            isoParticleSystem = agZ.bzy().sn(this.jHx);
            if (isoParticleSystem != null) {
                isoParticleSystem.setVisible(bCA2.isVisible() && bCA2.isUsable());
            }
            boolean bl = this.jHu;
            this.jHu = bCA2.dOf();
            if (bl && !this.jHu) {
                cxq_1.eWO().a(this);
            }
        } else {
            bWl.error((Object)"Cet ClientInteractiveElementView n'a pas de mod\u00e8le associ\u00e9.");
        }
    }

    private void bT(byte by) {
        if (this.bmn == by) {
            return;
        }
        for (int i = 0; i < 8; ++i) {
            boolean bl;
            int n = 1 << i;
            boolean bl2 = (by & n) == n;
            boolean bl3 = bl = (this.bmn & n) == n;
            if (bl == bl2) continue;
            this.l(jHs + i, bl2);
        }
        this.bmn = by;
    }

    @Override
    public void nU(int n) {
        super.nU(n);
        String string = "";
        try {
            string = auc_0.cVq().bS(this.jHw);
            string = String.format(string, n);
            this.dP(Integer.toString(n));
            if (n != 0) {
                this.k(string, true);
            }
        }
        catch (Exception exception) {
            bWl.error((Object)"impossible de r\u00e9cup\u00e9rer le path depuis la config ", (Throwable)exception);
        }
    }

    @Override
    public void K(int n, int n2) {
        this.bep = n;
        if (this.bep > 0) {
            FreeParticleSystem freeParticleSystem = agY.bzw().sk(this.bep);
            freeParticleSystem.a(this, 0.0f, n2);
            agZ.bzy().b(freeParticleSystem);
            this.jHx = freeParticleSystem.bLJ();
        }
    }

    public boolean isSelectable() {
        return this.jHv;
    }

    public void setSelectable(boolean bl) {
        this.jHv = bl;
    }

    @Override
    public afr_1[] bya() {
        return jHy;
    }

    public void mE(String string) {
        this.jHw = string;
    }

    public String dQk() {
        if (this.crg != null && this.crg instanceof bCA) {
            return ((bCA)this.crg).dOk();
        }
        return null;
    }

    protected int dND() {
        if (this.crg != null && this.crg instanceof bCA) {
            return ((bCA)this.crg).dND();
        }
        return -1;
    }

    public void dQl() {
        ahv_2 ahv_22;
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
            return;
        }
        bCA bCA2 = (bCA)this.aVD();
        if (bCA2 == null) {
            return;
        }
        Object object = bCA2.getName();
        String string = this.dQk();
        if (string != null) {
            object = (String)object + string;
        }
        if (bDr.f(bCA2) && !bDr.g(bCA2)) {
            ahv_22 = new ahv_2().ceH();
            if (bCA2.dNk() != null && !bCA2.dNk().dNl()) {
                ahv_22.e(new fhl_2(ett_1.oqd)).c(aum_0.cWf().c("item.learnable", new Object[0])).ceD();
            } else {
                ahv_22.e(new fhl_2(ett_1.oqe)).c(aum_0.cWf().c("furniture.unknown.apperance", new Object[0])).ceD();
            }
            if (object != null) {
                object = (String)object + ahv_22.ceL();
            }
        }
        if (object == null) {
            object = "ERROR : Text is null";
            bWl.error((Object)"The text is null, which certainly means that the initialization of the object has not taken place or has gone wrong.");
        }
        ahv_22 = new ahv_2();
        ahv_22.c("(").c(String.valueOf(this.Sn())).c(")");
        if (bCA2.ber()) {
            ahv_22.e(awx_2.dnK).c(" locked").ceD();
        }
        if (bCA2 instanceof bxb_0) {
            boolean bl = ((bxb_0)bCA2).dNl();
            ahv_22.ceH().c(" virtual: " + bl);
        }
        ahv_22.ceH().c(" direction: " + bCA2.bcB().name());
        String string2 = ahv_22.ceL();
        dci_0 dci_02 = new dci_0(this, bCA2.dQt(), this.dND());
        if (this.aVD() instanceof byv_0) {
            ahv_2 ahv_23 = new ahv_2();
            object = ahv_23.ceu().c((CharSequence)object).cev().ceL();
            dci_02.a((String)object, string2, null, null);
            byv_0 byv_02 = (byv_0)this.aVD();
            ArrayList<bea_0> arrayList = byv_02.dOx().dyM();
            for (bea_0 bea_02 : arrayList) {
                ahv_23 = new ahv_2();
                ahv_23.c(bea_02.getName()).c(" x").aN(bea_02.dSx().sID);
                ahv_23.ceH();
                ahv_23.hY(bea_02.eAU()).c(" \u00a7");
                dci_02.g(ahv_23.ceL(), null, bea_02.getItem().byf());
            }
        } else {
            List<String> list = bDr.i(bCA2);
            dci_02.a((String)object, string2, null, list);
        }
        cxq_1.eWO().a(dci_02);
    }

    @Override
    public void e(float f2, float f3, float f4) {
        if (this.getWorldX() != f2 || this.getWorldY() != f3 || this.getAltitude() != f4) {
            afh_0.bxU().a(this.Sn(), (int)f2, (int)f3);
            super.e(f2, f3, f4);
        }
    }

    @Override
    public int bqo() {
        if (this.crg == null) {
            return super.bqo();
        }
        return ((bCA)this.crg).bqo();
    }

    static /* synthetic */ void a(bcs_0 bcs_02, ayv_2 ayv_22) {
        bcs_02.a(ayv_22);
    }

    static /* synthetic */ Logger aGi() {
        return bWl;
    }
}

