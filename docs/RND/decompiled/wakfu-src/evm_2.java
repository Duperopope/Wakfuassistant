/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from evm
 */
public class evm_2 {
    private static final int osX = 32;
    private static final int osY = GC.r(evn_2.ovt.length, 32);
    public static final int[] osZ = new int[osY];

    private evm_2() {
    }

    public static int fec() {
        return osY;
    }

    public static void b(int[] nArray, short s) {
        int n = s / 32;
        nArray[n] = nArray[n] | 1 << s % 32;
    }

    public static void a(int[] nArray, evn_2 evn_22) {
        evm_2.b(nArray, (short)evn_22.ordinal());
    }

    public static int[] a(evn_2 ... evn_2Array) {
        int[] nArray = (int[])osZ.clone();
        for (evn_2 evn_22 : evn_2Array) {
            evm_2.a(nArray, evn_22);
        }
        return nArray;
    }

    public static boolean c(int[] nArray, int[] nArray2) {
        return Arrays.equals(nArray, nArray2);
    }

    public static boolean a(int[] nArray, evp_2 evp_22) {
        for (evn_2 evn_22 : evp_22.fef()) {
            if (evm_2.b(nArray, evn_22)) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int[] nArray, evn_2 evn_22) {
        return evm_2.c(nArray, (short)evn_22.ordinal());
    }

    public static boolean c(int[] nArray, short s) {
        return (nArray[s / 32] & 1 << s % 32) != 0;
    }
}

