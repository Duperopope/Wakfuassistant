/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cje
 */
public class cje_0
extends nv_0 {
    private int asK;

    @Override
    public byte[] aVX() {
        byte[] byArray = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.putInt(this.asK);
        return this.a((byte)3, byArray);
    }

    @Override
    public int d() {
        return 13108;
    }

    public void lT(int n) {
        this.asK = n;
    }
}

