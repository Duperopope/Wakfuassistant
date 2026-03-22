/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aDk
 */
public abstract class adk_1 {
    private static final boolean dCW = false;
    protected static final Logger dCX = Logger.getLogger(adk_1.class);
    protected adw_2[] dCY;
    protected final TIntIntHashMap dCZ = new TIntIntHashMap();
    protected ayv_2[] dDa;
    protected ayv_2[] dDb;
    protected final Object dDc = new Object();
    protected final Object dDd = new Object();
    protected final Object dDe = new Object();
    protected final HashMap<adt_2, adu_2> dDf = new HashMap();
    protected final ArrayList<adu_2> dDg = new ArrayList();
    protected int dDh;
    protected int dDi = 5;
    protected final List<adx_2> dDj = new ArrayList<adx_2>();
    private final List<adx_2> dDk = new ArrayList<adx_2>();
    private final List<adx_2> dDl = new ArrayList<adx_2>();
    protected final boolean dDm = true;

    public adk_1(adw_2[] adw_2Array, boolean bl) {
        if (adw_2Array == null) {
            return;
        }
        this.dCY = adw_2Array;
        this.dDa = new ayv_2[this.dCY.length];
        this.dDb = new ayv_2[this.dCY.length];
        for (int i = 0; i < adw_2Array.length; ++i) {
            this.dDa[i] = new ayv_2(this.dCY[i].bYv());
            this.dDb[i] = new ayv_2(this.dCY[i].bYw());
            this.dCZ.put(this.dCY[i].aHp(), i);
        }
        this.dDh = 0;
        if (bl) {
            abg_2.bUP().a(() -> {
                try {
                    this.aPc();
                }
                catch (Exception exception) {
                    dCX.error((Object)"Exception during BaseResourceManager creation", (Throwable)exception);
                }
            }, 1000L, -1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public adu_2 xa(int n) {
        int n2 = this.dCZ.get(n);
        adt_2 adt_22 = this.xb(n2);
        adu_2 adu_22 = this.xc(n2);
        if (adt_22 == null) {
            if (adu_22 != null) {
                this.a(n2, adu_22);
                adu_22 = null;
            }
        } else if (adu_22 == null) {
            this.a(n2, adt_22);
        } else {
            adu_22.dC(true);
            adu_22.c(adt_22);
            adu_22.xe(this.dDh);
            adu_22.ma(n);
            Object object = this.dDd;
            synchronized (object) {
                this.dDf.put(adt_22, adu_22);
            }
        }
        return adu_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(adt_2 adt_22) {
        Object object = this.dDd;
        synchronized (object) {
            return this.dDf.containsKey(adt_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(adt_2 adt_22) {
        adu_2 adu_22 = this.dDf.get(adt_22);
        if (adu_22 != null && adu_22.bYo() == adt_22) {
            Object object = this.dDe;
            synchronized (object) {
                if (this.dDg.contains(adu_22)) {
                    this.dDg.remove(adu_22);
                }
            }
            object = adu_22.bYr();
            synchronized (object) {
                adu_22.xe(this.dDh);
                if (adu_22.bYq()) {
                    try {
                        adt_22.d(adu_22);
                    }
                    catch (Exception exception) {
                        dCX.error((Object)"Exception during tagResourceInUse", (Throwable)exception);
                    }
                    adu_22.dC(false);
                    this.b(adu_22);
                }
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(adu_2 adu_22) {
        Object object = this.dDe;
        synchronized (object) {
            this.dDg.add(adu_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bXZ() {
        Object object = this.dDe;
        synchronized (object) {
            Object object2 = this.dDd;
            synchronized (object2) {
                this.dDg.clear();
                this.dDg.addAll(this.dDf.values());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private adt_2 xb(int n) {
        if (this.dCZ.containsValue(n)) {
            Object object = this.dDc;
            synchronized (object) {
                try {
                    return (adt_2)this.dDa[n].borrowObject();
                }
                catch (Exception exception) {
                    dCX.error((Object)"Exception during checkResourceOut", (Throwable)exception);
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, adt_2 adt_22) {
        if (this.dCZ.containsValue(n)) {
            Object object = this.dDc;
            synchronized (object) {
                try {
                    this.dDa[n].returnObject(adt_22);
                }
                catch (Exception exception) {
                    dCX.error((Object)"Exception during checkResourceIn", (Throwable)exception);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private adu_2 xc(int n) {
        if (this.dCZ.containsValue(n)) {
            Object object = this.dDc;
            synchronized (object) {
                try {
                    return (adu_2)this.dDb[n].borrowObject();
                }
                catch (Exception exception) {
                    dCX.error((Object)"Exception during checkContextOut", (Throwable)exception);
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, adu_2 adu_22) {
        if (this.dCZ.containsValue(n)) {
            Object object = this.dDc;
            synchronized (object) {
                try {
                    this.dDb[n].returnObject(adu_22);
                }
                catch (Exception exception) {
                    dCX.error((Object)"Exception during checkContextIn", (Throwable)exception);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void aPc() {
        Object object;
        ++this.dDh;
        if (!this.dDk.isEmpty()) {
            for (adx_2 object2 : this.dDk) {
                this.dDj.remove(object2);
            }
            this.dDk.clear();
        }
        if (!this.dDl.isEmpty()) {
            for (adx_2 adx_22 : this.dDl) {
                if (this.dDj.contains(adx_22)) continue;
                this.dDj.add(adx_22);
            }
            this.dDl.clear();
        }
        Object[] objectArray = null;
        Object object2 = this.dDe;
        synchronized (object2) {
            objectArray = this.dDg.toArray();
            this.dDg.clear();
        }
        if (objectArray != null) {
            for (Object object3 : objectArray) {
                Object object4 = (adu_2)object3;
                object = ((adu_2)object4).bYr();
                synchronized (object) {
                    ((adu_2)object4).xe(-2 * this.dDi);
                    ((adu_2)object4).dD(true);
                }
            }
        }
        Object object5 = this.dDd;
        synchronized (object5) {
            for (Object object4 : this.dDf.values().toArray()) {
                object = (adu_2)object4;
                Object object6 = ((adu_2)object).bYr();
                synchronized (object6) {
                    int n = this.dDh - ((adu_2)object).bYp();
                    if (n >= this.dDi && ((adu_2)object).bYs()) {
                        if (!((adu_2)object).bYq()) {
                            this.c((adu_2)object);
                            ((adu_2)object).bYo().e((adu_2)object);
                            ((adu_2)object).dC(true);
                        }
                        if (((adu_2)object).bYt()) {
                            try {
                                int n2 = this.dCZ.get(((adu_2)object).aHp());
                                Object object7 = this.dDc;
                                synchronized (object7) {
                                    Object object8 = this.dDd;
                                    synchronized (object8) {
                                        adt_2 adt_22 = ((adu_2)object).bYo();
                                        this.dDa[n2].returnObject(adt_22);
                                        this.dDb[n2].returnObject(object);
                                        this.dDf.remove(adt_22);
                                    }
                                }
                            }
                            catch (Exception exception) {
                                dCX.error((Object)"Exception during BaseResourceManager update", (Throwable)exception);
                            }
                        }
                    }
                }
            }
        }
    }

    public int bYa() {
        return this.dDi;
    }

    public void xd(int n) {
        this.dDi = n;
    }

    public String bYb() {
        long l = 0L;
        for (adt_2 adw_2Array : this.dDf.keySet()) {
            l += adw_2Array.bYn();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName()).append(" stats\n");
        for (adw_2 adw_22 : this.dCY) {
            int n = adw_22.aHp();
            int n2 = this.dCZ.get(n);
            stringBuilder.append("\tNb objects out  = ").append(this.dDa[n2].getNumActive()).append("\n");
            stringBuilder.append("\tNb objects in   = ").append(this.dDa[n2].getNumIdle()).append("\n");
            stringBuilder.append("\tNb contexts out = ").append(this.dDb[n2].getNumActive()).append("\n");
            stringBuilder.append("\tNb contexts in  = ").append(this.dDb[n2].getNumIdle()).append("\n");
            stringBuilder.append("\tMemory usage    = ").append((float)l / 1024000.0f).append(" MByte(s)");
        }
        return stringBuilder.toString();
    }

    public int bYc() {
        return this.dDh;
    }

    protected void b(adu_2 adu_22) {
        for (adx_2 adx_22 : this.dDj) {
            adx_22.g(adu_22);
        }
    }

    protected void c(adu_2 adu_22) {
        for (adx_2 adx_22 : this.dDj) {
            adx_22.f(adu_22);
        }
    }
}

