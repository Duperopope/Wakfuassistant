/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

public class aap
implements Comparable {
    public static final Comparator<aap> bYO = new aaq();
    final byte bYP;
    private final float bYQ;
    private final float bYR;
    private final float bYS;

    public aap(byte by, float f2, float f3, float f4) {
        this.bYP = by;
        this.bYQ = f2;
        this.bYR = f3;
        this.bYS = f4;
    }

    public int compareTo(@NotNull Object object) {
        aap aap2 = (aap)object;
        return this.bYP - aap2.bYP;
    }

    public float aIU() {
        return this.bYQ;
    }

    public float aIV() {
        return this.bYR;
    }

    public float aIW() {
        return this.bYS;
    }

    public byte brh() {
        return this.bYP;
    }

    public String toString() {
        return "DayLightDefinition{" + this.bYP + "%Day Color = {" + this.bYQ + ", " + this.bYR + ", " + this.bYS + "}";
    }
}

