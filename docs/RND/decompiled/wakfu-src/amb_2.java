/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amB
 */
public class amb_2
extends amu_1 {
    private long Ns;

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public void bDx() {
        this.Ns = -1L * this.Ns;
    }

    public amb_2(long l) {
        this.Ns = l;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        return this.Ns;
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        return this.Ns;
    }

    @Override
    public boolean bDp() {
        return true;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIG;
    }

    public String toString() {
        return "Int(" + this.Ns + ")";
    }
}

