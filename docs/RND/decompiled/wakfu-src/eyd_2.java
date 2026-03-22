/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from eYD
 */
final class eyd_2
implements ezz_1 {
    private final ArrayList<faa> rKh = new ArrayList();
    private final long rKi;
    private long ePP;
    private long rKj;
    private int asE;
    private String p;
    private long aZl;
    private boolean mnm;
    private byte rKf;
    private int epQ;
    private byte aZm;
    private short aZk;
    private long rKg;
    private List<Mv> ezD;
    private vb_0 ezE = vb_0.bIT;

    eyd_2(long l) {
        this.rKi = l;
    }

    @Override
    public long Sn() {
        return this.rKi;
    }

    @Override
    public long Xi() {
        return this.ePP;
    }

    @Override
    public int Xk() {
        return this.asE;
    }

    @Override
    public long Xm() {
        return this.rKj;
    }

    @Override
    public long pf() {
        return this.aZl;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public boolean bSr() {
        return this.mnm;
    }

    @Override
    public byte dJY() {
        return this.rKf;
    }

    @Override
    public byte aWO() {
        return this.aZm;
    }

    @Override
    public short aWP() {
        return this.aZk;
    }

    @Override
    public int Xt() {
        return this.epQ;
    }

    @Override
    public long Xv() {
        return this.rKg;
    }

    @Override
    public List<Mv> dxI() {
        return this.ezD;
    }

    @Override
    public byte fdX() {
        return Mv.aJ(this.ezD);
    }

    @Override
    public vb_0 dxH() {
        return this.ezE;
    }

    @Override
    public byte fPR() {
        if (this.ezE == null) {
            return (byte)vb_0.bIT.d();
        }
        return (byte)this.ezE.d();
    }

    void lS(int n) {
        this.asE = n;
        this.rKh.forEach(faa2 -> faa2.j(this));
    }

    void rE(long l) {
        long l2 = this.rKj;
        this.rKj = l;
        this.rKh.forEach(faa2 -> faa2.a(this, l2));
    }

    void setName(String string) {
        this.p = string;
        this.rKh.forEach(faa2 -> faa2.l(this));
    }

    void ij(long l) {
        this.aZl = l;
        this.rKh.forEach(faa2 -> faa2.i(this));
    }

    void jJ(boolean bl) {
        this.mnm = bl;
        this.rKh.forEach(faa2 -> faa2.s(this));
    }

    void fU(byte by) {
        this.rKf = by;
        this.rKh.forEach(faa2 -> faa2.k(this));
    }

    void aQ(byte by) {
        this.aZm = by;
        this.rKh.forEach(faa2 -> faa2.m(this));
    }

    void aT(short s) {
        this.aZk = s;
        this.rKh.forEach(faa2 -> faa2.n(this));
    }

    void Le(int n) {
        this.epQ = n;
        this.rKh.forEach(faa2 -> faa2.o(this));
    }

    void pi(long l) {
        this.ePP = l;
        this.rKh.forEach(faa2 -> faa2.r(this));
    }

    public void rF(long l) {
        this.rKg = l;
    }

    public void l(List<Mv> list) {
        this.ezD = list;
        this.rKh.forEach(faa2 -> faa2.p(this));
    }

    public void b(vb_0 vb_02) {
        this.ezE = vb_02;
        this.rKh.forEach(faa2 -> faa2.q(this));
    }

    @Override
    public boolean a(faa faa2) {
        return !this.rKh.contains(faa2) && this.rKh.add(faa2);
    }

    @Override
    public boolean b(faa faa2) {
        return this.rKh.remove(faa2);
    }

    public String toString() {
        return "GuildMemberModel{m_listeners=" + String.valueOf(this.rKh) + ", m_id=" + this.rKi + ", m_rank=" + this.rKj + ", m_guildPoints=" + this.asE + ", m_name='" + this.p + "', m_xp=" + this.aZl + ", m_connected=" + this.mnm + ", m_smiley=" + this.rKf + ", m_nationId=" + this.epQ + ", m_sex=" + this.aZm + ", m_breedId=" + this.aZk + ", m_saveDate=" + this.rKg + ", m_languages=" + String.valueOf(this.ezD == null ? Character.valueOf('?') : (Serializable)((Object)this.ezD.stream().map(Mv::aUP).collect(Collectors.joining(";")))) + ", m_accountCommunity=" + String.valueOf(this.ezE == null ? Character.valueOf('?') : this.ezE.getName()) + "}";
    }
}

