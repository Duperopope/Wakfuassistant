/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Pu
extends Pf {
    private static final Logger bdZ = Logger.getLogger(Pu.class);
    private String bdK;
    private String[] bea;
    private int beb;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray;
            boolean bl = string.endsWith("!");
            if (bl) {
                string = string.substring(0, string.length() - 1);
            }
            if ((stringArray = BH.a(string, ';')).length >= 1) {
                this.bdK = stringArray[0].intern();
                int n = 1 + this.i(stringArray);
                this.bea = bl ? null : Pu.a(stringArray, n);
                return true;
            }
            bdZ.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut au moins 2 : AppearanceId;parts...., ou un seul, mais avec un ! \u00e0 la fin) : " + string));
            return false;
        }
        catch (NumberFormatException numberFormatException) {
            bdZ.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    private static String[] a(String[] stringArray, int n) {
        String[] stringArray2 = new String[stringArray.length - n];
        for (int i = 0; i < stringArray2.length; ++i) {
            String string = stringArray[i + n];
            stringArray2[i] = string != null ? string.intern() : null;
        }
        return stringArray2;
    }

    private int i(String[] stringArray) {
        if (stringArray.length <= 1) {
            return 0;
        }
        try {
            this.beb = Integer.parseInt(stringArray[1].replace("!", ""));
            return 1;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcW;
    }

    public String aXP() {
        return this.bdK;
    }

    public String[] aXX() {
        return this.bea;
    }

    public int aXY() {
        return this.beb;
    }
}

