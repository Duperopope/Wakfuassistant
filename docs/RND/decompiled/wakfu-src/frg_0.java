/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from frG
 */
public class frg_0 {
    private static final Logger sZk = Logger.getLogger(frg_0.class);
    private final long sZl;
    private final int sZm;
    private final int sZn;
    private final ang_2 sZo;
    private final ang_2 sZp;
    private frl_0 rXq;

    public frg_0(long l, int n, int n2, String string, String string2) {
        this.sZl = l;
        this.sZm = n;
        this.sZn = n2;
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            sZk.error((Object)("[LD] Erreur au chargement du crit\u00e8re " + string + " du BoatLink " + l), (Throwable)exception);
        }
        this.sZo = ang_22;
        ang_2 ang_23 = null;
        try {
            ang_23 = ehu_0.rY(string2);
        }
        catch (Exception exception) {
            sZk.error((Object)("[LD] Erreur au chargement du crit\u00e8re " + string2 + " du BoatLink " + l), (Throwable)exception);
        }
        this.sZp = ang_23;
    }

    public long Sn() {
        return this.sZl;
    }

    public int gkn() {
        return this.sZm;
    }

    public int gko() {
        return this.sZn;
    }

    public ang_2 bdo() {
        return this.sZo;
    }

    public boolean a(exP exP2, RH rH) {
        return this.sZo == null || this.sZo.b(exP2, rH, this, exP2.bdV());
    }

    public boolean b(exP exP2, RH rH) {
        return this.sZp == null || this.sZp.b(exP2, rH, this, exP2.bdV());
    }

    public void c(frl_0 frl_02) {
        this.rXq = frl_02;
    }

    public boolean fTO() {
        return this.rXq != null && !BH.aU(this.rXq.aJi());
    }

    public frl_0 fTP() {
        return this.rXq;
    }
}

