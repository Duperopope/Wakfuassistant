/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from akr
 */
public class akr_1
implements ali_2 {
    private final long cCF;
    private final boolean cCG;
    private final float cCH;
    private final int cCI;
    private final long cCJ;
    private final float cCK;
    private final float cCL;

    public akr_1(long l) {
        this(l, false);
    }

    public akr_1(long l, boolean bl) {
        this(l, bl, 100.0f);
    }

    public akr_1(long l, boolean bl, float f2) {
        this(l, bl, f2, 0);
    }

    public akr_1(long l, boolean bl, float f2, int n) {
        this(l, bl, f2, n, 0L);
    }

    public akr_1(long l, boolean bl, float f2, int n, long l2) {
        this(l, bl, f2, n, l2, 1.0f, 1.0f);
    }

    public akr_1(long l, boolean bl, float f2, int n, long l2, float f3, float f4) {
        this.cCF = l;
        this.cCG = bl;
        this.cCH = f2;
        this.cCI = n;
        this.cCJ = l2;
        this.cCK = f3;
        this.cCL = f4;
    }

    @Generated
    public long bBy() {
        return this.cCF;
    }

    @Generated
    public boolean bBz() {
        return this.cCG;
    }

    @Generated
    public float bBA() {
        return this.cCH;
    }

    @Generated
    public int bBB() {
        return this.cCI;
    }

    @Generated
    public long bBC() {
        return this.cCJ;
    }

    @Override
    @Generated
    public float bBu() {
        return this.cCK;
    }

    @Override
    @Generated
    public float bBv() {
        return this.cCL;
    }
}

