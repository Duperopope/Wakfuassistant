/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from byR
 */
public class byr_1
extends bCA {
    static final Logger jDd = Logger.getLogger(byr_1.class);

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bf(false);
        this.bi(false);
    }

    @Override
    public void c(ng_1 ng_12) {
        jDd.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jDd.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        switch (rw_02) {
            case bkO: {
                if (this.bmf != 1) break;
                this.b(rw_02);
                this.aVQ();
                aie_0.cfn();
                bgt_0 bgt_02 = aie_0.cfo().cVK();
                bgt_02.dnw().dza();
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

    static /* synthetic */ void a(byr_1 byr_12, ayv_2 ayv_22) {
        byr_12.a(ayv_22);
    }
}

