/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from fIV
 */
public class fiv_2
implements Runnable {
    private static final Logger uCY = Logger.getLogger(fiv_2.class);
    private final HashMap<String, fix_1> uCZ = new HashMap();
    private final Object uDa = new Object();
    private boolean uDb = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void B(String string, int n) {
        fix_1 fix_12 = this.uCZ.get(string);
        if (fix_12 != null) {
            return;
        }
        if (n < 1) {
            n = 1;
        }
        try {
            fix_12 = new fix_1(string, n);
            Object object = this.uCZ;
            synchronized (object) {
                this.uCZ.put(string, fix_12);
            }
            object = this.uDa;
            synchronized (object) {
                this.uDa.notify();
            }
            this.uDb = true;
        }
        catch (Exception exception) {
            uCY.error((Object)("Resource invalide : " + string));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void vP(String string) {
        fix_1 fix_12 = null;
        HashMap<String, fix_1> hashMap = this.uCZ;
        synchronized (hashMap) {
            fix_12 = this.uCZ.remove(string);
        }
        if (fix_12 != null) {
            fix_12.clean();
        }
    }

    public void gCA() {
        for (fix_1 fix_12 : this.uCZ.values()) {
            fix_12.clean();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fhv_1 uH(String string) {
        fix_1 fix_12;
        Object object = this.uCZ;
        synchronized (object) {
            fix_12 = this.uCZ.get(string);
        }
        if (fix_12 != null) {
            object = this.uDa;
            synchronized (object) {
                this.uDa.notify();
            }
            this.uDb = true;
            return fix_12.gCB();
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (true) {
            HashMap<String, fix_1> hashMap;
            try {
                hashMap = this.uDa;
                synchronized (hashMap) {
                    if (!this.uDb) {
                        this.uDa.wait();
                    }
                }
            }
            catch (InterruptedException interruptedException) {
                uCY.warn((Object)"Interrupted Exception");
            }
            hashMap = this.uCZ;
            synchronized (hashMap) {
                for (fix_1 fix_12 : this.uCZ.values()) {
                    if (!fix_12.gCD()) continue;
                    fix_12.gCE();
                }
            }
            this.uDb = false;
        }
    }
}

