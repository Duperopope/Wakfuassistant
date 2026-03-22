/*
 * Decompiled with CFR 0.152.
 */
public final class DM {
    private DM() {
    }

    public static void a(fh_0 fh_02, do_0 do_02) {
        short s = do_02.aIz();
        fh_02.j(s);
        fh_02.f(do_02.aIy());
        if (!fh_02.mK(64)) {
            fh_02.mp(0);
            fh_02.mq(0);
        } else {
            fh_02.setName(do_02.aIC());
            fh_02.mp(fh_02.getName().hashCode());
            int n = fh_02.getName().indexOf(95) + 1;
            fh_02.mq(fh_02.getName().substring(n).hashCode());
        }
        do_02.aIA();
        do_02.aIA();
        fh_02.u(do_02.aIz());
        fh_02.a(di_0.d(do_02));
        fh_02.ms(1);
    }
}

