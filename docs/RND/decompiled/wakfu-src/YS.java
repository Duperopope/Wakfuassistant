/*
 * Decompiled with CFR 0.152.
 */
public class YS
extends YL<Float> {
    YS(zh_0 zh_02) {
        super(zh_02);
    }

    public final Float boG() {
        return Float.valueOf(GC.b(this.bTA[0].floatValue(), this.bTA[1].floatValue()));
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
    public /* synthetic */ Object getValue() {
        return this.boG();
    }
}

