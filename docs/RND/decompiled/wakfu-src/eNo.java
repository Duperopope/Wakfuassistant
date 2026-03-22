/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;

public abstract class eNo
extends ql_0 {
    public static final int qXB = 11;
    public static final int qXC = 12;
    public static final int qXD = 14;
    public static final int qXE = 15;
    public static final int qXF = 16;
    public static final int qXG = 18;
    public static final int qXH = 19;
    public static final int qXI = 20;
    public static final int qXJ = 21;
    public static final int qXK = 22;
    public static final int qXL = 23;
    public static final int qXM = 24;
    public static final int qXN = 25;
    public static final int qXO = 26;
    public static final int qXP = 27;
    public static final int qXQ = 28;
    public static final int qXR = 29;
    public static final int qXS = 30;
    public static final int qXT = 31;
    public static final int qXU = 32;
    public static final int qXV = 33;
    public static final int qXW = 34;
    public static final int qXX = 35;
    public static final int qXY = 36;
    public static final int qXZ = 37;

    public static String RS(int n) {
        for (Field field : eNo.class.getFields()) {
            try {
                if (field.getInt(null) != n) continue;
                return field.getName();
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        return "UNKNOWN_CONTAINER_TYPE (" + n + ")";
    }
}

