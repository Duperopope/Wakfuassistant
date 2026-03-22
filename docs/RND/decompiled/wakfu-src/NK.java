/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class NK
extends nv_0 {
    private int o = 775;
    private int aYR;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.aYR);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int d() {
        return this.o;
    }

    public void aWs() {
        this.o = 630;
    }

    public void nZ(int n) {
        this.aYR = n;
    }
}

