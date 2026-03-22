/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fSp
 */
public class fsp_2
implements aeh_2,
Comparable {
    private static final String vdO = "displayName";
    private static final String vdP = "hasDescription";
    private static final String vdQ = "themeDescription";
    private static final String[] vdR = new String[]{"displayName", "hasDescription", "themeDescription"};
    private final int vdS;
    private final String vdT;
    private final String vdU;
    private final String vdV;
    private final String vdW;

    public fsp_2(int n, String string, String string2, String string3) {
        this(n, string, string2, string3, null);
    }

    public fsp_2(int n, String string, String string2, String string3, String string4) {
        this.vdS = n;
        this.vdT = string;
        this.vdU = string2;
        this.vdV = string3;
        this.vdW = string4 == null ? null : string4.trim();
    }

    public String gFU() {
        return this.vdT;
    }

    public String gFV() {
        return this.vdU;
    }

    @Override
    public String[] bxk() {
        return vdR;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "displayName": {
                return this.vdV;
            }
            case "hasDescription": {
                return this.vdW != null && !this.vdW.isEmpty();
            }
            case "themeDescription": {
                return this.vdW;
            }
        }
        return null;
    }

    public boolean equals(Object object) {
        if (!(object instanceof fsp_2)) {
            return false;
        }
        if (this.vdU == null) {
            return ((fsp_2)object).vdU == null;
        }
        return this.vdU.equals(((fsp_2)object).vdU) && this.vdT.equals(((fsp_2)object).vdT);
    }

    public int hashCode() {
        return this.vdU.hashCode() + 9 * this.vdT.hashCode();
    }

    public int compareTo(@NotNull Object object) {
        if (!(object instanceof fsp_2)) {
            return 0;
        }
        fsp_2 fsp_22 = (fsp_2)object;
        if (this.vdU == null) {
            return -1;
        }
        if (fsp_22.vdU == null) {
            return 1;
        }
        int n = Integer.compare(this.vdS, fsp_22.vdS);
        if (n != 0) {
            return n;
        }
        if (this.vdV == null || fsp_22.vdV == null) {
            return 0;
        }
        return this.vdV.compareTo(fsp_22.vdV);
    }
}

