/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnR
 */
public final class bnr_1
extends Enum<bnr_1> {
    public static final /* enum */ bnr_1 iKk = new bnr_1();
    public static final /* enum */ bnr_1 iKl = new bnr_1();
    public static final /* enum */ bnr_1 iKm = new bnr_1();
    public static final /* enum */ bnr_1 iKn = new bnr_1();
    public static final /* enum */ bnr_1 iKo = new bnr_1();
    private static final /* synthetic */ bnr_1[] iKp;

    public static bnr_1[] values() {
        return (bnr_1[])iKp.clone();
    }

    public static bnr_1 valueOf(String string) {
        return Enum.valueOf(bnr_1.class, string);
    }

    public boolean dzA() {
        switch (this.ordinal()) {
            case 0: 
            case 1: {
                return false;
            }
            case 2: 
            case 3: 
            case 4: {
                return true;
            }
        }
        throw new IllegalArgumentException("R\u00e9sultat " + String.valueOf((Object)this) + " non g\u00e9r\u00e9");
    }

    public String dzB() {
        switch (this.ordinal()) {
            case 2: 
            case 3: {
                return "dimensionalBag.error.ie.badPosition";
            }
            case 4: {
                return "dimensionalBag.error.ie.maxContentReached";
            }
        }
        throw new IllegalArgumentException("R\u00e9sultat " + String.valueOf((Object)this) + " non g\u00e9r\u00e9");
    }

    private static /* synthetic */ bnr_1[] dzC() {
        return new bnr_1[]{iKk, iKl, iKm, iKn, iKo};
    }

    static {
        iKp = bnr_1.dzC();
    }
}

