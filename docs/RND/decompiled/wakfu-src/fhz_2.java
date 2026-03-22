/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHz
 */
public class fhz_2
implements aao_2 {
    public static final int uys = 300;
    protected static final fhz_2 uyt = new fhz_2();
    private int bap;
    private int baq;
    private int uyu = 300;
    private fes_2 uyv;
    private long aXv = this.hashCode();
    private int uyw;
    private int ofK;
    private boolean uyx;

    private fhz_2() {
        abb_2.bUA().start();
    }

    public static fhz_2 gAS() {
        return uyt;
    }

    public void hc(int n, int n2) {
        this.bap = n;
        this.baq = n2;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public void dC(long l) {
        this.aXv = l;
    }

    public int gAT() {
        return this.uyu;
    }

    public void abE(int n) {
        this.uyu = n;
    }

    public void a(fes_2 fes_22, flp_2 flp_22) {
        this.uyx = true;
        abb_2.bUA().b(this);
        if (this.uyv == fes_22 && this.uyw == flp_22.fca() && this.ofK == flp_22.fcn()) {
            this.d(fes_22, flp_2.o(flp_22));
            this.c(fes_22, flp_2.o(flp_22));
            this.uyv = null;
        } else {
            this.uyv = fes_22;
            this.uyw = flp_22.fca();
            this.ofK = flp_22.fcn();
        }
    }

    public void b(fes_2 fes_22, flp_2 flp_22) {
        this.uyx = false;
        if (this.uyv == fes_22) {
            abb_2.bUA().b(this);
            abb_2.bUA().a(this, this.uyu, fes_22.hashCode(), 1L);
            this.d(fes_22, flp_2.o(flp_22));
            return;
        }
        this.gAU();
    }

    public void gAU() {
        this.uyw = 0;
        this.uyv = null;
        this.ofK = 0;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            if (!this.uyx) {
                this.gAU();
            }
            return false;
        }
        return true;
    }

    public void c(fes_2 fes_22, flp_2 flp_22) {
        flp_22.b(fzq_0.tJV);
        flp_22.aca(2);
        flp_22.oZ(true);
        fes_22.h(flp_22);
    }

    public void d(fes_2 fes_22, flp_2 flp_22) {
        flp_22.b(fzq_0.tJU);
        flp_22.aca(1);
        fes_22.h(flp_22);
    }

    public boolean t(fes_2 fes_22) {
        int n = fes_22.getDisplayX();
        int n2 = fes_22.getDisplayY();
        return fes_22.getAppearance().gE(this.bap - n, this.baq - n2);
    }
}

