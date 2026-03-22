/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAh
 */
public class bah_2
extends bCA {
    static final Logger jEN = Logger.getLogger(bah_2.class);

    @Override
    public void aVI() {
        super.aVI();
        this.jHu = true;
    }

    @Override
    public void c(ng_1 ng_12) {
        jEN.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jEN.info((Object)("Action performed on interactive element : " + String.valueOf(rw_02)));
        switch (rw_02) {
            case bkV: {
                cvo_1.eTI().a(this);
                this.b(rw_02);
                this.aVQ();
                this.c(rw_02);
                return true;
            }
            case bkW: 
            case bkU: {
                this.b(rw_02);
                this.aVQ();
                this.c(rw_02);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("haven.world.entrance.title", new Object[0]);
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkV;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW, rw_0.bkU};
    }

    @Override
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.njH.eLI()};
    }

    static /* synthetic */ void a(bah_2 bah_22, ayv_2 ayv_22) {
        bah_22.a(ayv_22);
    }
}

