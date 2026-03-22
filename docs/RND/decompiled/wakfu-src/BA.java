/*
 * Decompiled with CFR 0.152.
 */
abstract sealed class BA
extends Enum<BA>
permits BB, BC, BD, BE, BF, BG {
    public static final /* enum */ BA avf = new BB("name");
    public static final /* enum */ BA avg = new BC("nationName");
    public static final /* enum */ BA avh = new BD("breedName");
    public static final /* enum */ BA avi = new BE("almanachName");
    public static final /* enum */ BA avj = new BF("almanachDescription");
    public static final /* enum */ BA avk = new BG("almanachMonth");
    private final String avl;
    private static final /* synthetic */ BA[] avm;

    public static BA[] values() {
        return (BA[])avm.clone();
    }

    public static BA valueOf(String string) {
        return Enum.valueOf(BA.class, string);
    }

    BA(String string2) {
        this.avl = string2;
    }

    public String aHV() {
        return this.avl;
    }

    public abstract String getValue();

    public static BA aO(String string) {
        for (BA bA : BA.values()) {
            if (!bA.aHV().equals(string)) continue;
            return bA;
        }
        return null;
    }

    private static /* synthetic */ BA[] aHW() {
        return new BA[]{avf, avg, avh, avi, avj, avk};
    }

    static {
        avm = BA.aHW();
    }
}

