/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from cXU
 */
public class cxu_2
extends crw_2 {
    protected static final Logger nXp = Logger.getLogger(cxu_2.class);
    private static final cxu_2 nXq = new cxu_2();
    private ffT nXr;
    private bbc_1 nXs;
    private final TLongShortHashMap nXt = new TLongShortHashMap();
    private fig_2 ikw;
    private alx_2 ikv;

    public static cxu_2 eXE() {
        return nXq;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18146: {
                cnU cnU2 = new cnU(this.nXs.Sn());
                aue_0.cVJ().etu().d(cnU2);
                this.nXr = null;
                this.nXt.clear();
                fse_1.gFu().f("seedSpreaderItem", (Object)null);
                fse_1.gFu().f("seedSpreaderDirty", false);
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
            if (this.nXs == null) {
                return;
            }
            fse_1.gFu().f("seedSpreaderItem", this.nXr);
            fse_1.gFu().f("seedSpreaderDirty", false);
            this.ikw = new cxv_2(this);
            ccg_2.eJI().a(this.ikw);
            this.ikv = new cxw_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.pd("seedSpreaderDialog");
            fyw_0.gqw().d("wakfu.seedSpreader", cgv_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (!bl) {
            cgv_1.setDraggedItem(null);
            this.nXr = null;
            this.nXt.clear();
            aue_0.cVJ().b(this.nXs.dPK());
            fse_1.gFu().vX("seedSpreaderItem");
            fse_1.gFu().vX("seedSpreaderDirty");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("seedSpreaderDialog");
            fyw_0.gqw().tc("wakfu.seedSpreader");
        }
    }

    public void a(bbc_1 bbc_12) {
        this.nXs = bbc_12;
    }

    public ffT eXF() {
        return this.nXr;
    }

    public void l(int n, short s) {
        if (n <= 0) {
            return;
        }
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            nXp.error((Object)("Impossible de retrouver l'item d'id=" + n));
            return;
        }
        if (this.nXr == null) {
            this.nXr = new ffT((fhc_0)r);
        }
        this.nXr.ak(s);
        fse_1.gFu().f("seedSpreaderItem", this.nXr);
    }

    public boolean bW(ffV ffV2) {
        fgl_0 fgl_02 = ffV2.dOg().fUZ();
        if (!(fgl_02 instanceof bfp_1)) {
            return false;
        }
        bfp_1 bfp_12 = (bfp_1)fgl_02;
        int n = bfp_12.dDR();
        bKT bKT2 = (bKT)bKU.eca().YN(n);
        if (bKT2 == null) {
            return false;
        }
        return bKT2 instanceof bKQ;
    }

    private void a(faw_2 faw_22, axb_2 axb_22) {
        fys_0 fys_02 = faw_22.getAppearance();
        awx_2 awx_22 = new awx_2(awx_2.dnF.aTn());
        fys_02.x(fsa_2.class);
        fys_02.setModulationColor(awx_22);
        fsa_2 fsa_22 = new fsa_2(awx_22, axb_22, fys_02, 0, 300, -1, abn.cdr);
        fys_02.a(fsa_22);
    }

    public void eOs() {
        if (!aue_0.cVJ().c(cxu_2.eXE())) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("seedSpreaderDialog");
        faw_2 faw_22 = (faw_2)fhs_22.uH("seedSlot");
        faw_22.getAppearance().x(fsa_2.class);
    }

    public boolean eXG() {
        return !this.nXt.isEmpty();
    }

    public boolean or(long l) {
        return this.nXt.contains(l);
    }
}

