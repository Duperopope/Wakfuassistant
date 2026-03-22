/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from UK
 */
public class uk_0 {
    public static final uk_0 bwJ = new uk_0(0, 0, 0, 0, 0, 0);
    public static final uk_0 bwK = new uk_0(0, 0, 0, 1, 0, 0);
    public static final uk_0 bwL = new uk_0(0, 0, 1, 0, 0, 0);
    public static final uk_0 bwM = new uk_0(0, 0, 7, 0, 0, 0);
    public static final uk_0 bwN = new uk_0(0, 1, 0, 0, 0, 0);
    public static final uk_0 bwO = new uk_0(1, 0, 0, 0, 0, 0);
    private final int bwP;
    private final int bwQ;
    private final int bwR;
    private final int bwS;
    private final int bwT;
    private final int bwU;
    private long bvQ;

    public uk_0(uk_0 uk_02) {
        this.bwP = uk_02.bwP;
        this.bwQ = uk_02.bwQ;
        this.bwR = uk_02.bwR;
        this.bwS = uk_02.bwS;
        this.bwT = uk_02.bwT;
        this.bwU = uk_02.bwU;
        this.bkc();
    }

    public uk_0(ua_0 ua_02) {
        this.bwP = 0;
        this.bwQ = 0;
        this.bwR = ua_02.bjR();
        this.bwS = ua_02.bjE();
        this.bwT = ua_02.bjF();
        this.bwU = ua_02.bjH();
        this.bkc();
    }

    public uk_0(int n, int n2, int n3, int n4, int n5, int n6) {
        this.bwP = n;
        this.bwQ = n2;
        this.bwR = n3;
        this.bwS = n4;
        this.bwT = n5;
        this.bwU = n6;
        this.bkc();
    }

    private void bkc() {
        this.bvQ = (long)(this.bwU | this.bwT << 8 | this.bwS << 16 | this.bwR << 24) | (long)this.bwQ << 32 | (long)this.bwP << 40;
    }

    public int bkd() {
        return this.bwP;
    }

    public int bke() {
        return this.bwQ;
    }

    public int bjR() {
        return this.bwR;
    }

    public int bjE() {
        return this.bwS;
    }

    public int bjF() {
        return this.bwT;
    }

    public int bjH() {
        return this.bwU;
    }

    public long bjB() {
        return this.bvQ;
    }

    public static uk_0 fq(long l) {
        long l2 = l;
        int n = (int)(l2 & 0xFFL);
        int n2 = (int)((l2 >>= 8) & 0xFFL);
        int n3 = (int)((l2 >>= 8) & 0xFFL);
        int n4 = (int)((l2 >>= 8) & 0xFFL);
        int n5 = (int)((l2 >>= 8) & 0xFFL);
        int n6 = (int)((l2 >>= 8) & 0xFFFFL);
        return new uk_0(n6, n5, n4, n3, n2, n);
    }

    public String toString() {
        return (String)(this.bwP != 0 ? this.bwP + " ans " : " ") + (String)(this.bwQ != 0 ? this.bwQ + " mois " : "") + (String)(this.bwR != 0 ? this.bwR + " jours " : "") + (String)(this.bwS != 0 ? this.bwS + " heures " : "") + (String)(this.bwT != 0 ? this.bwT + " minutes " : "") + (String)(this.bwU != 0 ? this.bwU + " secondes " : "");
    }
}

