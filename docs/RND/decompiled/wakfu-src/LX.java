/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import org.jetbrains.annotations.Contract;

public final class LX
extends Number {
    private static final long aRw = -7270147902121356179L;
    private short aRx;

    public LX() {
    }

    public LX(short s) {
        this.aRx = s;
    }

    @Contract(pure=true)
    public short aTy() {
        return this.aRx;
    }

    public void D(short s) {
        this.aRx = s;
    }

    public short aTz() {
        this.aRx = (short)(this.aRx + 1);
        return this.aRx;
    }

    public short aTA() {
        short s = this.aRx;
        this.aRx = (short)(this.aRx + 1);
        return s;
    }

    public short aTB() {
        this.aRx = (short)(this.aRx - 1);
        return this.aRx;
    }

    public short aTC() {
        short s = this.aRx;
        this.aRx = (short)(this.aRx - 1);
        return s;
    }

    public short E(short s) {
        this.aRx = (short)(this.aRx + s);
        return this.aRx;
    }

    public short F(short s) {
        this.aRx = (short)(this.aRx - s);
        return this.aRx;
    }

    public short G(short s) {
        this.aRx = (short)(this.aRx * s);
        return this.aRx;
    }

    public short H(short s) {
        this.aRx = (short)(this.aRx / s);
        return this.aRx;
    }

    public short I(short s) {
        this.aRx = (short)(this.aRx % s);
        return this.aRx;
    }

    public short J(short s) {
        if (s > this.aRx) {
            this.aRx = s;
        }
        return this.aRx;
    }

    public short K(short s) {
        if (s < this.aRx) {
            this.aRx = s;
        }
        return this.aRx;
    }

    @Override
    public int intValue() {
        return this.aRx;
    }

    @Override
    public long longValue() {
        return this.aRx;
    }

    @Override
    public float floatValue() {
        return this.aRx;
    }

    @Override
    public double doubleValue() {
        return this.aRx;
    }

    public String toString() {
        return String.valueOf(this.aRx);
    }
}

