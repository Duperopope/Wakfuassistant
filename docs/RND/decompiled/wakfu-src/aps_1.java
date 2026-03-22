/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.commons.pool.impl.StackObjectPool
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.StackObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from apS
 */
public abstract class aps_1
extends Thread {
    private static final boolean cPd = false;
    protected static final Logger cPe = LoggerFactory.getLogger(apy_1.class);
    protected final ArrayList<aql_2> cPf = new ArrayList();
    private final Queue<apu_1> cPg = new ConcurrentLinkedQueue<apu_1>();
    private volatile boolean btq;
    private int cPh;
    private final Lock cPi = new ReentrantLock();
    private final Condition cPj = this.cPi.newCondition();
    protected static final String cPk = "id";
    protected static final int cPl = "id".hashCode();
    private final ObjectPool cPm = new StackObjectPool((PoolableObjectFactory)new apt_1(this));

    private apu_1 bFX() {
        try {
            return (apu_1)this.cPm.borrowObject();
        }
        catch (Exception exception) {
            cPe.error("Exception lev\u00e9e lors d'un checkOut d'op\u00e9ration", (Throwable)exception);
            return null;
        }
    }

    private void a(apu_1 apu_12) {
        try {
            this.cPm.returnObject((Object)apu_12);
        }
        catch (Exception exception) {
            cPe.error("Exception lev\u00e9e lors du retour au pool d'un process", (Throwable)exception);
        }
    }

    public void a(aql_2 aql_22) {
        if (!this.cPf.contains(aql_22)) {
            this.cPf.add(aql_22);
        }
    }

    public void b(aql_2 aql_22) {
        this.cPf.remove(aql_22);
    }

    @Override
    public synchronized void start() {
        if (!this.btq) {
            this.btq = true;
            super.start();
        }
    }

    public void aKM() {
        this.a(apv_1.cPr, null);
    }

    public boolean bhl() {
        return this.btq;
    }

    public void cL(boolean bl) {
        this.btq = bl;
        this.bFY();
    }

    private void bFY() {
        this.cPi.lock();
        this.cPj.signal();
        this.cPi.unlock();
    }

    public void a(apv_1 apv_12, Object object) {
        apu_1 apu_12 = this.bFX();
        if (apu_12 != null) {
            apu_12.cPn = apv_12;
            apu_12.cPo = object;
            this.cPg.offer(apu_12);
            this.bFY();
        }
    }

    public int bFZ() {
        return this.cPg.size();
    }

    public int bGa() {
        return this.cPh;
    }

    public void ty(int n) {
        this.cPh = n;
    }

    public abstract apx_1 a(int var1, apx_1 var2);

    public abstract apx_1[] a(apx_1 var1);

    public abstract apx_1[] a(String var1, Object var2, apx_1 var3);

    protected abstract boolean bGb();

    protected abstract void b(apx_1 var1);

    protected abstract void c(apx_1 var1);

    protected abstract String bGc();

    protected abstract void bGd();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        cPe.info("BinaryStorage started " + String.valueOf(this));
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        this.btq = true;
        while (this.btq) {
            apu_1 apu_12;
            while ((apu_12 = this.cPg.poll()) != null) {
                apv_1 apv_12 = apu_12.cPn;
                switch (apv_12.ordinal()) {
                    case 0: {
                        ++n3;
                        Object object = (apx_1)apu_12.cPo;
                        this.b((apx_1)object);
                        for (aql_2 aql_22 : this.cPf) {
                            aql_22.b(this, (apx_1)object);
                        }
                        break;
                    }
                    case 1: {
                        ++n2;
                        Object object = (apx_1)apu_12.cPo;
                        this.c((apx_1)object);
                        for (aql_2 aql_22 : this.cPf) {
                            aql_22.a(this, (apx_1)object);
                        }
                        break;
                    }
                    case 2: {
                        this.cL(false);
                        for (aql_2 aql_23 : this.cPf) {
                            aql_23.c(this);
                        }
                        break;
                    }
                }
                ++n;
                this.a(apu_12);
            }
            if (!this.btq || !this.cPi.tryLock()) continue;
            try {
                this.cPj.await();
            }
            catch (InterruptedException interruptedException) {
                cPe.warn("Interrupt", (Throwable)interruptedException);
            }
            finally {
                this.cPi.unlock();
            }
        }
        cPe.info("BinaryStorage stopped : " + n + " operations, " + n2 + " saved, " + n3 + " destroyed");
    }
}

