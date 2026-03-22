/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDP
 */
public abstract class adp_1 {
    public static String dK(byte[] byArray) {
        if (byArray == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < byArray.length; ++i) {
            if (i != 0) {
                stringBuilder.append(' ');
            }
            int n = byArray[i] & 0xFF;
            stringBuilder.append(Integer.toHexString(n));
        }
        return stringBuilder.toString();
    }

    public static String dL(byte[] byArray) {
        if (byArray == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (byte by : byArray) {
            int n = by & 0xFF;
            if (n >= 32 && n <= 127) {
                stringBuilder.append((char)n);
                continue;
            }
            stringBuilder.append('.');
        }
        return stringBuilder.toString();
    }
}

