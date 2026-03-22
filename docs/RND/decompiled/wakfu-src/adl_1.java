/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 */
import org.apache.commons.pool.PoolableObjectFactory;

/*
 * Renamed from aDl
 */
public abstract class adl_1<E extends adu_2>
implements PoolableObjectFactory {
    public abstract E bYe();

    public void activateObject(Object object) {
        ((ayx_2)object).aVI();
    }

    public void passivateObject(Object object) {
        ((ayx_2)object).aVH();
    }

    public void destroyObject(Object object) {
    }

    public boolean validateObject(Object object) {
        return true;
    }

    public /* synthetic */ Object makeObject() {
        return this.bYe();
    }
}

