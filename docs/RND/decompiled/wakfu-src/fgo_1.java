/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGO
 */
public class fgo_1 {
    private Object aGT;
    private float aPY;
    private float aPZ;

    public fgo_1(Object object, float f2, float f3) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aGT = object;
    }

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        this.aGT = object;
    }

    public float aSc() {
        return this.aPY;
    }

    public void ap(float f2) {
        this.aPY = f2;
    }

    public float aSd() {
        return this.aPZ;
    }

    public void aq(float f2) {
        this.aPZ = f2;
    }
}

