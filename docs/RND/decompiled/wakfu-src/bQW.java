/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bQW
implements aeh_2,
bNC {
    public static final String kXV = "remainingTime";
    public static final String kXW = "constructionDate";
    public static final String kXX = "customItem";
    public static final String kXY = "isDeco";
    public static final String kXZ = "canBeEvolved";
    public static final String kYa = "performedConstructionDuration";
    public static final String kYb = "constructionDurationAsMinute";
    private final bQI kYc;
    private final long kYd;
    private final ux_0 kYe;
    private ffV kYf;

    private bQW(bQI bQI2, long l, ffV ffV2, ux_0 ux_02) {
        this.kYc = bQI2;
        this.kYd = l;
        this.kYe = ux_02;
        this.bv(ffV2);
    }

    public static bQW a(bQI bQI2, long l, int n, ux_0 ux_02) {
        ffV ffV2 = null;
        if (n != 0) {
            ffV2 = fgD.fXh().Ve(n);
        }
        return new bQW(bQI2, l, ffV2, ux_02);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kXV)) {
            return this.iq(true);
        }
        if (string.equals(kXW)) {
            return aum_0.cWf().v(this.kYe);
        }
        if (string.equals(kXX)) {
            return this.kYf;
        }
        if (string.equals(kXY)) {
            return this.kYc.ejU().coy();
        }
        if (string.equals(kXZ)) {
            fbk_0 fbk_02 = this.kYc.ejU();
            if (fbk_02 == null) {
                return false;
            }
            fbu_0 fbu_02 = fbw_0.rSQ.eF(fbk_02.aIi());
            if (fbu_02 == null) {
                return false;
            }
            fbk_0 fbk_03 = fbw_0.rSQ.eE(fbu_02.fSk());
            if (fbk_03 == null) {
                return false;
            }
            return fbk_02.coj() != fbk_03.coj();
        }
        if (string.equals(kYa)) {
            ua_0 ua_02 = this.ekn();
            if (ua_02 == null) {
                return 0;
            }
            return (fbo_0.c(this.kYc.ejU()).bjS() - ua_02.bjS()) / 60L;
        }
        if (string.equals(kYb)) {
            return fbo_0.c(this.kYc.ejU()).bjS() / 60L;
        }
        return this.kYc.eu(string);
    }

    private boolean ekl() {
        return this.kYd > 0L;
    }

    public ux_0 ekm() {
        fbu_0 fbu_02 = fbw_0.rSQ.eF(this.kYc.ejU().aIi());
        if (fbu_02 == null) {
            return null;
        }
        return fsl_0.a(bRb.kYS.ekv(), fbu_02, this.kYe.bjB());
    }

    public ua_0 ekn() {
        if (!this.ekl()) {
            return null;
        }
        ux_0 ux_02 = this.ekm();
        if (ux_02 == null) {
            return null;
        }
        uz_0 uz_02 = ue_0.bjV().bjc().l(ux_02);
        if (!uz_02.aYI()) {
            return null;
        }
        if (uz_02.e(ua_0.bvY)) {
            return ua_0.bvY;
        }
        return uz_02;
    }

    public String iq(boolean bl) {
        ua_0 ua_02 = this.ekn();
        if (ua_02 == null) {
            return null;
        }
        return bl ? uc_0.l(ua_02) : uc_0.k(ua_02);
    }

    public String getName() {
        return this.kYc.getName();
    }

    public bRf ejG() {
        return bRb.kYS.ct(this.kYc.ejU().coj());
    }

    public long LV() {
        return this.kYd;
    }

    public void dJK() {
        ua_0 ua_02 = this.kYc.ejR();
        if (!ua_02.aYI()) {
            return;
        }
        bNB.kDS.a(this);
    }

    public void dJL() {
        bNB.kDS.b(this);
    }

    @Override
    public void daZ() {
        fse_1.gFu().a((aef_2)this, kXV, kYa);
    }

    public bQI eko() {
        return this.kYc;
    }

    public void bv(ffV ffV2) {
        this.kYf = ffV2;
        fse_1.gFu().a((aef_2)this, kXX);
    }
}

