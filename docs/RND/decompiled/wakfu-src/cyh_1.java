/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYh
 */
public class cyh_1
implements aeh_2 {
    public static final String nXR = "item";
    public static final String nXS = "text";
    private final bgv_2 nXT;
    private final String nXU;

    public cyh_1(int n, String string) {
        this.nXT = (bgv_2)fgD.fXh().Vd(n);
        this.nXU = string;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nXR)) {
            return this.nXT;
        }
        if (string.equals(nXS)) {
            return this.nXU;
        }
        return null;
    }
}

