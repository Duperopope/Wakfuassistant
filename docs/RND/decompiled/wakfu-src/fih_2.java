/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIH
 */
public class fih_2
implements fiz_2 {
    public static final byte uBR = 2;
    private String bKP;

    public fih_2(String string) {
        this.bKP = string;
    }

    public String getText() {
        return this.bKP;
    }

    public void setText(String string) {
        this.bKP = string;
    }

    @Override
    public byte aFW() {
        return 2;
    }
}

