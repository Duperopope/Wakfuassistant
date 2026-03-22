/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTs
 */
public class fts_1
implements ftq_1 {
    private String cHc;
    private boolean jpH = false;
    private long dfi;
    private int bMn;
    private boolean bmw = true;

    public fts_1(String string, int n, long l) {
        this.cHc = string;
        this.bMn = n;
        this.dfi = l;
        this.bmw = this.bMn == Integer.MAX_VALUE;
    }

    public fts_1(String string) {
        this(string, Integer.MAX_VALUE, 0L);
    }

    public fts_1(boolean bl) {
        this.jpH = bl;
    }

    public String getId() {
        return this.cHc;
    }

    public int getDuration() {
        return this.bMn;
    }

    public long atA() {
        return this.dfi;
    }

    public void hq(long l) {
        this.dfi = l;
    }

    public boolean dJd() {
        return this.jpH;
    }

    public boolean aLB() {
        return this.bmw;
    }

    public void gGZ() {
        this.bmw = true;
    }

    public String toString() {
        return this.cHc;
    }
}

