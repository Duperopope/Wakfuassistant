/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSy
 */
public class bsy_1
extends aeb_1 {
    private static final String lhd = "accountPreferences%d.properties";
    private final long lhe;

    public bsy_1(long l) {
        super(String.format(lhd, l));
        this.lhe = l;
        this.dJ(false);
        this.dI(true);
    }

    public long xl() {
        return this.lhe;
    }

    @Override
    public String toString() {
        return String.format("%s (file related : %s, account related : %s)", this.getClass().getName(), this.aLM(), this.xl());
    }
}

