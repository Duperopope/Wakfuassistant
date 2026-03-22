/*
 * Decompiled with CFR 0.152.
 */
public final class fsd {
    public static final float tbo = 0.9f;

    public static fsc a(wg_0 wg_02, float f2, float f3) {
        fsa fsa2 = fsa.c(wg_02);
        if (fsa2 == fsa.taT) {
            return fsc.tbe;
        }
        fsb fsb2 = fsb.ZK(Math.round(f2));
        if (fsa2 == fsa.taU) {
            if (fsb2 == fsb.taY) {
                return fsc.tbk;
            }
            return fsc.tbf;
        }
        if (fsb2 == fsb.taY) {
            return f3 > 0.9f ? fsc.tbj : fsc.tbh;
        }
        return f3 > 0.9f ? fsc.tbi : fsc.tbg;
    }

    public static fsc a(wf_0 wf_02) {
        return fsd.a(wf_02.blE(), wf_02.blF(), wf_02.blG());
    }
}

