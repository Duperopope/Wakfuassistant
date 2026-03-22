/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apB
 */
public class apb_2
implements apj_2 {
    private String cOh = null;
    private apl_2 cOi = null;
    private int Yk = -1;

    public String toString() {
        return "[IgnoreTagValue:" + this.cOi.bEX() + "]" + this.cOh;
    }

    void c(apl_2 apl_22) {
        this.cOi = apl_22;
    }

    @Override
    public apl_2 bEV() {
        return this.cOi;
    }

    void setValue(String string) {
        this.cOh = string;
    }

    @Override
    public String getValue() {
        return this.cOh;
    }

    @Override
    public int bES() {
        return 0;
    }

    void tr(int n) {
        this.Yk = n;
    }

    @Override
    public int wp() {
        return this.Yk;
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
}

