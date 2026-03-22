/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eye
 */
class eye_0 {
    private final azw_2<String, Runnable> phh = new azw_2();

    eye_0() {
    }

    public void d(String string, Runnable runnable) {
        if (!this.phh.Y(string)) {
            this.phh.f(string, runnable);
        }
    }

    void bGy() {
        int n = this.phh.bTL();
        for (int i = 0; i < n; ++i) {
            this.phh.vU(i).run();
        }
    }
}

