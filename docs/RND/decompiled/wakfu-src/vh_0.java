/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vh
 */
public final class vh_0 {
    public static final byte bxM = 0;
    public static final byte bxN = 1;
    public static final byte bxO = 2;
    public static final byte bxP = 3;
    public static final byte bxQ = 4;
    public static final byte bxR = 6;
    public static final byte bxS = 7;
    public static final byte bxT = 8;

    private vh_0() {
    }

    public static String ai(byte by) {
        switch (by) {
            case 0: {
                return "Proxy";
            }
            case 1: {
                return "Connection";
            }
            case 2: {
                return "World";
            }
            case 3: {
                return "Game";
            }
            case 4: {
                return "Chat";
            }
            case 6: {
                return "Global";
            }
            case 7: {
                return "Craft";
            }
            case 8: {
                return "Dispatch";
            }
        }
        return null;
    }
}

