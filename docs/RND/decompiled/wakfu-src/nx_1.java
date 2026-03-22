/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nx
 */
public class nx_1
extends nr_0 {
    protected byte aYm;
    protected int aYC;
    protected long aYD;
    protected long aYE;
    protected long aYF;
    protected long aYG;

    public byte aWj() {
        return this.aYm;
    }

    public int aWk() {
        return this.aYC;
    }

    public long aWl() {
        return this.aYD;
    }

    public long aWm() {
        return this.aYE;
    }

    public long aWn() {
        return this.aYF;
    }

    public long aWo() {
        return this.aYG;
    }

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 29, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYm = byteBuffer.get();
        this.aYC = byteBuffer.getInt();
        this.aYD = byteBuffer.getLong();
        this.aYE = byteBuffer.getLong();
        this.aYF = byteBuffer.getLong();
        this.aYG = System.nanoTime();
        return true;
    }

    @Override
    public int d() {
        return 367;
    }
}

