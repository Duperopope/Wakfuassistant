/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class buT
implements aeh_2,
bNC {
    public static final String jqW = "name";
    public static final String jqX = "learnDuration";
    public static final String jqY = "duration";
    public static final String jqZ = "cost";
    public static final String jra = "requirement";
    public static final String jrb = "effects";
    public static final String jrc = "learnRemainingTime";
    public static final String jrd = "remainingTime";
    public static final String jre = "canBePurchased";
    public static final String jrf = "isActive";
    public static final String jrg = "performedLearningDuration";
    public static final String jrh = "learnDurationAsMinute";
    private final eyr_2 jri;

    public buT(eyr_2 eyr_22) {
        this.jri = eyr_22;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jqW)) {
            return this.ms(aum_0.cWf().a(138, (long)this.jri.d(), new Object[0]));
        }
        if (string.equals(jqY)) {
            if (!this.jri.Ty()) {
                return null;
            }
            return uc_0.k(this.jri.fQr());
        }
        if (string.equals(jqZ)) {
            ahv_2 ahv_22 = new ahv_2();
            if (!this.dJD()) {
                ahv_22.ceC().ih(new awx_2(0.6f, 0.0f, 0.0f, 1.0f).bQk());
            }
            ahv_22.yx(this.jri.cqq());
            return ahv_22.ceL();
        }
        if (string.equals(jra)) {
            ahv_2 ahv_23 = new ahv_2();
            if (!this.dJE()) {
                ahv_23.ceC().ih(new awx_2(0.6f, 0.0f, 0.0f, 1.0f).bQk());
            }
            ahv_23.c(aum_0.cWf().c("required.level.custom", ezu.prJ.Pj(this.jri.d())));
            return ahv_23.ceL();
        }
        if (string.equals(jrb)) {
            return this.dJA();
        }
        if (string.equals(jre)) {
            return this.dJC();
        }
        if (string.equals(jrc)) {
            if (!this.jri.fQq()) {
                return null;
            }
            return this.dJI().flatMap(ezu_12 -> this.dJH().map(ezv_12 -> {
                uw_0 uw_02 = buQ.b(ezv_12, this.jri, ezu_12);
                return this.a(uw_02);
            })).orElse(null);
        }
        if (string.equals(jrd)) {
            if (!this.jri.Ty()) {
                return null;
            }
            return this.dJI().flatMap(ezu_12 -> this.dJH().map(ezv_12 -> {
                uw_0 uw_02 = buQ.c(ezv_12, this.jri, ezu_12);
                return this.a(uw_02);
            })).orElse(null);
        }
        if (string.equals(jrf)) {
            return this.dJH().map(ezt_1::s).orElse(false);
        }
        if (this.jri.fQq()) {
            uz_0 uz_02 = uz_0.fp(this.jri.fQp().bjB());
            float f2 = ewo_0.oBF.p(ewr_0.oEL);
            uz_02.bs(1.0f / f2);
            switch (string) {
                case "learnDuration": {
                    return uc_0.k(uz_02);
                }
                case "performedLearningDuration": {
                    return this.dJI().flatMap(ezu_12 -> this.dJH().map(ezv_12 -> {
                        long l = uz_02.bjS() - ue_0.bjV().bjc().l(buQ.b(ezv_12, this.jri, ezu_12)).bjS();
                        return l / 60L;
                    })).orElse(null);
                }
                case "learnDurationAsMinute": {
                    return uz_02.bjS() / 60L;
                }
            }
        }
        return null;
    }

    public String dJA() {
        return this.ms(buQ.a(this.jri));
    }

    private String ms(String string) {
        boolean bl = fse_1.gFu().dp("isAdmin");
        if (bl) {
            return string + " (" + this.jri.d() + ")";
        }
        return string;
    }

    private String a(uw_0 uw_02) {
        uz_0 uz_02 = ue_0.bjV().bjc().l(uw_02);
        return uc_0.k(uz_02.d(ua_0.bvY) ? uz_02 : ua_0.bvY);
    }

    public int d() {
        return this.jri.d();
    }

    public eyv_2 dJB() {
        return this.jri.dJB();
    }

    private boolean dJC() {
        return this.dJD() && this.dJE() && this.dJF();
    }

    private boolean dJD() {
        return this.dJG().Yh() >= this.jri.cqq();
    }

    private boolean dJE() {
        return ezu.prJ.fi(this.jri.d(), this.dJG().cmL());
    }

    private boolean dJF() {
        if (this.jri.dJB().fQt() != eyu_2.rLO) {
            return true;
        }
        return ewo_0.oBF.k(ewr_0.oEE);
    }

    @NotNull
    private bjo_1 dJG() {
        return (bjo_1)aue_0.cVJ().cVL().dpI();
    }

    private Optional<ezv_1> dJH() {
        return this.dJI().map(ezu_12 -> ezu_12.Tu(this.jri.d()));
    }

    private Optional<ezu_1> dJI() {
        return Optional.ofNullable(this.dJG().drl());
    }

    public void dJJ() {
        fse_1.gFu().a((aef_2)this, jre, jra, jqZ);
    }

    public void aPc() {
        fse_1.gFu().a((aef_2)this, jre);
    }

    public void dJK() {
        bNB.kDS.a(this);
    }

    public void dJL() {
        bNB.kDS.b(this);
    }

    @Override
    public void daZ() {
        fse_1.gFu().a((aef_2)this, jrd, jrc, jrf, jrg);
    }
}

