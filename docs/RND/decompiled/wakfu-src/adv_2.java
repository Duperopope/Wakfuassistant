/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 */
import org.apache.commons.pool.PoolableObjectFactory;

/*
 * Renamed from aDv
 */
public abstract class adv_2<E extends adt_2>
implements PoolableObjectFactory {
    public abstract E bYu();

    public void activateObject(Object object) {
        ((ayx_2)object).aVI();
    }

    public void passivateObject(Object object) {
        try {
            ((ayx_2)object).aVH();
        }
        catch (Exception exception) {
            throw new RuntimeException("passivateObject exception");
        }
    }

    public void destroyObject(Object object) {
    }

    public boolean validateObject(Object object) {
        return true;
    }

    public /* synthetic */ Object makeObject() {
        return this.bYu();
    }
}

