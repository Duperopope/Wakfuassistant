/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from akP
 */
public class akp_1
extends alo_1<akq_2> {
    private final int cEi;
    private final int cEj;
    private final int cEk;
    private final boolean cEl;

    public akp_1(akq_2 akq_22, float f2, int n, int n2, int n3, boolean bl) {
        this(akq_22, f2, 1.0f, 1.0f, n, n2, n3, bl);
    }

    public akp_1(akq_2 akq_22, float f2, float f3, float f4, int n, int n2, int n3, boolean bl) {
        super(akq_22, f2, f3, f4);
        this.cEi = n;
        this.cEj = n2;
        this.cEk = n3;
        this.cEl = bl;
    }

    @Generated
    public int getDuration() {
        return this.cEi;
    }

    @Generated
    public int bBF() {
        return this.cEj;
    }

    @Generated
    public int bBG() {
        return this.cEk;
    }

    @Generated
    public boolean bBD() {
        return this.cEl;
    }
}

