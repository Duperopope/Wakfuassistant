/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAD
 */
public class bad_1
extends bCA {
    static final Logger jFk = Logger.getLogger(bad_1.class);

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bf(true);
        this.bi(true);
    }

    @Override
    public void c(ng_1 ng_12) {
        jFk.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jFk.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.b(rw_02);
        switch (rw_02) {
            case bkJ: {
                this.ac((short)Math.max(1, (this.bem() + 1) % 3));
                this.aVQ();
                this.c(rw_02);
                return true;
            }
        }
        return false;
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
    public byte bcN() {
        return 0;
    }

    static /* synthetic */ void a(bad_1 bad_12, ayv_2 ayv_22) {
        bad_12.a(ayv_22);
    }
}

