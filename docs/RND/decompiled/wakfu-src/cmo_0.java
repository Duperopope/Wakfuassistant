/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cmO
 */
public class cmo_0
extends nv_0 {
    protected static final Logger mba = Logger.getLogger(cmo_0.class);
    private byte mbb;
    private short huL;

    @Override
    public byte[] aVX() {
        int n = 3;
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put(this.mbb);
        byteBuffer.putShort(this.huL);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13459;
    }

    public void dw(byte by) {
        this.mbb = by;
    }

    public void cD(short s) {
        this.huL = s;
    }
}

