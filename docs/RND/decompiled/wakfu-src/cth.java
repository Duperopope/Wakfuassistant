/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cth
extends nr_0 {
    private int euz;
    private ux_0 mhT;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.euz = byteBuffer.getInt();
        this.mhT = uw_0.fn(byteBuffer.getLong());
        this.aDh = byteBuffer.getLong();
        return true;
    }

    public ux_0 eBR() {
        return this.mhT;
    }

    public int cyj() {
        return this.euz;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 13212;
    }
}

