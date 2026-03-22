/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amK
 */
public class amk_1
extends amu_1 {
    private final ang_2 cJe;
    private final amu_1 cJf;
    private final amu_1 cJg;
    private boolean cJh = false;

    public amk_1(ang_2 ang_22, amu_1 amu_12, amu_1 amu_13) {
        this.cJe = ang_22;
        this.cJf = amu_12;
        this.cJg = amu_13;
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        if (this.cJe.b(object, object2, object3, object4)) {
            return (double)(this.cJh ? -1 : 1) * (this.cJf.bDo() ? (double)this.cJf.d(object, object2, object3, object4) : this.cJf.e(object, object2, object3, object4));
        }
        return (double)(this.cJh ? -1 : 1) * (this.cJg.bDo() ? (double)this.cJg.d(object, object2, object3, object4) : this.cJg.e(object, object2, object3, object4));
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (!this.bDo()) {
            throw new UnsupportedOperationException("Cant't get integer value of a double");
        }
        if (this.cJe.b(object, object2, object3, object4)) {
            return (long)(this.cJh ? -1 : 1) * this.cJf.d(object, object2, object3, object4);
        }
        return (long)(this.cJh ? -1 : 1) * this.cJg.d(object, object2, object3, object4);
    }

    @Override
    public boolean bDo() {
        return this.cJf.bDo() && this.cJg.bDo();
    }

    @Override
    public void bDx() {
        this.cJh = !this.cJh;
    }

    @Override
    public boolean bDp() {
        return false;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIJ;
    }

    @Override
    public amz_1 bDv() {
        return this.cJf.bDv();
    }
}

