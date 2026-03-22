/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import org.jetbrains.annotations.Contract;

public final class LT
extends Number {
    private static final long aRs = 4761240226339838149L;
    private float awY;

    public LT() {
    }

    public LT(float f2) {
        this.awY = f2;
    }

    @Contract(pure=true)
    public float aTm() {
        return this.awY;
    }

    public float bj(float f2) {
        this.awY = f2;
        return this.awY;
    }

    public float bk(float f2) {
        this.awY += f2;
        return this.awY;
    }

    public float bl(float f2) {
        this.awY -= f2;
        return this.awY;
    }

    public float bm(float f2) {
        this.awY *= f2;
        return this.awY;
    }

    public float bn(float f2) {
        this.awY /= f2;
        return this.awY;
    }

    public float bo(float f2) {
        this.awY %= f2;
        return this.awY;
    }

    public float bp(float f2) {
        if (f2 > this.awY) {
            this.awY = f2;
        }
        return this.awY;
    }

    public float bq(float f2) {
        if (f2 < this.awY) {
            this.awY = f2;
        }
        return this.awY;
    }

    @Override
    public int intValue() {
        return (int)this.awY;
    }

    @Override
    public long longValue() {
        return (long)this.awY;
    }

    @Override
    public float floatValue() {
        return this.awY;
    }

    @Override
    public double doubleValue() {
        return this.awY;
    }

    public String toString() {
        return String.valueOf(this.awY);
    }
}

