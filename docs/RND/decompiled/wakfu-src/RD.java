/*
 * Decompiled with CFR 0.152.
 */
public final class RD {
    private static final long blU = 0x3FFFFFFFFFFFFFFFL;
    private static long blV = -1L;
    private static long blW = 0L;

    public static void dx(long l) {
        if (l >= 0L) {
            throw new IndexOutOfBoundsException("L'id de base pour la g\u00e9n\u00e9ration dynamique doit etre n\u00e9gatif.");
        }
        blW = l;
    }

    public static long dy(long l) {
        if (l < 0L) {
            return l;
        }
        if (l >= 0x3FFFFFFFFFFFFFFFL) {
            throw new IndexOutOfBoundsException("L'ID sp\u00e9cifi\u00e9 \u00e9crase une plage d'ID existante id=" + l + " >= 4611686018427387903");
        }
        return 0x3FFFFFFFFFFFFFFFL + l;
    }

    public static long dz(long l) {
        if (l > 0x3FFFFFFFFFFFFFFFL) {
            return l - 0x3FFFFFFFFFFFFFFFL;
        }
        return l;
    }

    public static boolean dA(long l) {
        return l >= 0x3FFFFFFFFFFFFFFFL;
    }

    public static boolean dB(long l) {
        return l < 0L;
    }

    public static long beh() {
        return blW - blV--;
    }
}

