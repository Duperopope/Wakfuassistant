/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bfG
implements aeh_2 {
    private static final Logger hVp = Logger.getLogger(bfG.class);
    private static final String hVq = "level";
    private static final String hVr = "levelString";
    public static final String hVs = "selectedLevel";
    private static final String[] hVt = new String[]{"level", "levelString", "selectedLevel"};
    private final short hVu;
    private final exP hVv;

    public bfG(short s, exP exP2) {
        this.hVu = s;
        this.hVv = exP2;
    }

    @Override
    public String[] bxk() {
        return hVt;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hVq)) {
            return this.hVu;
        }
        if (string.equals(hVr)) {
            return this.dgL();
        }
        if (string.equals(hVs)) {
            return this.dhf();
        }
        return null;
    }

    public short cmL() {
        return this.hVu;
    }

    private String dhf() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().ceu().c(" ").c(aum_0.cWf().c("levelShort.custom", this.cmL())).cev();
        try {
            if (this.hVv.cmL() < this.hVv.dnG()) {
                ahv_22.c(" ").a(auk_0.zU(116), 14, 13, null, null);
            }
        }
        catch (fu_0 fu_02) {
            hVp.error((Object)"Exception trying to getNameAndLevel", (Throwable)fu_02);
        }
        return ahv_22.ceL();
    }

    String dgL() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().c(aum_0.cWf().c("levelShort.custom", this.hVu));
        return ahv_22.ceL();
    }

    public boolean dhg() {
        return false;
    }
}

