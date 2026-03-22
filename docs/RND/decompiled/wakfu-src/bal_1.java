/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAl
 */
public class bal_1
extends bCA {
    static final Logger jEQ = Logger.getLogger(bal_1.class);

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bf(false);
        this.bi(false);
    }

    @Override
    public void b(acd_1 acd_12) {
        super.b(acd_12);
        this.beu().add(acd_12);
    }

    @Override
    public boolean h(acd_1 acd_12) {
        return acd_12.ac(this.aZw());
    }

    @Override
    public void c(ng_1 ng_12) {
        jEQ.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jEQ.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        switch (rw_02) {
            case bkO: {
                if (this.bmf != 1) break;
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

    static /* synthetic */ void a(bal_1 bal_12, ayv_2 ayv_22) {
        bal_12.a(ayv_22);
    }
}

