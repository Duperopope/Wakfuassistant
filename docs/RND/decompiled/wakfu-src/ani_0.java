/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Timestamp;

/*
 * Renamed from aNi
 */
public class ani_0
implements aqz_2 {
    protected int o;
    protected int emN;
    protected int emO;
    protected long emP;
    protected Timestamp emQ;
    protected boolean emR;

    public int d() {
        return this.o;
    }

    public int cql() {
        return this.emN;
    }

    public int cqm() {
        return this.emO;
    }

    public long cqn() {
        return this.emP;
    }

    public Timestamp cqo() {
        return this.emQ;
    }

    public boolean cqp() {
        return this.emR;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.emN = 0;
        this.emO = 0;
        this.emP = 0L;
        this.emQ = null;
        this.emR = false;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.emN = aqh_12.bGI();
        this.emO = aqh_12.bGI();
        this.emP = aqh_12.bGK();
        this.emQ = new Timestamp(aqh_12.bGK());
        this.emR = aqh_12.bxv();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAE.d();
    }
}

