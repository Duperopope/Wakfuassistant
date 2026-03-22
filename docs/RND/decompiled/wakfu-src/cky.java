/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cky
extends nv_0 {
    private anp_2 lYh;
    private long btF;

    @Override
    public byte[] aVX() {
        int n = this.lYh.bDU();
        int n2 = n * 10;
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + n2);
        byteBuffer.putLong(this.btF);
        for (int i = 0; i < n; ++i) {
            int[] nArray = this.lYh.tj(i);
            byteBuffer.putInt(nArray[0]);
            byteBuffer.putInt(nArray[1]);
            byteBuffer.putShort((short)nArray[2]);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12124;
    }

    public void d(anp_2 anp_22) {
        this.lYh = anp_22;
    }

    public void eY(long l) {
        this.btF = l;
    }
}

