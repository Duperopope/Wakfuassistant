/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from SP
 */
public class sp_0 {
    protected static final Logger bpL = Logger.getLogger(sp_0.class);
    private int bpM;
    private int bpN;
    private short bpO;
    private abi_1 bmk;

    public void a(int n, int n2, short s, abi_1 abi_12) {
        this.bpM = n;
        this.bpN = n2;
        this.bpO = s;
        this.bmk = abi_12;
    }

    public so_0 k(acd_1 acd_12) {
        if (acd_12 == null) {
            bpL.error((Object)"Cannot compute part in sight from null position", new Throwable());
            return null;
        }
        return this.o(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public so_0 o(int n, int n2, short s) {
        if (this.bmk == null) {
            bpL.error((Object)"direction ou position null : update partLocalisator first");
            return null;
        }
        if (this.bpM == n && this.bpN == n2 && this.bpO == s) {
            return so_0.bpI;
        }
        acp_1 acp_12 = new acp_1(this.bmk.dzz, this.bmk.dzA, 0.0f);
        acp_1 acp_13 = new acp_1(this.bpM - n, this.bpN - n2, 0.0f);
        double d2 = (acp_13 = acp_13.bWZ()).m(acp_12);
        if (d2 <= -0.7) {
            return so_0.bpI;
        }
        if (d2 >= 0.72) {
            return so_0.bpF;
        }
        return so_0.bpH;
    }

    public void reset() {
        this.bpM = 0;
        this.bpN = 0;
        this.bpO = 0;
        this.bmk = null;
    }
}

