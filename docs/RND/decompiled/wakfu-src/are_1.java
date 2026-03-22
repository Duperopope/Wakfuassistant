/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arE
 */
public class are_1
extends RuntimeException
implements agb_2 {
    private static final String cUK = "ALL";
    private static final String cUL = "animation-missing";
    private final String cUM;
    private final String cUN;

    are_1(String string, String string2, String string3) {
        super(string);
        this.cUM = string2;
        this.cUN = string3;
    }

    are_1(String string) {
        this.cUM = string;
        this.cUN = cUK;
    }

    public String aXV() {
        return this.cUM;
    }

    public String bkI() {
        return this.cUN;
    }

    @Override
    public String[] bHQ() {
        return new String[]{cUL, this.cUM, this.cUN};
    }
}

