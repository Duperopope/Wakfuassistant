/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHU
 */
public class chu_2
implements aeh_2 {
    public static final String nbA = "turn";
    private int nbB;

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("timelineElementType")) {
            return 2;
        }
        if (string.equals(nbA)) {
            return this.nbB;
        }
        return null;
    }

    public int eKM() {
        return this.nbB;
    }

    public void Mb(int n) {
        this.nbB = n;
        fse_1.gFu().a((aef_2)this, nbA);
    }
}

