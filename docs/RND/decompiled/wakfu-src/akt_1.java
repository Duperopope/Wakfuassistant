/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from akt
 */
public class akt_1
implements ali_2 {
    private final long cCP;
    private final int cCQ;
    private final int cCR;
    private final int cCS;
    private final boolean cCT;
    private final boolean cCU;
    private final float cCV;
    private final float cCW;

    public akt_1(long l, int n, int n2, int n3) {
        this(l, n, n2, n3, false);
    }

    public akt_1(long l, int n, int n2, int n3, boolean bl) {
        this(l, n, n2, n3, bl, false);
    }

    public akt_1(long l, int n, int n2, int n3, boolean bl, boolean bl2) {
        this(l, n, n2, n3, bl, bl2, 1.0f, 1.0f);
    }

    public akt_1(long l, int n, int n2, int n3, boolean bl, boolean bl2, float f2, float f3) {
        this.cCP = l;
        this.cCQ = n;
        this.cCR = n2;
        this.cCS = n3;
        this.cCT = bl;
        this.cCU = bl2;
        this.cCV = f2;
        this.cCW = f3;
    }

    @Generated
    public long bBy() {
        return this.cCP;
    }

    @Generated
    public int getX() {
        return this.cCQ;
    }

    @Generated
    public int getY() {
        return this.cCR;
    }

    @Generated
    public int NN() {
        return this.cCS;
    }

    @Generated
    public boolean bBD() {
        return this.cCT;
    }

    @Generated
    public boolean bBz() {
        return this.cCU;
    }

    @Override
    @Generated
    public float bBu() {
        return this.cCV;
    }

    @Override
    @Generated
    public float bBv() {
        return this.cCW;
    }
}

