/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class ahm {
    private final int cwE;
    private final int cwF;
    private final int cwG;
    private final int cwH;
    private final ahn_0 cwI;
    @Nullable
    private final String cwJ;
    private final int cwK;
    private final int cwL;
    private final boolean cwM;
    private static final String cwN = "x";

    public ahm(int n, int n2, int n3, int n4, ahn_0 ahn_02, @Nullable String string, int n5, int n6, boolean bl) {
        this.cwE = n;
        this.cwF = n2;
        this.cwG = n3;
        this.cwH = n4;
        this.cwI = ahn_02;
        this.cwJ = string;
        this.cwK = n5;
        this.cwL = n6;
        this.cwM = bl;
    }

    public int getWidth() {
        return this.cwE;
    }

    public int getHeight() {
        return this.cwF;
    }

    public int bzS() {
        return this.cwG;
    }

    public int bzT() {
        return this.cwH;
    }

    public ahn_0 bzU() {
        return this.cwI;
    }

    @Nullable
    public String bzV() {
        return this.cwJ;
    }

    public int getX() {
        return this.cwK;
    }

    public int getY() {
        return this.cwL;
    }

    public boolean bzW() {
        return this.cwM;
    }

    public String toString() {
        return "{Resolution : " + this.cwE + cwN + this.cwF + cwN + this.cwG + " " + BH.aR(this.cwI.name()) + " " + this.cwH + "Hz Prefered screen ID: " + this.cwJ + " x: " + this.cwK + " y: " + this.cwL + " hide taskbar: " + this.cwM + "}";
    }

    public boolean bzX() {
        return this.cwI != ahn_0.cwP && (this.cwE <= 0 || this.cwF <= 0);
    }

    public boolean equals(Object object) {
        if (object instanceof ahm) {
            ahm ahm2 = (ahm)object;
            return ahm2.cwE == this.cwE && ahm2.cwF == this.cwF && ahm2.cwI == this.cwI && ahm2.cwH == this.cwH && (ahm2.cwG == this.cwG || ahm2.cwG == -1 || this.cwG == -1) && Objects.equals(ahm2.cwJ, this.cwJ) && ahm2.cwK == this.cwK && ahm2.cwL == this.cwL;
        }
        return super.equals(object);
    }

    public static ahm eN(String string) {
        if (string == null) {
            string = "";
        }
        String[] stringArray = string.split(cwN);
        int n = ahm.a(stringArray, 0, 0);
        int n2 = ahm.a(stringArray, 1, 0);
        int n3 = ahm.a(stringArray, 2, -1);
        int n4 = ahm.a(stringArray, 3, 0);
        int n5 = ahm.a(stringArray, 4, ahn_0.cwO.ordinal());
        ahn_0 ahn_02 = n5 >= 0 && n5 < ahn_0.cwR.length ? ahn_0.cwR[n5] : ahn_0.cwO;
        int n6 = ahm.a(stringArray, 5, 0);
        int n7 = ahm.a(stringArray, 6, 0);
        String string2 = stringArray.length >= 8 && !stringArray[7].isEmpty() ? stringArray[7] : null;
        boolean bl = stringArray.length >= 9 && Boolean.TRUE.toString().equalsIgnoreCase(stringArray[8]);
        return new ahm(n, n2, n3, n4, ahn_02, string2, n6, n7, bl);
    }

    public static aho eO(String string) {
        if (string == null) {
            return new aho(ahn_0.cwO, false);
        }
        String[] stringArray = string.split(cwN);
        int n = ahm.a(stringArray, 4, ahn_0.cwO.ordinal());
        ahn_0 ahn_02 = n >= 0 && n < ahn_0.cwR.length ? ahn_0.cwR[n] : ahn_0.cwO;
        boolean bl = stringArray.length >= 9 && Boolean.TRUE.toString().equalsIgnoreCase(stringArray[8]);
        return new aho(ahn_02, bl);
    }

    private static int a(String[] stringArray, int n, int n2) {
        if (stringArray == null || n >= stringArray.length) {
            return n2;
        }
        try {
            return Integer.parseInt(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public final String bzY() {
        return this.cwE + cwN + this.cwF + cwN + this.cwG + cwN + this.cwH + cwN + this.cwI.ordinal() + cwN + this.cwK + cwN + this.cwL + cwN + (this.cwJ == null ? "" : this.cwJ) + cwN + this.cwM;
    }
}

