/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdP
 */
public class bdp_1
extends beg_2<bdr_1> {
    static final Logger hMs = Logger.getLogger(bdp_1.class);
    String hMl;

    @Override
    protected void a(bdj_2 bdj_22, bdr_1 bdr_12) {
        if (this.dem()) {
            assert (this.hMl == null);
            this.hMl = bdj_22.bpU();
        }
    }

    @Override
    public void a(bdr_1 bdr_12, bdr_1 bdr_13, bdj_2 bdj_22) {
        if (bdj_22.bqd() == null) {
            hMs.error((Object)"Impossible de desappliquer le changement d'anim statique ");
            return;
        }
        bdj_22.d(new bdq_1(this, bdj_22, bdr_12));
    }

    @Override
    public void e(bdj_2 bdj_22) {
        bdr_1 bdr_12 = (bdr_1)this.den();
        super.e(bdj_22);
        this.a(bdr_12, bdr_12, bdj_22);
    }
}

