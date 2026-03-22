/*
 * Decompiled with CFR 0.152.
 */
public final class Bn {
    private Bn() {
    }

    public static Byte[] da(byte ... byArray) {
        Byte[] byteArray = new Byte[byArray.length];
        for (int i = 0; i < byArray.length; ++i) {
            byteArray[i] = byArray[i];
        }
        return byteArray;
    }

    public static byte[] a(Byte ... byteArray) {
        byte[] byArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; ++i) {
            byArray[i] = byteArray[i];
        }
        return byArray;
    }

    public static Short[] a(short ... sArray) {
        Short[] shortArray = new Short[sArray.length];
        for (int i = 0; i < sArray.length; ++i) {
            shortArray[i] = sArray[i];
        }
        return shortArray;
    }

    public static Integer[] b(int ... nArray) {
        Integer[] integerArray = new Integer[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            integerArray[i] = nArray[i];
        }
        return integerArray;
    }

    public static Float[] a(float ... fArray) {
        Float[] floatArray = new Float[fArray.length];
        for (int i = 0; i < fArray.length; ++i) {
            floatArray[i] = Float.valueOf(fArray[i]);
        }
        return floatArray;
    }

    public static float[] a(Float ... floatArray) {
        float[] fArray = new float[floatArray.length];
        for (int i = 0; i < floatArray.length; ++i) {
            fArray[i] = floatArray[i].floatValue();
        }
        return fArray;
    }
}

