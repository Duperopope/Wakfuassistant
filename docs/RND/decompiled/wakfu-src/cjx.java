/*
 * Decompiled with CFR 0.152.
 */
public final class cjx
extends nv_0 {
    private final long lWz;

    public cjx(long l) {
        this.lWz = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lWz);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12928;
    }

    @Override
    public String toString() {
        return "AddHeroToGroupRequestMessage{m_heroId=" + this.lWz + "}";
    }
}

