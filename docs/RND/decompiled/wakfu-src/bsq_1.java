/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSQ
 */
public abstract class bsq_1
extends bsp_1 {
    @Override
    public void a(aez_0<?, ?> aez_02, aeb_1 aeb_12) {
        afe afe2 = aez_02.et(this.p);
        if (afe2 == null) {
            this.a(this.p, aeb_12);
        } else {
            this.a(afe2, aez_02);
        }
    }

    protected abstract void a(afe var1, aez_0<?, ?> var2);

    protected abstract void a(String var1, aeb_1 var2);
}

