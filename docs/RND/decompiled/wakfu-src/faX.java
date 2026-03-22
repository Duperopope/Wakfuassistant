/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class faX
extends faZ {
    private long jEK;
    private short rQi;
    private long rPz;

    faX() {
    }

    public faX(long l) {
        this.jEK = l;
    }

    @Override
    public fbb fRz() {
        return fbb.rQp;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.jEK);
        azg_12.gK(this.rPz);
        azg_12.aG(this.rQi);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.jEK = byteBuffer.getLong();
        this.rPz = byteBuffer.getLong();
        this.rQi = byteBuffer.getShort();
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

    public short fRB() {
        return this.rQi;
    }

    public long fRi() {
        return this.rPz;
    }

    public void rX(long l) {
        this.rPz = l;
    }

    public void eC(short s) {
        this.rQi = s;
    }

    @Override
    public String toString() {
        return "BuildingEvolve{m_buildingUid=" + this.jEK + ", m_nextBuildingRefId=" + this.rQi + ", m_creationDate=" + this.rPz + "} " + super.toString();
    }
}

