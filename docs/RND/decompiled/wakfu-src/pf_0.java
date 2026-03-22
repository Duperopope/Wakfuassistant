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
 * Renamed from PF
 */
public class pf_0
extends Pf {
    private static final Logger beB = Logger.getLogger(pf_0.class);
    private boolean beC;
    private String[] beD;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length < 2) {
                beB.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut au moins 2 : visibility[true|false];parts....) : " + string));
                return false;
            }
            this.beC = Boolean.parseBoolean(stringArray[0]);
            this.beD = new String[stringArray.length - 1];
            System.arraycopy(stringArray, 1, this.beD, 0, this.beD.length);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            beB.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bda;
    }

    public boolean aYk() {
        return this.beC;
    }

    public String[] aYl() {
        return this.beD;
    }
}

