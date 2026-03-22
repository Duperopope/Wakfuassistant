/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class frI
implements SH {
    private static final Logger sZt = Logger.getLogger(frI.class);
    private final int sZu;
    private final ang_2 sZv;
    private final short sZw;
    private final int sZx;
    private final int sZy;
    private final int sZz;
    private frl_0 rXq = null;

    public frI(int n, short s, String string, int n2, int n3, int n4) {
        this.sZu = n;
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            sZt.error((Object)("Impossible de compiler le crit\u00e8re " + string + " sur le cannonlink " + n), (Throwable)exception);
        }
        this.sZv = ang_22;
        this.sZw = s;
        this.sZx = n2;
        this.sZy = n3;
        this.sZz = n4;
    }

    public int clu() {
        return this.sZx;
    }

    public int clv() {
        return this.sZy;
    }

    public int clw() {
        return this.sZz;
    }

    @Override
    public int d() {
        return this.sZu;
    }

    @Override
    public ang_2 bdo() {
        return this.sZv;
    }

    @Override
    public short bdn() {
        return this.sZw;
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

