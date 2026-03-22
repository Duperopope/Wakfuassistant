/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHc
 */
public class ahc_2 {
    private long dNY;
    private long dNZ;
    private byte dOa;
    private short dOb;
    private byte asH;
    private int dOc;

    public ahc_2() {
    }

    public ahc_2(long l, byte by, short s, byte by2) {
        this(l, by, s, by2, 1);
    }

    public ahc_2(long l, byte by, short s, byte by2, int n) {
        this(l, l, by, s, by2, n);
    }

    public ahc_2(long l, long l2, byte by, short s, byte by2, int n) {
        this.dNY = l;
        this.dNZ = l2;
        this.dOa = by;
        this.dOb = s;
        this.asH = by2;
        this.dOc = n;
    }

    public long ccf() {
        return this.dNY;
    }

    public long ccg() {
        return this.dNZ == -1L ? this.dNY : this.dNZ;
    }

    public byte cch() {
        return this.dOa;
    }

    public short cci() {
        return this.dOb;
    }

    public byte aGu() {
        return this.asH;
    }

    public int ccj() {
        return this.dOc;
    }

    public void a(apl_1 apl_12) {
        this.dNY = apl_12.bFQ();
        this.dNZ = apl_12.bFQ();
        this.dOa = apl_12.aIy();
        this.dOb = apl_12.aIz();
        this.asH = apl_12.aIy();
        this.dOc = apl_12.aIA();
    }

    public void b(fs_0 fs_02) {
        fs_02.cq(this.dNY);
        fs_02.cq(this.dNZ);
        fs_02.g(this.dOa);
        fs_02.k(this.dOb);
        fs_02.g(this.asH);
        fs_02.mz(this.dOc);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ahc_2)) {
            return false;
        }
        ahc_2 ahc_22 = (ahc_2)object;
        return this.dNY == ahc_22.dNY && this.dNZ == ahc_22.dNZ && this.dOa == ahc_22.dOa && this.dOb == ahc_22.dOb && this.asH == ahc_22.asH && this.dOc == ahc_22.dOc;
    }
}

