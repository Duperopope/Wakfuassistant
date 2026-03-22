/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bnP
 */
public class bnp_1
implements aeh_2 {
    private static final Logger iJY = Logger.getLogger(bnp_1.class);
    public static final String iJZ = "isExtended";
    public static final String iKa = "hasAPrimaryGem";
    public static final String iKb = "primaryGem";
    public static final String iKc = "primaryGemIconUrl";
    public static final String iKd = "primaryGemIsLocked";
    public static final String iKe = "hasASecondaryGem";
    public static final String iKf = "secondaryGemIconUrl";
    public static final String iKg = "secondaryGem";
    private final fnz iKh;

    public bnp_1(fnz fnz2) {
        this.iKh = fnz2;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iJZ)) {
            ffV ffV2 = this.iKh.nF(true);
            if (ffV2 == null) {
                return false;
            }
            ffV ffV3 = this.iKh.nF(false);
            if (ffV3 == null) {
                return false;
            }
            return ffV2.avr() == ffV3.avr();
        }
        if (string.equals(iKa)) {
            return this.iKh.nF(true) != null;
        }
        if (string.equals(iKe)) {
            return this.iKh.nF(false) != null;
        }
        if (string.equals(iKc)) {
            ffV ffV4 = this.iKh.nF(true);
            if (ffV4 == null) {
                return null;
            }
            int n = this.q(ffV4);
            if (n == -1) {
                return null;
            }
            try {
                return String.format(auc_0.cVq().bS("dimensionalBagPrimaryGemPath"), n);
            }
            catch (fu_0 fu_02) {
                iJY.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 dimensionalBagPrimaryGemPath");
                return null;
            }
        }
        if (string.equals(iKf)) {
            ffV ffV5 = this.iKh.nF(false);
            if (ffV5 == null) {
                return null;
            }
            int n = this.q(ffV5);
            if (n == -1) {
                return null;
            }
            try {
                return String.format(auc_0.cVq().bS("dimensionalBagSecondaryGemPath"), n);
            }
            catch (fu_0 fu_03) {
                iJY.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 dimensionalBagSecondaryGemPath");
                return null;
            }
        }
        if (string.equals(iKb)) {
            return new bnq_1(this.iKh.nF(true), this.iKh.gek());
        }
        if (string.equals(iKg)) {
            return new bnq_1(this.iKh.nF(false), this.iKh.gek());
        }
        if (string.equals(iKd)) {
            return this.iKh.geB();
        }
        return null;
    }

    private int q(ffV ffV2) {
        int n = ffV2.avr();
        fnB fnB2 = fnB.Xq(n);
        if (fnB2 == null) {
            return -1;
        }
        return fnB2.aPy();
    }

    public void dhh() {
        fse_1.gFu().a((aef_2)this, iJZ, iKa, iKc, iKe, iKf, iKb, iKg);
    }
}

