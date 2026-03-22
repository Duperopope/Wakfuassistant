/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

/*
 * Renamed from aHA
 */
public class aha_1
implements ahz_1 {
    private apk_1 cOX;
    private final File dQU;
    private final int dQV;

    public aha_1(File file) {
        this(file, -1);
    }

    public aha_1(File file, int n) {
        this.dQU = file;
        this.dQV = n;
    }

    @Override
    public void cdQ() {
        this.cOX = this.dQV == -1 ? new apk_1(this.dQU) : new apk_1(this.dQU, this.dQV);
    }

    @Override
    public void reset() {
        this.cOX.gt(0L);
    }

    @Override
    public void close() {
        if (this.cOX != null) {
            this.cOX.close();
        }
    }

    @Override
    public boolean cdR() {
        return true;
    }

    @Override
    public void gt(long l) {
        this.cOX.gt(l);
    }

    @Override
    public long bFH() {
        return this.cOX.bFH();
    }

    @Override
    public long bFV() {
        return this.cOX.bFK();
    }

    @Override
    public String getDescription() {
        return this.dQU.getPath();
    }

    @Override
    public String ccQ() {
        return fq_0.bJ(this.dQU.getPath());
    }

    @Override
    public int read() {
        return this.cOX.bFI();
    }

    @Override
    public int read(byte[] byArray) {
        return this.cOX.read(byArray);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        return this.cOX.read(byArray, n, n2);
    }
}

