/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class acV {
    private static final Logger chU = Logger.getLogger(acV.class);
    protected aaj_0 bRH;
    private int chV;
    private int chW;
    private int chX = 0;
    asp_2 chY;

    protected acV() {
        this.btX();
    }

    public final void br(int n, int n2) {
        this.chV = n;
        this.chW = n2;
    }

    public final void btX() {
        this.br(1000, 1000);
    }

    public void rJ(int n) {
        this.chX = n;
    }

    private void btY() {
        WL wL = this.btZ();
        this.bRH = wL.bmC();
    }

    protected abstract WL btZ();

    protected abstract void bua();

    protected abstract void bub();

    public final void cd(boolean bl) {
        if (bl) {
            this.a(this.buc(), this.chX);
        }
        this.btY();
        this.a(this.chV, this.chW, this.bRH);
    }

    private asi_2 buc() {
        return new acW(this);
    }

    private void a(asi_2 asi_22, int n) {
        asj_2 asj_22 = asj_2.bJt();
        asj_22.a(asi_22);
        if (n > 0) {
            long l = System.currentTimeMillis();
            asj_22.a(new acX(this, l, n, asj_22));
        }
    }

    public final void e(Runnable runnable) {
        this.btY();
        asj_2.bJt().f(runnable);
        asj_2.bJt().bJy();
        this.a(this.chV, this.bRH);
    }

    public void a(int n, aaj_0 aaj_02) {
        if (this.chY != null) {
            chU.warn((Object)"on \u00e9tait d\u00e9j\u00e0 en attente d'un monde, on clean les conditions");
            asj_2.bJt().b(this.chY);
        }
        this.chY = new acY(this, aaj_02, n);
        asj_2.bJt().a(this.chY);
    }

    private void a(int n, int n2, aaj_0 aaj_02) {
        asj_2 asj_22 = asj_2.bJt();
        axm_1 axm_12 = this.btZ().bmE();
        axm_12.a(aaj_02);
        axm_12.a(aaj_02);
        aaj_0 aaj_03 = aaj_02.brc();
        asj_22.a(n, aaj_03);
        aaj_02.brb();
        asj_22.uk(n2);
        this.a(n, aaj_02);
        asj_22.a(new acZ(this, asj_22, aaj_03, axm_12, aaj_02));
    }

    public void reset() {
        asj_2.bJt().bJy();
        this.chY = null;
    }
}

