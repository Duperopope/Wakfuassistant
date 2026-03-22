/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnm
extends nv_0 {
    private final int mbF;
    private final long mbG;
    private final int mbH;
    private final int mbI;
    private final short mbJ;
    private final int mbK;

    public cnm(int n, long l, int n2, int n3, short s, int n4) {
        this.mbF = n;
        this.mbG = l;
        this.mbH = n2;
        this.mbI = n3;
        this.mbJ = s;
        this.mbK = n4;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        byteBuffer.putInt(this.mbF);
        byteBuffer.putLong(this.mbG);
        byteBuffer.putInt(this.mbH);
        byteBuffer.putInt(this.mbI);
        byteBuffer.putShort(this.mbJ);
        byteBuffer.putInt(this.mbK);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12464;
    }
}

