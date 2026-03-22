/*
 * Decompiled with CFR 0.152.
 */
public class aVH
extends agb_1
implements ayz_2 {
    private bsS efA;
    private boolean htp;
    private int htq;
    private static final ayv_2 htr = new ayv_2(new avi_0());

    public static aVH b(int n, int n2, int n3, bsS bsS2) {
        try {
            aVH aVH2 = (aVH)htr.borrowObject();
            aVH2.xO(n);
            aVH2.xP(n2);
            aVH2.xQ(n3);
            aVH2.l(bsS2);
            return aVH2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            htr.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.efA = null;
        this.htp = false;
        this.htq = 0;
    }

    aVH() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        this.n(this.efA);
        try {
            if (this.htp) {
                ((bsj_0)this.efA).dGQ().Aa(this.htq);
            }
            ((bsj_0)this.efA).fJE();
        }
        catch (Exception exception) {
            dJP.error((Object)"Error : ", (Throwable)exception);
        }
        fse_1.gFu().f("isInFightCreationOrPlacement", false);
        return 0L;
    }

    public void n(bsS bsS2) {
        for (bgy bgy2 : bsS2.dGs()) {
            bgy2.ddI().ddj();
        }
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public bsS cja() {
        return this.efA;
    }

    public void l(bsS bsS2) {
        this.efA = bsS2;
    }

    public void fb(boolean bl) {
        this.htp = bl;
    }

    public void Aa(int n) {
        this.htq = n;
    }
}

