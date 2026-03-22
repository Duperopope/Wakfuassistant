/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Vu
 */
public class vu_0
implements aaq_2<vt_0> {
    private final Logger bIg = Logger.getLogger(vu_0.class);

    @Override
    public boolean a(vt_0 vt_02) {
        Runnable runnable = vt_02.bkp();
        if (runnable == null) {
            this.bIg.error((Object)("Missing runnable inside " + String.valueOf(vt_0.class)));
            return false;
        }
        try {
            runnable.run();
        }
        catch (Exception exception) {
            this.bIg.error((Object)("Following exception occured with following runnable " + String.valueOf(runnable.getClass()) + " inside " + String.valueOf(vt_0.class)), (Throwable)exception);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 323;
    }
}

