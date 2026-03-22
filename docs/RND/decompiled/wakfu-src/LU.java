/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import org.jetbrains.annotations.Contract;

public final class LU
extends Number {
    private static final long aRt = 5032775914372829532L;
    private int aQL;

    public LU() {
    }

    public LU(int n) {
        this.aQL = n;
    }

    @Contract(pure=true)
    public int aTn() {
        return this.aQL;
    }

    public int ns(int n) {
        this.aQL = n;
        return this.aQL;
    }

    public int aTo() {
        ++this.aQL;
        return this.aQL;
    }

    public int aTp() {
        int n = this.aQL++;
        return n;
    }

    public int aTq() {
        --this.aQL;
        return this.aQL;
    }

    public int aTr() {
        int n = this.aQL--;
        return n;
    }

    public int nt(int n) {
        this.aQL += n;
        return this.aQL;
    }

    public int nu(int n) {
        this.aQL -= n;
        return this.aQL;
    }

    public int nv(int n) {
        this.aQL *= n;
        return this.aQL;
    }

    public int nw(int n) {
        this.aQL /= n;
        return this.aQL;
    }

    public int nx(int n) {
        this.aQL %= n;
        return this.aQL;
    }

    public int ny(int n) {
        if (n > this.aQL) {
            this.aQL = n;
        }
        return this.aQL;
    }

    public int nz(int n) {
        if (n < this.aQL) {
            this.aQL = n;
        }
        return this.aQL;
    }

    @Override
    public int intValue() {
        return this.aQL;
    }

    @Override
    public long longValue() {
        return this.aQL;
    }

    @Override
    public float floatValue() {
        return this.aQL;
    }

    @Override
    public double doubleValue() {
        return this.aQL;
    }

    public String toString() {
        return String.valueOf(this.aQL);
    }
}

