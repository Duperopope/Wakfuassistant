/*
 * Decompiled with CFR 0.152.
 */
public class frj {
    private final frk sXF;
    private float awY;

    public frj(frk frk2) {
        this.sXF = frk2;
        this.awY = frk2.sXJ;
    }

    public frj(frk frk2, float f2) {
        this(frk2);
        this.awY = f2;
    }

    public long uF(long l) {
        return Math.round((double)l * (double)this.awY);
    }

    public float getValue() {
        return this.awY;
    }

    public void setValue(float f2) {
        this.awY = Math.max(Math.min(f2, this.sXF.sXL), this.sXF.sXK);
    }

    public frk gjW() {
        return this.sXF;
    }
}

