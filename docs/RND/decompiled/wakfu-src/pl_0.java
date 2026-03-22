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
 * Renamed from Pl
 */
public class pl_0
extends Pf {
    private static final Logger bdD = Logger.getLogger(pl_0.class);
    private String bdE;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length != 1) {
                bdD.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : Animstatix) : " + string));
                return false;
            }
            this.bdE = stringArray[0];
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdD.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdj;
    }

    public String aXM() {
        return this.bdE;
    }
}

