/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckx
extends nv_0 {
    private long btF;
    private abi_1 lVh;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.btF);
        byteBuffer.put((byte)this.lVh.dzy);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13008;
    }

    public void eY(long l) {
        this.btF = l;
    }

    public void m(abi_1 abi_12) {
        this.lVh = abi_12;
    }
}

