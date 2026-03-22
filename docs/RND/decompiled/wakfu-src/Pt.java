/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Pt
extends Pf {
    private static final Logger bdW = Logger.getLogger(Pt.class);
    private String bdX;
    private String bdY;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 2) {
                bdW.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 2 : source, destination....) : " + string));
                return false;
            }
            this.bdX = stringArray[0];
            this.bdY = stringArray[1];
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdW.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return null;
    }

    public String aXV() {
        return this.bdX;
    }

    public String aXW() {
        return this.bdY;
    }
}

