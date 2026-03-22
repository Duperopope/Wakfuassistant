/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.DecimalFormat;
import org.apache.log4j.Logger;

/*
 * Renamed from bKq
 */
public abstract class bkq_0
implements aeh_2 {
    protected static final Logger knn = Logger.getLogger(bkq_0.class);
    public static final String kno = "name";
    public static final String knp = "nameWithDuration";
    public static final String knq = "nameWithRemainingTime";
    public static final String knr = "description";
    public static final String kns = "iconUrl";
    public static final String knt = "price";
    public static final String knu = "duration";
    public static final String knv = "remainingTime";
    public static final String knw = "buyEnabled";
    private final bkn_0 knx;

    protected bkq_0(bkn_0 bkn_02) {
        this.knx = bkn_02;
    }

    public abstract String getName();

    public abstract fpf ebf();

    @Override
    public Object eu(String string) {
        if (string.equals(knt)) {
            return DecimalFormat.getIntegerInstance().format(this.ebn().eAU()) + "\u00a7";
        }
        if (string.equals(knw)) {
            fpg fpg2 = bTj.eno().doD().eav();
            return fpg2 != null && fpg2.c(this.ebf()) >= this.ebn().eAU();
        }
        if (string.equals(knu)) {
            return this.ebm();
        }
        if (string.equals(knv)) {
            return this.ebl();
        }
        return null;
    }

    public void dhE() {
        fse_1.gFu().a((aef_2)this, knq, knv);
    }

    public void ebk() {
        fse_1.gFu().a((aef_2)this, knw);
    }

    protected Object ebl() {
        long l = (this.knx.MJ() + this.knx.Tz() - ue_0.bjV().bjg()) / 1000L;
        if (this.knx.MJ() == -1L || l <= 0L) {
            return null;
        }
        return new ahv_2().c(aum_0.cWf().c("remaining.duration", new Object[0])).c(" ").c(uc_0.i(new uz_0(l))).ceL();
    }

    protected String ebm() {
        return new ahv_2().c(aum_0.cWf().c(knu, new Object[0])).c(" ").c(uc_0.i(uz_0.fo(this.knx.Tz() / 1000L))).ceL();
    }

    public bkn_0 ebn() {
        return this.knx;
    }

    @Override
    public String[] bxk() {
        return null;
    }
}

