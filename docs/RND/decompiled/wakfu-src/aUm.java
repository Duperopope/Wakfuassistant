/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.net.URL;
import org.jetbrains.annotations.NotNull;

public final class aUm
extends amb_1 {
    private static final aUm gxU = new aUm();

    public static aUm cUI() {
        return gxU;
    }

    @Override
    public boolean d(amc_1 amc_12) {
        if (amc_12.bCB() != null) {
            Object object = amc_12.bCB();
            if (amc_12.bCN() != null) {
                object = (String)object + amc_12.bCN();
            }
            aqg_0.cBA().A((String)object, false);
            return true;
        }
        if (amc_12.bCK() != null) {
            amc_12.bCK().run();
            return true;
        }
        return false;
    }

    @NotNull
    public static String cUJ() {
        return String.format("%s/shortcuts.xml", System.getProperty("preferenceStorePath"));
    }

    @NotNull
    public static String cUK() {
        return String.format("file:%s", aUm.cUJ());
    }

    @NotNull
    public static URL cUL() {
        return new URL(aUm.cUK());
    }
}

