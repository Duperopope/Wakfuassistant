/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amA
 */
public class ama_2
extends amu_1 {
    private double aRr;

    @Override
    public boolean bDo() {
        return false;
    }

    @Override
    public void bDx() {
        this.aRr = -1.0 * this.aRr;
    }

    public ama_2(double d2) {
        this.aRr = d2;
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        return this.aRr;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("Can't get long value of a double constant");
    }

    @Override
    public boolean bDp() {
        return true;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIF;
    }

    public String toString() {
        return "Double(" + this.aRr + ")";
    }
}

