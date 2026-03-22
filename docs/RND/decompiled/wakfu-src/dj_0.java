/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from DJ
 */
public final class dj_0 {
    private dj_0() {
    }

    public static void a(fe_1 fe_12, do_0 do_02) {
        int n;
        short s = do_02.aIz();
        fe_12.j(s);
        fe_12.f(do_02.aIy());
        if (!fe_12.mK(64)) {
            fe_12.mp(0);
            fe_12.mq(0);
        } else {
            fe_12.setName(do_02.aIC());
            fe_12.mp(fe_12.getName().hashCode());
            n = fe_12.getName().indexOf(95) + 1;
            fe_12.mq(fe_12.getName().substring(n).hashCode());
        }
        do_02.aIA();
        do_02.aIA();
        n = do_02.aIz() & 0xFFFF;
        fe_12.e(do_02.mx(n));
        n = do_02.aIz() & 0xFFFF;
        fe_12.e(do_02.mw(n));
        n = do_02.aIz() & 0xFFFF;
        fe_12.f(n == 0 ? null : do_02.mw(n));
        fe_12.a(di_0.d(do_02));
        short[] sArray = fe_12.aKy();
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] > fe_12.aIn()) {
                fe_12.ms(sArray[i]);
            }
            i += sArray[i];
        }
    }
}

