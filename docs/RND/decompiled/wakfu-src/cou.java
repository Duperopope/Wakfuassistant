/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cou
extends ctY {
    private long mcW;
    private long aZj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.mcW = byteBuffer.getLong();
        this.aZj = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12843;
    }

    public long ewl() {
        return this.mcW;
    }

    public long fD() {
        return this.aZj;
    }
}

