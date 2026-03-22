/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ayE
 */
public class aye_2
implements aao_2 {
    private static final Logger dts = Logger.getLogger(aye_2.class);
    private final ArrayList<adi_1> dtt = new ArrayList();
    private final List<adi_1> dtu = new ArrayList<adi_1>();
    private final List<adi_1> dtv = new ArrayList<adi_1>();
    private final List<adi_1> dtw = new ArrayList<adi_1>();
    private final List<adi_1> dtx = new ArrayList<adi_1>();
    private boolean dty = false;
    private long aXv = 0L;

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public void dC(long l) {
        this.aXv = l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(aam_2 aam_22) {
        boolean bl = true;
        this.bSi();
        ArrayList<adi_1> arrayList = this.dtt;
        synchronized (arrayList) {
            this.dty = true;
            int n = this.dtt.size();
            if (n > 0) {
                for (int i = 0; i < n; ++i) {
                    adi_1 adi_12 = this.dtt.get(i);
                    if (adi_12 == null) continue;
                    try {
                        bl = adi_12.b(aam_22);
                    }
                    catch (RuntimeException runtimeException) {
                        dts.error((Object)("Exception lev\u00e9e lors du traitement d'un message (id : " + aam_22.d() + ") : " + String.valueOf(aam_22)), (Throwable)runtimeException);
                    }
                    if (bl) {
                        continue;
                    }
                    break;
                }
            } else {
                dts.warn((Object)("L'entit\u00e9 destinataire du message n'a pas de frames, message : " + aam_22.getClass().getSimpleName()));
                bl = true;
            }
            this.dty = false;
        }
        if (bl) {
            this.c(aam_22);
        }
        this.bSj();
        return false;
    }

    protected void c(@NotNull aam_2 aam_22) {
        dts.warn((Object)String.format("[NETWORK] Unhandled Message (%s) , id %d, Handler=%s (id=%s)", aam_22.getClass().getSimpleName(), aam_22.d(), this.getClass().getSimpleName(), this.Sn()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bSi() {
        ArrayList<adi_1> arrayList = this.dtt;
        synchronized (arrayList) {
            adi_1 adi_12;
            int n;
            int n2;
            List<adi_1> list = this.dtv;
            synchronized (list) {
                n2 = this.dtv.size();
                for (n = 0; n < n2; ++n) {
                    adi_12 = this.dtv.get(n);
                    if (this.dtt.contains(adi_12)) continue;
                    this.dtt.add(0, adi_12);
                    adi_12.a(this, false);
                }
                this.dtv.clear();
            }
            list = this.dtu;
            synchronized (list) {
                n2 = this.dtu.size();
                for (n = 0; n < n2; ++n) {
                    adi_12 = this.dtu.get(n);
                    if (!this.dtt.remove(adi_12)) continue;
                    adi_12.b(this, false);
                }
                this.dtu.clear();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bSj() {
        ArrayList<adi_1> arrayList = this.dtt;
        synchronized (arrayList) {
            adi_1 adi_12;
            int n;
            int n2;
            List<adi_1> list = this.dtx;
            synchronized (list) {
                n2 = this.dtx.size();
                for (n = 0; n < n2; ++n) {
                    adi_12 = this.dtx.get(n);
                    if (this.dtt.contains(adi_12)) continue;
                    this.dtt.add(0, adi_12);
                    adi_12.a(this, false);
                }
                this.dtx.clear();
            }
            list = this.dtw;
            synchronized (list) {
                n2 = this.dtw.size();
                for (n = 0; n < n2; ++n) {
                    adi_12 = this.dtw.get(n);
                    if (!this.dtt.remove(adi_12)) continue;
                    adi_12.b(this, false);
                }
                this.dtw.clear();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(adi_1 adi_12) {
        if (this.dty) {
            boolean bl;
            List<adi_1> list = this.dtw;
            synchronized (list) {
                bl = this.dtw.contains(adi_12);
            }
            if (bl) {
                list = this.dtv;
                synchronized (list) {
                    if (!this.dtv.contains(adi_12)) {
                        this.dtv.add(adi_12);
                    }
                    adi_12.a(this, true);
                }
                list = this.dtu;
                synchronized (list) {
                    this.dtu.remove(adi_12);
                }
            }
            list = this.dtx;
            synchronized (list) {
                this.dtx.add(adi_12);
                adi_12.a(this, true);
            }
        }
        ArrayList<adi_1> arrayList = this.dtt;
        synchronized (arrayList) {
            if (!this.dtt.contains(adi_12)) {
                this.dtt.add(0, adi_12);
                adi_12.a(this, false);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(adi_1 adi_12) {
        if (this.dty) {
            boolean bl;
            List<adi_1> list = this.dtx;
            synchronized (list) {
                bl = this.dtx.contains(adi_12);
            }
            if (bl) {
                list = this.dtu;
                synchronized (list) {
                    if (!this.dtu.contains(adi_12)) {
                        this.dtu.add(adi_12);
                    }
                }
                list = this.dtv;
                synchronized (list) {
                    if (this.dtv.remove(adi_12)) {
                        adi_12.b(this, false);
                    }
                }
            }
            list = this.dtw;
            synchronized (list) {
                if (!this.dtw.contains(adi_12)) {
                    this.dtw.add(adi_12);
                    adi_12.b(this, true);
                }
            }
        }
        ArrayList<adi_1> arrayList = this.dtt;
        synchronized (arrayList) {
            if (this.dtt.remove(adi_12)) {
                adi_12.b(this, false);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bSk() {
        Object[] objectArray;
        Object[] objectArray2 = this.dtt;
        synchronized (objectArray2) {
            objectArray = this.dtt.toArray();
        }
        if (this.dty) {
            objectArray2 = this.dtw;
            synchronized (objectArray2) {
                for (Object object : objectArray) {
                    adi_1 adi_12 = (adi_1)object;
                    if (this.dtw.contains(adi_12)) continue;
                    this.dtw.add(adi_12);
                    adi_12.b(this, true);
                }
            }
        }
        objectArray2 = this.dtt;
        synchronized (objectArray2) {
            this.dtt.clear();
        }
        for (Object object : objectArray) {
            adi_1 adi_13 = (adi_1)object;
            adi_13.b(this, false);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(adi_1 adi_12) {
        List<adi_1> list;
        boolean bl;
        if (this.dty) {
            bl = this.dtt.contains(adi_12);
        } else {
            list = this.dtt;
            synchronized (list) {
                bl = this.dtt.contains(adi_12);
            }
        }
        if (!bl) {
            list = this.dtv;
            synchronized (list) {
                bl = this.dtv.contains(adi_12);
            }
        }
        if (!bl) {
            list = this.dtx;
            synchronized (list) {
                bl = this.dtx.contains(adi_12);
            }
        }
        return bl;
    }

    public void dx(boolean bl) {
        this.dty = bl;
    }

    public List<adi_1> bSl() {
        return Collections.unmodifiableList(this.dtt);
    }
}

