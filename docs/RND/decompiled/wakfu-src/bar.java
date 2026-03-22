/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bar
implements afl {
    static final Logger hyT = Logger.getLogger(bar.class);

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.timeline.buff.list", new Object[0]);
    }

    public void a(WL wL) {
        try {
            aqb_1.bGD().a(new aon_0(), new bas(this));
        }
        catch (Exception exception) {
            hyT.error((Object)"", (Throwable)exception);
        }
        wL.b(this);
    }
}

