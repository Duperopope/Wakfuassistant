/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Pr
extends Pf {
    private static final Logger bdQ = Logger.getLogger(Pr.class);
    private static final float bdR = 0.4f;
    private static final float bdS = 2.0f;
    private float azQ;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length != 1) {
                bdQ.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : scale) : " + string));
                return false;
            }
            this.azQ = GC.b(Float.parseFloat(stringArray[0]), 0.4f, 2.0f);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdQ.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"), (Throwable)numberFormatException);
            return false;
        }
    }

    public float getScale() {
        return this.azQ;
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdk;
    }
}

