/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coo
extends ctY {
    private long mcP;
    private long lVb;
    private int mcQ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.huJ = byteBuffer.getLong();
        this.mcP = byteBuffer.getLong();
        this.lVb = byteBuffer.getLong();
        this.mcQ = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13458;
    }

    public int ewd() {
        return this.mcQ;
    }

    public long ewe() {
        return this.mcP;
    }

    public long ewf() {
        return this.lVb;
    }
}

