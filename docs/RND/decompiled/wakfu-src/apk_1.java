/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.log4j.Logger;

/*
 * Renamed from apK
 */
public class apk_1
implements Closeable {
    protected static final Logger cOC = Logger.getLogger(apk_1.class);
    public static final int cOD = 1024;
    public static final int cOE = 0x100000;
    private final RandomAccessFile cOF;
    private final byte[] cOG;
    private final int cOH;
    private int cOI;
    private int cOJ;
    private long cOK;

    public apk_1(File file, int n) {
        this.cOF = new RandomAccessFile(file, "r");
        this.bFM();
        if (n <= 0 || n > 0x100000) {
            throw new IOException("Invalid buffer size: " + n);
        }
        this.cOG = new byte[n];
        this.cOH = this.cOG.length;
    }

    public apk_1(File file) {
        this(file, 1024);
    }

    @Override
    public final void close() {
        this.cOF.close();
    }

    public final long bFH() {
        return this.cOF.length();
    }

    public final int bFI() {
        if (this.cOI >= this.cOJ && this.bFL() < 0) {
            return -1;
        }
        if (this.cOJ == 0) {
            return -1;
        }
        return this.cOG[this.cOI++];
    }

    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    public final int read(byte[] byArray, int n, int n2) {
        if (this.cOI >= this.cOJ && this.bFL() < 0) {
            return -1;
        }
        int n3 = Math.min(n2, this.cOJ - this.cOI);
        System.arraycopy(this.cOG, this.cOI, byArray, n, n3);
        this.cOI += n3;
        return n3;
    }

    public final String bFJ() {
        if (this.cOI >= this.cOJ && this.bFL() < 0) {
            return null;
        }
        int n = -1;
        for (int i = this.cOI; i < this.cOJ; ++i) {
            if (this.cOG[i] != 10) continue;
            n = i;
            break;
        }
        if (n < 0) {
            StringBuilder stringBuilder = new StringBuilder(100);
            int n2 = this.bFI();
            while (n2 != -1 && n2 != 10) {
                stringBuilder.append((char)n2);
                n2 = this.bFI();
            }
            if (n2 == -1 && stringBuilder.length() == 0) {
                return null;
            }
            if (stringBuilder.charAt(stringBuilder.length() - 1) == '\r') {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            return stringBuilder.toString();
        }
        String string = n > 0 && this.cOG[n - 1] == 13 ? new String(this.cOG, this.cOI, n - this.cOI - 1) : new String(this.cOG, this.cOI, n - this.cOI);
        this.cOI = n + 1;
        return string;
    }

    public final long bFK() {
        return this.cOK - (long)this.cOJ + (long)this.cOI;
    }

    public final void gt(long l) {
        int n = (int)(this.cOK - l);
        if (n >= 0 && n <= this.cOJ) {
            this.cOI = this.cOJ - n;
        } else {
            this.cOF.seek(l);
            this.bFM();
        }
    }

    private int bFL() {
        int n = this.cOF.read(this.cOG, 0, this.cOH);
        if (n >= 0) {
            this.cOK += (long)n;
            this.cOJ = n;
            this.cOI = 0;
        }
        return n;
    }

    private void bFM() {
        this.cOJ = 0;
        this.cOI = 0;
        this.cOK = this.cOF.getFilePointer();
    }
}

