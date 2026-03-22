/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ow
 */
public class ow_0
extends nv_0 {
    private final long aZN;
    private final String aZO;

    public ow_0(long l, String string) {
        this.aZN = l;
        this.aZO = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aZO);
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + byArray.length);
        byteBuffer.putLong(this.aZN);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)2, byteBuffer.array());
    }

    public long aXa() {
        return this.aZN;
    }

    public String aWZ() {
        return this.aZO;
    }

    @Override
    public int d() {
        return 1173;
    }
}

