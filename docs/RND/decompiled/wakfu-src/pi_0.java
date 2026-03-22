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
 * Renamed from Pi
 */
public final class pi_0
extends Pf {
    private static final Logger bdr = Logger.getLogger(pi_0.class);
    private String bds;
    private String bdt;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 1 && stringArray.length != 2) {
                bdr.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 2 : AppearanceId;AnimName(facultatif)) : " + string));
                return false;
            }
            this.bds = stringArray[0];
            if (stringArray.length == 2) {
                this.bdt = stringArray[1];
            }
            return true;
        }
        catch (Exception exception) {
            bdr.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"), (Throwable)exception);
            return false;
        }
    }

    public String aXE() {
        return this.bds;
    }

    public String aXF() {
        return this.bdt;
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdl;
    }
}

