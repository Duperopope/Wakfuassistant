/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmH
extends nv_0 {
    private long maQ;
    private long maR;
    private short lZm;
    private long lVH;
    private short bol = (short)-1;
    private long maS = 0L;

    @Override
    public byte[] aVX() {
        int n = 28;
        if (this.maS != 0L && this.bol >= 0) {
            n += 8;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.maQ);
        byteBuffer.putLong(this.lVH);
        byteBuffer.putLong(this.maR);
        byteBuffer.putShort(this.lZm);
        if (this.bol >= 0 && this.maS != 0L) {
            byteBuffer.putShort(this.bol);
            byteBuffer.putLong(this.maS);
        } else {
            byteBuffer.putShort(this.bol);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13337;
    }

    public void nv(long l) {
        this.maR = l;
    }

    public void setDestinationPosition(short s) {
        this.lZm = s;
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    public void ak(short s) {
        this.bol = s;
    }

    public void nw(long l) {
        this.maS = l;
    }

    public void nx(long l) {
        this.maQ = l;
    }
}

