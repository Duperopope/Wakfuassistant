/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amO
 */
public class amo_1
extends amt_2 {
    private final amu_1 cJo;
    private final amu_1 cJp;

    private amo_1(amu_1 amu_12, amu_1 amu_13) {
        this.cJo = amu_12;
        this.cJp = amu_13;
    }

    public static amu_1 a(amx_1 amx_12, amx_1 amx_13) {
        amo_1.a(amx_12, amx_13);
        amu_1 amu_12 = (amu_1)amx_12;
        amu_1 amu_13 = (amu_1)amx_13;
        if (amu_12.bDp() && amu_13.bDp()) {
            if (amu_12.bDo() && amu_13.bDo()) {
                return new amb_2(amu_12.d(null, null, null, null) * amu_13.d(null, null, null, null));
            }
            return new ama_2(amu_12.e(null, null, null, null) * amu_13.e(null, null, null, null));
        }
        return new amo_1(amu_12, amu_13);
    }

    @Override
    public boolean bDo() {
        return this.cJo.bDo() && this.cJp.bDo();
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = this.cJo.d(object, object2, object3, object4) * this.cJp.d(object, object2, object3, object4);
        if (this.bDz()) {
            return -1L * l;
        }
        return l;
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        double d2 = this.cJo.e(object, object2, object3, object4) * this.cJp.e(object, object2, object3, object4);
        if (this.bDz()) {
            return -1.0 * d2;
        }
        return d2;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIM;
    }
}

