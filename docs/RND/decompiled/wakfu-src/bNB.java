/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bNB
implements aao_2 {
    private static final Logger kDR = Logger.getLogger(bNB.class);
    public static final bNB kDS = new bNB();
    private final ArrayList<bNC> kDT = new ArrayList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bNC bNC2) {
        ArrayList<bNC> arrayList = this.kDT;
        synchronized (arrayList) {
            if (!this.kDT.contains(bNC2)) {
                this.kDT.add(bNC2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(bNC bNC2) {
        ArrayList<bNC> arrayList = this.kDT;
        synchronized (arrayList) {
            this.kDT.remove(bNC2);
        }
    }

    public void start() {
        abb_2.bUA().a(this, 1000L, -1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bhk() {
        abb_2.bUA().b(this);
        ArrayList<bNC> arrayList = this.kDT;
        synchronized (arrayList) {
            this.kDT.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            ArrayList<bNC> arrayList = this.kDT;
            synchronized (arrayList) {
                int n = this.kDT.size();
                for (int i = 0; i < n; ++i) {
                    try {
                        this.kDT.get(i).daZ();
                        continue;
                    }
                    catch (Throwable throwable) {
                        kDR.warn((Object)"Erreur durant un TimeTick", throwable);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "TimeManager{m_listeners=" + String.valueOf(this.kDT) + "}";
    }
}

