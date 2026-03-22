/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bOz
 */
public class boz_2
implements aeh_2 {
    private static final String kLu = "name";
    private static final String kLv = "familyIconUrl";
    private static final String kLw = "familyIconStyle";
    private static final String kLx = "gaugeColor";
    private static final String kLy = "currentValue";
    private static final String kLz = "currentValuePerc";
    private static final String kLA = "currentValueText";
    private static final String kLB = "isOnOverflow";
    private static final String kLC = "protectorInterval";
    private static final String kLD = "isProtector";
    private static final String kLE = "maxValueText";
    private static final String kLF = "wakfuGaugeStyle";
    private static final String kLG = "numberInZoneText";
    private static final String kLH = "intervalText";
    private static final String[] kLI = new String[]{"name", "gaugeColor", "currentValue", "familyIconUrl", "currentValueText", "protectorInterval", "maxValueText", "isProtector", "wakfuGaugeStyle", "numberInZoneText", "intervalText"};
    protected static final Logger kLJ = Logger.getLogger(boz_2.class);
    private final bow_2 kLK;
    private final int kLL;
    private final int kLM;
    private final int kLN;
    private box_2 kLO;
    private boolean kLP = false;

    public boz_2(bow_2 bow_22, int n, abm_1 abm_12, int n2, int n3) {
        this.kLK = bow_22;
        this.kLL = n;
        this.kLM = n2;
        this.kLN = n3;
        if (abm_12 == null && bTl.lnl.ctn() != -1) {
            abm_12 = bTl.lnl.Jx(n);
        }
        this.kLO = abm_12 == null ? null : new box_2(abm_12, this.kLN);
    }

    @Override
    public String[] bxk() {
        return kLI;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kLu)) {
            return this.getName();
        }
        if (string.equals(kLC)) {
            return this.kLO;
        }
        if (string.equals(kLy)) {
            return Float.valueOf(this.ehb());
        }
        if (string.equals(kLz)) {
            return new ftc_1(this.ehb() * 100.0f);
        }
        if (string.equals(kLA)) {
            return this.kLM > 100 ? boy_2.IC(this.kLM) : this.kLM;
        }
        if (string.equals(kLE)) {
            return this.kLN;
        }
        if (string.equals(kLB)) {
            return this.kLM > this.kLN;
        }
        if (string.equals(kLw)) {
            if (this.kLK.egX()) {
                return null;
            }
            switch (this.kLL) {
                case 10: {
                    return "PlantsIcon";
                }
                case 1: {
                    return "TreesIcon";
                }
                case 2: {
                    return "FarmingIcon";
                }
            }
            return "";
        }
        if (string.equals(kLv)) {
            if (!this.kLK.egX()) {
                return null;
            }
            try {
                return String.format(auc_0.cVq().bS("monstersFamily"), this.kLL);
            }
            catch (fu_0 fu_02) {
                kLJ.error((Object)"PropertyException during getFieldValue for FAMILY_ICON_URL_FIELD", (Throwable)fu_02);
            }
        } else {
            if (string.equals(kLD)) {
                return this.ehd();
            }
            if (string.equals(kLF)) {
                float f2 = this.ehb();
                if ((double)f2 > 0.65) {
                    return "CurrentWakfuBig";
                }
                if ((double)f2 > 0.35) {
                    return "CurrentStasisBig";
                }
                return "CurrentStasisBig";
            }
            if (string.equals(kLG)) {
                return aum_0.cWf().c("wakfu.currentResourceValueInZone", this.getName());
            }
            if (string.equals(kLH)) {
                if (this.kLO == null) {
                    return null;
                }
                return aum_0.cWf().c("wakfu.protectorInterval", this.getName(), this.kLO.egZ(), this.kLO.eha());
            }
        }
        return null;
    }

    public float ehb() {
        return (float)Math.min(this.kLM, this.kLN) / (float)this.kLN;
    }

    public String getName() {
        String string = this.kLK.egX() ? aum_0.cWf().a(38, (long)this.kLL, new Object[0]) : aum_0.cWf().a(37, (long)this.kLL, new Object[0]);
        if (string != null && !string.isEmpty()) {
            return string;
        }
        return "Famille inconnue";
    }

    public boolean ehc() {
        return this.kLO != null;
    }

    public void a(abm_1 abm_12) {
        this.kLO = new box_2(abm_12, this.kLN);
        fse_1.gFu().a((aef_2)this, kLI);
    }

    public boolean ehd() {
        return this.kLO != null && this.kLO.IB(this.kLM);
    }

    public int ehe() {
        return this.kLO == null ? -1 : this.kLM - this.kLO.eha();
    }

    public bow_2 ehf() {
        return this.kLK;
    }

    public int cqy() {
        return this.kLL;
    }

    public void il(boolean bl) {
        this.kLP = bl;
    }

    public boolean ehg() {
        return this.kLP;
    }

    public int getCurrentValue() {
        return this.kLM;
    }

    public String toString() {
        return "(familyId=" + this.kLL + ", currentValue=" + this.kLM + ")";
    }
}

