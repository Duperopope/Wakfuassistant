/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from frN
 */
public class frn_0
extends frk_0 {
    private static final Logger sZP = Logger.getLogger(frn_0.class);
    private final ang_2 sZQ;
    private final int sZR;
    private final int sZS;
    private final int sZT;
    private frl_0 rXq;
    private int cxt;
    private int sZU;

    public frn_0(long l, int n, int n2, int n3, int n4, String string) {
        super(l, n);
        this.sZR = n2;
        this.sZS = n3;
        this.sZT = n4;
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            sZP.error((Object)("Impossible de compiler le crit\u00e8re " + string + " sur le zaap " + l), (Throwable)exception);
        }
        this.sZQ = ang_22;
    }

    public frn_0(long l, int n, int n2, int n3, int n4, String string, int n5, fre_0 fre_02, int n6, int n7) {
        super(l, n, n5, fre_02);
        this.sZR = n2;
        this.sZS = n3;
        this.sZT = n4;
        this.cxt = n6;
        this.sZU = n7;
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            sZP.error((Object)("Impossible de compiler le crit\u00e8re " + string + " sur le zaap " + l), (Throwable)exception);
        }
        this.sZQ = ang_22;
    }

    public int clu() {
        return this.sZR;
    }

    public int clv() {
        return this.sZS;
    }

    public int clw() {
        return this.sZT;
    }

    public boolean bZ(exP exP2) {
        return this.sZQ == null || this.sZQ.b(exP2, null, this, exP2.bdV());
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

    public int wp() {
        return this.cxt;
    }

    public int gks() {
        return this.sZU;
    }

    public String toString() {
        return "ZaapInfo{m_id=" + this.sZE + ", m_exitX=" + this.sZR + ", m_exitY=" + this.sZS + ", m_exitWorldId=" + this.sZT + "}";
    }
}

