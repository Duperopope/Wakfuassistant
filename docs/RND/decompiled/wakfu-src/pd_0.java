/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from PD
 */
public class pd_0
extends Pf {
    private static final Logger bev = Logger.getLogger(pb_0.class);
    private String bew;
    private String bex;
    private String bey;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length != 3) {
                bev.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 3) : " + string));
                return false;
            }
            this.bew = stringArray[0];
            this.bex = stringArray[1];
            this.bey = stringArray[2];
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bev.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdb;
    }

    public String aYg() {
        return this.bew;
    }

    public String aYh() {
        return this.bex;
    }

    public String aYi() {
        return this.bey;
    }
}

