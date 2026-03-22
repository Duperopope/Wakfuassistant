/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.io.LittleEndianDataInputStream
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.base.Charsets;
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.io.LittleEndianDataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from Ig
 */
public final class ig_1 {
    private ig_1() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static JE f(File file) {
        JE jE = new JE();
        try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)new FileInputStream(file));){
            Jd jd = new Jd(jE);
            jd.b((DataInput)littleEndianDataInputStream);
            JE jE2 = jE;
            return jE2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(JE jE, File file) {
        try (LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)new FileOutputStream(file));){
            kj_2 kj_22 = new kj_2(jE);
            kj_22.b((DataOutput)littleEndianDataOutputStream);
        }
    }

    public static String a(DataInput dataInput) {
        byte by;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((by = dataInput.readByte()) != 0) {
            byteArrayOutputStream.write(by);
            if (byteArrayOutputStream.size() <= 1024) continue;
            throw new IOException("Unable to detect end String marker");
        }
        return byteArrayOutputStream.toString(Charsets.UTF_8.name());
    }

    public static void a(DataOutput dataOutput, String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8.name());
        dataOutput.write(byArray);
        dataOutput.writeByte(0);
    }
}

