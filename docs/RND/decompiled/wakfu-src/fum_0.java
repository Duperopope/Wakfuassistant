/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

/*
 * Renamed from fum
 */
public final class fum_0 {
    private fum_0() {
    }

    public static byte[] dg(byte[] byArray) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray2;
            try (DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);){
                deflaterOutputStream.write(byArray);
                deflaterOutputStream.finish();
                deflaterOutputStream.flush();
                byArray2 = byteArrayOutputStream.toByteArray();
            }
            return byArray2;
        }
    }

    public static byte[] eY(byte[] byArray) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray2;
            try (InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);){
                inflaterOutputStream.write(byArray);
                inflaterOutputStream.flush();
                byArray2 = byteArrayOutputStream.toByteArray();
            }
            return byArray2;
        }
    }

    public static String eZ(byte[] byArray) {
        return Base64.getEncoder().encodeToString(byArray);
    }

    public static byte[] fa(byte[] byArray) {
        return Base64.getDecoder().decode(byArray);
    }

    public static byte[] uY(long l) {
        azg_1 azg_12 = new azg_1();
        for (long i = l; i > 0L; i /= 10L) {
            azg_12.aF((byte)(i % 10L));
        }
        return azg_12.bTe();
    }

    public static byte[] b(byte[] byArray, byte[] byArray2) {
        try {
            if (byArray == null || byArray2 == null) {
                return null;
            }
            int n = byArray.length;
            int n2 = byArray2.length;
            byte[] byArray3 = new byte[n];
            for (int i = 0; i < n; ++i) {
                byArray3[i] = (byte)(byArray[i] ^ byArray2[i % n2]);
            }
            return byArray3;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

