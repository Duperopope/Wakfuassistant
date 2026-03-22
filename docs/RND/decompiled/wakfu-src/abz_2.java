/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBZ
 */
final class abz_2
extends abx_2 {
    @Override
    public float h(float f2, float f3, float f4) {
        float f5 = f4 * (float)Math.PI;
        float f6 = (1.0f - (float)Math.cos(f5)) * 0.5f;
        return f2 * (1.0f - f6) + f3 * f6;
    }
}

