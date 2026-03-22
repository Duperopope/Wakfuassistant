/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnA
extends nv_0 {
    private int epK;
    private int mbP;
    private byte mbQ;

    public void a(int n, fpf fpf2, int n2) {
        this.epK = n;
        this.mbQ = fpf2.sNB;
        this.mbP = n2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putInt(this.epK);
        byteBuffer.putInt(this.mbP);
        byteBuffer.put(this.mbQ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13393;
    }
}

