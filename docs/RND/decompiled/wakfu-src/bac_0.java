/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from baC
 */
public class bac_0
implements afl {
    protected static final Logger hyW = Logger.getLogger(bac_0.class);
    public static final bac_0 hyX = new bac_0();

    private bac_0() {
    }

    public void a(WL wL) {
        this.cYp();
        wL.b(this);
    }

    private boolean cYp() {
        aqb_1.bGD().a(new aor_0(), new bad_0(this));
        bqm_0.jbp.aPg();
        return true;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.scriptAction", new Object[0]);
    }
}

