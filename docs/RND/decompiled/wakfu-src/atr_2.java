/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from atR
 */
public abstract class atr_2
extends atq_1 {
    protected final ld_2 ddG;

    protected atr_2(ld_2 ld_22) {
        this.ddG = ld_22;
    }

    public ld_2 bMl() {
        return this.ddG;
    }

    public static atr_2 a(ld_2 ld_22) {
        return ld_22.aRc() ? new att_1(ld_22) : new ats_2(ld_22);
    }
}

