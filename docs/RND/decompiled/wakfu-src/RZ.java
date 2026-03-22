/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class RZ<ContentType extends RT, User extends RQ<ContentType>> {
    protected static final Logger bno = Logger.getLogger(RZ.class);
    protected User bnp;
    protected User bnq;
    protected RY bnr;
    protected final long bns;
    protected final long bnt;
    protected final long bnu;

    protected RZ(long l, User User2, User User3) {
        this.bns = l;
        this.bnt = User2.Sn();
        this.bnu = User3.Sn();
        this.a(User2, User3);
    }

    public long Sn() {
        return this.bns;
    }

    public long bfl() {
        return this.bnt;
    }

    public long Qy() {
        return this.bnu;
    }

    protected void a(User User2, User User3) {
        if (User2 == null) {
            throw new NullPointerException("[Trade] First user of an ItemExchanger can't be null");
        }
        if (User3 == null) {
            throw new NullPointerException("[Trade] Second user of an ItemExchanger can't be null");
        }
        bno.info((Object)("[Trade] Starting an exchange between " + User2.getName() + " (id=" + User2.Sn() + ") and " + User3.getName() + " (id=" + User3.Sn() + ")"));
        this.bnr = RY.bnj;
        this.bnp = User2;
        this.bnp.bj(false);
        this.bnq = User3;
        this.bnq.bj(false);
    }

    public void start() {
        if (this.bnr != RY.bnj) {
            throw new IllegalStateException("[Trade] Only an Initializing exchanger can be started. Current State: " + String.valueOf((Object)this.bnr));
        }
        if (!Sb.bfy().a(this)) {
            this.bnr = RY.bnm;
            this.a(this.bnp, (St)Sq.a(this, Ss.boq));
            this.c(this.bnp);
            this.c(this.bnq);
            return;
        }
        if (this.bfs()) {
            this.bfo();
        } else {
            this.bfp();
        }
    }

    protected abstract boolean b(User var1);

    protected abstract void c(User var1);

    protected boolean d(RQ rQ) {
        return rQ == this.bnp || rQ == this.bnq;
    }

    public User bfm() {
        return this.bnp;
    }

    public User bfn() {
        return this.bnq;
    }

    @Nullable
    public User e(User User2) {
        if (User2 == this.bnp) {
            return this.bnq;
        }
        if (User2 == this.bnq) {
            return this.bnp;
        }
        return null;
    }

    private void bfo() {
        this.bnr = RY.bnk;
        this.a(this.bnp, St.a(this, Sv.boE));
        this.a(this.bnq, St.a(this, Sv.boD));
    }

    private void bfp() {
        if (!this.b(this.bnp)) {
            this.bnr = RY.bnm;
            this.a(this.bnp, (St)Sq.a(this, Ss.bor));
            this.a(this.bnq, (St)Sq.a(this, Ss.boq));
            Sb.bfy().b(this);
            return;
        }
        if (!this.b(this.bnq)) {
            this.bnr = RY.bnm;
            this.a(this.bnp, (St)Sq.a(this, Ss.boq));
            this.a(this.bnq, (St)Sq.a(this, Ss.bor));
            this.c(this.bnp);
            Sb.bfy().b(this);
            return;
        }
        this.bnr = RY.bnl;
        this.b(St.a(this, Sv.boF));
    }

    protected void bfq() {
        bno.info((Object)("[Trade] Ending the exchange between " + this.bnp.getName() + " (id=" + this.bnp.Sn() + ") and " + this.bnq.getName() + " (id=" + this.bnq.Sn() + ")"));
        this.bnr = RY.bnm;
        this.bnp.clear();
        this.bnq.clear();
        Sb.bfy().b(this);
    }

    @Nullable
    public User dP(long l) {
        if (l == this.bnp.Sn()) {
            return this.bnp;
        }
        if (l == this.bnq.Sn()) {
            return this.bnq;
        }
        return null;
    }

    protected void b(St st) {
        this.a(st, true);
    }

    protected void a(St st, boolean bl) {
        if (this.bnp != null) {
            this.bnp.a(st);
        }
        if (this.bnq != null) {
            this.bnq.a(st);
        }
        if (bl) {
            try {
                st.aZp();
            }
            catch (Exception exception) {
                bno.error((Object)"[Trade] Exception lors de la notification d'un \u00e9v\u00e8nement aux utilisateurs d'un ItemExchanger: ", (Throwable)exception);
            }
        }
    }

    protected void a(long l, St st) {
        this.a(l, st, true);
    }

    protected void a(User User2, St st) {
        this.a(User2, st, true);
    }

    protected void a(long l, St st, boolean bl) {
        User User2 = this.dP(l);
        if (User2 == null) {
            bno.error((Object)("[Trade] Impossible d'envoyer un \u00e9v\u00e8nement \u00e0 l'utilisateur d'id " + l));
            return;
        }
        this.a(User2, st, bl);
    }

    protected void a(User User2, St st, boolean bl) {
        if (User2 != null) {
            User2.a(st);
        }
        if (bl) {
            try {
                st.aZp();
            }
            catch (Exception exception) {
                bno.error((Object)"[Trade] Exception lors de la notification d'un \u00e9v\u00e8nement \u00e0 un user d'un ItemExchanger: ", (Throwable)exception);
            }
        }
    }

    public RY bfr() {
        return this.bnr;
    }

    protected abstract boolean bfs();

    protected abstract boolean bft();

    public void dQ(long l) {
        this.f(this.dP(l));
    }

    public void f(User User2) {
        if (!this.d((RQ)User2)) {
            return;
        }
        this.bfp();
    }

    public void a(User User2, Ss ss) {
        if (!this.d((RQ)User2)) {
            return;
        }
        User User3 = this.e(User2);
        assert (User3 != null);
        Sq sq = Sq.a(this, Ss.bor);
        sq.dX(User2.Sn());
        Sq sq2 = Sq.a(this, ss);
        sq2.dX(User2.Sn());
        this.bnr = RY.bnm;
        this.a(User3.Sn(), (St)sq2);
        this.a(User2.Sn(), (St)sq);
        this.bfq();
    }

    public void dR(long l) {
        this.g(this.dP(l));
    }

    public void g(User User2) {
        if (!this.d((RQ)User2)) {
            bno.warn((Object)("[Trade] Impossible d'annuler l'\u00e9change, " + User2.getName() + " n'est pas concern\u00e9"));
            return;
        }
        this.bnr = RY.bnm;
        this.a(this.bnp, (St)Sq.a(this, Ss.boq));
        this.a(this.bnq, (St)Sq.a(this, Ss.bor));
        this.bfq();
    }

    public void bfu() {
        this.bnr = RY.bnm;
        this.a(this.bnp, (St)Sq.a(this, Ss.box));
        this.a(this.bnq, (St)Sq.a(this, Ss.box));
        this.bfq();
    }

    public void h(User User2) {
        if (!this.d((RQ)User2)) {
            bno.error((Object)("[Trade] Impossible de retirer l'utilisateur (\"" + User2.getName() + "\", " + User2.Sn() + ") de l'ExchangerUser : Il n'est pas concern\u00e9 par cet \u00e9change (\"" + this.bnp.getName() + "\", " + this.bnp.Sn() + "/\"" + this.bnq.getName() + "\", " + this.bnq.Sn() + ")."));
            return;
        }
        User User3 = this.e(User2);
        this.bnr = RY.bnm;
        this.a(User2, (St)Sq.a(this, Ss.bou));
        this.a(User3, (St)Sq.a(this, Ss.bot));
        this.bfq();
    }

    public void i(User User2) {
        if (!this.d((RQ)User2)) {
            bno.error((Object)("[Trade] Impossible de finir l'\u00e9change " + String.valueOf(User2) + " de l'ExchangerUser n'est pas concern\u00e9 par cet \u00e9change"));
            return;
        }
        if (this.bfw()) {
            this.bfx();
            this.bnr = RY.bnm;
            this.b(Sq.a(this, Ss.bov));
            this.bfq();
        } else {
            this.h(User2);
        }
    }

    public void c(long l, boolean bl) {
        this.a(this.dP(l), bl);
    }

    public void a(User User2, boolean bl) {
        if (!this.d((RQ)User2)) {
            bno.error((Object)("[Trade] Impossible de continuer l'\u00e9change " + String.valueOf(User2) + " de l'ExchangerUser n'est pas concern\u00e9 par cet \u00e9change"));
            return;
        }
        if (this.bft()) {
            User2.bj(bl);
        }
    }

    public void a(long l, ContentType ContentType, short s) {
        this.a(this.dP(l), ContentType, s);
    }

    public void a(long l, List<RT> list) {
        User User2 = this.dP(l);
        if (User2 == null) {
            return;
        }
        for (RT rT : list) {
            this.a(User2, rT, rT.bfd(), true);
        }
        this.a(User2, list);
    }

    public void a(User User2, List<RT> list) {
        this.b(Sw.a(this, Sy.boO, User2.Sn(), list));
    }

    public void a(User User2, ContentType ContentType, short s) {
        this.a(User2, ContentType, s, false);
    }

    public abstract void a(User var1, ContentType var2, short var3, boolean var4);

    public void b(long l, ContentType ContentType, short s) {
        this.b(this.dP(l), ContentType, s);
    }

    public void b(long l, List<RT> list) {
        User User2 = this.dP(l);
        if (User2 == null) {
            return;
        }
        ArrayList<RT> arrayList = new ArrayList<RT>();
        for (RT rT : list) {
            Object ContentType = User2.dE(rT.LV());
            if (ContentType == null) continue;
            this.b(User2, rT, ContentType.bfd(), true);
            RT rT2 = rT.bfg();
            rT2.ak(ContentType.bfd());
            arrayList.add(rT2);
        }
        this.b(this.dP(l), arrayList);
    }

    public void b(User User2, List<RT> list) {
        this.b(Sw.a(this, Sy.boP, User2.Sn(), list));
    }

    public void b(User User2, ContentType ContentType, short s) {
        this.b(User2, ContentType, s, false);
    }

    public void b(User User2, ContentType ContentType, short s, boolean bl) {
        if (!this.d((RQ)User2)) {
            bno.error((Object)"[Trade] On essaye de retirer un objet de la liste d'un utilisateur non valide");
            return;
        }
        if (s < 1) {
            bno.error((Object)"[Trade] On essaye de retirer une quantit\u00e9 n\u00e9gative ou nulle d'objets \u00e0 l'\u00e9change");
            return;
        }
        this.bnp.bj(false);
        this.bnq.bj(false);
        Object ContentType2 = User2.dE(ContentType.LV());
        if (ContentType2 == null) {
            bno.error((Object)"[Trade] On essaye de retirer un objet de l'\u00e9change qui n'existe pas");
            return;
        }
        if (ContentType2.bfd() < s) {
            bno.error((Object)"[Trade] On essaie de retirer plus d'objets qu'il n'y en a dans l'\u00e9change");
        } else if (ContentType2.bfd() == s) {
            ContentType2.aZp();
            User2.dG(ContentType.LV());
        } else {
            ContentType2.al(-s);
        }
        if (!bl) {
            this.b(Sw.a(this, Sy.boS, User2.Sn(), ContentType, s));
        }
    }

    protected boolean bfv() {
        return true;
    }

    protected abstract boolean bfw();

    protected abstract void bfx();

    public void dS(long l) {
        this.j(this.dP(l));
    }

    public void j(User User2) {
        if (!this.d((RQ)User2)) {
            bno.warn((Object)("[Trade] Impossible d'annuler l'\u00e9change, " + User2.getName() + " n'est pas concern\u00e9"));
            return;
        }
        switch (this.bnr) {
            case bnl: {
                this.h(User2);
                break;
            }
            case bnk: {
                this.a(User2, Ss.bos);
            }
        }
    }

    public abstract boolean dT(long var1);
}

