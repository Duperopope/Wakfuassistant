/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frH
 */
public class frh_0
extends frk_0 {
    private final int sZq;
    private final int sZr;
    private final fiH<frI> sZs = new fiH();

    public frh_0(long l, int n, int n2, int n3) {
        super(l, n);
        this.sZq = n2;
        this.sZr = n3;
    }

    public frh_0(long l, int n, int n2, int n3, int n4, fre_0 fre_02) {
        super(l, n, n4, fre_02);
        this.sZq = n2;
        this.sZr = n3;
    }

    public int azv() {
        return this.sZq;
    }

    public int clM() {
        return this.sZr;
    }

    public frI z(Object object, Object object2, Object object3, Object object4) {
        return this.sZs.w(object, object2, object3, object4).orElse(null);
    }

    public frI a(frI frI2) {
        this.sZs.a(frI2);
        return frI2;
    }

    public frI ZE(int n) {
        return this.sZs.Wa(n);
    }
}

