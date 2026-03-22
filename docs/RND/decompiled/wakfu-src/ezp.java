/*
 * Decompiled with CFR 0.152.
 */
public final class ezp
extends Enum<ezp> {
    public static final /* enum */ ezp prnn = new ezp(new ezt(0, 74));
    public static final /* enum */ ezp pro = new ezp(new ezt(1, 75, 1));
    public static final /* enum */ ezp prp = new ezp(new ezt(2, 76, 2, 3, 4));
    public static final /* enum */ ezp prq = new ezp(new ezt(3, 77, 5, 6, 7, 8, 9, 10));
    public static final /* enum */ ezp prr = new ezp(new ezt(4, 78, 11, 12, 13, 14, 15, 16, 70));
    public static final /* enum */ ezp prs = new ezp(new ezt(5, 79, 17, 18, 19, 20, 21, 22, 23, 24, 25));
    public static final /* enum */ ezp prt = new ezp(new ezt(6, 80, 26, 27, 28, 29, 30, 31, 32, 33, 34));
    public static final /* enum */ ezp pru = new ezp(new ezt(7, 81, 35, 36, 37, 38, 39, 40, 41, 42, 71));
    public static final /* enum */ ezp prv = new ezp(new ezt(8, 82, 43, 44, 45, 46, 47, 48, 49, 50, 51, 85));
    public static final /* enum */ ezp prw = new ezp(new ezt(9, 83, 52, 53, 54, 55, 56, 57, 58, 59));
    public static final /* enum */ ezp prx = new ezp(new ezt(10, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 72, 73, 84, 86));
    private final ezt pry;
    private static final /* synthetic */ ezp[] prz;

    public static ezp[] values() {
        return (ezp[])prz.clone();
    }

    public static ezp valueOf(String string) {
        return Enum.valueOf(ezp.class, string);
    }

    private ezp(ezt ezt2) {
        this.pry = ezt2;
    }

    public ezt fmy() {
        return this.pry;
    }

    private static /* synthetic */ ezp[] fmz() {
        return new ezp[]{prnn, pro, prp, prq, prr, prs, prt, pru, prv, prw, prx};
    }

    static {
        prz = ezp.fmz();
    }
}

