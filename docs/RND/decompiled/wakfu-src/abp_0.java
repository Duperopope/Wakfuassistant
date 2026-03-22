/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abP
 */
class abp_0
extends abe_0 {
    abp_0() {
    }

    @Override
    public void ca(float f2) {
        this.ceb += this.cee;
        this.cec += this.cef;
        this.ced += this.ceg;
        if (this.aQj != 0.0f) {
            float f3 = GC.H(this.aQj);
            float f4 = GC.G(this.aQj);
            this.aPY += (this.ceb + f3 * 0.125f * this.ced) * f2;
            this.aPZ += (this.cec - f3 * 0.125f * this.ced) * f2;
            this.aQa += f4 * this.ced * f2;
        } else {
            this.aPY += this.ceb * f2;
            this.aPZ += this.cec * f2;
            this.aQa += this.ced * f2;
        }
        this.ceh += f2;
    }
}

