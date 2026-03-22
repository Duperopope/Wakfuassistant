/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import org.jetbrains.annotations.Contract;

public final class LS
extends Number {
    private static final long aRq = -901017749638198914L;
    private double aRr;

    public LS() {
    }

    public LS(double d2) {
        this.aRr = d2;
    }

    @Contract(pure=true)
    public double aTl() {
        return this.aRr;
    }

    public double o(double d2) {
        this.aRr = d2;
        return this.aRr;
    }

    public double p(double d2) {
        this.aRr += d2;
        return this.aRr;
    }

    public double q(double d2) {
        this.aRr -= d2;
        return this.aRr;
    }

    public double r(double d2) {
        this.aRr *= d2;
        return this.aRr;
    }

    public double s(double d2) {
        this.aRr /= d2;
        return this.aRr;
    }

    public double t(double d2) {
        this.aRr %= d2;
        return this.aRr;
    }

    public double u(double d2) {
        if (d2 > this.aRr) {
            this.aRr = d2;
        }
        return this.aRr;
    }

    public double v(double d2) {
        if (d2 < this.aRr) {
            this.aRr = d2;
        }
        return this.aRr;
    }

    @Override
    public int intValue() {
        return (int)this.aRr;
    }

    @Override
    public long longValue() {
        return (long)this.aRr;
    }

    @Override
    public float floatValue() {
        return (float)this.aRr;
    }

    @Override
    public double doubleValue() {
        return this.aRr;
    }

    public String toString() {
        return String.valueOf(this.aRr);
    }
}

