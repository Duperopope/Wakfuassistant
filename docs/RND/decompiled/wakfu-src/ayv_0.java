/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aYv
 */
public final class ayv_0
implements afl {
    private static final Logger hxD = Logger.getLogger(ayv_0.class);

    public void a(WL wL) {
        try {
            aqb_1.bGD().a(new alp_0(), alp_02 -> {
                eKg eKg2 = new eKg();
                eKg2.lK(alp_02.d());
                eKg2.dL(alp_02.cmq());
                eKg2.dO(alp_02.aVe());
                eKg2.dN(alp_02.aVf());
                eKg2.dM(alp_02.cmr());
                eKh.qBm.a(eKg2);
            });
        }
        catch (Exception exception) {
            hxD.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            wL.b(this);
        }
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.companyRank", new Object[0]);
    }
}

