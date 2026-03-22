/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdT
 */
public class bdt_1
extends beg_2<bdv_1> {
    static final Logger hMA = Logger.getLogger(bdt_1.class);
    String hMl;

    @Override
    protected void a(bdj_2 bdj_22, bdv_1 bdv_12) {
        if (this.dem()) {
            assert (this.hMl == null);
            this.hMl = bdj_22.bpT();
        }
    }

    @Override
    public void a(bdv_1 bdv_12, bdv_1 bdv_13, bdj_2 bdj_22) {
        if (bdj_22.bqd() == null) {
            hMA.error((Object)"Impossible de desappliquer le changement d'anim statique ");
            return;
        }
        bdj_22.d(new bdu_1(this, bdj_22, bdv_12));
    }
}

