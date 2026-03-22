/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ciP
extends nv_0 {
    protected static final Logger lVt = Logger.getLogger(ciP.class);
    private final long lVu;

    public ciP(long l) {
        this.lVu = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.lVu);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13234;
    }
}

