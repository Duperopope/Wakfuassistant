/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.net.URL;

/*
 * Renamed from Fo
 */
public class fo_0 {
    public static boolean aBb = false;

    public static fy_0 bx(String string) {
        String string2 = fo_0.bB(string);
        return fw_0.aLA().d(fo_0.bA(string2));
    }

    public static void a(fv_0 fv_02) {
        fw_0.aLA().b(fv_02);
    }

    public static byte[] by(String string) {
        String string2 = fo_0.bB(string);
        return fq_0.by(string2);
    }

    public static byte[] c(String string, int n) {
        String string2 = fo_0.bB(string);
        return fq_0.c(string2, n);
    }

    public static InputStream bz(String string) {
        String string2 = fo_0.bB(string);
        return fq_0.bz(string2);
    }

    public static URL bA(String string) {
        String string2 = fo_0.bB(string);
        return new URL(string2);
    }

    public static String b(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        return fo_0.bB(string2);
    }

    public static String bB(String string) {
        fr_0.bR(string);
        return string;
    }
}

