/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aZK
 */
public class azk_0
implements afl {
    public static final azk_0 hyt = new azk_0();
    private static final Logger hyu = Logger.getLogger(azk_0.class);

    private azk_0() {
    }

    public void a(WL wL) {
        try {
            aqb_1.bGD().a(new anf_0(), azk_0::a);
        }
        catch (Exception exception) {
            hyu.error((Object)"Exception raised", (Throwable)exception);
        }
        wL.b(this);
    }

    private static void a(anf_0 anf_02) {
        fou_0.sLB.a(anf_02.d(), fot_0.f(anf_02.d(), anf_02.AK(), anf_02.aVt(), anf_02.aJe(), anf_02.csR()));
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.mountSkin", new Object[0]);
    }
}

