/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJR
 */
public class fjr_1
extends fjt_1 {
    public static final String TAG = "isLess";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValidInt(int n, int n2) {
        return n < n2;
    }

    @Override
    public boolean isValidFloat(float f2, float f3) {
        return f2 < f3;
    }

    @Override
    public boolean isValidDouble(double d2, double d3) {
        return d2 < d3;
    }

    @Override
    public boolean isValidShort(short s, short s2) {
        return s < s2;
    }

    @Override
    public boolean isValidLong(long l, long l2) {
        return l < l2;
    }

    @Override
    public boolean isValidByte(byte by, byte by2) {
        return by < by2;
    }
}

