/*
 * Decompiled with CFR 0.152.
 */
public interface afj
extends afg {
    public boolean f(afh var1, aeb_1 var2);

    @Override
    default public void d(afh afh2, aeb_1 aeb_12) {
        if (!this.f(afh2, aeb_12)) {
            return;
        }
        this.g(afh2, aeb_12);
    }

    @Override
    default public void e(afh afh2, aeb_1 aeb_12) {
        if (!this.f(afh2, aeb_12)) {
            return;
        }
        this.h(afh2, aeb_12);
    }

    public void g(afh var1, aeb_1 var2);

    public void h(afh var1, aeb_1 var2);
}

