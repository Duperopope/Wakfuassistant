/*
 * Decompiled with CFR 0.152.
 */
public final class ezi
extends Vc {
    long ppn = -1L;
    public final Va<ezi> ppo = new ezj(this, this, 8);

    public ezi(long l) {
        super(l);
    }

    public long fmo() {
        return this.ppn;
    }

    @Override
    public void clear() {
        super.clear();
        this.ppn = -1L;
    }

    public void ps(long l) {
        this.ppn = l;
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.ppo};
    }

    @Override
    public String toString() {
        return "WakfuPartyGlobalData{m_leaderId=" + this.ppn + ", LEADER=" + String.valueOf(this.ppo) + "}";
    }
}

