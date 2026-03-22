/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from akI
 */
public class aki_1
implements ali_2 {
    private final long cDQ;
    private final boolean cDR;
    private final float cDS;
    private final int cDT;
    private final float cDU;
    private final float cDV;

    public aki_1(long l) {
        this(l, false);
    }

    public aki_1(long l, boolean bl) {
        this(l, bl, 100.0f);
    }

    public aki_1(long l, boolean bl, float f2) {
        this(l, bl, f2, 1);
    }

    public aki_1(long l, boolean bl, float f2, int n) {
        this(l, bl, f2, n, 1.0f, 1.0f);
    }

    public aki_1(long l, boolean bl, float f2, int n, float f3, float f4) {
        this.cDQ = l;
        this.cDR = bl;
        this.cDS = f2;
        this.cDT = n;
        this.cDU = f3;
        this.cDV = f4;
    }

    @Generated
    public long bBy() {
        return this.cDQ;
    }

    @Generated
    public boolean bBz() {
        return this.cDR;
    }

    @Generated
    public float bBA() {
        return this.cDS;
    }

    @Generated
    public int bBI() {
        return this.cDT;
    }

    @Override
    @Generated
    public float bBu() {
        return this.cDU;
    }

    @Override
    @Generated
    public float bBv() {
        return this.cDV;
    }
}

