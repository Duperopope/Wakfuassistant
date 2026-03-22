/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bka
 */
public abstract class bka_1
extends bkb_0 {
    protected static final Logger iqa = Logger.getLogger(bka_1.class);
    final bmv_2 iqb;
    long iqc;

    bka_1(bmv_2 bmv_22) {
        this.iqb = bmv_22;
    }

    @Override
    public void bIH() {
        bkc_2.dsD().dsI();
        this.iqd.ddI().t(this.iqb.clf(), true);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        this.iqd.dcM().ebM();
        if (!bl) {
            this.iqd.ddI().t(this.iqb.clf(), false);
        }
        this.iqd.dnz();
        if (bl2) {
            cmo_0 cmo_02 = new cmo_0();
            cmo_02.dw((byte)3);
            cmo_02.cD(this.dsm());
            aue_0.cVJ().etu().d(cmo_02);
        }
        return true;
    }

    @Override
    public boolean dsd() {
        bkc_2.dsD().dsK();
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw((byte)2);
        cmo_02.cD(this.dsm());
        aue_0.cVJ().etu().d(cmo_02);
        bdj_2 bdj_22 = this.iqd.ddI();
        bdj_22.t(this.iqb.clf(), false);
        this.iqd.dcM().ebM();
        this.iqd.dnz();
        this.dse();
        return true;
    }

    void dse() {
        if (this.iqb.csA() > 0) {
            this.iqd.dpK().Y(this.iqb.cms(), this.dsf());
        }
    }

    private boolean dsf() {
        Object r = fgD.fXh().Vd(this.iqb.csA());
        if (r == null) {
            iqa.error((Object)("There is no ReferenceItem with the id=" + this.iqb.csA() + " for the CollectAction with the id=" + this.iqb.d()));
            return false;
        }
        return ((fhc_0)r).fUZ() instanceof bfp_1;
    }

    public void jV(long l) {
        this.iqc = l;
    }
}

