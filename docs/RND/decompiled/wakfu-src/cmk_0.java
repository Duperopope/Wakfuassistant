/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cmK
 */
public class cmk_0
extends nv_0 {
    protected static final Logger maX = Logger.getLogger(cmk_0.class);

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12584;
    }
}

