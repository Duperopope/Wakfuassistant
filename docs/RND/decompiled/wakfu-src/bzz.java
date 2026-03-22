/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bzz
extends bCA {
    static final Logger jDV = Logger.getLogger(bzz.class);
    public static final int jDW = -1;
    private fdr jDX;
    private final fi_1 jDY = new bzA(this);
    private bde_0 jBL;
    private ffV iWZ;
    int jDZ = -1;
    private bbh_1 jEa;

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW};
    }

    @Override
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.njt.eLI()};
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.iWZ = null;
        this.jEa = null;
        aue_0.cVJ().b(cul_1.eRH());
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
        this.bi(true);
        this.jDZ = -1;
        this.jBL = new bde_0(0L, 0, Sf.bnD, 1);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("equipable.dummy", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    protected fi_1 bey() {
        return this.jDY;
    }

    @Override
    public void dNq() {
        if (!BH.aU(this.baB)) {
            this.jDX = (fdr)fda_0.rWI.a(fdv_0.rZo, Integer.parseInt(this.baB));
        }
        if (this.jDX == null) {
            throw new IllegalArgumentException("Impossible de trouver le param\u00e8tre " + this.baB + " pour l'\u00e9l\u00e9ment interactif d'id=" + this.aXv);
        }
    }

    public void c(Sp sp) {
        this.jBL.a(sp);
    }

    public void a(int n, int n2, uy_1 uy_12) {
        if (n == n2) {
            return;
        }
        if (n != -1 && this.iWZ != null) {
            ffV ffV2 = this.iWZ;
            this.iWZ = null;
            this.jBL.bs(ffV2);
        }
        if (n2 != -1) {
            if (uy_12.aaQ > 0) {
                this.iWZ = new ffV();
                this.iWZ.c(uy_12);
            } else {
                this.iWZ = new ffV(aym_2.bSE());
                this.iWZ.l((fhc_0)fgD.fXh().Vd(this.jDZ));
                this.iWZ.ak((short)1);
            }
            try {
                this.jBL.bp(this.iWZ);
            }
            catch (sa_0 sa_02) {
                jDV.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
            }
            catch (Sz sz) {
                jDV.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
            }
        }
    }

    public ffV getItem() {
        return this.iWZ;
    }

    public String getAnimName() {
        return this.jDX.getAnimName();
    }

    public byte aWO() {
        return this.jDX.aWO();
    }

    public int dOM() {
        return this.jDZ;
    }

    public void Gd(int n) {
        this.jDZ = n;
    }

    public void a(bbh_1 bbh_12) {
        this.jEa = bbh_12;
    }

    public bbh_1 dON() {
        return this.jEa;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.blg) {
            aue_0.cVJ().b(cul_1.eRH());
        }
        this.b(rw_02);
        return true;
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDe(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bzz bzz2, ayv_2 ayv_22) {
        bzz2.a(ayv_22);
    }
}

