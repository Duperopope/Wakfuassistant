/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from axR
 */
public final class axr_1
extends Thread {
    protected static final Logger drH = Logger.getLogger(axr_1.class);
    private boolean btq = false;
    private int drI;
    private long drj = System.nanoTime();
    private final ArrayList<axs_1> drJ = new ArrayList();

    private axr_1() {
    }

    @Override
    public synchronized void start() {
        this.btq = true;
        super.start();
    }

    public int bRw() {
        return this.drI;
    }

    public void vl(int n) {
        this.drI = n;
    }

    public boolean bhl() {
        return this.btq;
    }

    public long bRx() {
        return this.drj;
    }

    public void gE(long l) {
        this.drj = l;
    }

    public boolean a(axt_1 axt_12) {
        for (axs_1 axs_12 : this.drJ) {
            if (axs_12.bRy() != axt_12) continue;
            return true;
        }
        return false;
    }

    public axs_1 a(axt_1 axt_12, int n) {
        if (!this.a(axt_12)) {
            axs_1 axs_12 = new axs_1(axt_12, n);
            this.drJ.add(axs_12);
            return axs_12;
        }
        return null;
    }

    public void b(axt_1 axt_12) {
        for (axs_1 axs_12 : this.drJ) {
            if (axs_12.bRy() != axt_12) continue;
            this.drJ.remove(axs_12);
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        ArrayList<axs_1> arrayList = new ArrayList<axs_1>();
        Object object = new Object();
        drH.info((Object)"Animator running");
        Object object2 = object;
        synchronized (object2) {
            while (this.btq) {
                arrayList.clear();
                long l = Long.MAX_VALUE;
                long l2 = System.nanoTime();
                for (axs_1 axs_12 : this.drJ) {
                    long l3 = axs_12.gF(l2);
                    if (l3 >= l) continue;
                    l = l3;
                    arrayList.add(axs_12);
                }
                if (l > 0L) {
                    try {
                        if (l == Long.MAX_VALUE) {
                            object.wait(100L);
                        } else {
                            object.wait((int)(l / 1000000L), (int)(l % 1000000L));
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        drH.error((Object)"InterruptedException during Animator run", (Throwable)interruptedException);
                    }
                }
                l2 = System.nanoTime();
                for (axs_1 axs_12 : arrayList) {
                    axs_12.bRy().gJ(axs_12.gG(l2));
                }
            }
        }
    }
}

