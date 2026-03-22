/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Wk
 */
public class wk_0 {
    protected static final Logger bMV = Logger.getLogger(wk_0.class);
    private static final float bMW = 0.25f;
    private static final float bMX = 0.583f;
    private final HashMap<ub_0, wc_0> bMY = new HashMap();
    private final ArrayList<wl_0> bMZ = new ArrayList();
    private final wh_0 bNa;

    public wk_0(wc_0 wc_02, wc_0 wc_03, wc_0 wc_04, wc_0 wc_05) {
        this.bMY.put(ub_0.bwc, wc_02);
        this.bMY.put(ub_0.bwd, wc_03);
        this.bMY.put(ub_0.bwe, wc_04);
        this.bMY.put(ub_0.bwb, wc_05);
        this.bNa = new wh_0(this);
    }

    public void a(wl_0 wl_02) {
        if (!this.bMZ.contains(wl_02)) {
            this.bMZ.add(wl_02);
        }
    }

    public wc_0 c(ub_0 ub_02) {
        return this.bMY.get((Object)ub_02);
    }

    public wh_0 blP() {
        return this.bNa;
    }

    @Nullable
    public wf_0 s(ux_0 ux_02) {
        ub_0 ub_02 = ub_0.n(ux_02);
        wc_0 wc_02 = this.bMY.get((Object)ub_02);
        if (wc_02 == null) {
            return null;
        }
        int n = ub_0.p(ux_02);
        return wc_02.qj(n);
    }

    public void a(ux_0 ux_02, float f2) {
        float f3;
        float f4;
        float f5;
        ub_0 ub_02 = ub_0.n(ux_02);
        wc_0 wc_02 = this.bMY.get((Object)ub_02);
        if (wc_02 == null) {
            return;
        }
        int n = ub_0.p(ux_02);
        wf_0 wf_02 = wc_02.qj(n);
        if (f2 <= 0.25f) {
            var10_7 = ux_02.bjN();
            var11_9 = ub_0.n(var10_7);
            var12_12 = this.bMY.get((Object)var11_9);
            if (var12_12 != null) {
                var13_14 = var12_12.bli();
                f5 = (var13_14.blm() + wf_02.bll()) * 0.5f;
            } else {
                f5 = (float)((double)wf_02.bll() + Math.random() * (double)(wf_02.blm() - wf_02.bll()));
            }
            f4 = wf_02.bll();
            f3 = f2 / 0.25f;
        } else if (f2 <= 0.583f) {
            f5 = wf_02.bll();
            f4 = wf_02.blm();
            f3 = (f2 - 0.25f) / 0.333f;
        } else {
            var10_7 = ux_02.bjO();
            var11_9 = ub_0.n(var10_7);
            var12_12 = this.bMY.get((Object)var11_9);
            if (var12_12 != null) {
                var13_14 = var12_12.blj();
                f4 = (var13_14.bll() + wf_02.blm()) * 0.5f;
            } else {
                f4 = (float)((double)wf_02.bll() + Math.random() * (double)(wf_02.blm() - wf_02.bll()));
            }
            f5 = wf_02.blm();
            f3 = (f2 - 0.583f) / 0.417f;
        }
        float f6 = GC.a(f5, f4, f3);
        wf_02.bC(f6);
        wf_02.bD(f2);
        this.bNa.a(ub_02);
        this.bNa.r(ux_02);
        try {
            this.bNa.blL();
        }
        catch (Exception exception) {
            bMV.error((Object)"Error during history update", (Throwable)exception);
        }
        int n2 = this.bMZ.size();
        for (int i = 0; i < n2; ++i) {
            this.bMZ.get(i).blQ();
        }
    }
}

