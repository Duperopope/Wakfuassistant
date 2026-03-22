/*
 * Decompiled with CFR 0.152.
 */
public class dgv {
    private static final int okA = 300;
    private final dgx okB;
    private final String okC;
    private int okj = 300;
    private int bMn = Integer.MAX_VALUE;

    public dgv(dgx dgx2, String string) {
        this.okB = dgx2;
        this.okC = string;
    }

    public dgv(dgx dgx2, String string, int n) {
        this.okB = dgx2;
        this.okC = string;
        this.bMn = n;
    }

    public dgv(dgx dgx2, String string, int n, int n2) {
        this.okB = dgx2;
        this.okC = string;
        this.okj = n;
        this.bMn = n2;
    }

    public int fcS() {
        return this.okj;
    }

    public int getDuration() {
        return this.bMn;
    }

    public dgx fcO() {
        return this.okB;
    }

    public String getMessage() {
        return this.okC;
    }

    public void Og(int n) {
        this.okj = n;
    }

    public void setDuration(int n) {
        this.bMn = n;
    }
}

