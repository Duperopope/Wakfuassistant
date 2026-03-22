/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agM
 */
class agm_0
implements agi_0 {
    agm_0() {
    }

    @Override
    public float j(float f2, float f3, float f4, float f5) {
        float f6 = Math.min(f2, f4);
        float f7 = Math.max(f2, f4);
        return GC.b(f3 + f5 * (f4 - f2), f6, f7);
    }
}

