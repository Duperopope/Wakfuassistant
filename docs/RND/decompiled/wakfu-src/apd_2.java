/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apD
 */
public class apd_2
implements apm_2 {
    private apn_2 cNp = null;
    private apl_2 cNQ = null;
    private String cOr = "aaa";
    private int Yk = -1;

    apd_2() {
    }

    void tr(int n) {
        this.Yk = n;
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
        return object;
    }

    public String toString() {
        return "[Text]" + this.cOr;
    }

    @Override
    public String bFb() {
        return this.cOr;
    }

    public void fy(String string) {
        this.cOr = string;
    }

    @Override
    public int bES() {
        return 0;
    }

    @Override
    public apn_2 bET() {
        return null;
    }

    @Override
    public int bER() {
        return 0;
    }

    @Override
    public String bEQ() {
        return null;
    }

    @Override
    public int wp() {
        return this.Yk;
    }
}

