/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class ftQ
implements Comparable<ftQ> {
    protected static final Logger tgK = Logger.getLogger(ftQ.class);
    private final ftP tgL;
    private final long tgM;

    public ftQ(ftP ftP2) {
        this.tgL = ftP2;
        this.tgM = System.currentTimeMillis();
    }

    public ftQ(ftP ftP2, int n) {
        assert ((long)n <= ftP2.gmE()) : "Temps restant trop court";
        this.tgL = ftP2;
        this.tgM = System.currentTimeMillis() + (long)n - ftP2.gmE();
    }

    public final ftP gmH() {
        return this.tgL;
    }

    public final int gmI() {
        return this.tgL.gmD();
    }

    public final long gmJ() {
        return this.tgM;
    }

    public final long gmK() {
        if (this.tgL.gmF()) {
            return Long.MAX_VALUE;
        }
        return this.tgM + this.tgL.gmE();
    }

    public final int gmL() {
        if (this.tgL.gmF()) {
            return -1;
        }
        long l = this.gmK() - System.currentTimeMillis();
        return l <= Integer.MAX_VALUE ? (int)l : -1;
    }

    public final int c(@NotNull ftQ ftQ2) {
        long l = this.gmK() - ftQ2.gmK();
        if (l > 0L) {
            return 1;
        }
        if (l < 0L) {
            return -1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.c((ftQ)object);
    }
}

