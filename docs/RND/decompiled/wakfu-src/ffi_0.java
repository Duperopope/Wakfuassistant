/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ffI
 */
public abstract class ffi_0
extends ffh_0 {
    private long cwe;
    private long dQk;
    public static final int sgb = Integer.MAX_VALUE;

    public long Tz() {
        return this.cwe;
    }

    public void fY(long l) {
        this.cwe = l;
    }

    public long MJ() {
        return this.dQk;
    }

    public void qw(long l) {
        this.dQk = l;
    }

    public void fVF() {
        this.cwe = Integer.MAX_VALUE;
    }

    public boolean bbY() {
        return this.cwe == Integer.MAX_VALUE;
    }

    public boolean aOY() {
        return this.dQk + this.cwe > ue_0.bjV().bjg();
    }
}

