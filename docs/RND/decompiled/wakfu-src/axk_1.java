/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axK
 */
public class axk_1 {
    private final int dqI;
    private final int dqJ;

    public axk_1(int n, int n2) {
        this.dqI = n;
        this.dqJ = n2;
    }

    public int bQZ() {
        return this.dqI;
    }

    public int bRa() {
        return this.dqJ;
    }

    public int a(axk_1 axk_12, boolean bl) {
        int n = this.dqI - axk_12.dqI;
        if (n != 0) {
            return n;
        }
        int n2 = this.dqJ - axk_12.dqJ;
        if (n2 != 0 || !bl) {
            return n2;
        }
        return 0;
    }

    public int a(axk_1 axk_12) {
        return this.a(axk_12, false);
    }
}

