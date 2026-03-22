/*
 * Decompiled with CFR 0.152.
 */
public class YU
extends YW<Float> {
    YU(zh_0 zh_02) {
        super(zh_02);
    }

    public final Float boI() {
        if ((float)this.bUm <= this.bTA[0].floatValue()) {
            return Float.valueOf(0.0f);
        }
        float f2 = this.boC();
        if ((float)this.bUm <= f2) {
            return Float.valueOf(1.0f);
        }
        this.bUm = (long)((float)this.bUm - f2);
        return Float.valueOf(0.0f);
    }

    public final boolean boJ() {
        return this.floatValue() != 0.0f;
    }

    @Override
    public float floatValue() {
        return ((Float)this.boq()).floatValue();
    }

    @Override
    public int intValue() {
        return ((Float)this.boq()).intValue();
    }

    @Override
    public String bor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float boC() {
        return this.bTA[1].floatValue() + this.bTA[0].floatValue();
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.boI();
    }
}

