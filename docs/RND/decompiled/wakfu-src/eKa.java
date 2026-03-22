/*
 * Decompiled with CFR 0.152.
 */
public final class eKa {
    public static uz_0 qBc = new uz_0(ua_0.bvV);
    public static final short[] qBd = new short[]{2828, 2830, 2831, 2829, 3577, 3065, 3075, 3071, 2832, 2833};

    public static short dI(short s) {
        int n = 0;
        for (int i = 0; i < qBd.length; ++i) {
            short s2 = qBd[i];
            if (s2 != s) continue;
            n = i == qBd.length - 1 ? 0 : i + 1;
            break;
        }
        return qBd[n];
    }
}

