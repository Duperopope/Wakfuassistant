/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fbr
extends faZ {
    private short mgx;
    private short mgy;

    fbr() {
    }

    public fbr(short s, short s2) {
        this.mgx = s;
        this.mgy = s2;
    }

    @Override
    public fbb fRz() {
        return fbb.rQl;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.aG(this.mgx);
        azg_12.aG(this.mgy);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.mgx = byteBuffer.getShort();
        this.mgy = byteBuffer.getShort();
    }

    @Override
    public void a(faR faR2) {
        faR2.a(this);
    }

    @Override
    public void a(faS faS2) {
        faS2.b(this);
    }

    public short eAo() {
        return this.mgx;
    }

    public short eAp() {
        return this.mgy;
    }

    @Override
    public String toString() {
        return "TopologyCreate{m_partitionX=" + this.mgx + ", m_partitionY=" + this.mgy + "} " + super.toString();
    }
}

