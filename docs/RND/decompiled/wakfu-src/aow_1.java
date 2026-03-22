/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoW
 */
public abstract class aow_1 {
    private String p = "";
    private aou_1[] cNf = null;

    public aow_1(String string, aou_1 ... aou_1Array) {
        if (string == null) {
            throw new IllegalArgumentException("Nom de liste ne peut \u00eatre null.");
        }
        this.p = string;
        this.cNf = aou_1Array;
    }

    public aow_1(aou_1 ... aou_1Array) {
        this("", aou_1Array);
    }

    public final int bEJ() {
        return this.cNf != null ? this.cNf.length : 0;
    }

    public final String bEK() {
        return this.p;
    }

    public aou_1 tl(int n) {
        return this.cNf[n];
    }

    public abstract aou_1[] bdl();
}

