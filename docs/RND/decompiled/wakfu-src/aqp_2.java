/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.InputStream;

/*
 * Renamed from aqp
 */
class aqp_2
extends BufferedInputStream {
    public aqp_2(InputStream inputStream) {
        super(inputStream);
    }

    public aqp_2(InputStream inputStream, int n) {
        super(inputStream, n);
    }

    public void gT(InputStream inputStream) {
        this.in = inputStream;
        this.pos = 0;
        this.count = 0;
        this.marklimit = 0;
        this.markpos = -1;
        this.buf = new byte[8192];
    }

    @Override
    public void close() {
        super.close();
    }
}

