/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBi
 */
public class bbi_2
extends bCA {
    static final Logger jFX = Logger.getLogger(bbi_2.class);

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.njM.eLI(), new crm_1("desc.mru.read", () -> {
            cso_2.eOa().Mr(393);
            aue_0.cVJ().a(cso_2.eOa());
        })};
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        bkz_0 bkz_02 = new bkz_0();
        if (!bkz_02.dsn()) {
            jFX.error((Object)"[PvpChangeState] Impossible to start PvpChangeState");
            return false;
        }
        bkz_02.bIH();
        this.c(rw_02);
        return true;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    static /* synthetic */ void a(bbi_2 bbi_22, ayv_2 ayv_22) {
        bbi_22.a(ayv_22);
    }
}

