/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from bAH
 */
public class bah_1
extends bCA
implements bba_2,
eIy {
    protected static final Logger jFn = Logger.getLogger(bah_1.class);
    protected fdx_0 jFo;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jFn.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.c(rw_02);
        this.b(rw_02);
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.blf;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.blf};
    }

    @Override
    public cpm_1[] dNh() {
        if (this.jFo == null) {
            return cpm_1.nip;
        }
        if (this.bmf == 1) {
            fqy_0 fqy_02 = fqz_0.giz().YY(this.jFo.clf());
            cql_2 cql_22 = (cql_2)cps_1.njr.eLI();
            cql_22.CV(fqy_02.giv());
            cql_22.qb("desc.mru." + fqy_02.giw());
            this.a(cql_22);
            cql_22.pY(this.dPq());
            cql_22.jU(this.dPp());
            cpm_1[] cpm_1Array = new cpm_1[]{cql_22};
            return cpm_1Array;
        }
        return cpm_1.nip;
    }

    public static boolean b(int n, int n2, int n3, boolean bl) {
        fec_0 fec_02;
        ffm ffm2;
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!(bgv_22 == null || !bl && fea_0.ah(bgt_02.aZj(), n) >= n2 || bgt_02.dno().UN(n) >= n2 || (ffm2 = (fec_02 = (fec_0)bgt_02.a(fez_0.sep)).UB(n)) != null && ffm2.bfd() >= n2)) {
            return false;
        }
        return bgt_02.dmi() >= (long)n3;
    }

    public static String c(int n, int n2, int n3, boolean bl) {
        ahv_2 ahv_22 = new ahv_2();
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgv_22 != null) {
            boolean bl2 = (n2 != 1 || bgt_02.dnP().UH(n) == null) && !bah_1.m(n, n2, bl);
            fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
            ffm ffm2 = fec_02.UB(n);
            ahv_22.ceC().ih(((bl2 &= ffm2 == null || ffm2.bfd() < n2) ? awx_2.dnJ : awx_2.dnL).bQk());
            ahv_22.c("[").c(bgv_22.getName()).c("]").c(" x").yx(n2);
            ahv_22.ceD();
        }
        if (n3 > 0) {
            if (bgv_22 != null) {
                ahv_22.ceH();
            }
            ahv_22.ceC().ih((bah_1.kX(n3) ? awx_2.dnL : awx_2.dnJ).bQk());
            ahv_22.c(aum_0.cWf().c("kama.shortGain", n3)).ceD();
        }
        return ahv_22.ceL();
    }

    public static void a(bCA bCA2, cql_2 cql_22, ang_2 ang_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (ang_22 != null && !ang_22.b(bgt_02, bCA2, null, bgt_02.bdV())) {
            cql_22.setEnabled(false);
            cql_22.qc(eLP.b(ang_22));
        }
    }

    static boolean kX(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fgj_0 fgj_02 = bgt_02.cWp();
        if (fgj_02 == null) {
            return false;
        }
        return fgj_02.exS() >= l;
    }

    static boolean m(int n, int n2, boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bl && fea_0.ah(bgt_02.aZj(), n) >= n2) {
            return true;
        }
        int n3 = n2;
        TLongIterator tLongIterator = fcL.rUh.sx(bgt_02.aZj()).iterator();
        while (tLongIterator.hasNext()) {
            bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(tLongIterator.next());
            if (n == 0) continue;
            int n4 = bgt_03.dno().UN(n);
            fec_0 fec_02 = (fec_0)bgt_03.a(fez_0.sep);
            ffm ffm2 = fec_02.UB(n);
            if (ffm2 == null) {
                n3 -= n4;
                continue;
            }
            short s = ffm2.bfd();
            if (s >= n2) continue;
            return false;
        }
        return n3 <= 0;
    }

    private boolean dPp() {
        if (this.jFo == null) {
            return false;
        }
        return bah_1.b(this.jFo.cqr(), this.jFo.cqs(), this.jFo.cqq(), this.jFo.cmN());
    }

    private String dPq() {
        if (this.jFo == null) {
            return null;
        }
        return bah_1.c(this.jFo.cqr(), this.jFo.cqs(), this.jFo.cqq(), this.jFo.cmN());
    }

    private void a(cql_2 cql_22) {
        if (this.jFo == null) {
            return;
        }
        bah_1.a(this, cql_22, this.jFo.bdo());
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        if (this.Sn() == 14641L && fec_02.UB(12787) != null) {
            cql_22.setEnabled(false);
            cql_22.qc(aum_0.cWf().c("lootChest.cantDrop", new Object[0]));
        }
    }

    @Override
    public fqy_0 drR() {
        return fqz_0.giz().YY(this.jFo.clf());
    }

    @Override
    public short dOY() {
        return 3;
    }

    @Override
    public short chU() {
        return (short)((float)this.bcN() * 10.0f);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bU((short)Short.MIN_VALUE);
        this.bf(true);
        this.bi(true);
        this.hu(true);
        this.hw(true);
        this.ht(true);
        assert (this.jFo == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jFo = null;
    }

    @Override
    public String getName() {
        if (this.jFo == null) {
            return null;
        }
        Object object = aum_0.cWf().a(85, (long)this.jFo.d(), new Object[0]);
        if (this.jFo.cqq() > 0) {
            object = (String)object + " (" + this.jFo.cqq() + "\u00a7)";
        }
        if (this.jFo.fTC()) {
            object = (String)object + " (" + this.jFo.cqs() + " x " + aum_0.cWf().a(15, (long)this.jFo.cqr(), new Object[0]) + ")";
        }
        return object;
    }

    @Override
    public void dNq() {
        super.dNq();
        this.jFo = (fdx_0)fda_0.rWI.a(fdv_0.rZa, Integer.parseInt(this.baB));
        if (this.jFo == null) {
            jFn.error((Object)("pas de param(paramId=" + this.baB + ") trouv\u00e9 pour le lootChest " + this.Sn()), (Throwable)new Exception());
        }
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public void dOC() {
        super.dOC();
        this.bmf = 0;
        this.aVQ();
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    @Override
    public eIw dNx() {
        return this.jFo;
    }

    @Override
    public String toString() {
        return "LootChest{m_param=" + String.valueOf(this.jFo) + "}";
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDj(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bah_1 bah_12, ayv_2 ayv_22) {
        bah_12.a(ayv_22);
    }
}

