/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.OptionalLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aAW
 */
public class aaw_1 {
    static final Logger dxm = Logger.getLogger(aaw_1.class);
    static final String dxn = "Worker";
    private static aaw_1 dxo = new aaw_1();
    final Lock dxp = new ReentrantLock();
    final Condition dxq = this.dxp.newCondition();
    aay_2 dxr;
    @NotNull
    private aad_2 dxs = new aad_2();

    private aaw_1() {
    }

    @NotNull
    Runnable bUp() {
        return this.dxs::run;
    }

    public void a(@NotNull aad_2 aad_22) {
        this.dxs = aad_22;
    }

    public static aaw_1 bUq() {
        return dxo;
    }

    public void start() {
        if (this.dxr != null && this.dxr.isAlive()) {
            return;
        }
        this.dxr = new aay_2(new aax_2(this, this.dxs), dxn);
        this.dxr.start();
    }

    public void bUr() {
        if (this.dxr == null) {
            return;
        }
        this.dxr.join();
    }

    public void bFY() {
        if (this.dxr == null) {
            return;
        }
        if (this.dxp.tryLock()) {
            this.dxq.signalAll();
            this.dxp.unlock();
        }
    }

    public void bUs() {
        if (this.dxr == null) {
            return;
        }
        this.dxr.interrupt();
        this.bFY();
    }

    public void bLI() {
        if (this.dxr == null) {
            return;
        }
        this.dxs.clear();
        this.cL(false);
    }

    protected boolean bUt() {
        return this.dxr != null && this.dxr.bhl();
    }

    public void cL(boolean bl) {
        if (this.dxr == null) {
            return;
        }
        this.dxr.cL(bl);
        this.bFY();
    }

    public void h(aam_2 aam_22) {
        if (aam_22 == null) {
            return;
        }
        aam_22.hg(System.currentTimeMillis());
        aam_22.hh(System.nanoTime());
        this.dxs.g(aam_22);
        if (this.bhl()) {
            this.bFY();
        }
    }

    public int bUu() {
        return this.dxs.bUf();
    }

    public boolean bhl() {
        return this.dxr != null && this.dxr.bhl();
    }

    public OptionalLong bUv() {
        if (this.dxr == null) {
            return OptionalLong.empty();
        }
        return OptionalLong.of(this.dxr.threadId());
    }

    public boolean bUw() {
        OptionalLong optionalLong = this.bUv();
        if (optionalLong.isEmpty()) {
            return false;
        }
        return Thread.currentThread().threadId() == optionalLong.getAsLong();
    }

    public String gX(String string) {
        return this.dxs.gX(string);
    }
}

