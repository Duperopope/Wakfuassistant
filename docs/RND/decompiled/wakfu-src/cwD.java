/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwD
extends nv_0 {
    private long mlb;
    private String jbB;

    public void nH(long l) {
        this.mlb = l;
    }

    public void oA(String string) {
        this.jbB = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.jbB);
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + byArray.length);
        byteBuffer.putLong(this.mlb);
        if (byArray.length < 127) {
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        }
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1009;
    }
}

