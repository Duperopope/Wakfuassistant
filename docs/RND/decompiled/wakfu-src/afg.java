/*
 * Decompiled with CFR 0.152.
 */
public interface afg {
    default public void b(afh afh2, aeb_1 aeb_12, aeb_1 aeb_13) {
        if (aeb_13 != null && aeb_12 != null) {
            this.e(afh2, aeb_12);
            this.d(afh2, aeb_13);
        } else if (aeb_13 == null) {
            this.e(afh2, aeb_12);
        } else {
            this.d(afh2, aeb_13);
        }
    }

    public void d(afh var1, aeb_1 var2);

    public void e(afh var1, aeb_1 var2);
}

