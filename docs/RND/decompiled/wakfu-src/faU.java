/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class faU
extends faZ {
    private long jEK;
    private long rPz;
    private short rQh;
    private short ccg;
    private short cch;

    faU() {
    }

    public faU(short s, short s2, short s3) {
        this.rQh = s;
        this.ccg = s2;
        this.cch = s3;
    }

    @Override
    public fbb fRz() {
        return fbb.rQn;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.jEK);
        azg_12.gK(this.rPz);
        azg_12.aG(this.rQh);
        azg_12.aG(this.ccg);
        azg_12.aG(this.cch);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.jEK = byteBuffer.getLong();
        this.rPz = byteBuffer.getLong();
        this.rQh = byteBuffer.getShort();
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

    public void rW(long l) {
        this.jEK = l;
    }

    public long fRi() {
        return this.rPz;
    }

    public void rX(long l) {
        this.rPz = l;
    }

    public short fRA() {
        return this.rQh;
    }

    public short bsM() {
        return this.ccg;
    }

    public short bsN() {
        return this.cch;
    }

    @Override
    public String toString() {
        return "BuildingCreate{m_buildingRefId=" + this.rQh + ", m_buildingUid=" + this.jEK + ", m_creationDate=" + this.rPz + ", m_x=" + this.ccg + ", m_y=" + this.cch + "} " + super.toString();
    }
}

