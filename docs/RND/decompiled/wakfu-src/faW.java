/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class faW
extends faZ {
    private long jEK;
    private int asA;

    faW() {
    }

    public faW(long l, int n) {
        this.jEK = l;
        this.asA = n;
    }

    @Override
    public fbb fRz() {
        return fbb.rQq;
    }

    @Override
    protected void g(azg_1 azg_12) {
        super.g(azg_12);
        azg_12.gK(this.jEK);
        azg_12.vC(this.asA);
    }

    @Override
    protected void fV(ByteBuffer byteBuffer) {
        super.fV(byteBuffer);
        this.jEK = byteBuffer.getLong();
        this.asA = byteBuffer.getInt();
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

    public int azv() {
        return this.asA;
    }

    public void lP(int n) {
        this.asA = n;
    }

    @Override
    public String toString() {
        return "BuildingEquip{m_buildingUid=" + this.jEK + ", m_itemId=" + this.asA + "} " + super.toString();
    }
}

