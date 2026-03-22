/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ckT
 */
public class ckt_0
extends nv_0 {
    private static final Logger lYJ = Logger.getLogger(ckt_0.class);
    private int lYK;

    @Override
    public byte[] aVX() {
        int n = 4;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.lYK);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13570;
    }

    public void La(int n) {
        this.lYK = n;
    }
}

