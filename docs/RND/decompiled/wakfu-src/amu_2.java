/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amu
 */
public class amu_2
extends amt_2 {
    private final amu_1 cIq;
    private final amu_1 cIr;

    private amu_2(amu_1 amu_12, amu_1 amu_13) {
        this.cIq = amu_12;
        this.cIr = amu_13;
    }

    public static amu_1 a(amx_1 amx_12, amx_1 amx_13) {
        amu_2.a(amx_12, amx_13);
        amu_1 amu_12 = (amu_1)amx_12;
        amu_1 amu_13 = (amu_1)amx_13;
        if (amu_12.bDp() && amu_13.bDp()) {
            if (amu_12.bDo() && amu_13.bDo()) {
                return new amb_2(amu_12.d(null, null, null, null) + amu_13.d(null, null, null, null));
            }
            return new ama_2(amu_12.e(null, null, null, null) + amu_13.e(null, null, null, null));
        }
        return new amu_2(amu_12, amu_13);
    }

    @Override
    public boolean bDo() {
        return this.cIq.bDo() && this.cIr.bDo();
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = this.cIq.d(object, object2, object3, object4) + this.cIr.d(object, object2, object3, object4);
        if (this.bDz()) {
            return -1L * l;
        }
        return l;
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        double d2 = this.cIq.e(object, object2, object3, object4) + this.cIr.e(object, object2, object3, object4);
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
        return amg_2.cIC;
    }

    public amu_1 bDr() {
        return this.cIq;
    }

    public amu_1 bDs() {
        return this.cIr;
    }
}

