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
 * Renamed from Pm
 */
public class pm_0
extends Pf {
    private static final Logger bdF = Logger.getLogger(pm_0.class);
    private String bdG;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 1) {
                bdF.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : Animstatix) : " + string));
                return false;
            }
            this.bdG = stringArray[0];
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdF.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcZ;
    }

    public String aXN() {
        return this.bdG;
    }
}

