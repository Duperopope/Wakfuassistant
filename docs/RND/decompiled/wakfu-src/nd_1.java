/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ND
 */
public class nd_1
extends nv_0 {
    private String aYL;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aYL);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int d() {
        return 665;
    }

    public void cU(String string) {
        this.aYL = string;
    }
}

