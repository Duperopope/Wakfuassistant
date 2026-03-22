/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aDO
 */
public class ado_1 {
    private static final Logger dEn = Logger.getLogger(ado_1.class);

    public static void i(long[] lArray) {
        for (int i = lArray.length - 1; i >= 0; --i) {
            int n = GC.mR(i + 1);
            long l = lArray[n];
            lArray[n] = lArray[i];
            lArray[i] = l;
        }
    }

    public static void v(int[] nArray) {
        for (int i = nArray.length - 1; i >= 0; --i) {
            int n = GC.mR(i + 1);
            int n2 = nArray[n];
            nArray[n] = nArray[i];
            nArray[i] = n2;
        }
    }

    public static void d(Object[] objectArray) {
        for (int i = objectArray.length - 1; i >= 0; --i) {
            int n = GC.mR(i + 1);
            Object object = objectArray[n];
            objectArray[n] = objectArray[i];
            objectArray[i] = object;
        }
    }

    public static boolean a(Object[] objectArray, Object object) {
        for (int i = 0; i < objectArray.length; ++i) {
            if (objectArray[i] != object) continue;
            return true;
        }
        return false;
    }

    public static boolean b(byte[] byArray, byte by) {
        for (int i = 0; i < byArray.length; ++i) {
            if (byArray[i] != by) continue;
            return true;
        }
        return false;
    }

    public static boolean a(short[] sArray, short s) {
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] != s) continue;
            return true;
        }
        return false;
    }

    public static boolean a(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return true;
        }
        return false;
    }

    public static boolean a(long[] lArray, long l) {
        for (int i = 0; i < lArray.length; ++i) {
            if (lArray[i] != l) continue;
            return true;
        }
        return false;
    }
}

