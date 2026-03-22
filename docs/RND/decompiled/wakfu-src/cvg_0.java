/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvg
 */
public class cvg_0
extends nr_0 {
    private long aDh;
    private fpu_0 mjQ;
    private boolean mjR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mjQ = fpu_0.YK(byteBuffer.get());
        this.mjR = byteBuffer.get() == 1;
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public fpu_0 dkC() {
        return this.mjQ;
    }

    public boolean aJG() {
        return this.mjR;
    }

    @Override
    public int d() {
        return 12298;
    }
}

