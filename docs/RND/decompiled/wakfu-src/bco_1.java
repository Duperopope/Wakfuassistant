/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcO
 */
public class bco_1
extends bcw_1 {
    private final int hJv;

    public bco_1(int n) {
        this.hJv = n;
    }

    @Override
    public String getDescription() {
        return aum_0.cWf().a(141, (long)this.hJv, new Object[0]);
    }

    @Override
    public String dak() {
        return aum_0.cWf().b(141, (long)this.hJv, new Object[0]);
    }

    @Override
    protected long dbv() {
        return -1L;
    }

    @Override
    protected boolean daJ() {
        return bud.joo.SV(this.hJv) == ewx_1.rCT;
    }

    @Override
    protected boolean daI() {
        return bud.joo.SV(this.hJv) == ewx_1.rCU;
    }

    @Override
    protected boolean dbw() {
        return false;
    }

    @Override
    protected boolean dbx() {
        return false;
    }

    @Override
    protected boolean dby() {
        return false;
    }

    public void dbu() {
        fse_1.gFu().a((aef_2)this, "isCompleted", "isFailed");
    }

    public String toString() {
        return "FightChallengeGoalView{m_challengeId=" + this.hJv + "}";
    }
}

