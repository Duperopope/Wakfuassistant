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
 * Renamed from Pj
 */
public class pj_0
extends Pf {
    private static final Logger bdu = Logger.getLogger(pj_0.class);
    private int bdv = 1000;
    private int bdw = 2000;
    private int bdx = 1000;
    private float bdy = 0.5f;
    private float bdz = 77.0f;
    private String bdA = "BOTH";

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray.length > 6) {
                bdu.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut au maximum: startDuration, midDuration, endDuration, amplitude, period, [X,Y,BOTH]) : " + string));
                return false;
            }
            int n = stringArray.length;
            if (n >= 1) {
                this.bdv = (int)Float.parseFloat(stringArray[0]);
            }
            if (n >= 2) {
                this.bdw = (int)Float.parseFloat(stringArray[1]);
            }
            if (n >= 3) {
                this.bdx = (int)Float.parseFloat(stringArray[2]);
            }
            if (n >= 4) {
                this.bdy = Float.parseFloat(stringArray[3]);
            }
            if (n == 5) {
                this.bdz = Float.parseFloat(stringArray[4]);
            }
            if (n == 6) {
                this.bdA = stringArray[5].toUpperCase();
                if (this.bdA.equals("XY")) {
                    this.bdA = "BOTH";
                }
            }
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bdu.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcV;
    }

    public int aXG() {
        return this.bdv;
    }

    public int aXH() {
        return this.bdw;
    }

    public int aXI() {
        return this.bdx;
    }

    public float aXJ() {
        return this.bdy;
    }

    public float aXK() {
        return this.bdz;
    }

    public String aXL() {
        return this.bdA;
    }
}

