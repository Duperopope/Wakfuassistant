/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class aPQ
implements aeh_2 {
    private final apj_0 eAM;
    private final boolean eAN;
    public static final String eAO = "name";
    public static final String eAP = "enabled";
    public static final String eAQ = "color";
    public static final String eAR = "command";
    public static final String eAS = "checkBoxText";
    public final String[] eAT = new String[]{"name", "enabled", "color", "command", "checkBoxText"};

    public aPQ(apj_0 apj_02, boolean bl) {
        this.eAM = apj_02;
        this.eAN = bl;
    }

    @Override
    public String[] bxk() {
        return this.eAT;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eAO)) {
            return this.eAM.getName();
        }
        if (string.equals(eAP)) {
            return this.eAN;
        }
        if (string.equals(eAQ)) {
            return this.eAM.getColor();
        }
        if (string.equals(eAR)) {
            return this.cBl();
        }
        if (string.equals(eAS)) {
            String string2 = this.cBl();
            if (string2 != null) {
                return this.cBl() + " - " + this.eAM.getName();
            }
            return this.eAM.getName();
        }
        return null;
    }

    public axb_2 getColor() {
        return this.eAM.getColor();
    }

    public String getName() {
        return this.eAM.getName();
    }

    public int d() {
        return this.eAM.d();
    }

    public int aYs() {
        return this.eAM.czu().aYs();
    }

    @Nullable
    private String cBl() {
        if (this.eAM.czu().czF() == null) {
            return null;
        }
        return aPb.iE(this.eAM.czu().czF().cyR()).cBl();
    }
}

