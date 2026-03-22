/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aew
 */
public class aew_0
implements aex {
    private static final Logger cno = Logger.getLogger(aew_0.class);
    protected final aex cnp;
    private final aed_0 cnq;
    private final aed_0 cnr;

    public aew_0(aex aex2, aed_0 aed_02, aed_0 aed_03) {
        this.cnp = aex2;
        this.cnq = aed_02;
        this.cnr = aed_03;
    }

    @Override
    public aed_0 c(adx_0 adx_02, int n) {
        return n < adx_02.bvM() ? this.cnq : this.cnr;
    }

    @Override
    public aed_0 bws() {
        return this.cnq;
    }

    @Override
    public aed_0 bwt() {
        return this.cnr;
    }

    @Override
    public void i(adx_0 adx_02) {
    }

    @Override
    public void j(adx_0 adx_02) {
        adx_02.a(this.cnp);
    }

    public static aex a(boolean bl, ads_0 ads_02, aed_0 aed_02, aed_0 aed_03) {
        if (aed_02 == null && aed_03 == null) {
            return aeB.bww();
        }
        if (aed_02 == null) {
            cno.warn((Object)"style inconnu pour la marche");
            aed_02 = aed_03;
        }
        if (aed_03 == null) {
            cno.warn((Object)"style inconnu pour la course");
            aed_03 = aed_02;
        }
        if (bl) {
            return new aey(ads_02.bvD(), aed_02, aed_03);
        }
        return new aew_0(ads_02.bvD(), aed_02, aed_03);
    }
}

