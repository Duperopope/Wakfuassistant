/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amN
 */
public class amn_2
extends amt_2 {
    private final amu_1 cJm;
    private final amu_1 cJn;

    private amn_2(amu_1 amu_12, amu_1 amu_13) {
        this.cJm = amu_12;
        this.cJn = amu_13;
    }

    public static amu_1 a(amx_1 amx_12, amx_1 amx_13) {
        amn_2.a(amx_12, amx_13);
        amu_1 amu_12 = (amu_1)amx_12;
        amu_1 amu_13 = (amu_1)amx_13;
        if (amu_12.bDp() && amu_13.bDp()) {
            return new ama_2((amu_12.bDo() ? (double)amu_12.d(null, null, null, null) : amu_12.e(null, null, null, null)) % (amu_13.bDo() ? (double)amu_13.d(null, null, null, null) : amu_13.e(null, null, null, null)));
        }
        return new amn_2(amu_12, amu_13);
    }

    @Override
    public boolean bDo() {
        return false;
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        double d2 = (this.cJm.bDo() ? (double)this.cJm.d(object, object2, object3, object4) : this.cJm.e(object, object2, object3, object4)) % (this.cJn.bDo() ? (double)this.cJn.d(object, object2, object3, object4) : this.cJn.e(object, object2, object3, object4));
        if (this.bDz()) {
            return -1.0 * d2;
        }
        return d2;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = (long)(this.cJm.bDo() ? (double)this.cJm.d(object, object2, object3, object4) : this.cJm.e(object, object2, object3, object4)) % (long)(this.cJn.bDo() ? (double)this.cJn.d(object, object2, object3, object4) : this.cJn.e(object, object2, object3, object4));
        if (this.bDz()) {
            return -1L * l;
        }
        return l;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIU;
    }
}

