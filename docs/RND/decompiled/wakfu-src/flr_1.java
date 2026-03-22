/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fLR
 */
public class flr_1
extends fiq_1 {
    private static final Logger uJl = Logger.getLogger(flr_1.class);
    private static final ObjectPool uJm = new ayv_2(new fls_2());

    public static flr_1 gEr() {
        flr_1 flr_12;
        try {
            flr_12 = (flr_1)uJm.borrowObject();
            flr_12.uth = uJm;
        }
        catch (Exception exception) {
            uJl.error((Object)"Probl\u00e8me au borrowObject.");
            flr_12 = new flr_1();
            flr_12.aVI();
        }
        return flr_12;
    }
}

