/*
 * Decompiled with CFR 0.152.
 */
public class Bv {
    public static final boolean[] aup = new boolean[0];
    public static final byte[] auq = new byte[0];
    public static final char[] aur = new char[0];
    public static final double[] aus = new double[0];
    public static final float[] aut = new float[0];
    public static final int[] auu = new int[0];
    public static final long[] auv = new long[0];
    public static final short[] auw = new short[0];
    public static final Boolean[] auxx = new Boolean[0];
    public static final Byte[] auy = new Byte[0];
    public static final Character[] auz = new Character[0];
    public static final Double[] auA = new Double[0];
    public static final Float[] auB = new Float[0];
    public static final Integer[] auC = new Integer[0];
    public static final Long[] auD = new Long[0];
    public static final Short[] auE = new Short[0];

    private Bv() {
    }

    public static Boolean[] a(boolean[] blArray) {
        if (blArray == null) {
            return null;
        }
        int n = blArray.length;
        if (n == 0) {
            return auxx;
        }
        Boolean[] booleanArray = new Boolean[n];
        for (int i = 0; i < n; ++i) {
            booleanArray[i] = blArray[i];
        }
        return booleanArray;
    }

    public static Byte[] db(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        int n = byArray.length;
        if (n == 0) {
            return auy;
        }
        Byte[] byteArray = new Byte[n];
        for (int i = 0; i < n; ++i) {
            byteArray[i] = byArray[i];
        }
        return byteArray;
    }

    public static Character[] a(char[] cArray) {
        if (cArray == null) {
            return null;
        }
        int n = cArray.length;
        if (n == 0) {
            return auz;
        }
        Character[] characterArray = new Character[n];
        for (int i = 0; i < n; ++i) {
            characterArray[i] = Character.valueOf(cArray[i]);
        }
        return characterArray;
    }

    public static Double[] a(double[] dArray) {
        if (dArray == null) {
            return null;
        }
        int n = dArray.length;
        if (n == 0) {
            return auA;
        }
        Double[] doubleArray = new Double[n];
        for (int i = 0; i < n; ++i) {
            doubleArray[i] = dArray[i];
        }
        return doubleArray;
    }

    public static Float[] b(float[] fArray) {
        if (fArray == null) {
            return null;
        }
        int n = fArray.length;
        if (n == 0) {
            return auB;
        }
        Float[] floatArray = new Float[n];
        for (int i = 0; i < n; ++i) {
            floatArray[i] = Float.valueOf(fArray[i]);
        }
        return floatArray;
    }

    public static Integer[] c(int[] nArray) {
        if (nArray == null) {
            return null;
        }
        int n = nArray.length;
        if (n == 0) {
            return auC;
        }
        Integer[] integerArray = new Integer[n];
        for (int i = 0; i < n; ++i) {
            integerArray[i] = nArray[i];
        }
        return integerArray;
    }

    public static Long[] b(long[] lArray) {
        if (lArray == null) {
            return null;
        }
        int n = lArray.length;
        if (n == 0) {
            return auD;
        }
        Long[] longArray = new Long[n];
        for (int i = 0; i < n; ++i) {
            longArray[i] = lArray[i];
        }
        return longArray;
    }

    public static Short[] b(short[] sArray) {
        if (sArray == null) {
            return null;
        }
        int n = sArray.length;
        if (n == 0) {
            return auE;
        }
        Short[] shortArray = new Short[n];
        for (int i = 0; i < n; ++i) {
            shortArray[i] = sArray[i];
        }
        return shortArray;
    }

    public static boolean[] a(Boolean[] booleanArray) {
        if (booleanArray == null) {
            return null;
        }
        int n = booleanArray.length;
        if (n == 0) {
            return aup;
        }
        boolean[] blArray = new boolean[n];
        for (int i = 0; i < n; ++i) {
            Boolean bl = booleanArray[i];
            if (bl == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            blArray[i] = bl;
        }
        return blArray;
    }

    public static byte[] b(Byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        int n = byteArray.length;
        if (n == 0) {
            return auq;
        }
        byte[] byArray = new byte[n];
        for (int i = 0; i < n; ++i) {
            Byte by = byteArray[i];
            if (by == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            byArray[i] = by;
        }
        return byArray;
    }

    public static char[] a(Character[] characterArray) {
        if (characterArray == null) {
            return null;
        }
        int n = characterArray.length;
        if (n == 0) {
            return aur;
        }
        char[] cArray = new char[n];
        for (int i = 0; i < n; ++i) {
            Character c2 = characterArray[i];
            if (c2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            cArray[i] = c2.charValue();
        }
        return cArray;
    }

    public static double[] a(Double[] doubleArray) {
        if (doubleArray == null) {
            return null;
        }
        int n = doubleArray.length;
        if (n == 0) {
            return aus;
        }
        double[] dArray = new double[n];
        for (int i = 0; i < n; ++i) {
            Double d2 = doubleArray[i];
            if (d2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            dArray[i] = d2;
        }
        return dArray;
    }

    public static float[] b(Float[] floatArray) {
        if (floatArray == null) {
            return null;
        }
        int n = floatArray.length;
        if (n == 0) {
            return aut;
        }
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            Float f2 = floatArray[i];
            if (f2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            fArray[i] = f2.floatValue();
        }
        return fArray;
    }

    public static int[] a(Integer[] integerArray) {
        if (integerArray == null) {
            return null;
        }
        int n = integerArray.length;
        if (n == 0) {
            return auu;
        }
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            Integer n2 = integerArray[i];
            if (n2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            nArray[i] = n2;
        }
        return nArray;
    }

    public static long[] b(Long[] longArray) {
        if (longArray == null) {
            return null;
        }
        int n = longArray.length;
        if (n == 0) {
            return auv;
        }
        long[] lArray = new long[n];
        for (int i = 0; i < n; ++i) {
            Long l = longArray[i];
            if (l == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            lArray[i] = l;
        }
        return lArray;
    }

    public static short[] a(Short[] shortArray) {
        if (shortArray == null) {
            return null;
        }
        int n = shortArray.length;
        if (n == 0) {
            return auw;
        }
        short[] sArray = new short[n];
        for (int i = 0; i < n; ++i) {
            Short s = shortArray[i];
            if (s == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            sArray[i] = s;
        }
        return sArray;
    }

    public static boolean[] a(Boolean[] booleanArray, boolean bl) {
        if (booleanArray == null) {
            return null;
        }
        int n = booleanArray.length;
        if (n == 0) {
            return aup;
        }
        boolean[] blArray = new boolean[n];
        for (int i = 0; i < n; ++i) {
            Boolean bl2 = booleanArray[i];
            blArray[i] = bl2 == null ? bl : bl2;
        }
        return blArray;
    }

    public static byte[] a(Byte[] byteArray, byte by) {
        if (byteArray == null) {
            return null;
        }
        int n = byteArray.length;
        if (n == 0) {
            return auq;
        }
        byte[] byArray = new byte[n];
        for (int i = 0; i < n; ++i) {
            Byte by2 = byteArray[i];
            byArray[i] = by2 == null ? by : by2;
        }
        return byArray;
    }

    public static char[] a(Character[] characterArray, char c2) {
        if (characterArray == null) {
            return null;
        }
        int n = characterArray.length;
        if (n == 0) {
            return aur;
        }
        char[] cArray = new char[n];
        for (int i = 0; i < n; ++i) {
            Character c3 = characterArray[i];
            cArray[i] = c3 == null ? c2 : c3.charValue();
        }
        return cArray;
    }

    public static double[] a(Double[] doubleArray, double d2) {
        if (doubleArray == null) {
            return null;
        }
        int n = doubleArray.length;
        if (n == 0) {
            return aus;
        }
        double[] dArray = new double[n];
        for (int i = 0; i < n; ++i) {
            Double d3 = doubleArray[i];
            dArray[i] = d3 == null ? d2 : d3;
        }
        return dArray;
    }

    public static float[] a(Float[] floatArray, float f2) {
        if (floatArray == null) {
            return null;
        }
        int n = floatArray.length;
        if (n == 0) {
            return aut;
        }
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            Float f3 = floatArray[i];
            fArray[i] = f3 == null ? f2 : f3.floatValue();
        }
        return fArray;
    }

    public static int[] a(Integer[] integerArray, int n) {
        if (integerArray == null) {
            return null;
        }
        int n2 = integerArray.length;
        if (n2 == 0) {
            return auu;
        }
        int[] nArray = new int[n2];
        for (int i = 0; i < n2; ++i) {
            Integer n3 = integerArray[i];
            nArray[i] = n3 == null ? n : n3;
        }
        return nArray;
    }

    public static long[] a(Long[] longArray, long l) {
        if (longArray == null) {
            return null;
        }
        int n = longArray.length;
        if (n == 0) {
            return auv;
        }
        long[] lArray = new long[n];
        for (int i = 0; i < n; ++i) {
            Long l2 = longArray[i];
            lArray[i] = l2 == null ? l : l2;
        }
        return lArray;
    }

    public static short[] a(Short[] shortArray, short s) {
        if (shortArray == null) {
            return null;
        }
        int n = shortArray.length;
        if (n == 0) {
            return auw;
        }
        short[] sArray = new short[n];
        for (int i = 0; i < n; ++i) {
            Short s2 = shortArray[i];
            sArray[i] = s2 == null ? s : s2;
        }
        return sArray;
    }

    public static String a(boolean[] blArray, String string, String string2, String string3) {
        if (blArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = blArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (boolean bl : blArray) {
            stringBuilder.append(bl);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(byte[] byArray, String string, String string2, String string3) {
        if (byArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = byArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (byte by : byArray) {
            stringBuilder.append(by);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(char[] cArray, String string, String string2, String string3) {
        if (cArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = cArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (char c2 : cArray) {
            stringBuilder.append(c2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(double[] dArray, String string, String string2, String string3) {
        if (dArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = dArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (double d2 : dArray) {
            stringBuilder.append(d2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(float[] fArray, String string, String string2, String string3) {
        if (fArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = fArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (float f2 : fArray) {
            stringBuilder.append(f2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(int[] nArray, String string, String string2, String string3) {
        if (nArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = nArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int n2 : nArray) {
            stringBuilder.append(n2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(long[] lArray, String string, String string2, String string3) {
        if (lArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = lArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (long l : lArray) {
            stringBuilder.append(l);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(short[] sArray, String string, String string2, String string3) {
        if (sArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = sArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (short s : sArray) {
            stringBuilder.append(s);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(boolean[] blArray, String string, String string2, String string3, String string4) {
        if (blArray == null) {
            return string4;
        }
        int n = blArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (boolean bl : blArray) {
            stringBuilder.append(bl);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(byte[] byArray, String string, String string2, String string3, String string4) {
        if (byArray == null) {
            return string4;
        }
        int n = byArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (byte by : byArray) {
            stringBuilder.append(by);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(char[] cArray, String string, String string2, String string3, String string4) {
        if (cArray == null) {
            return string4;
        }
        int n = cArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (char c2 : cArray) {
            stringBuilder.append(c2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(double[] dArray, String string, String string2, String string3, String string4) {
        if (dArray == null) {
            return string4;
        }
        int n = dArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (double d2 : dArray) {
            stringBuilder.append(d2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(float[] fArray, String string, String string2, String string3, String string4) {
        if (fArray == null) {
            return string4;
        }
        int n = fArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (float f2 : fArray) {
            stringBuilder.append(f2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(int[] nArray, String string, String string2, String string3, String string4) {
        if (nArray == null) {
            return string4;
        }
        int n = nArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int n2 : nArray) {
            stringBuilder.append(n2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(long[] lArray, String string, String string2, String string3, String string4) {
        if (lArray == null) {
            return string4;
        }
        int n = lArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (long l : lArray) {
            stringBuilder.append(l);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(short[] sArray, String string, String string2, String string3, String string4) {
        if (sArray == null) {
            return string4;
        }
        int n = sArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (short s : sArray) {
            stringBuilder.append(s);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static Object[] j(Object object) {
        if (!object.getClass().isArray()) {
            throw new IllegalArgumentException("argument is not an array.");
        }
        if (object instanceof boolean[]) {
            return Bv.a((boolean[])object);
        }
        if (object instanceof byte[]) {
            return Bv.db((byte[])object);
        }
        if (object instanceof char[]) {
            return Bv.a((char[])object);
        }
        if (object instanceof double[]) {
            return Bv.a((double[])object);
        }
        if (object instanceof float[]) {
            return Bv.b((float[])object);
        }
        if (object instanceof int[]) {
            return Bv.c((int[])object);
        }
        if (object instanceof long[]) {
            return Bv.b((long[])object);
        }
        if (object instanceof short[]) {
            return Bv.b((short[])object);
        }
        return (Object[])object;
    }

    public static boolean a(int[] nArray, int n) {
        for (int n2 : nArray) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }
}

