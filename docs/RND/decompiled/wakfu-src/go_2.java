/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;

/*
 * Renamed from GO
 */
class go_2 {
    private final gi_2 aHc;
    private final Timer aHd;

    go_2(gi_2 gi_22, Timer timer) {
        this.aHc = gi_22;
        this.aHd = timer;
    }

    public long aNZ() {
        return this.aHd.getCount();
    }

    public String aOt() {
        return String.format("%2.2f calls/%s", gi_2.a(this.aHc, this.aHd.getMeanRate()), gi_2.a(this.aHc));
    }

    public String aOu() {
        return String.format("%2.2f calls/%s", gi_2.b(this.aHc, this.aHd.getOneMinuteRate()), gi_2.b(this.aHc));
    }

    public String aOv() {
        return String.format("%2.2f calls/%s", gi_2.c(this.aHc, this.aHd.getFiveMinuteRate()), gi_2.c(this.aHc));
    }

    public String aOw() {
        return String.format("%2.2f calls/%s", gi_2.d(this.aHc, this.aHd.getFifteenMinuteRate()), gi_2.d(this.aHc));
    }

    public String aOx() {
        return String.format("%2.2f %s", gi_2.e(this.aHc, this.aHd.getSnapshot().getMin()), gi_2.e(this.aHc));
    }

    public String aOy() {
        return String.format("%2.2f %s", gi_2.f(this.aHc, this.aHd.getSnapshot().getMax()), gi_2.f(this.aHc));
    }

    public String aOz() {
        return String.format("%2.2f %s", gi_2.g(this.aHc, this.aHd.getSnapshot().getMean()), gi_2.g(this.aHc));
    }

    public String aOA() {
        return String.format("%2.2f %s", gi_2.h(this.aHc, this.aHd.getSnapshot().getStdDev()), gi_2.h(this.aHc));
    }

    public String aOB() {
        return String.format("%2.2f %s", gi_2.i(this.aHc, this.aHd.getSnapshot().getMedian()), gi_2.i(this.aHc));
    }

    public String aOC() {
        return String.format("<= %2.2f %s", gi_2.j(this.aHc, this.aHd.getSnapshot().get75thPercentile()), gi_2.j(this.aHc));
    }

    public String aOD() {
        return String.format("<= %2.2f %s", gi_2.k(this.aHc, this.aHd.getSnapshot().get95thPercentile()), gi_2.k(this.aHc));
    }

    public String aOE() {
        return String.format("<= %2.2f %s", gi_2.l(this.aHc, this.aHd.getSnapshot().get98thPercentile()), gi_2.l(this.aHc));
    }

    public String aOF() {
        return String.format("<= %2.2f %s", gi_2.m(this.aHc, this.aHd.getSnapshot().get99thPercentile()), gi_2.m(this.aHc));
    }

    public String aOG() {
        return String.format("<= %2.2f %s", gi_2.n(this.aHc, this.aHd.getSnapshot().get999thPercentile()), gi_2.n(this.aHc));
    }

    public String toString() {
        return "TimerReport{m_timer=" + this.aHd.getCount() + "}";
    }
}

