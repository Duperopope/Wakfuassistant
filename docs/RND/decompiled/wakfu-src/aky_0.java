/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Timestamp;

/*
 * Renamed from aKY
 */
public class aky_0
implements aqz_2 {
    protected int o;
    protected Timestamp egA;
    protected int egB;

    public int d() {
        return this.o;
    }

    public Timestamp cjM() {
        return this.egA;
    }

    public int cjN() {
        return this.egB;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.egA = null;
        this.egB = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.egA = new Timestamp(aqh_12.bGK());
        this.egB = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAk.d();
    }
}

