/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuB
extends nr_0 {
    private boolean mbz;
    private boolean mbA;
    private byte mbB;
    private byte mbC;

    public boolean eDp() {
        return this.mbz;
    }

    public boolean eDq() {
        return this.mbA;
    }

    public byte eDr() {
        return this.mbB;
    }

    public byte eDs() {
        return this.mbC;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbz = byteBuffer.get() == 1;
        this.mbA = byteBuffer.get() == 1;
        this.mbB = byteBuffer.get();
        this.mbC = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 13494;
    }
}

