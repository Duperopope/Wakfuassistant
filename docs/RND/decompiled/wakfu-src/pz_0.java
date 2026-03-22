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
 * Renamed from Pz
 */
public class pz_0
extends Pf {
    private static final Logger bel = Logger.getLogger(pz_0.class);
    private final float[] bem = new float[3];
    private float aQK;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length != 4) {
                bel.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 4 : R G B Range) : " + string));
                return false;
            }
            this.bem[0] = Float.parseFloat(stringArray[0]);
            this.bem[1] = Float.parseFloat(stringArray[1]);
            this.bem[2] = Float.parseFloat(stringArray[2]);
            this.aQK = Float.parseFloat(stringArray[3]);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bel.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcT;
    }

    public float[] aPt() {
        return this.bem;
    }

    public float aSL() {
        return this.aQK;
    }
}

