/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBH
 */
public class abh_1 {
    private final float dzf;
    private final float dzg;
    private final float dzh;
    private final float dzi;

    public abh_1(float f2, float f3, float f4, float f5) {
        this.dzf = f2;
        this.dzg = f3;
        this.dzh = f4;
        this.dzi = f5;
    }

    public float bY(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new RuntimeException("Time index out of bounds : t=" + f2);
        }
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return (2.0f * f4 - 3.0f * f3 + 1.0f) * this.dzf + (f4 - 2.0f * f3 + f2) * this.dzh + (-2.0f * f4 + 3.0f * f3) * this.dzg + (f4 - f3) * this.dzi;
    }
}

