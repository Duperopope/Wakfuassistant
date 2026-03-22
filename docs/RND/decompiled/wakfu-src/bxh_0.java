/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bxh
 */
public class bxh_0
extends bCA {
    static final Logger jAU = Logger.getLogger(bxh_0.class);
    private static final cpm_1[] jAV = new cpm_1[]{new cqx_2()};
    private fdg jAW;

    bxh_0() {
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public cpm_1[] dNh() {
        if (this.jAW == null) {
            jAU.error((Object)("No m_info for ArtisansBook with id=" + this.aXv));
            return jAV;
        }
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jAW.clf());
        if (fqy_02 == null) {
            jAU.error((Object)("No visual id=" + this.jAW.clf()));
            return jAV;
        }
        cpu_1 cpu_12 = (cpu_1)cps_1.niL.eLI();
        cpu_12.b(fqy_02);
        return new cpm_1[]{cpu_12};
    }

    @Override
    public short chU() {
        return this.bcN();
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("craft.artisansBook.name", new Object[0]);
    }

    @Override
    public void dNq() {
        fdg fdg2 = (fdg)fda_0.rWI.a(fdv_0.rZu, Integer.parseInt(this.baB));
        if (fdg2 == null) {
            jAU.error((Object)("[LD] The artisans' book " + this.aXv + " has its parameter [" + Integer.valueOf(this.baB) + "] that has no match in Admins"));
            return;
        }
        this.jAW = fdg2;
        this.ht(true);
    }

    @Override
    public void aVS() {
        super.aVS();
        if (aue_0.cVJ().c(csk_1.nFj)) {
            csk_1.nFj.a(this);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    public int dNr() {
        return this.jAW.dTA();
    }

    static /* synthetic */ void a(bxh_0 bxh_02, ayv_2 ayv_22) {
        bxh_02.a(ayv_22);
    }
}

