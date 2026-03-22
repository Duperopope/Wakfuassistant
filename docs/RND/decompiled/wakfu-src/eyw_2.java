/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYw
 */
public class eyw_2 {
    private int egM;
    private final uw_0 rJO = new uw_0(uw_0.bvJ);
    private final uw_0 rJP = new uw_0(uw_0.bvJ);

    public eyw_2 Tk(int n) {
        this.egM = n;
        return this;
    }

    public eyw_2 R(ux_0 ux_02) {
        this.rJO.f(ux_02);
        return this;
    }

    public eyw_2 S(ux_0 ux_02) {
        this.rJP.f(ux_02);
        return this;
    }

    public ezv_1 fPI() {
        eyx_2 eyx_22 = new eyx_2(this.egM);
        eyx_22.T(this.rJO);
        eyx_22.U(this.rJP);
        return eyx_22;
    }

    public String toString() {
        return "GuildBonusBuilder{m_bonusId=" + this.egM + ", m_buyDate=" + String.valueOf(this.rJO) + ", m_activationDate=" + String.valueOf(this.rJP) + "}";
    }
}

