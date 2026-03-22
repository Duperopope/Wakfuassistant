/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciJ
extends nv_0 {
    private final abi_1 lVh;

    public ciJ(abi_1 abi_12) {
        this.lVh = abi_12;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put((byte)this.lVh.dzy);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12551;
    }
}

