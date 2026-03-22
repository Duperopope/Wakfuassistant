/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDu
 */
public abstract class adu_2
implements ayx_2 {
    private adt_2 dDC = null;
    private int dDD = 0;
    private boolean dDE = false;
    private boolean dDF = true;
    private final Object dDG = new Object();
    private int atn;

    protected adu_2() {
    }

    public adt_2 bYo() {
        return this.dDC;
    }

    public void c(adt_2 adt_22) {
        this.dDC = adt_22;
    }

    public int bYp() {
        return this.dDD;
    }

    public void xe(int n) {
        this.dDD = n;
    }

    public boolean bYq() {
        return this.dDE;
    }

    public void dC(boolean bl) {
        this.dDE = bl;
    }

    public Object bYr() {
        return this.dDG;
    }

    public int aHp() {
        return this.atn;
    }

    public void ma(int n) {
        this.atn = n;
    }

    public boolean bYs() {
        return true;
    }

    public boolean bYt() {
        return this.dDF;
    }

    public void dD(boolean bl) {
        this.dDF = bl;
    }

    private void reset() {
        this.dDC = null;
        this.dDD = 0;
        this.dDE = true;
        this.dDF = true;
        this.atn = -1;
    }

    @Override
    public void aVI() {
        this.reset();
    }

    @Override
    public void aVH() {
        this.reset();
    }
}

