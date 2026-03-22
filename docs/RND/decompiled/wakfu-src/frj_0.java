/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from frJ
 */
public class frj_0
extends frk_0 {
    private final int sZA;
    private final int sZB;
    private frl_0 rXq;
    private final ang_2 sZC;
    private static final Logger sZD = Logger.getLogger(frj_0.class);

    public frj_0(long l, int n, int n2, int n3, String string) {
        super(l, n);
        this.sZA = n2;
        this.sZB = n3;
        this.sZC = this.p(l, string);
    }

    public frj_0(long l, int n, int n2, int n3, int n4, fre_0 fre_02, String string) {
        super(l, n, n4, fre_02);
        this.sZA = n2;
        this.sZB = n3;
        this.sZC = this.p(l, string);
    }

    private ang_2 p(long l, String string) {
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            sZD.warn((Object)("Unable to load DragoInfo for drago id " + l));
        }
        if (ang_22 == null) {
            ang_22 = amz_2.cIw;
        }
        return ang_22;
    }

    public int clu() {
        return this.sZA;
    }

    public int clv() {
        return this.sZB;
    }

    public void c(frl_0 frl_02) {
        this.rXq = frl_02;
    }

    public boolean fTO() {
        return this.rXq != null && !BH.aU(this.rXq.aJi());
    }

    public boolean bZ(exP exP2) {
        return this.sZC == null || this.sZC.b(exP2, null, this, exP2.bdV());
    }

    public frl_0 fTP() {
        return this.rXq;
    }

    public String toString() {
        return "DragoInfo{m_exitX=" + this.sZA + ", m_exitY=" + this.sZB + ", m_loading=" + String.valueOf(this.rXq) + "}";
    }
}

