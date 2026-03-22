/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fzv
extends fzu {
    public static final String TAG = "margin";
    private static final Logger tFY = Logger.getLogger(fzv.class);
    private static final ObjectPool tFZ = new ayv_2(new fzw(), 1000);

    @Override
    public String getTag() {
        return TAG;
    }

    public static fzv checkOut() {
        fzv fzv2;
        try {
            fzv2 = (fzv)tFZ.borrowObject();
            fzv2.uth = tFZ;
        }
        catch (Exception exception) {
            tFY.error((Object)"Probl\u00e8me au borrowObject.");
            fzv2 = new fzv();
            fzv2.aVI();
        }
        return fzv2;
    }
}

