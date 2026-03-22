/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSG
 */
class csg_2
implements fjb_1 {
    private final fbz_2 nGl;
    private final fey_2 nGm;
    private float nGn;

    private csg_2(fbz_2 fbz_22, fey_2 fey_22) {
        this.nGl = fbz_22;
        this.nGm = fey_22;
    }

    @Override
    public void eOq() {
        ftu_2.G(this.nGm);
        if (this.nGn == -1.0f) {
            this.nGn = this.nGl.getOffset();
        } else {
            this.nGl.setOffset(this.nGn);
        }
    }
}

