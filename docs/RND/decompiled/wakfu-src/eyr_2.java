/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYR
 */
public final class eyr_2 {
    private final int rLx;
    private final ua_0 rLy;
    private final ua_0 rLz;
    private final int rLA;
    private final eyv_2 rLB;
    private final eyo_2 rLC;

    public eyr_2(int n, long l, long l2, int n2, eyv_2 eyv_22, eyo_2 eyo_22) {
        this.rLx = n;
        this.rLy = uz_0.fp(l);
        this.rLz = uz_0.fp(l2);
        this.rLA = n2;
        this.rLB = eyv_22;
        this.rLC = eyo_22;
    }

    public int d() {
        return this.rLx;
    }

    public ua_0 fQp() {
        return this.rLy;
    }

    public boolean fQq() {
        return this.fQp().aYI();
    }

    public ua_0 fQr() {
        return this.rLz;
    }

    public boolean Ty() {
        return this.fQr().aYI();
    }

    public eyv_2 dJB() {
        return this.rLB;
    }

    public int cqq() {
        return this.rLA;
    }

    public eyo_2 fQs() {
        return this.rLC;
    }

    public String toString() {
        return "GuildBonusDefinition{m_id=" + this.rLx + ", m_learningDuration=" + String.valueOf(this.rLy) + ", m_duration=" + String.valueOf(this.rLz) + ", m_cost=" + this.rLA + ", m_effect=" + String.valueOf(this.rLB) + ", m_type=" + String.valueOf((Object)this.rLC) + "}";
    }
}

