/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fUV
 */
class fuv_2
extends InputStream {
    RandomAccessFile voB = null;
    final String voC = "r";

    fuv_2(fuu_1 fuu_12, String string) {
        this.voB = new RandomAccessFile(string, "r");
    }

    @Override
    public int read() {
        return this.voB.read();
    }

    @Override
    public int read(@NotNull byte[] byArray) {
        return this.voB.read(byArray);
    }

    @Override
    public int read(@NotNull byte[] byArray, int n, int n2) {
        return this.voB.read(byArray, n, n2);
    }

    @Override
    public long skip(long l) {
        return this.voB.skipBytes((int)l);
    }

    public long aPk() {
        return this.voB.length();
    }

    public long bFV() {
        return this.voB.getFilePointer();
    }

    @Override
    public int available() {
        return this.voB.length() == this.voB.getFilePointer() ? 0 : 1;
    }

    @Override
    public void close() {
        this.voB.close();
    }

    @Override
    public synchronized void mark(int n) {
    }

    @Override
    public synchronized void reset() {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    public void gt(long l) {
        this.voB.seek(l);
    }
}

