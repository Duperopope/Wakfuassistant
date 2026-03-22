/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnj
extends nv_0 {
    private boolean mbz;
    private boolean mbA;
    private byte mbB;
    private byte mbC;

    public void jr(boolean bl) {
        this.mbz = bl;
    }

    public void js(boolean bl) {
        this.mbA = bl;
    }

    public void dD(byte by) {
        this.mbB = by;
    }

    public void dE(byte by) {
        this.mbC = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.put((byte)(this.mbz ? 1 : 0));
        byteBuffer.put((byte)(this.mbA ? 1 : 0));
        byteBuffer.put(this.mbB);
        byteBuffer.put(this.mbC);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12722;
    }
}

