/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cYg
 */
public class cyg_2
implements aeh_2 {
    public static final String nXK = "description";
    public static final String nXL = "firstRankReward";
    public static final String nXM = "secondRankReward";
    public static final String nXN = "thirdRankReward";
    public static final String nXO = "fourthRankReward";
    private final ArrayList<cyh_1> nXP = new ArrayList();
    private final String nXQ;

    public cyg_2(String string) {
        this.nXQ = string;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nXK)) {
            return this.nXQ;
        }
        if (string.equals(nXL)) {
            if (this.nXP.size() >= 1) {
                return this.nXP.get(0);
            }
        } else if (string.equals(nXM)) {
            if (this.nXP.size() >= 2) {
                return this.nXP.get(1);
            }
        } else if (string.equals(nXN)) {
            if (this.nXP.size() >= 3) {
                return this.nXP.get(2);
            }
        } else if (string.equals(nXO) && this.nXP.size() >= 4) {
            return this.nXP.get(3);
        }
        return null;
    }

    public void a(cyh_1 cyh_12) {
        this.nXP.add(cyh_12);
        fse_1.gFu().a((aef_2)this, nXL, nXM, nXN, nXO);
    }
}

