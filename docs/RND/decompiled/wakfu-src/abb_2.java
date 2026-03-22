/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  gnu.trove.list.linked.TLinkedList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.TLinkable;
import gnu.trove.list.linked.TLinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

/*
 * Renamed from aBb
 */
public class abb_2
extends Thread {
    private static final long dxB = 3L;
    private static final Logger dxC = Logger.getLogger(abb_2.class);
    protected static final abb_2 dxD = new abb_2();
    protected boolean btq = false;
    protected final TLinkedList<abe_2> dxE = new TLinkedList();
    protected final Queue<abd_2> dxF = new ConcurrentLinkedQueue<abd_2>();
    protected final Lock dxG = new ReentrantLock();
    protected final Condition dxH = this.dxG.newCondition();
    protected long dxI;

    protected abb_2() {
        super("MessageScheduler");
    }

    public static abb_2 bUA() {
        return dxD;
    }

    private void bFY() {
        this.dxG.lock();
        this.dxH.signalAll();
        this.dxG.unlock();
    }

    public long a(aao_2 aao_22, long l, int n) {
        return this.a(aao_22, l, n, -1L);
    }

    public long a(aao_2 aao_22, long l, int n, long l2) {
        abe_2 abe_22 = new abe_2();
        abe_22.c(aao_22);
        abe_22.hm(l);
        abe_22.wE(n);
        abe_22.hl(l2);
        abe_22.hn(System.currentTimeMillis());
        ++this.dxI;
        abe_22.hi(this.dxI);
        abd_2 abd_22 = new abd_2();
        abd_22.dxP = abc_2.dxN;
        abd_22.dxQ = abe_22;
        this.dxF.offer(abd_22);
        this.bFY();
        return abe_22.bUx();
    }

    public void hk(long l) {
        abd_2 abd_22 = new abd_2();
        abd_22.dxP = abc_2.dxJ;
        abd_22.dxR = l;
        this.dxF.offer(abd_22);
        this.bFY();
    }

    public void bUB() {
        abd_2 abd_22 = new abd_2();
        abd_22.dxP = abc_2.dxM;
        this.dxF.offer(abd_22);
        this.bFY();
    }

    public void b(aao_2 aao_22) {
        abd_2 abd_22 = new abd_2();
        abd_22.dxP = abc_2.dxK;
        abd_22.dxS = aao_22;
        this.dxF.offer(abd_22);
        this.bFY();
    }

    public void a(aao_2 aao_22, int n) {
        abd_2 abd_22 = new abd_2();
        abd_22.dxP = abc_2.dxL;
        abd_22.dxS = aao_22;
        abd_22.dxT = n;
        this.dxF.offer(abd_22);
        this.bFY();
    }

    @Override
    public void start() {
        if (!this.btq) {
            this.btq = true;
            super.start();
        }
    }

    public boolean bhl() {
        return this.btq;
    }

    public void cL(boolean bl) {
        this.btq = bl;
        this.bFY();
    }

    private void a(abe_2 abe_22) {
        boolean bl = false;
        long l = abe_22.bUJ();
        for (abe_2 abe_23 : this.dxE) {
            if (abe_23.bUJ() <= l) continue;
            this.dxE.addBefore((TLinkable)abe_23, (TLinkable)abe_22);
            bl = true;
            break;
        }
        if (!bl) {
            this.dxE.add((TLinkable)abe_22);
        }
    }

    private void a(abe_2 abe_22, long l) {
        try {
            aba_2 aba_22 = new aba_2();
            aba_22.a(abe_22.bUL());
            aba_22.hi(abe_22.bUx());
            aba_22.wE(abe_22.bUy());
            aba_22.hj(l);
            aaw_1.bUq().h(aba_22);
        }
        catch (Exception exception) {
            dxC.error((Object)("Unable to push ClockMessage, exception raised : " + exception.getMessage()));
        }
    }

    private void bUC() {
        while (!this.dxF.isEmpty()) {
            abd_2 abd_22 = this.dxF.poll();
            block0 : switch (abd_22.dxP.ordinal()) {
                case 4: {
                    this.a(abd_22.dxQ);
                    break;
                }
                case 0: {
                    abe_2 abe_22;
                    Iterator iterator = this.dxE.iterator();
                    while (iterator.hasNext()) {
                        abe_22 = (abe_2)iterator.next();
                        if (abe_22.bUx() != abd_22.dxR) continue;
                        abe_22.bUN();
                        iterator.remove();
                        break block0;
                    }
                    break;
                }
                case 1: {
                    abe_2 abe_22;
                    Iterator iterator = this.dxE.iterator();
                    while (iterator.hasNext()) {
                        abe_22 = (abe_2)iterator.next();
                        if (abe_22.bUL() != abd_22.dxS) continue;
                        iterator.remove();
                    }
                    break;
                }
                case 2: {
                    abe_2 abe_22;
                    Iterator iterator = this.dxE.iterator();
                    while (iterator.hasNext()) {
                        abe_22 = (abe_2)iterator.next();
                        if (abe_22.bUL() != abd_22.dxS || abe_22.bUy() != abd_22.dxT) continue;
                        iterator.remove();
                    }
                    break;
                }
                case 3: {
                    this.dxE.clear();
                }
            }
        }
    }

    @Override
    public void run() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        dxC.info((Object)"MessageScheduler running");
        while (this.btq) {
            try {
                try {
                    if (!this.dxE.isEmpty()) {
                        long l = System.currentTimeMillis();
                        arrayList.clear();
                        Iterator iterator = this.dxE.iterator();
                        while (iterator.hasNext()) {
                            abe_2 abe_22 = (abe_2)iterator.next();
                            if (abe_22.bUJ() <= l + 3L) {
                                if (!abe_22.bUM()) {
                                    this.a(abe_22, l);
                                    abe_22.hn(l);
                                    iterator.remove();
                                    if (!abe_22.bUK()) continue;
                                    arrayList.add(abe_22);
                                    continue;
                                }
                                iterator.remove();
                                continue;
                            }
                            if (!arrayList.isEmpty()) break;
                            this.dxG.lock();
                            this.dxH.await(Math.max(1L, abe_22.bUJ() - l), TimeUnit.MILLISECONDS);
                            this.dxH.signalAll();
                            this.dxG.unlock();
                            break;
                        }
                        if (!arrayList.isEmpty()) {
                            for (abe_2 abe_23 : arrayList) {
                                this.a(abe_23);
                            }
                        }
                        this.bUC();
                        continue;
                    }
                    if (this.dxG.tryLock()) {
                        this.dxH.await();
                        this.dxG.unlock();
                    }
                    this.bUC();
                }
                catch (Exception exception) {
                    dxC.error((Object)"Exception during run", (Throwable)exception);
                }
            }
            catch (Exception exception) {
                dxC.error((Object)"Exception during run", (Throwable)exception);
            }
        }
        dxC.info((Object)"Message Scheduler stopped");
    }

    public final String bUD() {
        long l = System.currentTimeMillis();
        Iterator iterator = this.dxE.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Found ").append(this.dxE.size()).append(" clocks:\n");
        while (iterator.hasNext()) {
            abe_2 abe_22 = (abe_2)iterator.next();
            stringBuilder.append(abe_22.bUL().getClass().getSimpleName()).append(" : ").append(abe_22.bUI()).append(" ms ");
            if (abe_22.bUK()) {
                stringBuilder.append("repeatable ").append(abe_22.bUH()).append(" times ");
            }
            stringBuilder.append("next tick in ").append(abe_22.bUJ() - l).append(" ms\n");
        }
        return stringBuilder.toString();
    }
}

