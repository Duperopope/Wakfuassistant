/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from flv
 */
public abstract class flv_0<E extends flx_0> {
    protected static final Logger sEv = Logger.getLogger(flv_0.class);
    private final long sEw;
    private final int sEx;
    private final int sEy;
    private final boolean sEz;
    private final int sEA;
    private int epr;

    protected flv_0(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        this.sEw = l;
        this.sEx = n;
        this.sEy = n2;
        this.sEz = bl;
        this.sEA = flw.aO(iterable);
    }

    public long Sn() {
        return this.sEw;
    }

    public int csT() {
        return this.sEx;
    }

    public int csV() {
        return this.sEy;
    }

    public boolean bfb() {
        return this.sEz;
    }

    public void WY(int n) {
        this.epr = n;
    }

    public int csU() {
        return this.epr;
    }

    public boolean csX() {
        return this.a(flw.sEB);
    }

    public boolean csY() {
        return this.a(flw.sEC);
    }

    public boolean csZ() {
        return this.a(flw.sED);
    }

    private boolean a(flw flw2) {
        return (this.sEA & flw2.sEE) == flw2.sEE;
    }

    public abstract void bk(List<amx_1> var1);

    public abstract flA gdh();

    public abstract boolean a(E var1);

    public static List<flv_0> bl(List<flv_0> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            flv_0 flv_02 = list.get(i);
            if (flv_02.csT() >= 0) continue;
            list.remove(flv_02);
        }
        return list;
    }

    public static List<flv_0> bm(List<flv_0> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            flv_0 flv_02 = list.get(i);
            if (flv_02.csT() <= 0) continue;
            list.remove(flv_02);
        }
        return list;
    }
}

