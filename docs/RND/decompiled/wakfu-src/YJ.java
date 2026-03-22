/*
 * Decompiled with CFR 0.152.
 */
public class YJ
extends YL<Float> {
    YJ(zh_0 zh_02) {
        super(zh_02);
    }

    public final Float boy() {
        return Float.valueOf(this.bTB[0].floatValue());
    }

    @Override
    public final float floatValue() {
        return this.boy().floatValue();
    }

    @Override
    public final int intValue() {
        return this.boy().intValue();
    }

    @Override
    public final String bor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.boy();
    }
}

