/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class eMP {
    public static final int qNG = 27083;

    private eMP() {
    }

    public static int fz(int n, int n2) {
        if (n2 >= 13) {
            return 0;
        }
        int n3 = n2 < 1 ? 10 : (n2 < 7 ? 6 : 3);
        return (int)fhB.a((short)n, fgj.siE) * n3;
    }

    public static int z(int n, short s) {
        return eMO.qNB.y(n, s).map(Bu::aHI).orElse(0);
    }

    public static Optional<Integer> A(int n, short s) {
        return eMO.qNB.y(n, s).map(Bu::getFirst);
    }
}

