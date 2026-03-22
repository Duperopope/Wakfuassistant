/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anI
 */
public class ani_1
extends ant_2 {
    private final Long cKs;

    public ani_1(String string) {
        super(string);
        this.cKg = amr_2.cIi;
        this.cKs = Long.parseLong(string);
    }

    public ani_1(String string, Long l) {
        super(string);
        this.cKg = amr_2.cIi;
        this.cKs = l;
    }

    public Long bDS() {
        return this.cKs;
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.bDS();
    }
}

