/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 */
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.pool.PoolableObjectFactory;

/*
 * Renamed from ayI
 */
public class ayi_2
extends ayv_2 {
    private final Queue<Object> dtR = new ConcurrentLinkedQueue<Object>();

    public ayi_2(PoolableObjectFactory poolableObjectFactory) {
        super(poolableObjectFactory);
    }

    private void bSC() {
        if (this.dtR != null) {
            Object object;
            while ((object = this.dtR.poll()) != null) {
                try {
                    super.returnObject(object);
                }
                catch (Exception exception) {
                    duC.error((Object)"Exception during performPendingCheckins", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public synchronized Object borrowObject() {
        this.bSC();
        return super.borrowObject();
    }

    @Override
    public void returnObject(Object object) {
        if (this.dtR != null) {
            this.dtR.offer(object);
        }
    }
}

