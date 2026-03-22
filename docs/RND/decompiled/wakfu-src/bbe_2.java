/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBe
 */
public class bbe_2
extends bCA {
    static final Logger jFU = Logger.getLogger(bbe_2.class);

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bf(false);
        this.bi(false);
    }

    @Override
    public void c(ng_1 ng_12) {
        jFU.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkO: {
                if (this.bmf == 2) {
                    jFU.info((Object)("Action [" + String.valueOf(rw_02) + "] ignored on interactive element : " + this.Sn()));
                    return true;
                }
                jFU.info((Object)("Action [" + String.valueOf(rw_02) + "] performed on interactive element : " + this.Sn()));
                this.b(rw_02);
                this.aVQ();
                this.c(rw_02);
                return true;
            }
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkO;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkO};
    }

    @Override
    public byte bcN() {
        return 0;
    }

    static /* synthetic */ void a(bbe_2 bbe_22, ayv_2 ayv_22) {
        bbe_22.a(ayv_22);
    }
}

