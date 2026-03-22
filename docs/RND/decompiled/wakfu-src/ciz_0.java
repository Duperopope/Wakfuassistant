/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ciz
 */
public final class ciz_0
extends nr_0 {
    private int lUW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lUW = byteBuffer.getInt();
        return false;
    }

    public int evr() {
        return this.lUW;
    }

    @Override
    public int d() {
        return 530;
    }

    @Override
    public String toString() {
        return "ConnectionQueuedMessage{m_queuePosition=" + this.lUW + "}";
    }
}

