/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ciF
extends nv_0 {
    protected static final Logger lUY = Logger.getLogger(ciF.class);
    protected static final boolean lUZ = false;

    @Override
    public byte[] aVX() {
        boolean bl = false;
        ByteBuffer byteBuffer = ByteBuffer.allocate(0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13760;
    }
}

