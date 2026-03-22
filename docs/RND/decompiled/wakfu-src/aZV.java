/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aZV
implements afl {
    protected static Logger oO = Logger.getLogger(aZV.class);

    public void a(WL wL) {
        this.cYY();
        wL.b(this);
    }

    public void cYY() {
        aqb_1.bGD().a(new anu_0(), new aZW(this));
    }

    void a(anu_0 anu_02, foS foS2) {
        for (anw_0 anw_02 : anu_02.ctH()) {
            foS2.b(anw_02.ctN(), anw_02.ctJ(), anw_02.ctK(), anw_02.ctL(), anw_02.ctM());
        }
    }

    void b(anu_0 anu_02, foS foS2) {
        for (aNV aNV2 : anu_02.ctG()) {
            foS2.a(aNV2.ctI(), aNV2.ctJ(), aNV2.ctK(), aNV2.ctL(), aNV2.ctM());
        }
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.protectorEcosystem", new Object[0]);
    }
}

