/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import org.jetbrains.annotations.Contract;

public final class LQ
extends Number {
    private static final long aRn = -8341715773506793693L;
    private byte axm;

    public LQ() {
    }

    public LQ(byte by) {
        this.axm = by;
    }

    @Contract(pure=true)
    public byte aTf() {
        return this.axm;
    }

    public void q(byte by) {
        this.axm = by;
    }

    public byte aTg() {
        this.axm = (byte)(this.axm + 1);
        return this.axm;
    }

    public byte aTh() {
        byte by = this.axm;
        this.axm = (byte)(this.axm + 1);
        return by;
    }

    public byte aTi() {
        this.axm = (byte)(this.axm - 1);
        return this.axm;
    }

    public byte aTj() {
        byte by = this.axm;
        this.axm = (byte)(this.axm - 1);
        return by;
    }

    public byte r(byte by) {
        this.axm = (byte)(this.axm + by);
        return this.axm;
    }

    public byte s(byte by) {
        this.axm = (byte)(this.axm - by);
        return this.axm;
    }

    public byte t(byte by) {
        this.axm = (byte)(this.axm * by);
        return this.axm;
    }

    public byte u(byte by) {
        this.axm = (byte)(this.axm / by);
        return this.axm;
    }

    public byte v(byte by) {
        this.axm = (byte)(this.axm % by);
        return this.axm;
    }

    public byte w(byte by) {
        if (by > this.axm) {
            this.axm = by;
        }
        return this.axm;
    }

    public byte x(byte by) {
        if (by < this.axm) {
            this.axm = by;
        }
        return this.axm;
    }

    @Override
    public int intValue() {
        return this.axm;
    }

    @Override
    public long longValue() {
        return this.axm;
    }

    @Override
    public float floatValue() {
        return this.axm;
    }

    @Override
    public double doubleValue() {
        return this.axm;
    }

    public String toString() {
        return String.valueOf(this.axm);
    }
}

