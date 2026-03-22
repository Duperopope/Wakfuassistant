/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwX
 */
public class cwx_0
extends nv_0 {
    private final String mly;

    public cwx_0(String string) {
        this.mly = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mly);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14448;
    }
}

