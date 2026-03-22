/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ciI
extends nv_0 {
    protected static final Logger lVc = Logger.getLogger(ciI.class);
    protected static final boolean lVd = false;
    private final int lVe;
    private final int lVf;
    private final int lVg;

    public ciI(int n, int n2, int n3) {
        this.lVe = n;
        this.lVf = n2;
        this.lVg = n3;
    }

    @Override
    public byte[] aVX() {
        int n = 12;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.lVe);
        byteBuffer.putInt(this.lVf);
        byteBuffer.putInt(this.lVg);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13259;
    }
}

