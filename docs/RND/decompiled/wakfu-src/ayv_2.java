/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.commons.pool.impl.SoftReferenceObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.SoftReferenceObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from ayV
 */
public class ayv_2
extends SoftReferenceObjectPool {
    protected static final Logger duC = Logger.getLogger(ayv_2.class);
    protected String duD;
    protected static final Object duE = new Object();
    protected static final HashMap<String, ayv_2> duF = new HashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ayv_2 gU(String string) {
        Object object = duE;
        synchronized (object) {
            return duF.get(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Iterable<String> bSU() {
        Object object = duE;
        synchronized (object) {
            return duF.keySet();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string, ayv_2 ayv_22) {
        Object object = duE;
        synchronized (object) {
            int n = 0;
            Object object2 = string;
            while (duF.containsKey(object2)) {
                object2 = string + " #" + n++;
            }
            ayv_22.duD = object2;
            duF.put((String)object2, ayv_22);
        }
    }

    public ayv_2(PoolableObjectFactory poolableObjectFactory) {
        super(poolableObjectFactory);
        try {
            Object object = this.borrowObject();
            this.duD = object.getClass().getName();
            ayv_2.a(this.duD, this);
            this.returnObject(object);
        }
        catch (Exception exception) {
            duC.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
        }
    }

    public String getName() {
        return this.duD;
    }

    public ayv_2(PoolableObjectFactory poolableObjectFactory, int n) {
        super(poolableObjectFactory);
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        try {
            int n3;
            Object[] objectArray = new Object[n2];
            for (n3 = 0; n3 < n2; ++n3) {
                objectArray[n3] = this.borrowObject();
            }
            for (n3 = 0; n3 < n2; ++n3) {
                this.returnObject(objectArray[n3]);
                objectArray[n3] = null;
            }
            Object object = this.borrowObject();
            this.returnObject(object);
            this.duD = object.getClass().getName();
            ayv_2.a(this.duD, this);
        }
        catch (Exception exception) {
            duC.error((Object)"Exception lev\u00e9e : ", (Throwable)exception);
        }
    }

    public synchronized Object borrowObject() {
        Object object = super.borrowObject();
        aau_2.M(object);
        return object;
    }

    public synchronized void returnObject(Object object) {
        super.returnObject(object);
        aau_2.Z(object);
    }
}

