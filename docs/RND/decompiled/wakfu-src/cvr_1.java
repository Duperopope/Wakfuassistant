/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from cVr
 */
public class cvr_1
extends crw_2 {
    protected static final Logger nPf = Logger.getLogger(cvr_1.class);
    private static final cvr_1 nPg = new cvr_1();
    private bQX nPh;
    private bap_1 nPi;
    private int nPj;
    private fig_2 ikw;
    private alx_2 ikv;

    public static cvr_1 eTM() {
        return nPg;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16817: {
                fim_2 fim_22 = string -> {
                    cla cla2 = new cla(this.nPi.Sn());
                    TLongObjectIterator tLongObjectIterator = this.nPh.ekq().iterator();
                    while (tLongObjectIterator.hasNext()) {
                        tLongObjectIterator.advance();
                        ffT ffT2 = (ffT)tLongObjectIterator.value();
                        cla2.l(ffT2.LV(), ffT2.bfd());
                    }
                    aue_0.cVJ().etu().d(cla2);
                    this.nPh.dXp();
                };
                fiq_2.gCw().d(fik_2.a(fim_22).l("question.havenWorldResourcesCollectorConfirm", this.nPh.ekr()).vG(ccp_2.mRM.byf()));
                return false;
            }
            case 16381: {
                this.nPh.removeItem(((dbI)aam_22).faT());
                return false;
            }
            case 16215: {
                if (this.nPh.aVo() >= this.nPj) {
                    aPd.e("maxItemsCountReached", new Object[0]);
                    return false;
                }
                dbl_0 dbl_02 = (dbl_0)aam_22;
                long l = dbl_02.bCp();
                short s = dbl_02.bfd();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                bdl_0 bdl_02 = bgt_02.dno();
                ffV ffV2 = dbl_02.getItem() == null ? bdl_02.tb(l) : dbl_02.getItem();
                fhc_0 fhc_02 = ffV2.dOg();
                if (fhc_02.a(ffj_0.sgf) != null && !fhc_02.a(ffj_0.sgf).b(bgt_02, -1, fhc_02, bgt_02.fgg())) {
                    nPf.warn((Object)"Impossible d'ajouter l'item");
                    aPd.e("storageBox.addItem.unauthorized", new Object[0]);
                    return false;
                }
                this.nPh.c(ffV2, s);
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (!bl) {
            if (this.nPi == null || this.nPh == null) {
                return;
            }
            fse_1.gFu().f("havenWorldResourcesCollector", this.nPh);
            this.ikw = new cvs_1(this);
            ccg_2.eJI().a(this.ikw);
            this.ikv = new cvt_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.pd("havenWorldResourcesCollectorDialog");
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("havenWorldResourcesCollectorDialog");
            fbz_2 fbz_22 = (fbz_2)fhs_22.uH("itemList");
            this.nPj = fbz_22.getIdealSizeMaxColumns() * fbz_22.getIdealSizeMaxRows();
            fyw_0.gqw().d("wakfu.havenWorldResourcesCollector", cez_1.class);
            if (!this.nEc) {
                aue_0.cVJ().cVK().dno().dRv();
            }
            aue_0.cVJ().b(czi_2.eYU());
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (!bl) {
            aue_0.cVJ().a(czi_2.eYU());
            aue_0.cVJ().b(this.nPi.dPj());
            fse_1.gFu().vX("havenWorldResourcesCollector");
            fyw_0.gqw().b(this.ikv);
            ccg_2.eJI().b(this.ikw);
            fyw_0.gqw().tl("havenWorldResourcesCollectorDialog");
            fyw_0.gqw().tc("wakfu.havenWorldResourcesCollector");
        }
    }

    public void a(bap_1 bap_12) {
        this.nPi = bap_12;
    }

    public bQX eTN() {
        return this.nPh;
    }

    public void a(bQX bQX2) {
        this.nPh = bQX2;
    }

    public boolean or(long l) {
        return this.nPh.jW(l);
    }

    public void eRC() {
        fse_1.gFu().f("havenWorldResourcesCollector", this.nPh);
    }
}

