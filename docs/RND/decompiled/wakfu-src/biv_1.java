/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIV
 */
public class biv_1
implements aeh_2 {
    public static final String kiO = "iconStyle";
    public static final String kiP = "title";
    public static final String kiQ = "text";
    public static final String kiR = "index";
    public static final String kiS = "type";
    public final String[] kiT = new String[]{"iconStyle", "title", "text", "index", "type"};
    private final biu_1 kiU;
    private final String kiV;
    private final String kiW;
    private final int kiX;
    private int cxt;
    private final aef_2 kiY;

    public biv_1(biu_1 biu_12, String string, String string2, int n, aef_2 aef_22) {
        this.kiU = biu_12;
        this.kiV = string;
        this.kiW = string2;
        this.kiX = n;
        this.kiY = aef_22;
    }

    @Override
    public String[] bxk() {
        return this.kiT;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kiO)) {
            String string2 = this.kiU.dZv();
            return string2 == null ? "none" : string2;
        }
        if (string.equals(kiP)) {
            return this.kiV;
        }
        if (string.equals(kiR)) {
            return this.cxt;
        }
        if (string.equals(kiQ)) {
            return this.kiW;
        }
        if (string.equals(kiS)) {
            return this.kiU.aeV();
        }
        if (this.kiY != null) {
            return this.kiY.eu(string);
        }
        return null;
    }

    public biu_1 dZx() {
        return this.kiU;
    }

    public int wp() {
        return this.cxt;
    }

    public void tr(int n) {
        this.cxt = n;
    }

    public int getSoundId() {
        return this.kiX;
    }

    public String toString() {
        return this.kiV + " index=" + this.cxt;
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }
}

