/*
 * Decompiled with CFR 0.152.
 */
public class ahi
extends ahj {
    private final float cwo = 4.8f;
    private static final float cwp = 9.81f;
    private static final float cwq = 1.0f;
    private float cwi = 1.0f;
    private final float cwr = 9.81f;
    private final float cws;
    private final float cwt;
    private final float cwu;
    private float cwv;
    private final float cww;
    private final float cwx;
    private final float cwy;
    private final float cwz;
    private int bUi;

    public ahi(afW afW2, float f2, float f3, float f4, double d2) {
        this(afW2, f2, f3, f4, d2, 1.0f);
    }

    public ahi(afW afW2, float f2, float f3, float f4, double d2, float f5) {
        super(afW2);
        this.cwi = f5;
        this.cws = this.cwB.getWorldX();
        this.cwt = this.cwB.getWorldY();
        this.cwu = this.cwB.getAltitude();
        this.cwv = f4 - this.cwu;
        d2 = (float)Math.toRadians(d2 == 0.0 ? 1.0 : d2);
        float f6 = aco_1.bm(f2 - this.cws, f3 - this.cwt);
        float f7 = (float)Math.sqrt((double)(9.81f * f6) / Math.sin(2.0 * d2));
        double d3 = Math.atan((f3 - this.cwt) / (f2 - this.cws));
        if (f2 - this.cws < 0.0f) {
            d3 += Math.PI;
        }
        this.cwz = 2.0f * f7 * (float)Math.sin(d2) / 9.81f;
        double d4 = (double)f7 * Math.cos(d2);
        this.cww = (float)(Math.cos(d3) * d4);
        this.cwx = (float)(Math.sin(d3) * d4);
        this.cwy = f7 * (float)Math.sin(d2);
        this.cwv /= this.cwz;
    }

    @Override
    public void qy(int n) {
        this.bUi += n;
        float f2 = (float)this.bUi * (this.cwi / 1000.0f);
        if (this.cwB == null || f2 > this.cwz) {
            this.bzQ();
            return;
        }
        float f3 = this.cww * f2 + this.cws;
        float f4 = this.cwx * f2 + this.cwt;
        float f5 = -4.905f * f2 * f2 + this.cwy * f2;
        float f6 = 8.6f * f5 + this.cwu + f2 * this.cwv;
        this.cwB.e(f3, f4, f6);
    }

    @Override
    public float bzP() {
        return this.cwz * 1000.0f / this.cwi;
    }
}

