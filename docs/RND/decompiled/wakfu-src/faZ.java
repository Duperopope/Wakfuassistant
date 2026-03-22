/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class faZ {
    private long rQj;
    private boolean rQk;
    private long aZQ;

    public abstract fbb fRz();

    public abstract void a(faR var1);

    public abstract void a(faS var1);

    public final byte[] fRC() {
        azg_1 azg_12 = new azg_1();
        this.g(azg_12);
        return azg_12.bTe();
    }

    protected void g(azg_1 azg_12) {
        azg_12.gK(this.rQj);
        azg_12.aF((byte)(this.rQk ? 1 : 0));
    }

    public final void fW(ByteBuffer byteBuffer) {
        this.fV(byteBuffer);
    }

    protected void fV(ByteBuffer byteBuffer) {
        this.rQj = byteBuffer.getLong();
        this.rQk = byteBuffer.get() == 1;
    }

    public long fRD() {
        return this.rQj;
    }

    public void rY(long l) {
        this.rQj = l;
    }

    public boolean eoe() {
        return this.rQk;
    }

    public void mQ(boolean bl) {
        this.rQk = bl;
    }

    public long aXb() {
        return this.aZQ;
    }

    public void mY(long l) {
        this.aZQ = l;
    }

    public String toString() {
        return "HavenWorldAction{m_actionUID=" + this.rQj + ", m_isAdmin=" + this.rQk + ", m_playerId=" + this.aZQ + "}";
    }
}

