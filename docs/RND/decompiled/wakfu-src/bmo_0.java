/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMO
 */
public class bmo_0
implements aeh_2 {
    public static final String kzn = "state";
    public static final String kzo = "value";
    private final short kzp;
    private int aQL;

    public bmo_0(short s, int n) {
        this.kzp = s;
        this.aQL = n;
    }

    public void setValue(int n) {
        this.aQL = n;
        fse_1.gFu().a((aef_2)this, kzo);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kzn)) {
            return fqX.gjM().Zr(this.kzp);
        }
        if (string.equals(kzo)) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.aQL >= 0) {
                stringBuilder.append("+");
            }
            stringBuilder.append(this.aQL).append("%");
            return stringBuilder.toString();
        }
        return null;
    }
}

