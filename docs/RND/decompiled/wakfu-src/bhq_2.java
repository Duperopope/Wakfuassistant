/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from bHQ
 */
public abstract class bhq_2
extends bhi_1 {
    protected final long kcI;
    protected final long kcJ;

    bhq_2(long l, long l2, Runnable runnable) {
        super(runnable);
        this.kcI = l;
        this.kcJ = l2;
    }

    public boolean dWV() {
        return this.kcI != -1L;
    }

    public long ls(long l) {
        return this.kcI == -1L ? l : this.kcI;
    }

    public boolean dWW() {
        return this.kcJ != -1L;
    }

    public long lt(long l) {
        return this.kcJ == -1L ? l : this.kcJ;
    }

    @Override
    public boolean isValid() {
        if (this.kcI == -1L && this.kcJ == -1L) {
            return false;
        }
        if (this.kcI != -1L && this.kcJ != -1L) {
            return this.kcI <= this.kcJ;
        }
        return true;
    }

    public boolean lu(long l) {
        if (this.kcI != -1L && this.kcI > l) {
            return false;
        }
        return this.kcJ == -1L || this.kcJ >= l;
    }

    @Generated
    public long aOa() {
        return this.kcI;
    }

    @Generated
    public long aOb() {
        return this.kcJ;
    }
}

