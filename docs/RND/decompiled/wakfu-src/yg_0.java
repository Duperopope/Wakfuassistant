/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YG
 */
public class yg_0
extends yo_0<zx_1, Float> {
    public yg_0(zx_1 zx_12) {
        super(zx_12);
    }

    protected Float bou() {
        return ((zx_1)this.bTD).bUD.a(Float.valueOf(this.bTC[0].floatValue()));
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

