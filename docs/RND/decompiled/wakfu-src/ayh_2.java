/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayH
 */
public class ayh_2
extends RuntimeException
implements agb_2 {
    private static final String dtO = "unhandled-message";
    private final String dtP;
    private final String dtQ;

    public ayh_2(String string, String string2, String string3) {
        super(string);
        this.dtP = string2;
        this.dtQ = string3;
    }

    @Override
    public String[] bHQ() {
        return new String[]{dtO, this.dtP, this.dtQ};
    }
}

