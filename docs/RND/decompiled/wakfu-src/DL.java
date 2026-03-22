/*
 * Decompiled with CFR 0.152.
 */
public class DL {
    public static void a(ff_0 ff_02, do_0 do_02) {
        int n;
        short s = do_02.aIz();
        ff_02.j(s);
        ff_02.f(do_02.aIy());
        if (!ff_02.mK(64)) {
            ff_02.mp(0);
            ff_02.mq(0);
        } else {
            ff_02.setName(do_02.aIC());
            ff_02.mp(ff_02.getName().hashCode());
            n = ff_02.getName().indexOf(95) + 1;
            ff_02.mq(ff_02.getName().substring(n).hashCode());
        }
        do_02.aIA();
        do_02.aIA();
        ff_02.u(do_02.aIz());
        n = do_02.aIz() & 0xFFFF;
        ff_02.f(do_02.mw(n));
        ff_02.a(di_0.d(do_02));
        ff_02.ms(1);
    }
}

