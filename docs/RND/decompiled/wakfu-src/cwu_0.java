/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwU
 */
public class cwu_0
extends nv_0 {
    private final long mls;
    private final long mlt;
    private final String mlu;

    public cwu_0(long l, long l2, String string) {
        this.mls = l;
        this.mlt = l2;
        this.mlu = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mlu);
        ByteBuffer byteBuffer = ByteBuffer.allocate(17 + byArray.length);
        byteBuffer.putLong(this.mls);
        byteBuffer.putLong(this.mlt);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15897;
    }
}

