/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class Pf {
    private static final Logger bcJ = Logger.getLogger(Pf.class);
    private static int bcK = 1;
    private final int bcL = bcK++;
    private boolean bcM = false;
    private boolean bcN = false;

    protected abstract boolean da(@NotNull String var1);

    public abstract ph_0 aXu();

    public int d() {
        return this.bcL;
    }

    public boolean aXv() {
        return this.bcM;
    }

    public void aQ(boolean bl) {
        this.bcM = bl;
    }

    public void aR(boolean bl) {
        this.bcN = bl;
    }

    public boolean aXw() {
        return this.bcN;
    }

    public static Pf db(String string) {
        String[] stringArray = string.split("\\|", -1);
        if (stringArray.length % 2 != 0) {
            bcJ.error((Object)("HMI error : Nombre de param\u00e8tres d\u00e9cod\u00e9s: " + stringArray.length + " Attendu: pair "));
            return null;
        }
        Byte by = 0;
        String string2 = "";
        boolean bl = false;
        for (int i = 0; i < stringArray.length; i += 2) {
            String string3 = stringArray[i];
            String string4 = stringArray[i + 1];
            if (string3.equals("type")) {
                by = Byte.parseByte(string4);
                continue;
            }
            if (string3.equals("data")) {
                string2 = string4;
                continue;
            }
            if (!string3.equals("broadcast")) continue;
            bl = Boolean.parseBoolean(string4);
        }
        Pg.aXx();
        return Pg.a(ph_0.G(by), string2, bl);
    }

    public String toString() {
        return "HMIAction{m_id=" + this.bcL + ", m_targetOnly=" + this.bcM + ", m_isInstant=" + this.bcN + "} ";
    }
}

