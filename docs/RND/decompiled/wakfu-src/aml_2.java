/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amL
 */
public class aml_2
extends ams_2 {
    private final amu_1 cJi;
    private final amu_1 cJj;

    private aml_2(amu_1 amu_12, amu_1 amu_13) {
        this.cJi = amu_12;
        this.cJj = amu_13;
    }

    public amu_1 bDr() {
        return this.cJi;
    }

    public amu_1 bDs() {
        return this.cJj;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        double d2 = this.cJi.bDo() ? (double)this.cJi.d(object, object2, object3, object4) : this.cJi.e(object, object2, object3, object4);
        double d3 = this.cJj.bDo() ? (double)this.cJj.d(object, object2, object3, object4) : this.cJj.e(object, object2, object3, object4);
        if (d2 < d3) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    public static ang_2 b(amx_1 amx_12, amx_1 amx_13) {
        aml_2.a(amx_12, amx_13);
        amu_1 amu_12 = (amu_1)amx_12;
        amu_1 amu_13 = (amu_1)amx_13;
        if (amu_12.bDp() && amu_13.bDp()) {
            return new amz_2((amu_12.bDo() ? (double)amu_12.d(null, null, null, null) : amu_12.e(null, null, null, null)) < (amu_13.bDo() ? (double)amu_13.d(null, null, null, null) : amu_13.e(null, null, null, null)));
        }
        return new aml_2(amu_12, amu_13);
    }

    @Override
    public Enum bDq() {
        return amg_2.cIK;
    }
}

