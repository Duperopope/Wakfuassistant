/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYC
 */
public class eyc_2 {
    private long aXv;
    private long ePP;
    private long mln;
    private int asE;
    private String p;
    private long aZl;
    private boolean mnm;
    private byte rKf;
    private byte aZm;
    private short aZk;
    private int epQ;
    private long rKg;

    public eyc_2 rz(long l) {
        this.aXv = l;
        return this;
    }

    public eyc_2 Ts(int n) {
        this.asE = n;
        return this;
    }

    public eyc_2 rA(long l) {
        this.ePP = l;
        return this;
    }

    public eyc_2 rB(long l) {
        this.mln = l;
        return this;
    }

    public eyc_2 sw(String string) {
        this.p = string;
        return this;
    }

    public eyc_2 rC(long l) {
        this.aZl = l;
        return this;
    }

    public eyc_2 mN(boolean bl) {
        this.mnm = bl;
        return this;
    }

    public eyc_2 fS(byte by) {
        this.rKf = by;
        return this;
    }

    public eyc_2 fT(byte by) {
        this.aZm = by;
        return this;
    }

    public eyc_2 ew(short s) {
        this.aZk = s;
        return this;
    }

    public eyc_2 Tt(int n) {
        this.epQ = n;
        return this;
    }

    public eyc_2 rD(long l) {
        this.rKg = l;
        return this;
    }

    public long Sn() {
        return this.aXv;
    }

    public long emG() {
        return this.mln;
    }

    public String getName() {
        return this.p;
    }

    public ezz_1 fPQ() {
        eyd_2 eyd_22 = new eyd_2(this.aXv);
        eyd_22.rE(this.mln);
        eyd_22.setName(this.p);
        eyd_22.lS(this.asE);
        eyd_22.ij(this.aZl);
        eyd_22.jJ(this.mnm);
        eyd_22.fU(this.rKf);
        eyd_22.aQ(this.aZm);
        eyd_22.aT(this.aZk);
        eyd_22.Le(this.epQ);
        eyd_22.pi(this.ePP);
        eyd_22.rF(this.rKg);
        return eyd_22;
    }

    public String toString() {
        return "GuildMemberBuilder{m_id=" + this.aXv + ", m_rankId=" + this.mln + ", m_guildPoints=" + this.asE + ", m_name='" + this.p + "', m_xp=" + this.aZl + ", m_connected=" + this.mnm + ", m_smiley=" + this.rKf + ", m_sex=" + this.aZm + ", m_breedId=" + this.aZk + ", m_nationId=" + this.epQ + ", m_saveDate=" + this.rKg + "}";
    }
}

