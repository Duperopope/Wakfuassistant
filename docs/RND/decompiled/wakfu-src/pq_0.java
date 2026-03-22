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
 * Renamed from Pq
 */
public final class pq_0
extends Pf {
    private static final Logger bdN = Logger.getLogger(pq_0.class);
    private String bdO;
    private String bdP;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length != 2) {
                bdN.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : deltaAltitude) : " + string));
                return false;
            }
            this.bdO = stringArray[0];
            this.bdP = stringArray[1];
            return true;
        }
        catch (Exception exception) {
            bdN.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"));
            return false;
        }
    }

    public String aXR() {
        return this.bdO;
    }

    public String aXS() {
        return this.bdP;
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdf;
    }
}

