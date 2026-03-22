/*
 * Decompiled with CFR 0.152.
 */
public class YO
extends YW<Float> {
    YO(zh_0 zh_02) {
        super(zh_02);
    }

    public final Float boB() {
        float f2 = this.boC();
        if ((float)this.bUm > f2) {
            this.bUm = (long)((float)this.bUm - f2);
        }
        return ((yl_0)this.bTA[1]).bM(this.bUm);
    }

    @Override
    public final float floatValue() {
        return ((Float)this.boq()).floatValue();
    }

    @Override
    public final int intValue() {
        return ((Float)this.boq()).intValue();
    }

    @Override
    public final String bor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float boC() {
        return this.bTA[0].floatValue();
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.boB();
    }
}

