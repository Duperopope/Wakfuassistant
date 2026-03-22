/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aZP
implements afl {
    static final Logger hyx = Logger.getLogger(aZP.class);
    private static final aZP hyy = new aZP();

    public static aZP cYX() {
        return hyy;
    }

    private aZP() {
    }

    public void a(WL wL) {
        aqb_1.bGD().a(new aNI(), new aZQ(this));
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.nation.ranks", new Object[0]);
    }
}

