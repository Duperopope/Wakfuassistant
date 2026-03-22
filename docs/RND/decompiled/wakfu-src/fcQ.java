/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class fcQ {
    private fcQ() {
    }

    public static short fK(int n, int n2) {
        short s = fcQ.Ud(n2);
        Optional<azn_2> optional = fcP.rUw.E(n, s);
        return optional.map(azn_22 -> (short)azn_22.bTs()).orElse((short)0);
    }

    public static Optional<Integer> fL(int n, int n2) {
        short s = fcQ.Ud(n2);
        Optional<azn_2> optional = fcP.rUw.E(n, s);
        return optional.map(azn_2::bTr);
    }

    private static short Ud(int n) {
        if (n < 1) {
            return 1;
        }
        if (n < 60) {
            return 2;
        }
        return 3;
    }
}

