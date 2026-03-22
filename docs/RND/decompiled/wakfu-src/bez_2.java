/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bez
 */
public class bez_2
extends beh_2 {
    private final float hNF;

    public bez_2(enk_0 enk_02, float f2) {
        super(enk_02);
        this.hNF = f2;
    }

    public bez_2(bez_2 bez_22) {
        super(bez_22.hMZ);
        this.hNF = bez_22.hNF;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        bdj_22.setScale(this.hNF);
    }

    public float getScale() {
        return this.hNF;
    }

    public bez_2 deA() {
        return new bez_2(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bez_2 bez_22 = (bez_2)object;
        return Float.compare(bez_22.hNF, this.hNF) == 0;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hNF == 0.0f ? 0 : Float.floatToIntBits(this.hNF));
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.deA();
    }
}

