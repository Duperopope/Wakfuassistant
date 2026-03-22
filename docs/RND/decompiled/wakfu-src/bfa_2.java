/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfA
 */
public class bfa_2
implements aeM {
    private final float hUj;
    private final float hUk;
    private final float hUl;
    private final int hUm;
    private final int hUn;

    public bfa_2(float f2, float f3, float f4, int n, int n2) {
        this.hUk = f2;
        this.hUl = f3;
        this.hUj = f4;
        this.hUm = n;
        this.hUn = n2;
    }

    @Override
    public int bwN() {
        return this.hUm;
    }

    @Override
    public int bwO() {
        return this.hUn;
    }

    @Override
    public float a(aro_1 aro_12) {
        return this.hUj;
    }

    @Override
    public float b(aro_1 aro_12) {
        float f2 = (float)this.hUm / 2.0f;
        return f2 * (this.hUk - 0.5f) / this.hUj;
    }

    @Override
    public float c(aro_1 aro_12) {
        float f2 = (float)this.hUn / 2.0f;
        return f2 * (this.hUl - 0.5f) / this.hUj;
    }
}

