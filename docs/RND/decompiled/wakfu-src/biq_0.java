/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from biQ
 */
public class biq_0
extends bil_0 {
    public static final String imG = "resMaxed";
    public static final String[] imH = new String[]{"resMaxed"};
    public static final String[] imI = new String[imH.length + imf.length];
    private final bgy imJ;
    private final exf_2 imK;
    private final boolean imL;

    public biq_0(exf_2 exf_22, bim_0 bim_02, bgy bgy2, exf_2 exf_23, boolean bl) {
        super(exf_22, bim_02);
        this.imJ = bgy2;
        this.imK = exf_23;
        this.imL = bl;
    }

    @Override
    public String[] bxk() {
        return imI;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "resMaxed": {
                return this.dqV() >= 90;
            }
        }
        return super.eu(string);
    }

    @Override
    protected Object dqG() {
        return this.j(false, false);
    }

    @Override
    protected Object dqJ() {
        return this.j(false, true);
    }

    @Override
    protected Object dqI() {
        return this.c(false, true, false);
    }

    @Override
    protected int dqv() {
        return this.Df(this.dqW());
    }

    @Override
    protected Object dqH() {
        return this.j(true, true);
    }

    private int dqV() {
        return this.Dg(this.Df(this.dqW()));
    }

    private int dqW() {
        return this.imL ? this.imJ.c((pt_0)exx_2.rGw) : this.imJ.c((pt_0)exx_2.rGB);
    }

    private int De(int n) {
        return this.img.aYD() + n;
    }

    private int Df(int n) {
        return this.img.aYB() + n;
    }

    private int Dg(int n) {
        boolean bl = this.imJ.a(exe_1.rDj);
        return (int)Math.round(100.0 - esr_0.aa(n, bl) * 100.0);
    }

    private String j(boolean bl, boolean bl2) {
        int n = this.dqW();
        int n2 = this.Df(n);
        if (!this.imL) {
            int n3 = this.Dg(n2);
            if (bl2) {
                return biO.dn(n3, n2);
            }
            return biO.a(n3, bl, true, ett_1.opC);
        }
        return biO.a(n2, bl, false, ett_1.opC);
    }

    private String c(boolean bl, boolean bl2, boolean bl3) {
        int n = this.dqW();
        int n2 = this.Df(n);
        int n3 = this.De(n);
        if (!this.imL) {
            int n4 = this.Dg(n2);
            if (bl2) {
                return biO.i(n4, n2, bl3);
            }
            return biO.a(n4, bl, true, bl3);
        }
        return biO.a(n2, bl, false, bl3);
    }

    @Override
    protected axb_2 getModulationColor() {
        if (this.imL) {
            return super.getModulationColor();
        }
        int n = this.dqW();
        int n2 = this.Df(n);
        int n3 = this.Dg(n2);
        int n4 = this.imJ.djE() + n;
        int n5 = this.Dg(n4);
        int n6 = this.imJ.djF() + n;
        int n7 = this.Dg(n6);
        if (n3 == n5 && n3 > n7) {
            return fhm_2.uwB.a(ett_1.ooe);
        }
        if (n3 == n7 && n3 < n5) {
            return fhm_2.uwB.a(ett_1.ood);
        }
        return fhm_2.uwB.a(ett_1.ooc);
    }

    static {
        System.arraycopy(imH, 0, imI, 0, imH.length);
        System.arraycopy(imf, 0, imI, imH.length, imf.length);
    }
}

