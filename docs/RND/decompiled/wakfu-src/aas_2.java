/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aAS
 */
public class aas_2 {
    protected static final Logger dwZ = Logger.getLogger(aas_2.class);
    private static final aas_2 dxa = new aas_2();
    final Map<Runnable, aau_1> dxb = new HashMap<Runnable, aau_1>();
    private static final boolean dxc = false;
    final ObjectPool dxd = new ayv_2(new aat_2(this));

    private aas_2() {
    }

    public static aas_2 bUl() {
        return dxa;
    }

    private aau_1 a(aas_2 aas_22, Runnable runnable, long l, int n) {
        try {
            aau_1 aau_12 = (aau_1)this.dxd.borrowObject();
            aau_12.dxf = aas_22;
            aau_12.dxg = runnable;
            aau_12.dxh = l;
            aau_12.dxi = n;
            aau_12.dxj = true;
            aau_12.dxk = true;
            return aau_12;
        }
        catch (Exception exception) {
            dwZ.error((Object)"Exception levee", (Throwable)exception);
            return new aau_1(this, aas_22, runnable, l, n);
        }
    }

    int bUm() {
        return this.dxd.getNumActive() + this.dxd.getNumIdle();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(aau_1 aau_12) {
        this.dxb.remove(aau_12.dxg);
        aau_1 aau_13 = aau_12;
        synchronized (aau_13) {
            try {
                aau_12.aZp();
                aau_12.wait();
                aau_12.run();
            }
            catch (InterruptedException interruptedException) {
                dwZ.error((Object)"Exception levee", (Throwable)interruptedException);
            }
        }
    }

    public void a(Runnable runnable, long l, int n) {
        abg_2.bUP().a(runnable, l, n);
    }

    public void h(Runnable runnable) {
        aau_1 aau_12 = this.dxb.remove(runnable);
        if (aau_12 != null) {
            aau_12.dxk = false;
        } else {
            dwZ.warn((Object)"On essaie de retirer une tache qui n'est pas dans le scheduler");
        }
    }
}

