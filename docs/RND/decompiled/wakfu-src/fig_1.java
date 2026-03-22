/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIG
 */
public class fig_1
implements fiz_2 {
    public static final byte uBQ = 3;
    private String crF;
    private String bKP;

    public fig_1(String string, String string2) {
        this.crF = string;
        this.bKP = string2;
    }

    public String byf() {
        return this.crF;
    }

    public void setIconUrl(String string) {
        this.crF = string;
    }

    public String getText() {
        return this.bKP;
    }

    public void setText(String string) {
        this.bKP = string;
    }

    @Override
    public byte aFW() {
        return 3;
    }
}

