/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmU
extends nv_0 {
    private String mbk;
    private short mbj;

    public void ox(String string) {
        this.mbk = string;
    }

    public void cE(short s) {
        this.mbj = s;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mbk);
        ByteBuffer byteBuffer = ByteBuffer.allocate(3 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putShort(this.mbj);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12233;
    }
}

