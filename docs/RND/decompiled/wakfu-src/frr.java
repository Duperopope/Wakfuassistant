/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class frr {
    public static final long sXX = TimeUnit.MILLISECONDS.convert(5L, TimeUnit.SECONDS);
    private frs mkG = frs.sYc;
    private exP sXY;
    private long cwe = sXX;
    private Runnable sXZ;
    private Runnable sYa;
    private Runnable sYb;

    public boolean gjZ() {
        if (this.mkG != frs.sYc) {
            return false;
        }
        if (this.sXY.fhA()) {
            return false;
        }
        this.mkG = frs.sYd;
        this.sXY.a(this);
        if (this.sYb != null) {
            this.sYb.run();
        }
        abg_2.bUP().a(this::cas, this.cwe, 1);
        return true;
    }

    public void cancel() {
        if (this.mkG == frs.sYc) {
            return;
        }
        if (this.mkG == frs.sYf) {
            return;
        }
        this.mkG = frs.sYe;
        this.clean();
        if (this.sXZ == null) {
            return;
        }
        this.sXZ.run();
    }

    public void cas() {
        if (this.mkG != frs.sYd) {
            return;
        }
        this.mkG = frs.sYf;
        this.clean();
        if (this.sYa == null) {
            return;
        }
        this.sYa.run();
    }

    private void clean() {
        this.sXY.a((frr)null);
    }

    private frr() {
    }

    public static frr bY(@NotNull exP exP2) {
        frr frr2 = new frr();
        frr2.sXY = exP2;
        return frr2;
    }

    public frr uG(long l) {
        this.cwe = l;
        return this;
    }

    public frr F(Runnable runnable) {
        this.sXZ = runnable;
        return this;
    }

    public frr G(Runnable runnable) {
        this.sYa = runnable;
        return this;
    }

    public frr H(Runnable runnable) {
        this.sYb = runnable;
        return this;
    }
}

