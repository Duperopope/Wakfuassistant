/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aHJ
 */
public class ahj_1
extends InputStream
implements apq_1 {
    private final apn_1 dSn;

    public ahj_1(apn_1 apn_12) {
        this.dSn = apn_12;
    }

    @Override
    public int read() {
        int n = this.dSn.read();
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
        int n3 = this.dSn.read(byArray, n, n2);
        int n4 = n + n2;
        for (int i = n; i < n4; ++i) {
            byArray[i] = (byte)((byArray[i] - 1 + 256) % 256);
        }
        return n3;
    }

    @Override
    public long skip(long l) {
        return this.dSn.skip(l);
    }

    @Override
    public int available() {
        return this.dSn.available();
    }

    @Override
    public void close() {
        this.dSn.close();
    }

    @Override
    public void mark(int n) {
    }

    @Override
    public void reset() {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public void gt(long l) {
        this.dSn.gt(l);
    }

    @Override
    public long bFH() {
        return this.dSn.bFH();
    }

    @Override
    public long bFV() {
        return this.dSn.bFV();
    }
}

