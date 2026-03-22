/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anj
 */
public class anj_2
extends amx_2 {
    private final ang_2 cKd;
    private final ang_2 cKe;

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        boolean bl2 = this.cKd.b(object, object2, object3, object4) && !this.cKe.b(object, object2, object3, object4);
        boolean bl3 = bl = !this.cKd.b(object, object2, object3, object4) && this.cKe.b(object, object2, object3, object4);
        if (bl2 || bl) {
            return 0;
        }
        return -1;
    }

    private anj_2(ang_2 ang_22, ang_2 ang_23) {
        this.cKd = ang_22;
        this.cKe = ang_23;
    }

    public ang_2 bDt() {
        return this.cKd;
    }

    public ang_2 bDu() {
        return this.cKe;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    public static ang_2 b(amx_1 amx_12, amx_1 amx_13) {
        anj_2.a(amx_12, amx_13);
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
        return new anj_2(ang_22, ang_23);
    }

    @Override
    public Enum bDq() {
        return amg_2.cIO;
    }
}

