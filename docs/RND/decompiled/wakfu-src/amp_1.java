/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amP
 */
public class amp_1
extends ams_2 {
    private final amu_1 cJq;
    private final amu_1 cJr;

    private amp_1(amu_1 amu_12, amu_1 amu_13) {
        this.cJq = amu_12;
        this.cJr = amu_13;
    }

    public amu_1 bDr() {
        return this.cJq;
    }

    public amu_1 bDs() {
        return this.cJr;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if ((this.cJq.bDo() ? (double)this.cJq.d(object, object2, object3, object4) : this.cJq.e(object, object2, object3, object4)) != (this.cJr.bDo() ? (double)this.cJr.d(object, object2, object3, object4) : this.cJr.e(object, object2, object3, object4))) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    public static ang_2 b(amx_1 amx_12, amx_1 amx_13) {
        amp_1.a(amx_12, amx_13);
        amu_1 amu_12 = (amu_1)amx_12;
        amu_1 amu_13 = (amu_1)amx_13;
        if (amu_12.bDp() && amu_13.bDp()) {
            return new amz_2((amu_12.bDo() ? (double)amu_12.d(null, null, null, null) : amu_12.e(null, null, null, null)) != (amu_13.bDo() ? (double)amu_13.d(null, null, null, null) : amu_13.e(null, null, null, null)));
        }
        return new amp_1(amu_12, amu_13);
    }

    @Override
    public Enum bDq() {
        return amg_2.cII;
    }
}

