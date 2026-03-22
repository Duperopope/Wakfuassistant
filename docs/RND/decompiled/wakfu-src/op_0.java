/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Op
 */
public class op_0
extends nv_0 {
    private final byte aZE;
    private final String aZF;

    public op_0(byte by, String string) {
        this.aZE = by;
        this.aZF = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aZF);
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer.put(this.aZE);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    public byte aWY() {
        return this.aZE;
    }

    public String aWZ() {
        return this.aZF;
    }

    @Override
    public int d() {
        return 1074;
    }
}

