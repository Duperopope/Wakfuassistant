/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRN
 */
public class crn_2
implements pu_0,
aeh_2 {
    public static final String nDA = "characValue";
    public static final String nDB = "characMaxValue";
    public static final String nDC = "iconUrl";
    public static final String nDD = "isHp";
    public static final String nDE = "isInSameTeam";
    public static final String nDF = "isInBlueTeam";
    private static final String[] nDG = new String[]{"characValue", "iconUrl", "isInSameTeam"};
    private final exf_2 nDH;
    private final bgy nDI;

    public crn_2(exf_2 exf_22, bgy bgy2) {
        this.nDH = exf_22;
        this.nDH.a(this);
        this.nDI = bgy2;
    }

    @Override
    public String[] bxk() {
        return nDG;
    }

    @Override
    public void a(pr_0 pr_02) {
        fse_1.gFu().a((aef_2)this, nDB);
        fse_1.gFu().a((aef_2)this, nDA);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nDA)) {
            return this.nDH.aYB();
        }
        if (string.equals(nDB)) {
            return this.nDH.aYD();
        }
        if (string.equals(nDD)) {
            return this.nDH.dqy() == exx_2.rGi;
        }
        if (!string.equals(nDC)) {
            if (string.equals(nDE)) {
                if (this.nDI == null) {
                    return false;
                }
                return this.nDI.dkj();
            }
            if (string.equals(nDF)) {
                if (this.nDI == null) {
                    return false;
                }
                return this.nDI.dkk();
            }
        }
        return null;
    }

    public String toString() {
        return "TimelineCellView{m_charac=" + String.valueOf(this.nDH) + "}";
    }
}

