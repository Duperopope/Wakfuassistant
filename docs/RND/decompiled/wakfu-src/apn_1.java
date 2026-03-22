/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from apN
 */
public class apn_1
extends InputStream
implements apq_1 {
    private final apk_1 cOX;
    private final long cOY;
    private final long cOZ;

    public apn_1(apk_1 apk_12, long l, long l2) {
        this.cOX = apk_12;
        this.cOZ = l;
        this.cOY = l2;
        apk_12.gt(l);
    }

    @Override
    public int read() {
        if (this.cOX.bFK() - this.cOZ == this.cOY) {
            return -1;
        }
        return this.cOX.bFI();
    }

    @Override
    public int read(byte @NotNull [] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte @NotNull [] byArray, int n, int n2) {
        long l = this.cOX.bFK() - this.cOZ;
        return this.cOX.read(byArray, n, (int)Math.min(this.cOY - l, (long)n2));
    }

    @Override
    public void gt(long l) {
        if (l < 0L) {
            throw new IOException("Position invalide dans le flux : " + l + ". Taille du fichier : " + this.cOY);
        }
        this.cOX.gt(this.cOZ + l);
    }

    @Override
    public long bFH() {
        return this.cOY;
    }

    @Override
    public long bFV() {
        return this.cOX.bFK() - this.cOZ;
    }

    @Override
    public void close() {
        this.cOX.close();
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
    public int available() {
        return (int)this.cOY;
    }
}

