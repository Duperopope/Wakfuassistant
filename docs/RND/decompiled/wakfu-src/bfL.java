/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class bfL
implements aeh_2 {
    private static final Logger hVE = Logger.getLogger(bfL.class);
    public static final String hVF = "item";
    public static final String hVG = "quantity";
    public static final String hVH = "xp";
    public static final String hVI = "boosterXp";
    public static final String hVJ = "kama";
    public static final String hVK = "xpIconUrl";
    public static final String hVL = "rankDescription";
    public static final String[] hVM = new String[]{"item", "quantity", "xpIconUrl", "xp", "kama", "rankDescription"};

    @Override
    public String[] bxk() {
        return hVM;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hVF)) {
            return this.dhn();
        }
        if (string.equals(hVG)) {
            return this.oP();
        }
        if (string.equals(hVH)) {
            return this.agN();
        }
        if (string.equals(hVJ)) {
            return this.aGx();
        }
        if (string.equals(hVK)) {
            return this.dho();
        }
        if (string.equals(hVL)) {
            return this.dhp();
        }
        return null;
    }

    protected abstract fhc_0 dhn();

    protected abstract int oP();

    protected abstract int agN();

    protected abstract int aGx();

    protected abstract String dho();

    protected abstract String dhp();
}

