/*
 * Decompiled with CFR 0.152.
 */
public final class fqZ
extends Enum<fqZ>
implements aoq_1 {
    public static final /* enum */ fqZ sXj = new fqZ(0, "NO_FLAG");
    private final String sXk;
    private final int sXl;
    private static final /* synthetic */ fqZ[] sXm;

    public static fqZ[] values() {
        return (fqZ[])sXm.clone();
    }

    public static fqZ valueOf(String string) {
        return Enum.valueOf(fqZ.class, string);
    }

    private fqZ(int n2, String string2) {
        this.sXl = n2;
        this.sXk = string2;
    }

    public int gjO() {
        return this.sXl;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.sXl);
    }

    @Override
    public String aXB() {
        return this.sXk;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fqZ[] gjP() {
        return new fqZ[]{sXj};
    }

    static {
        sXm = fqZ.gjP();
    }
}

