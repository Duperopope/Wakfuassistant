/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwH
extends nv_0 {
    private long mlb;
    private String cxT;

    public void nH(long l) {
        this.mlb = l;
    }

    public void eQ(String string) {
        this.cxT = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.cxT);
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + byArray.length);
        byteBuffer.putLong(this.mlb);
        if (byArray.length < 32) {
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        }
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1135;
    }
}

