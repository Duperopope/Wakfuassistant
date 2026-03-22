/*
 * Decompiled with CFR 0.152.
 */
@Deprecated
public final class fqI
extends Enum<fqI> {
    public static final /* enum */ fqI sVt = new fqI();
    public static final /* enum */ fqI sVu = new fqI();
    public static final /* enum */ fqI sVv = new fqI();
    public static final /* enum */ fqI sVw = new fqI();
    public static final /* enum */ fqI sVx = new fqI();
    private static final /* synthetic */ fqI[] sVy;

    public static fqI[] values() {
        return (fqI[])sVy.clone();
    }

    public static fqI valueOf(String string) {
        return Enum.valueOf(fqI.class, string);
    }

    public boolean isValid() {
        return this == sVt;
    }

    private static /* synthetic */ fqI[] giV() {
        return new fqI[]{sVt, sVu, sVv, sVw, sVx};
    }

    static {
        sVy = fqI.giV();
    }
}

