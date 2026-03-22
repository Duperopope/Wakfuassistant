/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ciO
extends nv_0 {
    protected static final Logger lVq = Logger.getLogger(ciO.class);
    private final long lVr;
    private final fsm lVs;

    public ciO(long l, fsm fsm2) {
        this.lVr = l;
        this.lVs = fsm2;
    }

    @Override
    public byte[] aVX() {
        int n = 9;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.lVr);
        byteBuffer.put(this.lVs.aJr());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12448;
    }
}

