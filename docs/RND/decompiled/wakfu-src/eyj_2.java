/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eYJ
 */
class eyj_2
implements fab {
    private final ArrayList<fac> rLk = new ArrayList();
    private final long rLl;
    private String p;
    private long mlq;
    private short bok;

    eyj_2(long l) {
        this.rLl = l;
    }

    @Override
    public long Sn() {
        return this.rLl;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public long fQk() {
        return this.mlq;
    }

    @Override
    public short bfE() {
        return this.bok;
    }

    @Override
    public boolean K(TObjectProcedure<eyh_2> tObjectProcedure) {
        for (eyh_2 eyh_22 : eyh_2.values()) {
            if (!this.b(eyh_22) || tObjectProcedure.execute((Object)eyh_22)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(eyh_2 eyh_22) {
        return this.b(eyh_22, (short)-1);
    }

    @Override
    public boolean rM(long l) {
        return (this.mlq & l) == l;
    }

    @Override
    public boolean b(eyh_2 eyh_22, short s) {
        int n = 1 << eyh_22.rLh;
        return (s == -1 || eyh_22.X(this.bok, s)) && (this.mlq & (long)n) == (long)n;
    }

    public void setName(String string) {
        this.p = string;
        this.fQl();
    }

    public void rN(long l) {
        this.mlq = l;
        this.fQl();
    }

    @Override
    public void cX(short s) {
        this.bok = s;
        this.fQl();
    }

    private void fQl() {
        int n = this.rLk.size();
        for (int i = 0; i < n; ++i) {
            this.rLk.get(i).e(this);
        }
    }

    @Override
    public boolean a(fac fac2) {
        return !this.rLk.contains(fac2) && this.rLk.add(fac2);
    }

    @Override
    public boolean b(fac fac2) {
        return this.rLk.remove(fac2);
    }

    public String toString() {
        return "GuildRankModel{m_id=" + this.rLl + ", m_name='" + this.p + "', m_authorisations=" + this.mlq + "}";
    }
}

