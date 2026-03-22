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
 * Renamed from Pn
 */
public class pn_0
extends Pf {
    private static final Logger bdH = Logger.getLogger(pn_0.class);
    private String bdI;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 1) {
                bdH.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : AnimSuffix) : " + string));
                return false;
            }
            this.bdI = stringArray[0];
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdH.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcY;
    }

    public String aXO() {
        return this.bdI;
    }
}

