/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cVJ
 */
public class cvj_2
implements adi_1,
btr_1 {
    protected static final Logger nQq = Logger.getLogger(cvj_2.class);
    private static final cvj_2 nQr = new cvj_2();
    private alx_2 ikv;
    bng_1 nQs;
    private fhs_2 nQt;
    private fis_1 nQu;
    private abz_1 nFM;
    boolean nQv;
    private emh_0 nQw;
    private long exa;

    public static cvj_2 eUG() {
        return nQr;
    }

    private cvj_2() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (czb_2.o(aam_22)) {
            return false;
        }
        switch (aam_22.d()) {
            case 19232: {
                dae_0 dae_02 = (dae_0)aam_22;
                int n = dae_02.bCo();
                if (n == -1) {
                    aue_0.cVJ().b(this);
                    return false;
                }
                if (n == -2) {
                    this.nQs.dyh();
                    cvj_2.eUG().eUI();
                    return false;
                }
                cjs_0 cjs_02 = new cjs_0();
                cjs_02.KU(this.nQs.dye());
                cjs_02.KV(n);
                aue_0.cVJ().etu().d(cjs_02);
                this.nQs.reset();
                bqm_0.jbp.b(new brl_1(this.nQs.dye(), n));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cvk_1(this);
            fyw_0.gqw().a(this.ikv);
            this.nQt = ccj_2.g("interactiveDialogDialog", 256L).getElementMap();
            this.nFM = new cvl_2(this);
            this.nQu = new cvm_2(this);
            fbj_1.getInstance().a(fzq_0.tJS, this.nQu, true);
            aie_0.cfn().bmE().a(this.nFM, true);
            this.eUI();
            fyw_0.gqw().d("wakfu.interactiveDialog", cfd_2.class);
            btu.jlv.a(bsR.jjA, this);
        }
    }

    void eUH() {
        if (!this.nQv) {
            fdy_1 fdy_12 = (fdy_1)this.nQt.uH("textView");
            fdy_12.guV();
            this.kx(true);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            Object object;
            this.nQs = null;
            fbj_1.getInstance().b(fzq_0.tJS, this.nQu, true);
            aie_0.cfn().bmE().a(this.nFM);
            fyw_0.gqw().tl("interactiveDialogDialog");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.interactiveDialog");
            bva_2.lrK.bLG();
            bgy bgy2 = null;
            if (this.nQw == emh_0.qMU) {
                bgy2 = bgg_0.dlO().ju(this.exa);
            } else if (this.nQw == emh_0.qMT && (object = (bJr)bjx_0.klY.Ym((int)this.exa)) != null) {
                bgy2 = ((bJr)object).cXa();
            }
            if (bgy2 != null) {
                object = bgy2.ddI();
                ((ZC)object).setCanPlaySound(true);
            }
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(int n, emh_0 emh_02, long l) {
        bJr bJr2;
        this.exa = l;
        this.nQw = emh_02;
        Object d2 = qd_0.bfh.ox(n);
        String string = this.a(emh_02, l);
        String string2 = this.b(emh_02, l).orElse(string);
        bgy bgy2 = null;
        if (emh_02 == emh_0.qMU) {
            bgy2 = bgg_0.dlO().ju(l);
        } else if (emh_02 == emh_0.qMT && (bJr2 = (bJr)bjx_0.klY.Ym((int)l)) != null) {
            bgy2 = bJr2.cXa();
        }
        if (bgy2 != null) {
            bgy2.ddI().setCanPlaySound(false);
        }
        this.nQs = new bng_1((qb_0)d2, emh_02, l, string, string2);
        fse_1.gFu().f("currentDialog", this.nQs);
        aue_0.cVJ().a(this);
    }

    @NotNull
    private String a(emh_0 emh_02, long l) {
        bhx_0 bhx_02;
        if (emh_02 == emh_0.qMU) {
            bhx_0 bhx_03 = (bhx_0)bgg_0.dlO().ju(l);
            String string = bhx_03.csl();
            return string.isEmpty() ? emh_02.qq(bhx_03.aWP()) : string;
        }
        bJr bJr2 = bjx_0.klY.HC((int)l);
        if (bJr2 != null && (bhx_02 = bJr2.cXa()) != null) {
            return bhx_02.csl();
        }
        return emh_02.qq(this.exa);
    }

    private Optional<String> b(emh_0 emh_02, long l) {
        if (emh_02 != emh_0.qMU) {
            return Optional.empty();
        }
        bgy bgy2 = bgg_0.dlO().ju(l);
        String string = ((bhx_0)bgy2).csl();
        if (string.isEmpty() || "default".equalsIgnoreCase(string)) {
            return Optional.of(emh_02.qq(bgy2.aWP()));
        }
        return Optional.of(string);
    }

    public void Nl(int n) {
        if (this.nQs == null) {
            nQq.error((Object)("On tente de passer \u00e0 un dialogue d'id=" + n + " alors qu'il n'y a pas de dialog en cours !"));
            return;
        }
        if (n == 0) {
            aue_0.cVJ().b(this);
            return;
        }
        this.nQs.b((qb_0)qd_0.bfh.ox(n));
        this.eUI();
    }

    public void eUI() {
        this.nQv = false;
        fdy_1 fdy_12 = (fdy_1)this.nQt.uH("textView");
        fdy_12.a(new cvn_1(this, fdy_12));
        if (this.nQs != null) {
            bva_2.lrK.bLG();
            bva_2.lrK.nG(this.nQs.dyb());
        }
    }

    void kx(boolean bl) {
        for (bnf_1 bnf_12 : this.nQs.dyf()) {
            bnf_12.setVisible(bl);
        }
        this.nQv = true;
    }

    @Override
    public void H(exP exP2) {
        if (exP2 != aue_0.cVJ().cVK()) {
            return;
        }
        aue_0.cVJ().b(this);
    }
}

