/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fez
 */
public final class fez_0
extends Enum<fez_0> {
    public static final /* enum */ fez_0 sep = new fez_0(new feA());
    public static final /* enum */ fez_0 seq = new fez_0(new feB());
    private final aza_2<? extends fff> ser;
    private static final /* synthetic */ fez_0[] ses;

    public static fez_0[] values() {
        return (fez_0[])ses.clone();
    }

    public static fez_0 valueOf(String string) {
        return Enum.valueOf(fez_0.class, string);
    }

    private fez_0(aza_2<? extends fff> aza_22) {
        this.ser = aza_22;
    }

    public fff fUz() {
        return this.ser.createNew();
    }

    private static /* synthetic */ fez_0[] fUA() {
        return new fez_0[]{sep, seq};
    }

    static {
        ses = fez_0.fUA();
    }
}

