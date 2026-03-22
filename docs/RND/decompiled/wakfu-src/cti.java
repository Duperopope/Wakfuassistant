/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cti
extends nr_0 {
    private int euz;
    private int mhU;
    private ux_0 mhV;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.euz = byteBuffer.getInt();
        this.mhU = byteBuffer.getInt();
        this.mhV = uw_0.fn(byteBuffer.getLong());
        this.aDh = byteBuffer.getLong();
        return true;
    }

    public int eBS() {
        return this.mhU;
    }

    public ux_0 eBT() {
        return this.mhV;
    }

    public int cyj() {
        return this.euz;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 13808;
    }
}

