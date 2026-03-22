/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from Ut
 */
public abstract class ut_0
extends GregorianCalendar
implements uy_0,
Runnable {
    private static final Logger bvn = Logger.getLogger(ut_0.class);
    private static final boolean bvo = false;
    protected final us_0 bvp = new us_0();
    private final List<Uu> bvq = new ArrayList<Uu>();
    private final List<Uu> bvr = new ArrayList<Uu>();
    private final List<uh_0> bvs = new ArrayList<uh_0>();
    private final int bvt;
    private final int bvu;
    private uw_0 bvv;
    private long bvw;
    private long bvx;
    protected boolean bvy;

    protected ut_0(int n, int n2) {
        super(uw_0.bvG);
        this.bvt = n;
        this.bvu = n2;
    }

    public abstract float bjf();

    @Override
    public void run() {
        if (this.bvy) {
            this.fl(this.bjg());
            this.bjk();
            this.bvq.removeAll(this.bvr);
            this.bvr.clear();
            int n = this.bvq.size();
            for (int i = 0; i < n; ++i) {
                this.bvq.get(i).onCalendarEvent(Uv.bvz, this);
            }
        }
    }

    public void a(Uu uu) {
        if (!this.bvr.remove(uu) || !this.bvq.contains(uu)) {
            this.bvq.add(uu);
        }
    }

    public void a(uh_0 uh_02) {
        if (!this.bvs.contains(uh_02)) {
            this.bvs.add(uh_02);
        }
    }

    public azz_1<ug_0> bje() {
        return this.bvp.bje();
    }

    public ug_0 bjd() {
        return this.bvp.bjd();
    }

    public long bjg() {
        return (this.bjh() + this.bvw) * (long)this.bvu;
    }

    long bjh() {
        return (System.nanoTime() - this.bvx) / 1000000L;
    }

    public long bji() {
        return this.bjh() + this.bvw;
    }

    public void b(ug_0 ug_02) {
        this.bvp.b(ug_02);
        int n = this.bvq.size();
        for (int i = 0; i < n; ++i) {
            this.bvq.get(i).onCalendarEvent(Uv.bvC, this);
        }
    }

    public void k(Class<? extends ug_0> clazz) {
        azz_1<ug_0> azz_12 = this.bvp.bje();
        for (int i = azz_12.size() - 1; i >= 0; --i) {
            ug_0 ug_02 = (ug_0)azz_12.get(i);
            if (!ug_02.getClass().equals(clazz)) continue;
            this.b(ug_02);
        }
    }

    public void b(Uu uu) {
        if (!this.bvr.contains(uu)) {
            this.bvr.add(uu);
        }
    }

    public void fk(long l) {
        this.bvx = System.nanoTime();
        this.bvw = l;
        this.fl(l);
        this.bvy = true;
        int n = this.bvq.size();
        for (int i = 0; i < n; ++i) {
            this.bvq.get(i).onCalendarEvent(Uv.bvA, this);
        }
    }

    private void fl(long l) {
        this.setTimeInMillis(l);
        int n = this.bvt + this.get(1) - 1970;
        this.bvv = new uw_0(this.get(13), this.get(12), this.get(11), this.get(5), this.get(2) + 1, n);
    }

    public void fm(long l) {
        this.bjj();
        abg_2.bUP().h(this);
        abg_2.bUP().a((Runnable)this, l);
    }

    protected void bjj() {
        this.bjk();
    }

    public void a(ug_0 ug_02) {
        this.bvp.a(ug_02);
        int n = this.bvq.size();
        for (int i = 0; i < n; ++i) {
            this.bvq.get(i).onCalendarEvent(Uv.bvB, this);
        }
    }

    protected void bjk() {
        if (!this.bvy) {
            return;
        }
        ug_0 ug_02 = this.bvp.bjd();
        while (ug_02 != null && ug_02.bjc().k(this.bvv) < 0) {
            this.c(ug_02);
            this.d(ug_02);
            this.e(ug_02);
            this.bjl();
            ug_02 = this.bvp.bjd();
        }
    }

    private void c(ug_0 ug_02) {
        try {
            ug_02.a(this);
        }
        catch (Exception exception) {
            bvn.error((Object)"Exception levee lors de l'execution d'un evenement", (Throwable)exception);
        }
    }

    private void d(ug_0 ug_02) {
        int n = this.bvs.size();
        for (int i = 0; i < n; ++i) {
            try {
                this.bvs.get(i).f(ug_02);
                continue;
            }
            catch (Exception exception) {
                bvn.error((Object)"Exception levee lors de la notification d'un evenement aux observers", (Throwable)exception);
            }
        }
    }

    private void e(ug_0 ug_02) {
        uj_0 uj_02;
        this.bvp.b(ug_02);
        if (ug_02 instanceof uj_0 && (uj_02 = (uj_0)ug_02).bkb() != null && (uj_02.bka().bjv() || uj_02.bka().k(this.bvv) > 0)) {
            this.bvp.a(ug_02.c(uj_02.bkb()));
        }
    }

    private void bjl() {
        int n = this.bvq.size();
        for (int i = 0; i < n; ++i) {
            try {
                this.bvq.get(i).onCalendarEvent(Uv.bvD, this);
                continue;
            }
            catch (Exception exception) {
                bvn.error((Object)"Exception levee lors de la notification d'un evenement aux observers", (Throwable)exception);
            }
        }
    }

    @Override
    public ux_0 bjc() {
        return this.bvv;
    }

    public uw_0 bjm() {
        return new uw_0(this.bvv);
    }

    public boolean a(ux_0 ux_02) {
        return this.bvv.equals(ux_02);
    }

    public boolean b(ux_0 ux_02) {
        return this.bvv.g(ux_02);
    }

    public boolean c(ux_0 ux_02) {
        return this.bvv.h(ux_02);
    }

    public boolean d(ux_0 ux_02) {
        return this.bvv.i(ux_02);
    }

    public boolean e(ux_0 ux_02) {
        return this.bvv.j(ux_02);
    }

    public ub_0 bjn() {
        return ub_0.n(this.bvv);
    }

    public boolean bjo() {
        return this.bvy;
    }

    public uw_0 bjp() {
        ux_0 ux_02 = this.bjc();
        return uw_0.a(LocalDate.of(ux_02.bjI(), ux_02.bjG(), 1).plusMonths(1L));
    }

    public uw_0 bjq() {
        ux_0 ux_02 = this.bjc();
        return uw_0.a(LocalDateTime.of(ux_02.bjI(), ux_02.bjG(), ux_02.bjD(), 5, 0, 0).plusDays(1L));
    }

    public boolean bjr() {
        return true;
    }
}

