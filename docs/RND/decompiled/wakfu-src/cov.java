/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cov
extends ctY {
    private long kqc;
    private long mcP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.huJ = byteBuffer.getLong();
        this.kqc = byteBuffer.getLong();
        this.mcP = byteBuffer.getLong();
        return true;
    }

    public long ewe() {
        return this.mcP;
    }

    @Override
    public int d() {
        return 13914;
    }

    public long ebU() {
        return this.kqc;
    }

    @Override
    public String toString() {
        return "StartCollectOnInteractiveElementMessage{m_interactifElementId=" + this.kqc + ", m_collectTime=" + this.mcP + "}";
    }
}

