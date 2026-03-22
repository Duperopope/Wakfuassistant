/*
 * Decompiled with CFR 0.152.
 */
public final class ckn
extends nv_0 {
    private long aDh;
    private acd_1 bio;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDh);
        azg_12.vC(this.bio.getX());
        azg_12.vC(this.bio.getY());
        azg_12.aG(this.bio.bdi());
        return this.a((byte)3, azg_12.bTe());
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void b(acd_1 acd_12) {
        this.bio = acd_12;
    }

    @Override
    public int d() {
        return 12858;
    }

    @Override
    public String toString() {
        return "FightCompanionPlacementRequestMessage{m_characterId=" + this.aDh + ", m_position=" + String.valueOf(this.bio) + "}";
    }
}

