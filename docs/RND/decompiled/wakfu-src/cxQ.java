/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxQ
extends nr_0 {
    private byte kIf;
    private long lKU;
    private uw_0 bvv;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        this.lKU = byteBuffer.getLong();
        this.bvv = uw_0.fn(byteBuffer.getLong());
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public long esw() {
        return this.lKU;
    }

    public ux_0 bjc() {
        return this.bvv;
    }

    @Override
    public int d() {
        return 1031;
    }
}

