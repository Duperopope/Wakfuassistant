/*
 * Decompiled with CFR 0.152.
 */
class abT
extends abe_0 {
    protected float cfd;
    protected boolean cfe;
    protected float bMl;
    protected float cff;

    abT() {
    }

    @Override
    public void ca(float f2) {
        if (!this.cfe) {
            this.cee = this.bMl / this.cfd;
            this.ceg = this.cff;
            this.ceb += this.cee * f2;
            this.cec += this.cef * f2;
            this.ced += this.ceg * f2;
            this.aPY += this.ceb * f2;
            this.aPZ += this.cec * f2;
            this.aQa += this.ced * f2;
            if (this.ayP < 0.3f) {
                this.ayP += 0.005f;
            }
            this.cee = 0.0f;
            this.cef = 0.0f;
            this.ceg = 0.0f;
        } else {
            this.brL *= 1.0025f;
            this.cej = this.brL;
            this.ayP *= 0.99f;
            if (this.ayP < 0.01f) {
                this.ceh = this.cei;
            }
        }
        this.ceh += f2;
    }
}

