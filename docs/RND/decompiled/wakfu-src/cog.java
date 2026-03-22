/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cog
extends nr_0 {
    protected static final Logger mcC = Logger.getLogger(cog.class);
    protected static final boolean mcD = false;
    private boolean hXv;
    private int mcE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        this.hXv = by == 1;
        this.mcE = byteBuffer.remaining() > 0 ? byteBuffer.getInt() : -1;
        return true;
    }

    @Override
    public int d() {
        return 12021;
    }

    public boolean aGv() {
        return this.hXv;
    }

    public int evQ() {
        return this.mcE;
    }
}

