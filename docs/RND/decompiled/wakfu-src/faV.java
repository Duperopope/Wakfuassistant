/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class faV
extends faZ {
    private long jEK;

    faV() {
    }

    public faV(long l) {
        this.jEK = l;
    }

    @Override
    public fbb fRz() {
        return fbb.rQo;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.jEK);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.jEK = byteBuffer.getLong();
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

    @Override
    public String toString() {
        return "BuildingDelete{m_buildingUid=" + this.jEK + "} " + super.toString();
    }
}

