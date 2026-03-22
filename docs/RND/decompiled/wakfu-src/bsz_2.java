/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSz
 */
public class bsz_2
extends aeb_1 {
    private static final String lhf = "characterPreferences-%s.properties";
    private final long lhg;

    public bsz_2(bgt_0 bgt_02) {
        super(String.format(lhf, bgt_02.getName()));
        this.lhg = bgt_02.Sn();
        this.dJ(false);
        this.dI(true);
    }

    public long KU() {
        return this.lhg;
    }

    @Override
    public String toString() {
        return String.format("%s (file related : %s, character related : %s)", this.getClass().getName(), this.aLM(), this.KU());
    }
}

