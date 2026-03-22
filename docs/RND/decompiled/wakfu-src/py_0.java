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
 * Renamed from Py
 */
public class py_0
extends Pf {
    private static final Logger bej = Logger.getLogger(py_0.class);
    private float bek;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 1) {
                bej.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : deltaAltitude) : " + string));
                return false;
            }
            this.bek = Float.parseFloat(stringArray[0]);
            return true;
        }
        catch (Exception exception) {
            bej.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bde;
    }

    public float aYa() {
        return this.bek;
    }
}

