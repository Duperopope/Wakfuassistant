/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Fq
 */
public class fq_0 {
    private static final Logger aBc = Logger.getLogger(fq_0.class);
    public static final String aBd = "file://";
    public static final String aBe = "file:\\\\";
    private static final boolean aBf = true;

    public static URL bA(String string) {
        try {
            return new URL(string);
        }
        catch (MalformedURLException malformedURLException) {
            File file = new File(string);
            return file.toURI().toURL();
        }
    }

    public static byte[] c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = fq_0.gI(fileInputStream);
        ((InputStream)fileInputStream).close();
        return byArray;
    }

    public static byte[] by(String string) {
        InputStream inputStream = fq_0.bz(string);
        byte[] byArray = fq_0.gI(inputStream);
        inputStream.close();
        return byArray;
    }

    public static byte[] c(String string, int n) {
        InputStream inputStream = fq_0.bz(string);
        byte[] byArray = fq_0.a(inputStream, n);
        inputStream.close();
        return byArray;
    }

    public static InputStream bz(String string) {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(new URL(string).openStream());
        }
        catch (Exception exception) {
            int n = string.indexOf(aBd);
            String string2 = string;
            if (n >= 0) {
                string2 = string.substring(n + aBd.length());
            }
            File file = new File(string2);
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        }
        return bufferedInputStream;
    }

    public static int a(InputStream inputStream, byte[] byArray, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        while ((n3 = inputStream.read(byArray, n + n4, n2 - n4)) != -1 && (n4 += n3) != n2) {
        }
        return n4;
    }

    public static byte[] a(FileInputStream fileInputStream) {
        int n;
        int n2 = fileInputStream.available();
        byte[] byArray = new byte[n2];
        int n3 = 0;
        while ((n = fileInputStream.read(byArray, n3, n2 - n3)) != 0 && (n3 += n) != n2) {
        }
        assert (n3 == n2);
        return byArray;
    }

    public static byte[] gI(InputStream inputStream) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[inputStream.available()];
        while ((n = inputStream.read(byArray)) > 0) {
            byteArrayOutputStream.write(byArray, 0, n);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] a(InputStream inputStream, int n) {
        int n2;
        int n3 = Math.min(n, inputStream.available());
        byte[] byArray = new byte[n3];
        int n4 = 0;
        while ((n2 = inputStream.read(byArray, n4, n3 - n4)) != 0 && (n4 += n2) != n3) {
        }
        assert (n4 == n3);
        return byArray;
    }

    public static boolean bC(String string) {
        File file = new File(string);
        return file.exists() || bl_0.bl(string);
    }

    public static void bD(String string) {
        File file = new File(string);
        if (!file.exists()) {
            return;
        }
        if (!file.isFile()) {
            return;
        }
        file.delete();
    }

    public static void bE(String string) {
        fq_0.c(string, false);
    }

    public static void c(String string, boolean bl) {
        File file = new File(string);
        if (!file.exists()) {
            return;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return;
        }
        for (File file2 : fileArray) {
            if (file2.isDirectory()) {
                fq_0.bE(file2.getPath());
                continue;
            }
            file2.delete();
        }
        if (!bl) {
            file.delete();
        }
    }

    public static String aKT() {
        CRC32 cRC32 = new CRC32();
        cRC32.update(String.valueOf(System.nanoTime()).getBytes());
        return String.valueOf(cRC32.getValue());
    }

    public static void k(String string, String string2) {
        byte[] byArray = fq_0.by(string);
        FileOutputStream fileOutputStream = fq_0.bO(string2);
        fileOutputStream.write(byArray);
        fileOutputStream.close();
    }

    public static void a(fs_0 fs_02, boolean bl) {
        if (bl) {
            fs_02.g((byte)1);
        } else {
            fs_02.g((byte)0);
        }
    }

    public static String bF(String string) {
        int n = fq_0.bN(string);
        return string.substring(n + 1);
    }

    public static String bG(String string) {
        int n = fq_0.bN(string);
        if (n == -1) {
            return "";
        }
        return string.substring(0, n);
    }

    public static String bH(String string) {
        int n = fq_0.bN(string);
        return string.substring(0, n + 1);
    }

    public static String bI(String string) {
        int n = string.lastIndexOf(46);
        if (n == -1) {
            return "";
        }
        return string.substring(n + 1);
    }

    public static String bJ(String string) {
        int n = fq_0.bN(string) + 1;
        int n2 = string.lastIndexOf(46);
        if (n2 < n) {
            return string.substring(n);
        }
        return string.substring(n, n2);
    }

    public static String bK(String string) {
        int n = string.lastIndexOf(46);
        if (n < 0) {
            return string;
        }
        return string.substring(0, n);
    }

    public static String bL(String string) {
        String string2 = string.replace('\\', '/');
        int n = string2.lastIndexOf(47);
        if (n == string2.length() - 1) {
            n = string2.substring(0, n).lastIndexOf(47);
        }
        return string2.substring(0, n);
    }

    public static String bM(String string) {
        String string2 = string.replace('\\', '/');
        int n = string2.lastIndexOf(47);
        if (n == string2.length() - 1) {
            n = string2.substring(0, n).lastIndexOf(47);
            return string2.substring(n + 1, string2.length() - 1);
        }
        return string2.substring(n + 1, string2.length());
    }

    private static int bN(String string) {
        int n = string.lastIndexOf(47);
        if (n >= 0) {
            return n;
        }
        return string.lastIndexOf(92);
    }

    public static FileOutputStream bO(String string) {
        File file = new File(string);
        File file2 = file.getParentFile();
        if (file2 != null) {
            file2.mkdirs();
        }
        return new FileOutputStream(file);
    }

    public static void a(@NotNull String string, byte @NotNull [] byArray) {
        FileOutputStream fileOutputStream = fq_0.bO(string);
        fileOutputStream.write(byArray);
        fileOutputStream.close();
    }

    public static boolean d(File file) {
        if (!file.exists()) {
            return false;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return false;
        }
        for (File file2 : fileArray) {
            if (file2.isDirectory()) {
                fq_0.d(file2);
                continue;
            }
            file2.delete();
        }
        return file.delete();
    }

    public static byte[] dg(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length / 2);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(byArray);
        deflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] dh(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        byte[] byArray2 = fq_0.gI(inflaterInputStream);
        ((InputStream)byteArrayInputStream).close();
        return byArray2;
    }

    public static void a(File file, File file2, CopyOption copyOption) {
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            Files.copy(file.toPath(), file2.toPath(), copyOption);
            return;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return;
        }
        for (File file3 : fileArray) {
            File file4 = new File(file2, file3.getName());
            if (file3.isFile()) {
                Files.copy(file3.toPath(), file4.toPath(), copyOption);
                continue;
            }
            if (!file3.isDirectory()) continue;
            file4.mkdirs();
            fq_0.a(file3, file4, copyOption);
        }
    }

    public static boolean e(File file) {
        String[] stringArray = file.list();
        return file.isDirectory() && (stringArray == null || stringArray.length == 0);
    }

    public static File bP(@NotNull String string) {
        String string2 = string.startsWith(aBd) || string.startsWith(aBe) ? string.substring(aBd.length()) : string;
        return new File(URLDecoder.decode(string2, StandardCharsets.UTF_8));
    }

    public static boolean bQ(@NotNull String string) {
        try {
            Desktop.getDesktop().open(fq_0.bP(string));
            return true;
        }
        catch (IOException | IllegalArgumentException exception) {
            aBc.error((Object)("Cannot open folder with path = " + string), (Throwable)exception);
            return false;
        }
    }
}

