/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aDs
 */
public abstract class ads_2
implements adq_2,
Runnable {
    protected static final Logger dDx = Logger.getLogger(ads_2.class);
    protected final boolean dDy = false;
    private boolean btq = false;
    private boolean dDz = true;
    private final Object dDA = new Object();
    private final ArrayList<adr_2> dDB = new ArrayList();

    public final void bYj() {
        if (!this.btq) {
            dDx.info((Object)"Loader non initialis\u00e9");
        } else {
            dDx.info((Object)"Loader d\u00e9j\u00e0 d\u00e9marrer");
        }
    }

    public final void bYk() {
        this.btq = false;
        this.clear();
    }

    @Override
    public final void run() {
        dDx.info((Object)"Loader non initialis\u00e9");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void bYl() {
        if (this.dDz) {
            this.dDz = false;
            Object object = this.dDA;
            synchronized (object) {
                this.dDA.notify();
            }
        }
    }

    protected abstract void bYm();

    protected abstract void clear();

    @Override
    public void a(adr_2 adr_22) {
        this.dDB.add(adr_22);
    }

    @Override
    public void hd(String string) {
        for (adr_2 adr_22 : this.dDB) {
            adr_22.hh(string);
        }
    }

    @Override
    public void D(String string, String string2) {
        for (adr_2 adr_22 : this.dDB) {
            adr_22.E(string, string2);
        }
    }

    @Override
    public void he(String string) {
        for (adr_2 adr_22 : this.dDB) {
            adr_22.hg(string);
        }
    }

    @Override
    public void b(adr_2 adr_22) {
        this.dDB.remove(adr_22);
    }
}

