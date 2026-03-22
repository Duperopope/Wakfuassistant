/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHa
 */
public final class aha_2
implements agn_1 {
    private final float dNG;
    private final float dNH;
    private final float dNI;
    private final boolean dNJ;
    private final int dNK;
    public static final double dNL = 4.8;

    public aha_2(float f2, float f3, float f4) {
        this(f2, f3, f4, false, 0);
    }

    public aha_2(float f2, float f3, float f4, boolean bl) {
        this(f2, f3, f4, bl, 0);
    }

    public aha_2(float f2, float f3, float f4, boolean bl, int n) {
        this.dNG = f2;
        this.dNH = f3;
        this.dNI = f4;
        this.dNJ = bl;
        this.dNK = n;
    }

    @Override
    public float bpl() {
        return this.dNG - this.dNH;
    }

    @Override
    public float bpm() {
        return -(this.dNG + this.dNH);
    }

    @Override
    public float bpn() {
        return (float)((double)this.dNI / 4.8);
    }

    @Override
    public boolean bpo() {
        return this.dNJ;
    }

    @Override
    public int bpp() {
        return this.dNK;
    }
}

