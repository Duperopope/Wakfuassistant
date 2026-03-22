/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anL
 */
public class anl_1
extends ant_2 {
    private final String cKt;

    public anl_1(String string) {
        this(string, true);
    }

    public anl_1(String string, boolean bl) {
        super(string);
        this.cKg = amr_2.cIh;
        this.cKt = bl && string.startsWith("\"") && string.endsWith("\"") ? string.substring(1, string.length() - 1) : string;
    }

    @Override
    public String getValue() {
        return this.cKt;
    }
}

