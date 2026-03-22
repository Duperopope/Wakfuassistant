/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import org.apache.log4j.Logger;

/*
 * Renamed from aCJ
 */
public final class acj_2
extends Thread
implements ack_2 {
    protected static final Logger dBR = Logger.getLogger(acj_2.class);
    private static final acj_2 dBS = new acj_2();
    private int dBT;
    private boolean btq;

    public static acj_2 bXP() {
        return dBS;
    }

    private acj_2() {
        super("MemoryMonitor");
    }

    @Override
    public String bSw() {
        return this.getName();
    }

    @Override
    public int bSx() {
        return this.dBT;
    }

    @Override
    public void vw(int n) {
        this.dBT = n;
    }

    @Override
    public synchronized void start() {
        if (!this.btq) {
            this.btq = true;
            super.start();
        }
    }

    @Override
    public void run() {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        while (this.btq) {
            MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
            MemoryUsage memoryUsage2 = memoryMXBean.getNonHeapMemoryUsage();
            dBR.error((Object)("Memory usage : heap(" + this.hw(memoryUsage.getUsed()) + " / " + this.hw(memoryUsage.getMax()) + ") non-heap(" + this.hw(memoryUsage2.getUsed()) + " / " + this.hw(memoryUsage2.getMax()) + ")"));
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                dBR.error((Object)"InterruptedException during MemoryMonitor run", (Throwable)interruptedException);
            }
        }
    }

    private float hw(long l) {
        return (float)l / 1024000.0f;
    }
}

