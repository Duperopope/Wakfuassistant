/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from DF
 */
public final class df_0 {
    private df_0() {
    }

    public static void a(ex_1 ex_12, do_0 do_02) {
        int n;
        int n2;
        Object object;
        int n3;
        ex_12.f(do_02.aIy());
        if (ex_12.aJN()) {
            ex_12.setScale(do_02.aIB());
        }
        if (ex_12.aJP()) {
            ex_12.l(do_02.aIB());
        }
        if (ex_12.aJO()) {
            n3 = do_02.aIz() & 0xFFFF;
            object = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                object[n2] = do_02.aIC();
            }
            ex_12.h((String[])object);
        }
        if (ex_12.aJQ()) {
            n3 = do_02.aIy() & 0xFF;
            object = new ArrayList(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                int n4 = do_02.aIA();
                n = do_02.aIA();
                object.add(new fa_1(n4, n));
            }
            ex_12.d((List<fa_1>)object);
        }
        if (ex_12.aJS()) {
            n3 = do_02.aIy() & 0xFF;
            object = new ArrayList(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                String string = do_02.aIC();
                n = do_02.aIA();
                object.add(new ez_1(string, n));
            }
            ex_12.e((List<ez_1>)object);
        }
        if (ex_12.aJT()) {
            ey_1 ey_12 = new ey_1();
            de_0.a(ey_12, do_02);
            ex_12.a(ey_12);
        }
        int n5 = do_02.aIz() & 0xFFFF;
        ex_12.a(new ew_1[n5]);
        object = ex_12.aJJ();
        for (n2 = 0; n2 < ((String[])object).length; ++n2) {
            ew_1 ew_12 = new ew_1();
            object[n2] = ew_12;
            dd_0.a(ew_12, do_02);
        }
    }
}

