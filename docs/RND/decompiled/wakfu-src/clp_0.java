/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clp
 */
public class clp_0
extends cll_0 {
    private short lZl;
    private short lZm;

    @Override
    public byte[] aVX() {
        int n = 27;
        if (this.lZf != 0L) {
            n += 10;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.bgK);
        byteBuffer.putLong(this.lZd);
        byteBuffer.putLong(this.lZe);
        byteBuffer.putShort(this.lZm);
        if (this.lZf != 0L) {
            byteBuffer.put((byte)1);
            byteBuffer.putLong(this.lZf);
            byteBuffer.putShort(this.lZl);
        } else {
            byteBuffer.put((byte)0);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12174;
    }

    public void ak(short s) {
        this.lZl = s;
    }

    public void setDestinationPosition(short s) {
        this.lZm = s;
    }
}

