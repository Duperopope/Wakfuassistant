/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NE
 */
public class ne_0
extends nv_0 {
    private String aYN;

    @Override
    public byte[] aVX() {
        byte[] byArray = new byte[]{};
        byArray = BH.aP(this.aYN);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int d() {
        return 763;
    }

    public void cW(String string) {
        this.aYN = string;
    }
}

