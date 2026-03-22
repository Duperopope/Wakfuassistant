/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fsL
 */
public final class fsl_0 {
    private static final Logger tej = Logger.getLogger(fsl_0.class);

    private fsl_0() {
    }

    @Nullable
    public static ux_0 a(long l, fbu_0 fbu_02, long l2) {
        fby fby2;
        if (fbu_02.fSm()) {
            return null;
        }
        uz_0 uz_02 = new uz_0(fbu_02.fSl());
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            tej.error((Object)"Exception raised", (Throwable)fbt2);
            return uw_0.fn(l2).a(uz_02);
        }
        int n = fby2.fRQ();
        float f2 = (float)(100 + n) / 100.0f;
        uz_02.bs(f2);
        return uw_0.fn(l2).a(uz_02);
    }

    public static boolean a(long l, fas_0 fas_02) {
        fbu_0 fbu_02 = fbw_0.rSQ.eF(fas_02.erN().aIi());
        if (fbu_02 == null) {
            return false;
        }
        ux_0 ux_02 = fsl_0.a(l, fbu_02, fas_02.fRi());
        return ux_02 == null || !ux_02.i(ue_0.bjV().bjc());
    }

    public static long a(fbk_0 fbk_02, long l) {
        fby fby2;
        int n = fbk_02.fSb();
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            tej.error((Object)"Exception raised", (Throwable)fbt2);
            return n;
        }
        if (fby2 == null) {
            return n;
        }
        return (long)((double)n * (100.0 + (double)fby2.fRS()) / 100.0);
    }

    public static int b(fbk_0 fbk_02, long l) {
        fby fby2;
        int n = fbk_02.fSe();
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            tej.error((Object)"Exception raised", (Throwable)fbt2);
            return n;
        }
        if (fby2 == null) {
            return n;
        }
        return GC.cw((long)((double)n * (100.0 + (double)fby2.fRT()) / 100.0));
    }

    public static long a(fam_0 fam_02, fsm_0 fsm_02) {
        return Math.max(0L, fsl_0.a(fam_02.erN(), fsm_02.Ya()) - fsm_02.glr());
    }

    public static int b(fam_0 fam_02, fsm_0 fsm_02) {
        return Math.max(0, fsl_0.b(fam_02.erN(), fsm_02.Ya()) - fsm_02.eAn());
    }

    public static int c(fam_0 fam_02, fsm_0 fsm_02) {
        return Math.max(0, fam_02.erN().fSc() - fsm_02.glu());
    }

    public static boolean a(fam_0 fam_02, fsm_0 fsm_02, boolean bl) {
        int n;
        fbk_0 fbk_02 = fam_02.erN();
        fby_0 fby_02 = fam_02.fRh();
        if (fby_02.fSt() <= 0) {
            return true;
        }
        fcf_0 fcf_02 = new fcf_0(fbk_02.aIi());
        fsm_02.O(fcf_02);
        int n2 = fcf_02.eEl();
        if (bl) {
            --n2;
        }
        return (n = fby_02.fSt() - n2) > 0;
    }

    public static fcp_0 d(fam_0 fam_02, fsm_0 fsm_02) {
        fcp_0 fcp_02 = new fcp_0(fsm_02, fam_02.erN().aIi());
        return fcp_02;
    }
}

