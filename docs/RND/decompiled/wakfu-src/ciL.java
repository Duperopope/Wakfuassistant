/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

@Deprecated
public class ciL
extends nv_0 {
    protected static final Logger lVk = Logger.getLogger(ciL.class);
    protected static final boolean lVl = false;
    private final int lVm;
    private final int lVn;
    private final int lVo;
    private final long lVp;

    public ciL(int n, int n2, int n3, long l) {
        this.lVm = n;
        this.lVn = n2;
        this.lVo = n3;
        this.lVp = l;
    }

    @Override
    public byte[] aVX() {
        int n = 20;
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putInt(this.lVm);
        byteBuffer.putInt(this.lVn);
        byteBuffer.putInt(this.lVo);
        byteBuffer.putLong(this.lVp);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12309;
    }
}

