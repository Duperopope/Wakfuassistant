/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amI
 */
public class ami_2
extends ams_2 {
    private final amu_1 cIZ;
    private final amu_1 cJa;

    private ami_2(amu_1 amu_12, amu_1 amu_13) {
        this.cIZ = amu_12;
        this.cJa = amu_13;
    }

    public amu_1 bDr() {
        return this.cIZ;
    }

    public amu_1 bDs() {
        return this.cJa;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if ((this.cIZ.bDo() ? (double)this.cIZ.d(object, object2, object3, object4) : this.cIZ.e(object, object2, object3, object4)) == (this.cJa.bDo() ? (double)this.cJa.d(object, object2, object3, object4) : this.cJa.e(object, object2, object3, object4))) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    public static ang_2 b(amx_1 amx_12, amx_1 amx_13) {
        ami_2.a(amx_12, amx_13);
        amu_1 amu_12 = (amu_1)amx_12;
        amu_1 amu_13 = (amu_1)amx_13;
        if (amu_12.bDp() && amu_13.bDp()) {
            return new amz_2((amu_12.bDo() ? (double)amu_12.d(null, null, null, null) : amu_12.e(null, null, null, null)) == (amu_13.bDo() ? (double)amu_13.d(null, null, null, null) : amu_13.e(null, null, null, null)));
        }
        return new ami_2(amu_12, amu_13);
    }

    @Override
    public Enum bDq() {
        return amg_2.cII;
    }
}

