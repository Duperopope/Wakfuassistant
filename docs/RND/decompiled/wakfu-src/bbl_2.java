/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bBL
 */
public class bbl_2
extends bCA {
    private fdK jGy;
    public static final short jGz = 0;
    public static final short jGA = 1;

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkV: {
                bkg_1 bkg_12 = new bkg_1(this);
                bkg_12.bIH();
                this.c(rw_02);
                return true;
            }
            case bkW: {
                this.c(rw_02);
                aue_0.cVJ().cVK().dnY();
                return true;
            }
        }
        return false;
    }

    @Override
    public cpm_1[] dNh() {
        cpm_1[] cpm_1Array = new cpm_1[1];
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jGy.clf());
        cqw_12.CV(fqy_02.giv());
        cqw_12.setName("desc.mru." + fqy_02.giw());
        cqw_12.e(rw_0.bkV);
        ang_2 ang_22 = this.jGy.daw();
        cqw_12.setEnabled(this.e(ang_22));
        cpm_1Array[0] = cqw_12;
        return cpm_1Array;
    }

    private boolean e(ang_2 ang_22) {
        if (ang_22 == null) {
            return true;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        return ang_22.b(bgt_02, null, null, bgt_02.bdV());
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW};
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkV;
    }

    @Override
    protected void dbu() {
        super.dbu();
        String string = aum_0.cWf().a(157, (long)this.jGy.d(), new Object[0]);
        short s = this.bem();
        short s2 = this.dQs();
        if (s == 0 && s2 == 1) {
            String string2 = aum_0.cWf().c("stele.state.disabled", new Object[0]);
            aPd.f(String.format(string2, string), new Object[0]);
            return;
        }
        if (s == 1 && s2 == 0) {
            aPd.f("stele.state.activated", string);
            return;
        }
    }

    @Override
    public void dNq() {
        this.jGy = (fdK)fda_0.rWI.a(fdv_0.rZv, Integer.parseInt(this.baB));
        this.ht(true);
    }

    public List<fdM> dPN() {
        return this.jGy.dPN();
    }

    public fdn_0 dPO() {
        return this.jGy.fTY();
    }

    public fdn_0 dPP() {
        return this.jGy.fTZ();
    }

    public int ayQ() {
        return this.jGy.d();
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(157, (long)this.jGy.d(), new Object[0]);
    }

    @Override
    public void aZp() {
        this.aVH();
    }

    public fdK dPQ() {
        return this.jGy;
    }
}

