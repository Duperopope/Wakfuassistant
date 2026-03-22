/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ckS
 */
public class cks_0
extends nv_0 {
    private static final Logger lYE = Logger.getLogger(cks_0.class);
    private int lYF;
    private int lYG;
    private byte lYH;
    private byte lYI;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putInt(this.lYF);
        byteBuffer.put(this.lYH);
        byteBuffer.putInt(this.lYG);
        byteBuffer.put(this.lYI);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14744;
    }

    public void KY(int n) {
        this.lYF = n;
    }

    public void KZ(int n) {
        this.lYG = n;
    }

    public void dp(byte by) {
        this.lYI = by;
    }

    public void dq(byte by) {
        this.lYH = by;
    }
}

