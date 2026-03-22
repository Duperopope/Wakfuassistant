/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

/*
 * Renamed from aBg
 */
public class abg_2 {
    private static final Logger dyi = Logger.getLogger(abg_2.class);
    private static final abg_2 dyj = new abg_2();
    private static final int dyk = 30;
    private final ConcurrentLinkedQueue<abl_2> dyl = new ConcurrentLinkedQueue();
    private final List<abi_2> dym = new ArrayList<abi_2>();
    private final List<abi_2> dyn = new ArrayList<abi_2>();
    private final AtomicInteger dyo = new AtomicInteger(0);
    private final AtomicInteger dyp = new AtomicInteger(0);

    private abg_2() {
    }

    public static abg_2 bUP() {
        return dyj;
    }

    public void i(Runnable runnable) {
        this.a(runnable, 1L, 1);
    }

    public void a(Runnable runnable, Duration duration) {
        this.a(runnable, duration.toMillis(), -1);
    }

    public void a(Runnable runnable, long l) {
        this.a(runnable, l, -1);
    }

    public void a(Runnable runnable, abf_2 abf_22, long l, int n) {
        if (runnable == null) {
            dyi.error((Object)"Tentative d'insertion d'un Runnable null");
            return;
        }
        if (n == 0) {
            dyi.warn((Object)"On schedule un runnable pour \u00eatre execut\u00e9 0 fois, WTF ? (Gros blaireau)");
            return;
        }
        abj_1 abj_12 = new abj_1(runnable, abf_22.ho(l));
        abj_12.wF(n);
        this.a(abj_12);
    }

    public void a(Runnable runnable, Duration duration, int n) {
        this.a(runnable, duration.toMillis(), n);
    }

    public void a(Runnable runnable, long l, int n) {
        if (runnable == null) {
            dyi.error((Object)"Tentative d'insertion d'un Runnable null");
            return;
        }
        if (n == 0) {
            dyi.warn((Object)"On schedule un runnable pour \u00eatre execut\u00e9 0 fois");
            return;
        }
        abk_1 abk_12 = new abk_1(runnable, l);
        abk_12.wF(n);
        this.a(abk_12);
    }

    public void b(Runnable runnable, long l) {
        this.i(runnable);
        this.a(runnable, l);
    }

    private void a(abi_2 abi_22) {
        abl_2 abl_22 = new abl_2(abm_2.dyz, abi_22, null);
        this.dyl.offer(abl_22);
        this.dyp.incrementAndGet();
        aaw_1.bUq().bFY();
    }

    public void h(Runnable runnable) {
        abl_2 abl_22 = new abl_2(abm_2.dyA, null, runnable);
        this.dyl.offer(abl_22);
        this.dyp.incrementAndGet();
    }

    public void bUQ() {
        this.dym.clear();
        this.dyl.clear();
        this.dyp.set(0);
        this.dyo.set(0);
    }

    private void a(abi_2 abi_22, long l) {
        long l2 = abi_22.hp(l);
        for (int i = 0; i < this.dym.size(); ++i) {
            abi_2 abi_23 = this.dym.get(i);
            if (l2 >= abi_23.bUV()) continue;
            this.dym.add(i, abi_22);
            return;
        }
        this.dym.add(abi_22);
    }

    public long bUR() {
        if (this.dym.isEmpty()) {
            return 30L;
        }
        long l = this.dym.get(0).bUV() - System.currentTimeMillis();
        return Math.max(0L, l);
    }

    public boolean bUS() {
        return !this.dym.isEmpty() || this.dyl.peek() != null;
    }

    public void bUT() {
        if (!this.bUS()) {
            return;
        }
        this.bUU();
    }

    private void bUU() {
        abl_2 abl_22;
        long l = System.currentTimeMillis();
        while ((abl_22 = this.dyl.poll()) != null) {
            block0 : switch (abl_22.bUX()) {
                case dyA: {
                    Iterator<abi_2> iterator = this.dym.iterator();
                    while (iterator.hasNext()) {
                        abi_2 abi_22 = iterator.next();
                        if (abi_22.bkp() != abl_22.bkp()) continue;
                        this.dyo.decrementAndGet();
                        iterator.remove();
                        break block0;
                    }
                    break;
                }
                case dyz: {
                    this.dyo.incrementAndGet();
                    this.a(abl_22.bUY(), l);
                    break;
                }
                default: {
                    dyi.error((Object)("Undefined operation ! : " + String.valueOf((Object)abl_22.bUX())));
                }
            }
            this.dyp.decrementAndGet();
        }
    }

    public void aPc() {
        if (!this.bUS()) {
            return;
        }
        long l = System.currentTimeMillis();
        this.bUU();
        Iterator<abi_2> iterator = this.dym.iterator();
        while (iterator.hasNext()) {
            abi_2 abi_22 = iterator.next();
            long l2 = l - abi_22.bUV();
            if (l2 < 0L) continue;
            iterator.remove();
            this.dyo.decrementAndGet();
            int n = abi_22.bUW();
            if (n == 0) continue;
            if (n > 0) {
                --n;
            }
            abi_22.wF(n);
            Runnable runnable = null;
            try {
                runnable = abi_22.bkp();
                if (runnable != null) {
                    runnable.run();
                } else {
                    dyi.error((Object)"(Paranoia) Process null ?!");
                }
            }
            catch (Throwable throwable) {
                dyi.error(runnable != null ? "ProcessScheduler exception (" + runnable.getClass().getName() + "): " : "ProcessScheduler exception (null process): ", throwable);
            }
            if (n == 0) continue;
            this.dyn.add(abi_22);
        }
        if (!this.dyn.isEmpty()) {
            l = System.currentTimeMillis();
            int n = this.dyn.size();
            for (int i = 0; i < n; ++i) {
                this.a(this.dyn.get(i), l);
            }
            this.dyn.clear();
        }
        this.bUU();
    }
}

