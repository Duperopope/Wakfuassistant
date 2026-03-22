/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NG
 */
public class ng_0
extends nv_0 {
    private final String aYO;

    public ng_0(String string) {
        this.aYO = string;
    }

    @Override
    public byte[] aVX() {
        String string = this.aYO;
        byte[] byArray = BH.aP(string);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int d() {
        return 739;
    }
}

