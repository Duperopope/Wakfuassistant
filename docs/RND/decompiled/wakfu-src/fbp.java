/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class fbp
extends faZ {
    private long rRl;

    public fbp() {
    }

    public fbp(long l) {
        this.rRl = l;
    }

    @Override
    public fbb fRz() {
        return fbb.rQt;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.rRl);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.rRl = byteBuffer.getLong();
    }

    @Override
    public void a(faR faR2) {
        faR2.a(this);
    }

    @Override
    public void a(faS faS2) {
        faS2.b(this);
    }

    public long fRJ() {
        return this.rRl;
    }

    @Override
    public String toString() {
        return "InteractiveElementDelete{m_elementUid=" + this.rRl + "} " + super.toString();
    }
}

