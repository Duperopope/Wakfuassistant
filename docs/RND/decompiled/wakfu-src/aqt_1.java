/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aqt
 */
public abstract class aqt_1
implements ayx_2 {
    protected static final Logger cQE = Logger.getLogger(aqt_1.class);
    public static final ObjectPool cQF = new ayv_2(new aqu_1());
    public static final ObjectPool cQG = new ayv_2(new aqw_2());
    protected final aqq_2 cQH = new aqq_2();
    protected final aqo_2 cQI = new aqo_2();
    private ObjectPool bip;

    aqt_1() {
    }

    public abstract DataOutputStream b(OutputStream var1);

    public abstract DataInputStream b(FileInputStream var1);

    public static synchronized aqt_1 b(ObjectPool objectPool) {
        aqt_1 aqt_12 = null;
        try {
            aqt_12 = (aqt_1)objectPool.borrowObject();
            aqt_12.a(objectPool);
        }
        catch (Exception exception) {
            cQE.error((Object)"Exception during checkOut", (Throwable)exception);
        }
        return aqt_12;
    }

    public void a(ObjectPool objectPool) {
        this.bip = objectPool;
    }

    public void aZp() {
        try {
            this.bip.returnObject((Object)this);
            this.bip = null;
        }
        catch (Exception exception) {
            cQE.error((Object)"Exception during release IOStreamWrapper", (Throwable)exception);
        }
    }
}

