/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aWn
 */
public class awn_0
extends agb_1 {
    private static final Logger huB = Logger.getLogger(awn_0.class);
    private bsj_0 edi;
    private final long huC;
    private final int huD;

    public awn_0(int n, int n2, int n3, bsj_0 bsj_02, long l, int n4) {
        super(n, n2, n3);
        this.edi = bsj_02;
        this.huC = l;
        this.huD = n4;
    }

    @Override
    protected long cbk() {
        ewm_1 ewm_12 = this.edi.dGQ().eLo();
        ewm_12.rq(this.huC);
        bgy bgy2 = (bgy)this.edi.qJ(this.huC);
        if (this.huD == -1) {
            ewm_12.rl(this.huC);
        } else {
            ewm_12.d(this.huC, this.huD, this.edi.aT(bgy2), this.Q(bgy2));
        }
        ewm_12.rr(this.huC);
        cyx_2.eYd().V(this.huD, false);
        if (aue_0.cVJ().cVK().Sn() == this.huC) {
            return 0L;
        }
        return 1500L;
    }

    private boolean Q(bgy bgy2) {
        return !(bgy2.doV() instanceof eyi) || !bgy2.fgk();
    }

    @Override
    protected void caV() {
    }

    public bsj_0 cXk() {
        return this.edi;
    }

    public void a(bsj_0 bsj_02) {
        this.edi = bsj_02;
    }
}

