/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agS
 */
public abstract class ags_0 {
    private final axb_2 cuV;
    private final axb_2 cuW;
    private final long cuX;
    protected final float[] cuY;
    protected boolean cuZ;
    protected long cva;

    protected ags_0(axb_2 axb_22, axb_2 axb_23, long l) {
        this.cuV = axb_22;
        this.cuW = axb_23;
        this.cuX = l;
        this.cuZ = true;
        this.cva = 0L;
        this.cuY = new float[3];
        this.cuY[0] = this.cuV.aIU();
        this.cuY[1] = this.cuV.aIV();
        this.cuY[2] = this.cuV.aIW();
    }

    public boolean bzm() {
        axb_2 axb_22 = this.cuZ ? this.cuW : this.cuV;
        return this.cuY[0] != axb_22.aIU() || this.cuY[1] != axb_22.aIV() || this.cuY[2] != axb_22.aIW();
    }

    public void qF(int n) {
        if (!this.bzm()) {
            return;
        }
        this.cva += (long)n;
        float f2 = (float)this.cva / (float)this.cuX;
        if (f2 >= 1.0f) {
            if (this.cuZ) {
                this.cuY[0] = this.cuW.aIU();
                this.cuY[1] = this.cuW.aIV();
                this.cuY[2] = this.cuW.aIW();
            } else {
                this.cuY[0] = this.cuV.aIU();
                this.cuY[1] = this.cuV.aIV();
                this.cuY[2] = this.cuV.aIW();
            }
            return;
        }
        if (this.cuZ) {
            this.cuY[0] = GC.a(this.cuV.aIU(), this.cuW.aIU(), f2);
            this.cuY[1] = GC.a(this.cuV.aIV(), this.cuW.aIV(), f2);
            this.cuY[2] = GC.a(this.cuV.aIW(), this.cuW.aIW(), f2);
        } else {
            this.cuY[0] = GC.a(this.cuW.aIU(), this.cuV.aIU(), f2);
            this.cuY[1] = GC.a(this.cuW.aIV(), this.cuV.aIV(), f2);
            this.cuY[2] = GC.a(this.cuW.aIW(), this.cuV.aIW(), f2);
        }
    }

    public void bzn() {
        this.cuZ = true;
        this.cva = 0L;
    }

    public void bzo() {
        this.cuZ = false;
        this.cva = 0L;
    }
}

