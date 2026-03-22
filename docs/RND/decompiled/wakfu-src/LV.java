/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import org.jetbrains.annotations.Contract;

public final class LV
extends Number {
    private static final long aRu = 4540818864492112337L;
    private long Ns;

    public LV() {
    }

    public LV(long l) {
        this.Ns = l;
    }

    @Contract(pure=true)
    public long aTs() {
        return this.Ns;
    }

    public void cH(long l) {
        this.Ns = l;
    }

    public long aTt() {
        ++this.Ns;
        return this.Ns;
    }

    public long aTu() {
        long l = this.Ns++;
        return l;
    }

    public long aTv() {
        --this.Ns;
        return this.Ns;
    }

    public long aTw() {
        long l = this.Ns--;
        return l;
    }

    public long cI(long l) {
        this.Ns += l;
        return this.Ns;
    }

    public long cJ(long l) {
        this.Ns -= l;
        return this.Ns;
    }

    public long cK(long l) {
        this.Ns *= l;
        return this.Ns;
    }

    public long cL(long l) {
        this.Ns /= l;
        return this.Ns;
    }

    public long cM(long l) {
        this.Ns %= l;
        return this.Ns;
    }

    public long cN(long l) {
        if (l > this.Ns) {
            this.Ns = l;
        }
        return this.Ns;
    }

    public long cO(long l) {
        if (l < this.Ns) {
            this.Ns = l;
        }
        return this.Ns;
    }

    @Override
    public int intValue() {
        return (int)this.Ns;
    }

    @Override
    public long longValue() {
        return this.Ns;
    }

    @Override
    public float floatValue() {
        return this.Ns;
    }

    @Override
    public double doubleValue() {
        return this.Ns;
    }

    public String toString() {
        return String.valueOf(this.Ns);
    }
}

