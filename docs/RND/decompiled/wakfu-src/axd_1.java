/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axD
 */
public final class axd_1 {
    private final azw_2<String, axc_1> dqv = new azw_2();
    private static final axd_1 dqw = new axd_1();

    public static axd_1 bQW() {
        return dqw;
    }

    private axd_1() {
    }

    public void a(String string, axc_1 axc_12) {
        this.dqv.f(string, axc_12);
    }

    public axc_1 gN(String string) {
        return this.dqv.O(string);
    }

    public void reset() {
        this.dqv.clear();
    }

    public boolean aJG() {
        return this.dqv.bTL() == 0;
    }
}

