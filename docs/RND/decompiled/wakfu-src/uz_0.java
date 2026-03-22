/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Uz
 */
public class uz_0
implements ua_0 {
    private int bvK;
    private int bvL;
    private int bvM;
    private int bvS;
    private long bvT;

    public uz_0(long l) {
        this.bvT = l;
        this.bjP();
    }

    public uz_0(ua_0 ua_02) {
        this.bvK = ua_02.bjH();
        this.bvL = ua_02.bjF();
        this.bvM = ua_02.bjE();
        this.bvS = ua_02.bjR();
        this.bjQ();
        this.bjP();
    }

    public uz_0(int n, int n2, int n3, int n4) {
        this.bvK = n;
        this.bvL = n2;
        this.bvM = n3;
        this.bvS = n4;
        this.bjQ();
        this.bjP();
    }

    public void c(ua_0 ua_02) {
        if (ua_02 == null) {
            this.c(bwa);
            return;
        }
        this.bvK = ua_02.bjH();
        this.bvL = ua_02.bjF();
        this.bvM = ua_02.bjE();
        this.bvS = ua_02.bjR();
        this.bvT = ua_02.bjS();
    }

    public void f(int n, int n2, int n3, int n4) {
        this.bvK = n;
        this.bvL = n2;
        this.bvM = n3;
        this.bvS = n4;
        this.bjQ();
        this.bjP();
    }

    private void bjP() {
        long l = this.bvT;
        this.bvS = (int)(l / 86400L);
        this.bvM = (int)((l -= (long)(this.bvS * 3600 * 24)) / 3600L);
        this.bvL = (int)((l -= (long)(this.bvM * 3600)) / 60L);
        this.bvK = (int)(l -= (long)(this.bvL * 60));
    }

    private void bjQ() {
        this.bvT = this.bvK + this.bvL * 60 + this.bvM * 3600 + this.bvS * 3600 * 24;
    }

    @Override
    public int bjH() {
        return this.bvK;
    }

    @Override
    public int bjF() {
        return this.bvL;
    }

    @Override
    public int bjE() {
        return this.bvM;
    }

    @Override
    public int bjR() {
        return this.bvS;
    }

    @Override
    public boolean aYI() {
        return this.bvT > 0L;
    }

    @Override
    public boolean aJG() {
        return this.bvT == 0L;
    }

    public boolean equals(Object object) {
        if (object == this || object instanceof ua_0) {
            ua_0 ua_02 = (ua_0)object;
            return this.bjS() == ua_02.bjS();
        }
        return false;
    }

    @Override
    public boolean d(@NotNull ua_0 ua_02) {
        return this.bvT > ua_02.bjS();
    }

    @Override
    public boolean e(@NotNull ua_0 ua_02) {
        return this.bvT < ua_02.bjS();
    }

    public String toString() {
        return "{Interval: " + this.bvS + "d " + this.bvM + ":" + this.bvL + ";" + this.bvK + "}";
    }

    @Override
    public long bjS() {
        return this.bvT;
    }

    @Override
    public long bjB() {
        return this.bvT * 1000L;
    }

    public static uz_0 fo(long l) {
        return new uz_0(l);
    }

    public static uz_0 fp(long l) {
        return new uz_0(l / 1000L);
    }

    @Override
    public int f(ua_0 ua_02) {
        if (this.aJG()) {
            return 0;
        }
        if (ua_02.aJG()) {
            throw new ArithmeticException("/ by zero");
        }
        long l = this.bvT;
        long l2 = ua_02.bjS();
        if (l2 == 0L) {
            throw new ArithmeticException("/ by zero");
        }
        return (int)(l / l2);
    }

    public void g(ua_0 ua_02) {
        if (ua_02 == null) {
            return;
        }
        this.bvT += ua_02.bjS();
        this.bjP();
    }

    public void h(ua_0 ua_02) {
        if (ua_02 == null) {
            return;
        }
        this.bvT -= ua_02.bjS();
        this.bjP();
    }

    public void pQ(int n) {
        this.bvT *= (long)n;
        this.bjP();
    }

    public void bs(float f2) {
        this.bvT = (long)((float)this.bvT * f2);
        this.bjP();
    }
}

