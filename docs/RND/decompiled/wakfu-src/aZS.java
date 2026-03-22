/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aZS
implements afl {
    public static final aZS hyA = new aZS();
    private static final Logger hyB = Logger.getLogger(aZS.class);

    private aZS() {
    }

    public void a(WL wL) {
        try {
            aqb_1.bGD().a(new aNP(), aZS::a);
        }
        catch (Exception exception) {
            hyB.error((Object)"Exception raised", (Throwable)exception);
        }
        wL.b(this);
    }

    private static void a(aNP aNP2) {
        foC.sLW.a(aNP2.d(), foB.G(aNP2.d(), aNP2.AK(), aNP2.aVt(), aNP2.ctm()));
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.petSkin", new Object[0]);
    }
}

