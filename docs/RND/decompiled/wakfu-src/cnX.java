/*
 * Decompiled with CFR 0.152.
 */
public class cnX
extends nv_0 {
    private final int mcq;
    private final long mcr;
    private final int mcs;
    private final int mct;

    public cnX(long l, int n, int n2, int n3) {
        this.mcq = n;
        this.mcr = l;
        this.mcs = n2;
        this.mct = n3;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.mcq);
        azg_12.gK(this.mcr);
        azg_12.vC(this.mcs);
        azg_12.vC(this.mct);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12509;
    }

    @Override
    public String toString() {
        return "AddSpellToDeckRequestMessage{m_spellId=" + this.mcq + ", m_playerId=" + this.mcr + ", m_deckIndex=" + this.mcs + ", m_slotIndex=" + this.mct + "}";
    }
}

