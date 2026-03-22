/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bTd
implements aeh_2 {
    private static final Logger lmK = Logger.getLogger(bTd.class);
    public static final String lmL = "iconUrl";
    public static final String lmM = "enabled";
    public static final String lmN = "items";
    public static final String lmO = "idString";
    private final bfS lmP;
    private final ArrayList<bkk_0> lmQ = new ArrayList();

    public bTd(bfS bfS2) {
        this.lmP = bfS2;
    }

    public void clear() {
        this.lmQ.clear();
    }

    public void a(bkk_0 bkk_02) {
        this.lmQ.add(bkk_02);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    public boolean isEnabled() {
        return this.lmQ.size() != 0;
    }

    public void ebk() {
        int n = this.lmQ.size();
        for (int i = 0; i < n; ++i) {
            this.lmQ.get(i).ebk();
        }
    }

    public bfS dih() {
        return this.lmP;
    }

    void dhE() {
        int n = this.lmQ.size();
        for (int i = 0; i < n; ++i) {
            bkk_0 bkk_02 = this.lmQ.get(i);
            bkk_02.dhE();
        }
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lmL)) {
            try {
                return String.format(auc_0.cVq().bS("challengeCategoryIconsPath"), this.lmP.aJr());
            }
            catch (fu_0 fu_02) {
                lmK.error((Object)"PropertyException during getFieldValue for ICON_URL", (Throwable)fu_02);
                return null;
            }
        }
        if (string.equals(lmM)) {
            return this.lmQ.size() > 0;
        }
        if (string.equals(lmN)) {
            return this.lmQ;
        }
        if (string.equals(lmO)) {
            return String.valueOf(this.lmP.aJr());
        }
        return null;
    }
}

