/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aHI
 */
public class ahi_1
extends InputStream {
    private final InputStream dSm;

    public ahi_1(InputStream inputStream) {
        this.dSm = inputStream;
    }

    @Override
    public int read() {
        int n = this.dSm.read();
        if (n == -1) {
            return -1;
        }
        return (n - 1 + 256) % 256;
    }

    @Override
    public int read(byte @NotNull [] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte @NotNull [] byArray, int n, int n2) {
        int n3 = this.dSm.read(byArray, n, n2);
        int n4 = n + n2;
        for (int i = n; i < n4; ++i) {
            byArray[i] = (byte)((byArray[i] - 1 + 256) % 256);
        }
        return n3;
    }

    @Override
    public long skip(long l) {
        return this.dSm.skip(l);
    }

    @Override
    public int available() {
        return this.dSm.available();
    }

    @Override
    public void close() {
        this.dSm.close();
    }

    @Override
    public void mark(int n) {
        this.dSm.mark(n);
    }

    @Override
    public void reset() {
        this.dSm.reset();
    }

    @Override
    public boolean markSupported() {
        return this.dSm.markSupported();
    }
}

