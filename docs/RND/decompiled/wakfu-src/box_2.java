/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOx
 */
public class box_2
implements aeh_2 {
    private static final String kLn = "valueMin";
    private static final String kLo = "valueMax";
    private static final String kLp = "intervalText";
    private final int kLq;
    private final int kLr;
    private final int kLs;
    private final String[] kLt = new String[]{"valueMin", "valueMax", "intervalText"};

    public box_2(abm_1 abm_12, int n) {
        this.kLq = abm_12.bWb();
        this.kLr = abm_12.bWc();
        this.kLs = n;
    }

    @Override
    public String[] bxk() {
        return this.kLt;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kLn)) {
            return Float.valueOf((float)this.kLq / (float)this.kLs);
        }
        if (string.equals(kLo)) {
            return Float.valueOf((float)this.kLr / (float)this.kLs);
        }
        if (string.equals(kLp)) {
            if (this.kLq > 100 && this.kLr > 100) {
                return boy_2.IC(this.kLq) + " - " + boy_2.IC(this.kLr);
            }
            return this.kLq + " - " + this.kLr;
        }
        return null;
    }

    public int egZ() {
        return this.kLq;
    }

    public int eha() {
        return this.kLr;
    }

    public boolean IB(int n) {
        return n <= this.kLr && n >= this.kLq;
    }

    public String toString() {
        return "interval : " + this.kLq + "-" + this.kLr;
    }
}

