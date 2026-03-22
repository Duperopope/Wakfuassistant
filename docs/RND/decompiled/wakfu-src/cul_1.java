/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUl
 */
public class cul_1
implements adi_1 {
    protected static final Logger nLL = Logger.getLogger(cul_1.class);
    private static final cul_1 nLM = new cul_1();
    private alx_2 ikv;
    private bqh_1 nLN;

    public static cul_1 eRH() {
        return nLM;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cum_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.pd("equipableDummyDialog").getElementMap();
            cAY.eHc().nP(600012L);
            if (this.nLN.dEx().getItem() == null) {
                this.eRI();
            }
            fyw_0.gqw().d("wakfu.equipableDummy", cea_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("equipableDummyDialog");
            fse_1.gFu().vX("equipableDummy");
            cAY.eHc().nP(600013L);
            fyw_0.gqw().tc("wakfu.equipableDummy");
        }
    }

    private void eRI() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("equipableDummyDialog");
        fsi_2.F((fes_2)fhs_22.uH("pennon"));
    }

    private void equipItem(ffV ffV2) {
        Object object;
        fcw_0 fcw_02;
        if (ffV2 == null) {
            fcw_02 = new fcw_0(-1L);
        } else {
            boolean bl;
            object = ffV2.dOg();
            ang_2 ang_22 = ((fhc_0)object).a(ffj_0.sgg);
            if (ffV2.fWm() || ang_22 != null && !ang_22.b(null, null, null, null)) {
                aPd.e("error.cannotEquipNonExchangeableItem", new Object[0]);
                return;
            }
            fgl_0 fgl_02 = ((fhc_0)object).fUZ();
            boolean bl2 = fgl_02 instanceof bfs_1;
            boolean bl3 = ((fhc_0)object).dGh().aIi() == 646;
            boolean bl4 = bl = ((fhc_0)object).dGh().aIi() == 647;
            if (!(bl2 || bl3 || bl)) {
                return;
            }
            fcw_02 = new fcw_0(ffV2.LV());
        }
        object = new clg();
        ((clg)object).ng(this.nLN.dEx().Sn());
        ((clg)object).a(fcw_02);
        aue_0.cVJ().etu().d(object);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18135: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                this.equipItem(dbl_02.getItem());
                return false;
            }
            case 19025: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                ffV ffV2 = this.nLN.dEx().getItem();
                if (ffV2 == null) {
                    return false;
                }
                if (ffV2.avr() == dbl_03.bCo()) {
                    this.equipItem(null);
                }
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

    public void a(bzz bzz2) {
        this.nLN = new bqh_1(bzz2);
        fse_1.gFu().f("equipableDummy", this.nLN);
        aue_0.cVJ().a(this);
        if (fyw_0.gqw().to("equipableDummyDialog") && this.nLN.dEx().getItem() == null) {
            this.eRI();
        }
    }
}

