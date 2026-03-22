/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIC
 */
public class eic_0 {
    private final long qwL;
    private long aDg;
    private String aFD;
    private short aZk;
    private long aDL;
    private byte aZm;
    private dR mmE;

    public eic_0(long l) {
        this.qwL = l;
    }

    public void a(eic_0 eic_02) {
        if (this.qwL != eic_02.qwL) {
            throw new IllegalStateException("Trying to merge a data from another with a different ID");
        }
        this.aFD = eic_02.aFD;
        this.aDg = eic_02.aDg;
        this.aZk = eic_02.aZk;
        this.aDL = eic_02.aDL;
        this.aZm = eic_02.aZm;
        this.mmE = eic_02.mmE;
    }

    public long KU() {
        return this.qwL;
    }

    public long xl() {
        return this.aDg;
    }

    public void nL(long l) {
        this.aDg = l;
    }

    public String xO() {
        return this.aFD;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public short aWP() {
        return this.aZk;
    }

    public void aT(short s) {
        this.aZk = s;
    }

    public long Ya() {
        return this.aDL;
    }

    public void jQ(long l) {
        this.aDL = l;
    }

    public byte aWO() {
        return this.aZm;
    }

    public void aQ(byte by) {
        this.aZm = by;
    }

    public void d(dR dR2) {
        this.mmE = dR2;
    }

    public dR fwD() {
        return this.mmE;
    }
}

