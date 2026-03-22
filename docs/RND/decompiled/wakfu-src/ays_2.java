/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.commons.pool.impl.StackObjectPoolFactory
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.kernel.core.common.MemoryObjectPool$2;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.StackObjectPoolFactory;
import org.apache.log4j.Logger;

/*
 * Renamed from ayS
 */
public class ays_2 {
    private static final boolean duo = false;
    public static final Logger dup = Logger.getLogger(ays_2.class);
    private ObjectPool<ayq_2> duq = new StackObjectPoolFactory((PoolableObjectFactory)new ayt_2(this)).createPool();
    private final Class dur;
    final ayr_2 dus;
    private final int dut;

    public static ayr_2 r(Class clazz) {
        return new MemoryObjectPool$2(clazz, clazz);
    }

    public ays_2(int n, Class clazz, ayr_2 ayr_22) {
        ays_2.a(ayr_22, clazz);
        this.dus = ayr_22;
        this.dur = clazz;
        this.dut = ayq_2.q(clazz);
        ayu_2.bST().c(this);
    }

    private static boolean a(ayr_2<?> ayr_22, Class clazz) {
        if (ayr_22.bSL() != clazz) {
            throw new IllegalArgumentException("Invalid factory : should be a " + String.valueOf(clazz));
        }
        return true;
    }

    public final ayq_2 bSM() {
        try {
            ayq_2 ayq_22 = (ayq_2)this.duq.borrowObject();
            ayq_22.bSX();
            ayq_22.brr();
            aau_2.M(ayq_22);
            return ayq_22;
        }
        catch (Exception exception) {
            throw new RuntimeException("Unable to extract an object from pool, classType : " + this.dur.getName());
        }
    }

    public final void a(ayq_2 ayq_22) {
        try {
            this.duq.returnObject((Object)ayq_22);
            aau_2.Z(ayq_22);
        }
        catch (Exception exception) {
            dup.error((Object)("Error releasing MemoryObject : " + String.valueOf(ayq_22)));
        }
    }

    public final int bSN() {
        return this.dut;
    }

    public final Class bSO() {
        return this.dur;
    }

    public final int bSP() {
        return this.duq.getNumActive();
    }

    public final int bSQ() {
        return this.duq.getNumActive() + this.duq.getNumIdle();
    }
}

