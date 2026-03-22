/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.DateFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bfV
implements aeh_2 {
    protected final bfU hXW;
    public static final String hXX = "isModel";
    public static final String hXY = "isCurrent";
    public static final String hXZ = "type";
    public static final String hYa = "title";
    public static final String hYb = "description";
    public static final String hYc = "longDescription";
    public static final String hYd = "expiry";
    public static final String hYe = "duration";
    public static final String hYf = "iconUrl";
    public static final String hYg = "requirements";
    public static final String hYh = "meetsRequirements";
    public static final String hYi = "state";
    public static final String hYj = "rewards";
    public static final String hYk = "firstRankReward";
    public static final String hYl = "secondRankReward";
    public static final String hYm = "thirdRankReward";
    public static final String hYn = "minUsers";
    public static final String hYo = "maxUsers";
    public static final String hYp = "isSelectedByProtector";
    public static final String hYq = "hasRewards";
    public static final String[] hYr = new String[]{"isModel", "isCurrent", "type", "title", "description", "expiry", "duration", "iconUrl", "requirements", "meetsRequirements", "state", "rewards", "hasRewards"};
    private boolean hYs = false;
    protected static final Logger hYt = Logger.getLogger(bfV.class);

    public bfV(bfU bfU2) {
        this.hXW = bfU2;
    }

    public bfU dig() {
        return this.hXW;
    }

    @Override
    public String[] bxk() {
        return hYr;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hXX)) {
            return true;
        }
        if (string.equals(hXY)) {
            return this.hYs;
        }
        if (string.equals(hXZ)) {
            return this.hXW.dih();
        }
        if (string.equals(hYa)) {
            String string2 = this.hXW.diA();
            if (string2 != null && string2.length() == 0) {
                return null;
            }
            return string2;
        }
        if (string.equals(hYb)) {
            return this.diL();
        }
        if (string.equals(hYc)) {
            String string3 = this.hXW.diD();
            if (string3 == null || string3.length() == 0) {
                return null;
            }
            return "\"" + string3 + "\"";
        }
        if (string.equals(hYg)) {
            String string4 = this.hXW.diE();
            if (string4 != null && string4.length() == 0) {
                return null;
            }
            ahv_2 ahv_22 = new ahv_2();
            if (!this.diN()) {
                ahv_22.ceC().ih(awx_2.dnJ.bQk());
            }
            ahv_22.c(string4);
            return ahv_22.ceL();
        }
        if (string.equals(hYh)) {
            return this.diN();
        }
        if (string.equals(hYd)) {
            return this.diM();
        }
        if (string.equals(hYe)) {
            if (this.hXW.aFT() > 0) {
                return String.format("%d:00:00", this.hXW.aFT());
            }
        } else {
            if (string.equals(hYf)) {
                return this.byf();
            }
            if (string.equals(hYi)) {
                return this.hXW.dij();
            }
            if (string.equals(hYq)) {
                return this.hXW.aFV().size() != 0;
            }
            if (string.equals(hYj)) {
                ArrayList<bgh> arrayList = this.hXW.aFV();
                ArrayList<bgg> arrayList2 = new ArrayList<bgg>();
                int n = arrayList.size();
                for (int i = 0; i < n; ++i) {
                    arrayList2.add(new bgg(arrayList.get(i)));
                }
                return arrayList2;
            }
            if (string.equals(hYk)) {
                ArrayList<bgh> arrayList = this.hXW.aFV();
                if (arrayList == null || arrayList.size() < 1) {
                    return null;
                }
                return new bgg(arrayList.get(0));
            }
            if (string.equals(hYl)) {
                ArrayList<bgh> arrayList = this.hXW.aFV();
                if (arrayList == null || arrayList.size() < 2) {
                    return null;
                }
                return new bgg(arrayList.get(1));
            }
            if (string.equals(hYm)) {
                ArrayList<bgh> arrayList = this.hXW.aFV();
                if (arrayList == null || arrayList.size() < 3) {
                    return null;
                }
                return new bgg(arrayList.get(2));
            }
            if (string.equals(hYn)) {
                return this.hXW.aGe();
            }
            if (string.equals(hYo)) {
                return this.hXW.aGf();
            }
            if (string.equals(hYp)) {
                return bTj.eno().doD().eaB().contains(this.hXW.d());
            }
        }
        return null;
    }

    protected Object diL() {
        String string = this.hXW.diB();
        if (string != null && string.length() == 0) {
            return null;
        }
        return string;
    }

    public void fK(boolean bl) {
        if (this.hYs != bl) {
            this.hYs = bl;
            fse_1.gFu().a((aef_2)this, hXY);
        }
    }

    public String byf() {
        try {
            return String.format(auc_0.cVq().bS("challengeCategoryIconsPath"), this.hXW.dih().aJr());
        }
        catch (fu_0 fu_02) {
            hYt.error((Object)"PropertyException during getIconUrl", (Throwable)fu_02);
            return null;
        }
    }

    public String diM() {
        if (this.hXW.diG() != null) {
            DateFormat dateFormat = DateFormat.getDateTimeInstance(1, 2, aum_0.cWf().aUXX().aUJ());
            return String.format("%s %s", aum_0.cWf().c("expire.in", new Object[0]), dateFormat.format(this.hXW.diG()));
        }
        return null;
    }

    public bfS dih() {
        return this.hXW.dih();
    }

    public bgi dii() {
        return this.hXW.dii();
    }

    public boolean diN() {
        ang_2 ang_22 = this.hXW.diI();
        return ang_22 == null || ang_22.b(aue_0.cVJ().cVK(), aue_0.cVJ().cVK(), null, null);
    }
}

