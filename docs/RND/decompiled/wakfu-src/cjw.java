/*
 * Decompiled with CFR 0.152.
 */
public final class cjw
extends nv_0 {
    private final long lWy;

    public cjw(long l) {
        this.lWy = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lWy);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12762;
    }

    @Override
    public String toString() {
        return "AddCompanionToGroupRequestMessage{m_companionId=" + this.lWy + "}";
    }
}

