/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YH
 */
public class yh_0
extends yo_0<zy_1, Float> {
    public yh_0(zy_1 zy_12) {
        super(zy_12);
    }

    protected Float bou() {
        return ((zy_1)this.bTD).bUE.a(Float.valueOf(this.bTC[0].floatValue()), Float.valueOf(this.bTC[1].floatValue()));
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
        return null;
    }

    @Override
    protected /* synthetic */ Object getValue() {
        return this.bou();
    }
}

