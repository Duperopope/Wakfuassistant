/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aDz
 */
class adz_2
implements adf_1 {
    protected static final Logger dDJ = Logger.getLogger(adz_2.class);
    private aam_2 dDK;
    private boolean dDL;
    private Exception dDM;
    private final Lock dDN = new ReentrantLock();
    private final Condition dDO = this.dDN.newCondition();

    adz_2() {
        this.clear();
    }

    public void clear() {
        this.dDK = null;
        this.dDL = false;
        this.dDM = null;
    }

    public void bYy() {
        this.dDN.lock();
    }

    public void bYz() {
        this.dDN.unlock();
    }

    public void bYA() {
        try {
            this.dDO.await();
        }
        catch (InterruptedException interruptedException) {
            dDJ.info((Object)"BlockingRequestRecipient wait interrupted", (Throwable)interruptedException);
        }
    }

    @Nullable
    public aam_2 bYB() {
        return this.dDK;
    }

    public boolean bYC() {
        return this.dDL;
    }

    public boolean bYD() {
        return this.dDM != null;
    }

    @Nullable
    public Exception bYE() {
        return this.dDM;
    }

    private void bYF() {
        this.dDN.lock();
        try {
            this.dDO.signalAll();
        }
        finally {
            this.dDN.unlock();
        }
    }

    @Override
    public void a(adc_1 adc_12, Exception exception) {
        this.dDM = exception;
        this.dDL = true;
        this.bYF();
        adf_1.super.a(adc_12, exception);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        this.dDK = aam_22;
        this.dDL = true;
        this.bYF();
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

