/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aYq
 */
public class ayq_0
implements afl {
    protected static final Logger hxC = Logger.getLogger(ayq_0.class);

    public void a(WL wL) {
        this.cYp();
        wL.b(this);
    }

    private boolean cYp() {
        aqb_1.bGD().a(new aLJ(), new aYr(this));
        aqb_1.bGD().a(new aLK(), new aYs(this));
        return true;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.climateBonus", new Object[0]);
    }
}

