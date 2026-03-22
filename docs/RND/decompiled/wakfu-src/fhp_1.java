/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHp
 */
public abstract class fhp_1
extends fhi_2 {
    public boolean gAa() {
        return true;
    }

    @Override
    public void e(fhv_1 fhv_12) {
        if (this.gAa()) {
            this.getParentOfType(fhv_1.class).e(fhv_12);
        } else {
            super.e(fhv_12);
        }
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (this.gAa()) {
            this.getParentOfType(fhv_1.class).d(fhv_12);
        } else {
            super.d(fhv_12);
        }
    }

    @Override
    public fht_1 getElementType() {
        return fht_1.uxC;
    }
}

