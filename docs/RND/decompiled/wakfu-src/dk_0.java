/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from DK
 */
public final class dk_0 {
    private static final short[] aya = new short[0];

    private dk_0() {
    }

    public static void a(fg_0 fg_02, do_0 do_02) {
        int n;
        short s = do_02.aIz();
        fg_02.j(s);
        fg_02.f(do_02.aIy());
        if (!fg_02.mK(64)) {
            fg_02.mp(0);
            fg_02.mq(0);
        } else {
            fg_02.setName(do_02.aIC());
            fg_02.mp(fg_02.getName().hashCode());
            n = fg_02.getName().indexOf(95) + 1;
            fg_02.mq(fg_02.getName().substring(n).hashCode());
        }
        do_02.aIA();
        do_02.aIA();
        n = do_02.aIz() & 0xFFFF;
        fg_02.g(n == 0 ? aya : do_02.mw(n));
        int n2 = do_02.aIz() & 0xFFFF;
        fg_02.f(n2 == 0 ? null : do_02.mw(n2));
        fg_02.a(di_0.d(do_02));
        if (n == 0 && n2 != 0) {
            fg_02.at(true);
        }
        fg_02.ms(n);
    }
}

