/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cio
 */
public class cio_0
extends nv_0 {
    private byte[] lUF = exH.pdv;

    public void ek(byte[] byArray) {
        this.lUF = (byte[])byArray.clone();
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(exH.pdv.length);
        byteBuffer.put(this.lUF);
        return this.a((byte)0, byteBuffer.array());
    }

    @Override
    public int d() {
        return 32;
    }
}

