/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blu
 */
public class blu_0
implements aeh_2 {
    public static final String iuC = "isAlphabeticalSorted";
    public static final String iuD = "isLevelSorted";
    public static final String iuE = "filterType";
    private blv_0 iuF = blv_0.iuJ;
    private boolean iuG = false;
    private boolean iuH = false;
    public final String[] iuI = new String[]{"isAlphabeticalSorted", "isLevelSorted", "filterType"};

    @Override
    public String[] bxk() {
        return this.iuI;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iuC)) {
            return this.iuG;
        }
        if (string.equals(iuD)) {
            return this.iuH;
        }
        if (string.equals(iuE)) {
            return this.iuF.aHp();
        }
        return null;
    }

    public blv_0 dtH() {
        return this.iuF;
    }

    public void a(blv_0 blv_02) {
        this.iuF = blv_02;
    }

    public boolean dtI() {
        return this.iuG;
    }

    public void gs(boolean bl) {
        this.iuG = bl;
    }

    public boolean dtJ() {
        return this.iuH;
    }

    public void gt(boolean bl) {
        this.iuH = bl;
    }

    public String dtK() {
        return this.iuG + "," + this.iuH + "," + this.iuF.aHp();
    }

    public void lV(String string) {
        String[] stringArray = string.split(",");
        if (stringArray.length < 3) {
            return;
        }
        this.iuG = Boolean.parseBoolean(stringArray[0]);
        this.iuH = Boolean.parseBoolean(stringArray[1]);
        this.iuF = blv_0.DG(Integer.parseInt(stringArray[2]));
    }
}

