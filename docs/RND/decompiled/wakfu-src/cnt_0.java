/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cnT
 */
public final class cnt_0
extends nv_0 {
    private final long mcn;

    public cnt_0(long l) {
        this.mcn = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.mcn);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13477;
    }

    @Override
    public String toString() {
        return "ChallengeInformationRequestMessage{m_characterId=" + this.mcn + "}";
    }
}

