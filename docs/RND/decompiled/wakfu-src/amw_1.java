/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amw
 */
public class amw_1
extends amx_2 {
    private final ang_2 cIs;
    private final ang_2 cIt;

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.cIs.b(object, object2, object3, object4) && this.cIt.b(object, object2, object3, object4)) {
            return 0;
        }
        return -1;
    }

    private amw_1(ang_2 ang_22, ang_2 ang_23) {
        this.cIs = ang_22;
        this.cIt = ang_23;
    }

    public ang_2 bDt() {
        return this.cIs;
    }

    public ang_2 bDu() {
        return this.cIt;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    public static ang_2 b(amx_1 amx_12, amx_1 amx_13) {
        amw_1.a(amx_12, amx_13);
        ang_2 ang_22 = (ang_2)amx_12;
        ang_2 ang_23 = (ang_2)amx_13;
        if (ang_22.bDp()) {
            if (ang_22.b(null, null, null, null)) {
                return ang_23;
            }
            return new amz_2(false);
        }
        if (ang_23.bDp()) {
            if (ang_23.b(null, null, null, null)) {
                return ang_22;
            }
            return new amz_2(false);
        }
        return new amw_1(ang_22, ang_23);
    }

    @Override
    public Enum bDq() {
        return amg_2.cID;
    }
}

