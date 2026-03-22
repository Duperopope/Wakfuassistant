/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctw
extends nr_0 {
    private long aDh;
    private int bfF;
    private boolean mim;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.bfF = byteBuffer.getInt();
        this.mim = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13325;
    }

    public long KU() {
        return this.aDh;
    }

    public int avZ() {
        return this.bfF;
    }

    public boolean eCi() {
        return this.mim;
    }
}

