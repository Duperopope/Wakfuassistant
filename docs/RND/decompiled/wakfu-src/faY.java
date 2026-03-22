/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class faY
extends faZ {
    private long jEK;
    private short ccg;
    private short cch;

    faY() {
    }

    public faY(long l, short s, short s2) {
        this.jEK = l;
        this.ccg = s;
        this.cch = s2;
    }

    @Override
    public fbb fRz() {
        return fbb.rQu;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.jEK);
        azg_12.aG(this.ccg);
        azg_12.aG(this.cch);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.jEK = byteBuffer.getLong();
        this.ccg = byteBuffer.getShort();
        this.cch = byteBuffer.getShort();
    }

    @Override
    public void a(faR faR2) {
        faR2.a(this);
    }

    @Override
    public void a(faS faS2) {
        faS2.b(this);
    }

    public long ZC() {
        return this.jEK;
    }

    public short bsM() {
        return this.ccg;
    }

    public short bsN() {
        return this.cch;
    }

    @Override
    public String toString() {
        return "BuildingMove{m_buildingUid=" + this.jEK + ", m_x=" + this.ccg + ", m_y=" + this.cch + "} " + super.toString();
    }
}

