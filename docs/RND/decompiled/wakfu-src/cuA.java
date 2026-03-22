/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuA
extends nr_0 {
    private byte mbv;
    private boolean mbw;
    private long mbx;
    private byte mby;

    public byte eDl() {
        return this.mbv;
    }

    public boolean eDm() {
        return this.mbw;
    }

    public long eDn() {
        return this.mbx;
    }

    public byte eDo() {
        return this.mby;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbx = byteBuffer.getLong();
        this.mby = byteBuffer.get();
        this.mbv = byteBuffer.get();
        this.mbw = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12189;
    }
}

