/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAW
 */
public class baw_1
extends bCA {
    static final Logger jFM = Logger.getLogger(baw_1.class);

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        if (rw_02 == rw_0.bll) {
            aue_0.cVJ().a(new baz_1(this));
        }
        this.c(rw_02);
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bll;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bll};
    }

    @Override
    public cpm_1[] dNh() {
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.CV(crc_2.nms.nnW);
        cqw_12.setName("nationSelectionBoard");
        cqw_12.e(rw_0.bll);
        cpm_1[] cpm_1Array = new cpm_1[]{cqw_12};
        return cpm_1Array;
    }

    @Override
    public String getName() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(aum_0.cWf().c("nationSelectionBoard", new Object[0]));
        return ahv_22.ceL();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    static /* synthetic */ void a(baw_1 baw_12, ayv_2 ayv_22) {
        baw_12.a(ayv_22);
    }
}

