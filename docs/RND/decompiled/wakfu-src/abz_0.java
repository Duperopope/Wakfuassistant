/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abZ
 */
public class abz_0
extends aca {
    private final int cfx;
    private final agg_0 cfy = new agg_0();
    private int bUi;
    private final float[] cfz;
    private int bUj;

    public abz_0(float[] fArray, int n, long l) {
        super(1.0f);
        this.cfz = fArray;
        this.cfx = n * 1000;
        this.bUj = (int)(l / (long)this.cfx) % this.cfz.length;
        this.cfy.setSpeed(1.0f / ((float)n * 0.5f));
        this.cfy.cG(this.cfz[this.bUj]);
    }

    public abz_0(int n, long l) {
        this(abz_0.rC(100), n, l);
    }

    public static float[] rC(int n) {
        abl_1 abl_12 = new abl_1(0.55f, 0.35f, n);
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            fArray[i] = GC.b((float)abl_12.nextDouble(), 0.0f, 1.0f);
        }
        return fArray;
    }

    public static float[] a(int n, float f2, float f3) {
        abl_1 abl_12 = new abl_1(0.55f, 0.35f, n);
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            fArray[i] = GC.b((float)abl_12.nextDouble(), f2, f3);
        }
        return fArray;
    }

    @Override
    public boolean rl(int n) {
        this.bUi += n;
        if (this.bUi > this.cfx) {
            this.bUi = 0;
            ++this.bUj;
            if (this.bUj >= this.cfz.length) {
                this.bUj = 0;
            }
            this.cfy.aS(this.cfz[this.bUj]);
        }
        this.cfy.sj(n);
        return super.rl(n);
    }

    @Override
    public float bnY() {
        return super.bnY() * this.cfy.getValue();
    }
}

