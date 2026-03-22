/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWW
 */
public class eww_1 {
    private final int rCO;
    private final ang_2 rCP;
    private final int rCQ;
    private final int rCR;

    public eww_1(int n, ang_2 ang_22, int n2, short s) {
        this.rCO = n;
        this.rCP = ang_22;
        this.rCQ = n2;
        this.rCR = s;
    }

    public int d() {
        return this.rCO;
    }

    public ang_2 bdo() {
        return this.rCP;
    }

    public int fOs() {
        return this.rCQ;
    }

    public int fOr() {
        return this.rCR;
    }

    public String toString() {
        return "FightChallengeReward{m_id=" + this.rCO + ", m_criterion=" + String.valueOf(this.rCP) + ", m_xpLevel=" + this.rCQ + ", m_dropLevel=" + this.rCR + "}";
    }
}

