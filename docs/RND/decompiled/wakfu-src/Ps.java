/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Ps
extends Pf {
    private static final Logger bdT = Logger.getLogger(Ps.class);
    private float[] bdU = new float[4];
    private String bdV;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length != 4 && stringArray.length != 5) {
                bdT.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 5 : partName;R;G;B;A (couleur entre [0-1]) : " + string));
                return false;
            }
            this.bdV = stringArray[0];
            float f2 = Float.parseFloat(stringArray[1]);
            float f3 = Float.parseFloat(stringArray[2]);
            float f4 = Float.parseFloat(stringArray[3]);
            float f5 = stringArray.length == 4 ? 1.0f : Float.parseFloat(stringArray[4]);
            this.bdU = new float[]{f2 * f5, f3 * f5, f4 * f5, f5};
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdT.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcX;
    }

    public float[] aXT() {
        return this.bdU;
    }

    public String aXU() {
        return this.bdV;
    }
}

