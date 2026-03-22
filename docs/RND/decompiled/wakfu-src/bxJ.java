/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bxJ
extends bCA {
    static final Logger jBI = Logger.getLogger(bxJ.class);
    private fdk_0 jBJ;
    int[] jBK;
    private bde_0 jBL;
    private String p;
    private final fi_1 jBM = new bxK(this);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.blg) {
            aue_0.cVJ().b(csd_2.eOn());
        }
        return false;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkX, rw_0.bkY};
    }

    @Override
    public cpm_1[] dNh() {
        if (this.dNj().Xi() == aue_0.cVJ().cVK().Sn() || cpq_1.og(this.dNk().Xi())) {
            return new cpm_1[]{cps_1.nju.eLI()};
        }
        return new cpm_1[]{cps_1.njw.eLI()};
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
        this.bi(true);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jBL = null;
        aue_0.cVJ().b(csd_2.eOn());
    }

    @Override
    protected fi_1 bey() {
        return this.jBM;
    }

    @Override
    public void dNq() {
        if (!BH.aU(this.baB)) {
            this.jBJ = (fdk_0)fda_0.rWI.a(fdv_0.rZp, Integer.parseInt(this.baB));
        }
        if (this.jBJ == null) {
            throw new IllegalArgumentException("Impossible de trouver le param\u00e8tre " + this.baB + " pour l'\u00e9l\u00e9ment interactif d'id=" + this.aXv);
        }
        this.p = aum_0.cWf().a(150, (long)this.jBJ.d(), new Object[0]);
        this.jBL = new bde_0(0L, 0, ffl_0.sgm, this.jBJ.clJ());
    }

    public void dNN() {
        if (this.jBK.length != this.jBL.bfa()) {
            throw new IllegalArgumentException("La taille des donn\u00e9es dynamiques ne correspond pas \u00e0 la taille des donn\u00e9es statiques. Bookcase id=" + this.aXv);
        }
        boolean bl = cAY.eHc().eHm();
        cAY.eHc().jy(false);
        short s = this.jBL.bfa();
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            int n;
            ffV ffV2 = this.jBL.eQ(s2);
            int n2 = ffV2 == null ? 0 : ffV2.avr();
            if (n2 == (n = this.jBK[s2])) continue;
            if (ffV2 != null) {
                this.jBL.eR(s2);
            }
            if (n == 0) continue;
            ffV ffV3 = new ffV(aym_2.bSE());
            Object r = fgD.fXh().Vd(n);
            if (r == null) continue;
            ffV3.l((fhc_0)r);
            ffV3.ak((short)1);
            try {
                this.jBL.i(ffV3, s2);
                continue;
            }
            catch (sa_0 sa_02) {
                jBI.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
                continue;
            }
            catch (Sz sz) {
                jBI.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
                continue;
            }
            catch (SD sD) {
                jBI.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
            }
        }
        cAY.eHc().jy(bl);
    }

    public void c(Sp sp) {
        this.jBL.a(sp);
    }

    public bde_0 dNO() {
        return this.jBL;
    }

    public int[] dNP() {
        return this.jBK;
    }

    public void B(int[] nArray) {
        this.jBK = nArray;
    }

    public int dNQ() {
        if (this.jBK == null) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < this.jBK.length; ++i) {
            int n2 = this.jBK[i];
            if (n2 <= 0) continue;
            ++n;
        }
        return n;
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bCZ(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bxJ bxJ2, ayv_2 ayv_22) {
        bxJ2.a(ayv_22);
    }
}

