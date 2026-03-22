/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.log4j.Logger;

/*
 * Renamed from ayW
 */
public abstract class ayw_2<E extends ayx_2>
implements PoolableObjectFactory {
    private static final boolean duG = false;
    private static final int duH = -1;
    private static final Logger duI = Logger.getLogger(ayw_2.class);
    private final ArrayList<ayx_2> duJ = new ArrayList(0);

    public abstract E baw();

    public void activateObject(Object object) {
        try {
            ((ayx_2)object).aVI();
        }
        catch (Exception exception) {
            duI.error((Object)"Exception on checkOut : ", (Throwable)exception);
        }
    }

    public void passivateObject(Object object) {
        try {
            ((ayx_2)object).aVH();
        }
        catch (Exception exception) {
            duI.error((Object)"Exception on checkIn : ", (Throwable)exception);
            throw new RuntimeException(exception.toString());
        }
    }

    public void destroyObject(Object object) {
    }

    public boolean validateObject(Object object) {
        return true;
    }

    private int K(Object object) {
        int n = this.duJ.size();
        for (int i = 0; i < n; ++i) {
            if (this.duJ.get(i) != object) continue;
            return i;
        }
        return -1;
    }

    public /* synthetic */ Object makeObject() {
        return this.baw();
    }
}

