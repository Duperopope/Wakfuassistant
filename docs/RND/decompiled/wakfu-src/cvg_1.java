/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVG
 */
public class cvg_1
implements aeh_2 {
    public static final String nQj = "title";
    public static final String nQk = "description";
    private final String nQl;
    private final String nQm;

    public cvg_1(String string, String string2) {
        this.nQl = string;
        this.nQm = string2;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nQj)) {
            return this.nQl;
        }
        if (string.equals(nQk)) {
            return this.nQm;
        }
        return null;
    }
}

