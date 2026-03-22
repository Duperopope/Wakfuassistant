/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cVv
 */
public class cvv_2
implements adi_1 {
    private static final Logger nPE = Logger.getLogger(cvv_2.class);
    public static final cvv_2 nPF = new cvv_2();
    boolean nPG;
    boolean nPH;
    private boolean nPI = true;
    Runnable nPJ;

    public void eUy() {
        aue_0 aue_02 = aue_0.cVJ();
        fyw_0.gqw().gqL();
        bzj_2.eqi().b(aue_02.cVK());
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18075: {
                if (this.nPG) {
                    nPE.warn((Object)"On tente de changer de h\u00e9ros alors qu'un changement est en cours");
                    return false;
                }
                this.nPG = true;
                dae_0 dae_02 = (dae_0)aam_22;
                long l = dae_02.bCp();
                bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
                bly_0.ivl.ka(l);
                aue_0 aue_02 = aue_0.cVJ();
                cdv_0 cdv_02 = cdv_0.euj();
                bgt_0 bgt_03 = aue_02.cVK();
                fst_1.gGA().cVc();
                bgt_02.fZ(false);
                fbj_1.getInstance().setVisible(false);
                byte by = cyt_1.eXX().eXY().ebE();
                long l2 = System.currentTimeMillis();
                cvg_2.eTB().eTE();
                cvw_2 cvw_22 = new cvw_2(this, cdv_02, bgt_02, aue_02, bgt_03, l2, by);
                asj_2.bJt().a(cvw_22);
                aIq.cgr().cgs();
                bgt_03.djv();
                bgt_03.fZ(true);
                bgt_03.ddI().ddm().ddP();
                return false;
            }
        }
        return true;
    }

    public void kv(boolean bl) {
        this.nPH = bl;
    }

    void am(bgt_0 bgt_02) {
        cnt_0 cnt_02 = new cnt_0(bgt_02.Sn());
        aue_0.cVJ().etu().d(cnt_02);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        this.nPJ = null;
        if (!bl) {
            this.nPG = false;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public boolean eUz() {
        return this.nPG;
    }

    public boolean eUA() {
        return this.nPI;
    }

    public void kw(boolean bl) {
        this.nPI = bl;
    }

    public void D(Runnable runnable) {
        this.nPJ = runnable;
    }
}

