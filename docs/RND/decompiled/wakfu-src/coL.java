/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coL
extends nr_0 {
    private long aDh;
    private int mdm;
    private long mdn;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mdm = byteBuffer.getInt();
        this.mdn = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13817;
    }

    public long KU() {
        return this.aDh;
    }

    public int ewB() {
        return this.mdm;
    }

    public long ewC() {
        return this.mdn;
    }
}

