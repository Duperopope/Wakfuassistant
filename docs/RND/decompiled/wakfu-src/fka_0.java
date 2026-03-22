/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fka
 */
public class fka_0
implements abs_2,
Runnable {
    private static final Logger sAe = Logger.getLogger(fka_0.class);
    protected final flr_0 sAf;
    private final long sAg = ue_0.bjV().bjg();
    private long drM = ue_0.bjV().bjg();
    private int sAh;

    public fka_0(flr_0 flr_02) {
        this.sAf = flr_02;
        this.sAh = flr_02.gdd();
    }

    @Override
    public long atA() {
        return this.sAg;
    }

    @Override
    public long bVj() {
        this.run();
        long l = fkb_0.WI(this.sAh);
        int n = this.sAf.gde();
        if (l > 0L && n == -1) {
            sAe.error((Object)"Attention un cooldown de purgation tourne sur une nation vide");
        }
        return l;
    }

    protected long WH(int n) {
        return fkb_0.WI(n) - (ue_0.bjV().bjg() - this.drM);
    }

    public long bVs() {
        return this.WH(this.sAf.gdd());
    }

    public void elv() {
    }

    @Override
    public boolean bVk() {
        this.sAf.eln();
        return false;
    }

    public void elu() {
    }

    @Override
    public void hq(long l) {
    }

    @Override
    public void run() {
        int n;
        int n2 = this.sAf.gdd();
        if (n2 != (n = fkb_0.I(this.sAh, ue_0.bjV().bjg() - this.sAg))) {
            this.drM = ue_0.bjV().bjg();
        }
        this.sAf.WU(n - n2);
    }

    public void dX(int n, int n2) {
        this.sAh += n;
    }

    public void reset() {
        this.sAh = 0;
        this.drM = 0L;
    }
}

