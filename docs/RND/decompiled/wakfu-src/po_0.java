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
 * Renamed from Po
 */
public class po_0
extends Pf {
    private static final Logger bdJ = Logger.getLogger(po_0.class);
    private String bdK;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 1) {
                bdJ.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvais nombre de param\u00e8tres (il en faut 1 : AppearanceId) : " + string));
                return false;
            }
            this.bdK = stringArray[0];
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdJ.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcU;
    }

    public String aXP() {
        return this.bdK;
    }
}

