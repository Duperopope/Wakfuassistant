/*
 * Decompiled with CFR 0.152.
 */
public class aaW
implements acv_0 {
    private float axp;
    private float axq;
    private float axr;
    private boolean ccM;

    @Override
    public void qF(int n) {
    }

    public void setColor(float f2, float f3, float f4) {
        this.axp = f2;
        this.axq = f3;
        this.axr = f4;
        this.ccM = arn_2.aY(this.axp, 0.0f) && arn_2.aY(this.axq, 0.0f) && arn_2.aY(this.axr, 0.0f);
    }

    @Override
    public int bpb() {
        return 500;
    }

    @Override
    public boolean bpa() {
        return this.ccM;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = fArray[0] + this.axp;
        fArray[1] = fArray[1] + this.axq;
        fArray[2] = fArray[2] + this.axr;
    }
}

