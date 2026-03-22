/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aCL
 */
public final class acl_2
extends Thread
implements ack_2 {
    protected static final Logger dBU = Logger.getLogger(acl_2.class);
    private boolean btq;
    private int dBT;
    private long dBV;
    private static final acl_2 dBW = new acl_2();
    private final HashMap<Long, Long> dBX = new HashMap();

    public static acl_2 bXQ() {
        return dBW;
    }

    private acl_2() {
        super("ThreadMonitor");
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
            this.dBV = System.nanoTime();
            super.start();
        }
    }

    @Override
    public synchronized void run() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (threadMXBean == null) {
            return;
        }
        if (!threadMXBean.isThreadCpuTimeSupported()) {
            return;
        }
        threadMXBean.setThreadCpuTimeEnabled(true);
        while (this.btq) {
            double d2 = System.nanoTime() - this.dBV;
            long[] lArray = threadMXBean.getAllThreadIds();
            long l = 0L;
            dBU.info((Object)"-----------------------------------------------------------------------");
            for (long l2 : lArray) {
                long l3 = threadMXBean.getThreadCpuTime(l2);
                long l4 = l3 - this.hx(l2);
                if (l4 <= 0L) continue;
                this.j(l2, l3);
                double d3 = 100.0 * ((double)l4 / d2);
                ThreadInfo threadInfo = threadMXBean.getThreadInfo(l2);
                dBU.info((Object)("[" + threadInfo.getThreadName() + "] usage = " + d3 + " %"));
                l += l4;
            }
            double d4 = 100.0 * ((double)l / d2);
            dBU.info((Object)("total cpu usage = " + d4 + " %"));
            this.dBV = System.nanoTime();
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                dBU.error((Object)"InterruptedException during ThreadMonitor run", (Throwable)interruptedException);
            }
        }
    }

    public long hx(long l) {
        if (this.dBX.containsKey(l)) {
            return this.dBX.get(l);
        }
        return 0L;
    }

    public void j(long l, long l2) {
        this.dBX.put(l, l2);
    }
}

