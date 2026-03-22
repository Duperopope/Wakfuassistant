/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

/*
 * Renamed from ayF
 */
public class ayf_2
extends aye_2 {
    private static final Logger dtz = Logger.getLogger(ayf_2.class);
    protected acn_2 dtA;
    protected static final AtomicInteger dtB = new AtomicInteger(-1);

    public ayf_2() {
        this.dx(false);
        this.dC(dtB.getAndDecrement());
    }

    public void bSm() {
    }

    public void bSn() {
        dtz.info((Object)"FrameworkEntity::onReConnect()");
    }

    public void bSo() {
    }

    public void a(acn_2 acn_22) {
        this.dtA = acn_22;
    }

    public acn_2 bSp() {
        return this.dtA;
    }

    public synchronized void bSq() {
        if (this.dtA != null) {
            this.dtA.bXT();
        }
    }

    public synchronized boolean bSr() {
        return this.dtA != null && this.dtA.bSr();
    }

    public <OutputMessage extends aam_2> void d(OutputMessage OutputMessage) {
        this.a(OutputMessage, false);
    }

    public synchronized <OutputMessage extends aam_2> void a(OutputMessage OutputMessage, boolean bl) {
        try {
            this.dtA.h(OutputMessage);
        }
        catch (RuntimeException runtimeException) {
            dtz.error((Object)("Exception pushing message " + OutputMessage.getClass().getSimpleName()), (Throwable)runtimeException);
        }
    }
}

