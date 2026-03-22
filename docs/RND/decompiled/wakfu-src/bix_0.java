/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bix
 */
public final class bix_0 {
    public static final int ikP = 20;

    public static void q(bhJ bhJ2) {
        String string = "timelineCellDialog" + bhJ2.Sn();
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        if (!(fhv_12 instanceof feq_1)) {
            return;
        }
        feq_1 feq_12 = (feq_1)fhv_12;
        if (bhJ2.a(exe_1.rFd)) {
            feq_12.setOffset(GC.cw(feq_12.getXOffset()), GC.cw(feq_12.getYOffset() + 20));
        } else {
            feq_12.setOffset(GC.cw(feq_12.getXOffset()), GC.cw(feq_12.getYOffset() - 20));
        }
    }
}

