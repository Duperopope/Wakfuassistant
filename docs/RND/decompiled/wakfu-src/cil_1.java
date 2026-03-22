/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIl
 */
public class cil_1
extends cir_1 {
    private static final Logger ndv = Logger.getLogger(cil_1.class);
    private final fby_0 ndw;
    private static long ndx = -1L;

    public cil_1(fby_0 fby_02) {
        super(new cis_1(true, true));
        this.ndw = fby_02;
    }

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdW;
    }

    @Override
    protected void ey(int n, int n2) {
        fbk_0 fbk_02 = fbo_0.e(this.ndw);
        acc_1 acc_12 = this.nae.getCellCoordFromMouse(n, n2);
        acc_1 acc_13 = this.nae.getHavenWorldImages().JX(fbk_02.conn());
        int n3 = acc_12.bWx() + acc_13.bWx();
        int n4 = acc_12.bWy() + acc_13.bWy();
        fsn_0 fsn_02 = new fsn_0(this.nae.getWorkingHavenWorld(), cah_1.lFD);
        caj_2 caj_22 = new caj_2(ndx, fbk_02.aIi(), 0, (short)n3, (short)n4);
        fsn_02.b(caj_22);
        fsb_0 fsb_02 = this.nae.h(caj_22);
        this.kWd = new cit_1(fsb_02);
        this.kWd.T(fsn_02.glx());
    }

    @Override
    protected void eLd() {
        --ndx;
    }
}

