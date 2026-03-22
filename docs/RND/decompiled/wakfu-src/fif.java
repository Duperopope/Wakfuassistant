/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class fif {
    public static final byte srB = 0;
    public static final byte srC = 1;
    public static final byte srD = 2;

    public static fif gH(byte by) {
        switch (by) {
            case 0: {
                return new fie();
            }
            case 1: {
                return new fih_0();
            }
            case 2: {
                return new fii_0();
            }
        }
        return null;
    }

    public abstract byte fZw();

    public abstract void e(azg_1 var1);

    public abstract void eM(ByteBuffer var1);
}

