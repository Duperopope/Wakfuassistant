/*
 * Decompiled with CFR 0.152.
 */
public final class cjz
extends nv_0 {
    private final long lWB;

    public cjz(long l) {
        this.lWB = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lWB);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13041;
    }

    @Override
    public String toString() {
        return "ItemizeCompanionRequestMessage{m_companionId=" + this.lWB + "}";
    }
}

