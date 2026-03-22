/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bvy
implements aeh_2 {
    private static final Logger jtt = Logger.getLogger(bvy.class);
    public static final String jtu = "id";
    public static final String jtv = "emblemPath";
    public static final String jtw = "backgroundPath";
    public static final String jtx = "emblemTexture";
    public static final awx_2 jty = new awx_2(0.18f, 0.31f, 0.31f, 1.0f);
    public static final String[] jtz = new String[]{"id", "emblemPath", "backgroundPath", "emblemTexture"};
    private final int jtA;

    public bvy(int n) {
        this.jtA = n;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jtu.equals(string)) {
            return this.jtA;
        }
        if (jtv.equals(string)) {
            return this.bG("guildBlazonForegroundPartPath");
        }
        if (jtw.equals(string)) {
            return this.bG("guildBlazonBackgroundPartPath");
        }
        if (jtx.equals(string)) {
            return buK.dJw().b(this.jtA, jty);
        }
        return null;
    }

    private String bG(String string) {
        String string2 = "";
        try {
            string2 = String.format(auc_0.cVq().bS(string), this.jtA);
        }
        catch (fu_0 fu_02) {
            jtt.error((Object)("Can't retrieve blazon " + string + " for id " + this.jtA), (Throwable)fu_02);
        }
        return string2;
    }

    public int d() {
        return this.jtA;
    }

    @Override
    public String[] bxk() {
        return jtz;
    }
}

