/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axS
 */
public class axs_1 {
    private axt_1 drK;
    private long drL;
    private long drM;

    public axs_1(axt_1 axt_12, long l) {
        this.drK = axt_12;
        this.drL = l;
        this.drM = 0L;
    }

    public long gF(long l) {
        long l2 = 1000000000L / this.drL;
        long l3 = l - this.drM;
        long l4 = l2 - l3;
        return l4 >= 0L ? l4 : 0L;
    }

    public long gG(long l) {
        long l2 = 1000000000L / this.drL;
        long l3 = l - this.drM;
        this.drM = l;
        return l3 / l2;
    }

    public axt_1 bRy() {
        return this.drK;
    }

    public void c(axt_1 axt_12) {
        this.drK = axt_12;
    }

    public long bRz() {
        return this.drL;
    }

    public void gH(long l) {
        this.drL = l;
    }

    public long bRA() {
        return this.drM;
    }

    public void gI(long l) {
        this.drM = l;
    }
}

