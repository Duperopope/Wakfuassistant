/*
 * Decompiled with CFR 0.152.
 */
public abstract class fnv
extends fnn {
    public static final int sJg = 3;
    public static final int sJh = -3;
    public static final int sJi = 2;
    public static final abi_1 sJj = abi_1.dzk;
    public static final long sJk = 9L;
    private static final int sJl = 100;
    private static final int sJm = 100;
    private final fnE sJn = new fnE();
    private boolean mkM;
    private int sJo;
    private boolean mbq;

    public fnv(long l, long l2, String string, long l3, fnq fnq2, fnI fnI2, fno fno2) {
        super(l, l2, string, l3, fnq2, fnI2, fno2);
        this.Xo(408);
    }

    public fgj_0 cWp() {
        return fit_0.srO.tG(this.bxw);
    }

    public fnE gew() {
        return this.sJn;
    }

    public int gex() {
        return this.sJo;
    }

    public void Xo(int n) {
        this.sJo = n <= 0 ? 408 : n;
        this.dyt();
    }

    public boolean gey() {
        return this.mbq;
    }

    public void nE(boolean bl) {
        this.mbq = bl;
    }

    @Override
    public boolean c(tl_1 tl_12) {
        super.c(tl_12);
        tl_12.abf = this.sJo;
        tl_12.abi = this.gey();
        tl_12.abu.clear();
        tl_12.abu.abX = this.mkM;
        try {
            this.sJn.c(tl_12.abu);
        }
        catch (Exception exception) {
            sIF.error((Object)("Erreur \u00e0 la serialisation des permissions / pourboires" + String.valueOf(this)), (Throwable)exception);
        }
        return true;
    }

    @Override
    public boolean a(tg_1 tg_12, boolean bl) {
        if (!super.a(tg_12, bl)) {
            return false;
        }
        tg_12.abg = bl ? new tk_2() : null;
        tg_12.abf = this.sJo;
        tg_12.abi = this.gey();
        tg_12.abh.clear();
        tg_12.abh.abX = this.mkM;
        this.sJn.c(tg_12.abh);
        return true;
    }

    @Override
    public boolean b(tg_1 tg_12) {
        if (!super.b(tg_12)) {
            return false;
        }
        this.Xo(tg_12.abf);
        this.nE(tg_12.abi);
        this.mkM = tg_12.abh.abX;
        return this.b(tg_12.abh);
    }

    public boolean a(exP exP2, fnB fnB2) {
        if (fnB2 == null) {
            return false;
        }
        if (exP2.Sn() == this.aDh) {
            return true;
        }
        fnE fnE2 = this.gew();
        fnD fnD2 = fnE2.us(exP2.Sn());
        if (fnD2 != null) {
            return fnD2.b(fnB2);
        }
        long l = exP2.Ya();
        fnC fnC2 = fnE2.b(fnG.sKm);
        if (l != 0L && l == this.Ya() && fnC2 != null) {
            return fnC2.b(fnB2);
        }
        fnC fnC3 = fnE2.b(fnG.sKl);
        return fnC3 != null && fnC3.b(fnB2);
    }

    @Override
    public boolean d(tl_1 tl_12) {
        this.Xo(tl_12.abf);
        this.nE(tl_12.abi);
        super.d(tl_12);
        this.mkM = tl_12.abu.abX;
        try {
            this.b(tl_12.abu);
        }
        catch (Exception exception) {
            sIF.error((Object)("Exception \u00e0 la d\u00e9-serialisation des permissions du Havre-sac du joueur " + this.aDh), (Throwable)exception);
        }
        return true;
    }

    public boolean b(tw_1 tw_12) {
        this.sJn.d(tw_12);
        return true;
    }

    public boolean ab(short s, short s2) {
        return s < 0;
    }

    public boolean ac(short s, short s2) {
        return s2 < 0;
    }

    public boolean ad(short s, short s2) {
        return s > 100 && s2 > 100;
    }

    protected boolean ae(short s, short s2) {
        boolean bl = false;
        fnz fnz2 = (fnz)this.sIJ.gd(s, s2);
        if (fnz2 != null) {
            short s3 = fnz2.gel();
            short s4 = fnz2.gem();
            bl = s >= s3 && s < s3 + 6 && s2 >= s4 && s2 < s4 + 6 && fnz2.nF(true) != null;
        }
        return bl;
    }

    @Override
    public void b(wy_0 wy_02) {
        ww_0 ww_02 = wy_02.bmp();
        if (ww_02 == null) {
            sIF.error((Object)"Topology null !!! (ne devrait pas arriver)");
            return;
        }
        for (int i = 0; i < 18; ++i) {
            for (int j = 0; j < 18; ++j) {
                wy_02.b(j, i, !this.ae((short)j, (short)i));
            }
        }
        for (fnp fnp2 : this.sIJ) {
            for (fnH fnH2 : fnp2.gen()) {
                if (!ww_02.aK(fnH2.bcC(), fnH2.bcD())) {
                    sIF.error((Object)("\u00c9l\u00e9ment dans le sac dimensionnel plac\u00e9 au mauvais endroit " + String.valueOf(fnH2) + " (" + fnH2.bcC() + ";" + fnH2.bcD() + ") de type=" + String.valueOf((Object)fnH2.dOh())));
                    continue;
                }
                wy_02.a(fnH2.bcC(), fnH2.bcD(), fnH2.bcE(), fnH2.beq());
            }
        }
    }

    public fnA a(byte by, ffV ffV2, boolean bl) {
        fnp fnp2 = this.sIJ.gZ(by);
        if (fnp2 instanceof fnz) {
            fnA fnA2 = ((fnz)fnp2).m(ffV2, bl);
            return fnA2;
        }
        return null;
    }

    public fnA c(byte by, boolean bl, boolean bl2) {
        fnp fnp2 = this.sIJ.gZ(by);
        if (fnp2 instanceof fnz) {
            return ((fnz)fnp2).w(bl, bl2);
        }
        return null;
    }

    public ffV g(byte by, boolean bl) {
        fnp fnp2 = this.sIJ.gZ(by);
        if (fnp2 instanceof fnz) {
            return ((fnz)fnp2).nF(bl);
        }
        return null;
    }

    public fnA b(byte by, ffV ffV2, boolean bl) {
        fnp fnp2 = this.sIJ.gZ(by);
        if (!fnz.dg(ffV2)) {
            return fnA.sJH;
        }
        if (!(fnp2 instanceof fnz)) {
            return fnA.sJO;
        }
        fnz fnz2 = (fnz)fnp2;
        if (fnz2.nF(true) == null) {
            return fnA.sJI;
        }
        if (fnz2.nF(false) != null) {
            return fnA.sJJ;
        }
        if (fnz2.nF(true).avr() == ffV2.avr()) {
            return fnA.sJP;
        }
        return fnz2.a(true, ffV2, bl);
    }

    public fnA b(byte by, boolean bl, byte by2, boolean bl2, boolean bl3) {
        if (by == by2) {
            return fnA.sJO;
        }
        fnp fnp2 = this.sIJ.gZ(by);
        fnp fnp3 = this.sIJ.gZ(by2);
        if (!(fnp2 instanceof fnz) || !(fnp3 instanceof fnz)) {
            return fnA.sJO;
        }
        fnz fnz2 = (fnz)fnp2;
        fnz fnz3 = (fnz)fnp3;
        ffV ffV2 = fnz2.nF(bl);
        if (ffV2 == null) {
            return fnA.sJO;
        }
        ffV ffV3 = fnz3.nF(bl2);
        if (ffV3 == null) {
            fnA fnA2 = fnz2.w(bl, false);
            if (fnA2 != fnA.sJF) {
                return fnA2;
            }
            fnA fnA3 = fnz3.m(ffV2, false);
            if (fnA3 != fnA.sJF) {
                return fnA3;
            }
            if (bl3) {
                fnz2.w(bl, true);
                fnz3.m(ffV2, true);
            }
            return fnA.sJF;
        }
        fnA fnA4 = fnz2.a(bl, ffV3, false);
        if (fnA4 != fnA.sJF) {
            return fnA4;
        }
        fnA fnA5 = fnz3.a(bl2, ffV2, false);
        if (fnA5 != fnA.sJF) {
            return fnA5;
        }
        if (bl3) {
            fnz2.a(bl, ffV3, true);
            fnz3.a(bl2, ffV2, true);
        }
        return fnA.sJF;
    }

    protected VL gg(int n, int n2) {
        short[] sArray = new short[324];
        short s = (short)(n * 18);
        short s2 = (short)(n2 * 18);
        for (fnp fnp2 : this.sIJ) {
            fnz fnz2 = (fnz)fnp2;
            ffV ffV2 = fnz2.nF(true);
            int n3 = ffV2 != null && fnB.Xq(ffV2.avr()) == fnB.sJW ? 28 : 0;
            int n4 = fnp2.gel();
            int n5 = fnp2.gem();
            int n6 = n4 + 6;
            for (int i = n4; i < n6; ++i) {
                int n7 = n5 + 6;
                for (int j = n5; j < n7; ++j) {
                    sArray[i - s + (j - s2) * 18] = n3;
                }
            }
        }
        try {
            VL vL = ewt_0.ffg().k(sArray);
            return vL;
        }
        catch (VM vM) {
            sIF.error((Object)"Exception pendant l'update des types de sol du havre-sac ", (Throwable)vM);
            return null;
        }
    }

    public boolean bfb() {
        return this.mkM;
    }

    public void bl(boolean bl) {
        this.mkM = bl;
    }

    protected abstract void dyt();
}

