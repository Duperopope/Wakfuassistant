/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckL
 */
public class ckl_0
extends nv_0 {
    private String lYx;
    private Boolean lYy;

    public void ow(String string) {
        this.lYx = string;
    }

    public void h(Boolean bl) {
        this.lYy = bl;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.lYx);
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length + 1);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)(this.lYy != false ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13834;
    }
}

