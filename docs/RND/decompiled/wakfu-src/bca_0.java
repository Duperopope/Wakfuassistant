/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bCa
 */
public class bca_0
extends bCA
implements eIy {
    static final Logger jGO = Logger.getLogger(bca_0.class);
    private fdE jGP;
    private int hNj;
    private int bep;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jGO.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.b(rw_02);
        this.c(rw_02);
        return true;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public rw_0 dNn() {
        boolean bl = this.bmf == 1 && this.jGP.cya() >= 0;
        boolean bl2 = this.bmf == 0 && this.jGP.cxX() >= 0;
        return bl || bl2 ? rw_0.bkJ : rw_0.bkR;
    }

    @Override
    public cpm_1[] dNh() {
        fqy_0 fqy_02 = this.drR();
        if (fqy_02 == null) {
            return cpm_1.nip;
        }
        cpr_1 cpr_12 = (cpr_1)cps_1.njy.eLI();
        cpr_12.CV(fqy_02.giv());
        boolean bl = this.dPZ();
        cpr_12.qb("desc.mru." + fqy_02.giw());
        if (this.drR().giy()) {
            cpr_12.pY(bah_1.c(this.drR().cuZ()[0], 1, 0, false));
        }
        cpr_12.jU(true);
        cpr_12.setEnabled(fqy_02.isEnabled() && bl);
        return new cpm_1[]{cpr_12};
    }

    private boolean dPZ() {
        return this.drR().bV(aue_0.cVJ().cVK());
    }

    private fqy_0 drR() {
        return switch (this.bmf) {
            case 1 -> fqz_0.giz().YY(this.jGP.cya());
            case 0 -> fqz_0.giz().YY(this.jGP.cxX());
            default -> throw new IllegalStateException("State " + this.bmf + " inconnu pour un Lampadaire");
        };
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jGP = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
        this.hNj = 0;
        this.bep = 0;
        assert (this.jGP == null);
    }

    @Override
    protected void dbu() {
        super.dbu();
        switch (this.bmf) {
            case 1: {
                this.dQb();
                break;
            }
            case 0: {
                this.dQa();
            }
        }
    }

    private void dQa() {
        acq_0.cge.bn(this.hNj, 1000);
        IsoParticleSystem isoParticleSystem = agZ.bzy().sn(this.bep);
        if (isoParticleSystem != null) {
            isoParticleSystem.uA(500);
        }
        this.hNj = -1;
        this.bep = -1;
    }

    private void dQb() {
        this.dQa();
        try {
            ast_2 ast_22 = asx_2.day.btu();
            this.hNj = ast_22.d();
            awx_2 awx_22 = new awx_2(this.jGP.AM());
            ast_22.t(0.0f, 0.0f, 0.0f);
            ast_22.u(0.0f, 0.0f, 0.0f);
            ast_22.c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), 1000);
            ast_22.a(new acp_1(this.bcC(), this.bcD(), this.bcE()));
            ast_22.aT(this.jGP.aSL());
            ast_22.setEnabled(true);
            ast_22.cT(this.jGP.bKI());
            acq_0.cge.a(ast_22);
            int n = this.jGP.bBE();
            if (n > 0) {
                CellParticleSystem cellParticleSystem = agY.bzw().sl(n);
                if (cellParticleSystem != null) {
                    cellParticleSystem.r(this.bcC(), this.bcD(), this.bcE() + this.bcN());
                    agZ.bzy().b(cellParticleSystem);
                    this.bep = cellParticleSystem.bLJ();
                } else {
                    jGO.error((Object)("Particule non trouv\u00e9e " + n));
                }
            }
        }
        catch (Exception exception) {
            jGO.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public boolean dQc() {
        return true;
    }

    @Override
    public void c(ng_1 ng_12) {
        jGO.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public void dNq() {
        super.dNq();
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jGO.error((Object)("[LD] Le lampadaire " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        fdE fdE2 = (fdE)fda_0.rWI.a(fdv_0.rYW, Integer.valueOf(stringArray[0]));
        if (fdE2 == null) {
            jGO.error((Object)("[LD] Le lampadaire " + this.aXv + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jGP = fdE2;
        this.ht(false);
    }

    @Override
    public eIw dNx() {
        return this.jGP;
    }

    @Override
    public void aVS() {
        acq_0.cge.rD(this.hNj);
        agZ.bzy().so(this.bep);
        super.aVS();
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    static /* synthetic */ void a(bca_0 bca_02, ayv_2 ayv_22) {
        bca_02.a(ayv_22);
    }
}

