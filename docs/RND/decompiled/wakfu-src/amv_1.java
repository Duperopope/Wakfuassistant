/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amV
 */
public class amv_1
extends amx_2 {
    private final ang_2 cJs;
    private final ang_2 cJt;

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.cJs.b(object, object2, object3, object4) || this.cJt.b(object, object2, object3, object4)) {
            return 0;
        }
        return -1;
    }

    private amv_1(ang_2 ang_22, ang_2 ang_23) {
        this.cJs = ang_22;
        this.cJt = ang_23;
    }

    public ang_2 bDt() {
        return this.cJs;
    }

    public ang_2 bDu() {
        return this.cJt;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    public static ang_2 b(amx_1 amx_12, amx_1 amx_13) {
        amv_1.a(amx_12, amx_13);
        ang_2 ang_22 = (ang_2)amx_12;
        ang_2 ang_23 = (ang_2)amx_13;
        if (ang_22.bDp()) {
            if (ang_22.b(null, null, null, null)) {
                return new amz_2(true);
            }
            return ang_23;
        }
        if (ang_23.bDp()) {
            if (ang_23.b(null, null, null, null)) {
                return new amz_2(true);
            }
            return ang_22;
        }
        return new amv_1(ang_22, ang_23);
    }

    @Override
    public Enum bDq() {
        return amg_2.cIN;
    }
}

