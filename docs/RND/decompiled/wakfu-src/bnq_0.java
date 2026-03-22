/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNq
 */
public class bnq_0
extends bno_0<fap> {
    public static final String kCf = "amount";

    public bnq_0(fap fap2) {
        super(fap2);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kCf)) {
            return aum_0.cWf().cQ(Math.abs(((fap)this.kCc).aaW())) + "\u00a7";
        }
        return super.eu(string);
    }

    @Override
    protected int aeV() {
        return 1;
    }
}

