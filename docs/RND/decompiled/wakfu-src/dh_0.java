/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from DH
 */
public final class dh_0 {
    private dh_0() {
    }

    public static void a(fd_1 fd_12, do_0 do_02) {
        int n = do_02.aIz() & 0xFFFF;
        for (int i = 0; i < n; ++i) {
            fc_1 fc_12 = new fc_1();
            dg_0.a(fc_12, do_02);
            fd_12.a(fc_12);
        }
    }
}

