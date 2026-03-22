/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOk
 */
public class bok_2
implements aeh_2 {
    private static final String kKb = "tutorialType";
    public static final String kKc = "imageUrl";
    public static final String kKd = "title";
    public static final String kKe = "description";
    public static final String kKf = "style";
    private final String kKg;
    private final String kKh;
    private final String kKi;
    private final int kKj;
    private int jdu = -1;

    public bok_2(String string, String string2, String string3, int n, int n2) {
        this(string, string2, string3, n);
        this.jdu = n2;
    }

    public bok_2(String string, String string2, String string3, int n) {
        this.kKg = string;
        this.kKh = string2;
        this.kKi = string3;
        this.kKj = n;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kKc)) {
            if (this.kKg == null) {
                return null;
            }
            return auc_0.cVq().kD(this.kKg);
        }
        if (string.equals(kKd)) {
            return this.kKh;
        }
        if (string.equals(kKe)) {
            return this.kKi;
        }
        if (string.equals(kKf)) {
            switch (this.kKj) {
                case 1: {
                    return kKb + this.kKj;
                }
            }
            return null;
        }
        return null;
    }

    public String bAD() {
        return this.kKh;
    }

    public int egI() {
        return this.jdu;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bok_2)) {
            return false;
        }
        bok_2 bok_22 = (bok_2)object;
        if (this.jdu != bok_22.jdu) {
            return false;
        }
        if (this.kKj != bok_22.kKj) {
            return false;
        }
        if (!this.kKi.equals(bok_22.kKi)) {
            return false;
        }
        if (this.kKg != null && !this.kKg.equals(bok_22.kKg)) {
            return false;
        }
        return this.kKh.equals(bok_22.kKh);
    }

    public int hashCode() {
        return 0;
    }
}

