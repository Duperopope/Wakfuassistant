/*
 * Decompiled with CFR 0.152.
 */
public class ftE {
    public static long a(double d2, exP exP2) {
        float f2;
        evt_1 evt_12 = evt_1.owK;
        if (exP2 instanceof eve_2) {
            evt_12 = ((eve_2)((Object)exP2)).dpL().fdL();
        }
        float f3 = f2 = evt_12 == null ? 1.0f : evt_12.feA();
        if (!exP2.i(ezj_0.pui) && !exP2.i(ezj_0.pui.fmM())) {
            d2 *= (double)f2;
        }
        return Math.round(d2);
    }

    public static long ad(double d2) {
        return Math.round(d2 * (double)evt_1.owL.feA());
    }

    public static long ae(double d2) {
        evt_1 evt_12 = evt_1.Oq(evt_1.owL.fey());
        float f2 = evt_12.feA() - evt_1.owL.feA();
        return Math.round(d2 * (double)f2);
    }
}

