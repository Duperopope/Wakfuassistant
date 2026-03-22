/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amE
 */
public class ame_2
extends anf_2 {
    private final long cIB;

    public ame_2(int n, int n2, short s) {
        this.cIB = anf_2.L(n, n2, s);
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        return Double.longBitsToDouble(this.cIB);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        return this.cIB;
    }

    @Override
    public boolean bDp() {
        return true;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIR;
    }
}

