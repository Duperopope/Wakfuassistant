/*
 * Decompiled with CFR 0.152.
 */
public class eOu
extends eON
implements esn_0 {
    private static final int rbm = 0;
    private static final int rbn = 1;
    private static final int rbo = 2;
    private static final int rbp = 3;
    private static final aox_1 rbq = new enz_0(new eny_0("Valeur", new enx_0("Valeur", eNA.qYC)), new eny_0("Valeur + config", new enx_0("Valeur", eNA.qYC), new enx_0("0 = NONE / 1 = ARMOR_GIVEN / 2 = ARMOR_RECEIVED / 3 = ARMOR_GIVEN + ARMOR_RECEIVED (d\u00e9faut)", eNA.qYD)), new eny_0("Valeur + config + \u00e9l\u00e9ment", new enx_0("Valeur", eNA.qYC), new enx_0("0 = NONE / 1 = ARMOR_GIVEN / 2 = ARMOR_RECEIVED / 3 = ARMOR_GIVEN + ARMOR_RECEIVED (d\u00e9faut)", eNA.qYD), new enx_0("Element (0 pour ignorer)", eNA.qYD)));
    private int rbr = 0;

    public eOu() {
        super(exx_2.rHu);
    }

    @Override
    public aox_1 bEt() {
        return rbq;
    }

    public eOu fCC() {
        eOu eOu2 = new eOu();
        eOu2.rcf = this.rcf;
        eOu2.rbr = 0;
        eOu2.bby();
        return eOu2;
    }

    @Override
    public void E(QD qD) {
        this.aQL = 0;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        int n = this.fCD();
        if (!eOu.RY(n)) {
            bgA.error((Object)("Invalid armor parameter " + n + " in effect id=" + this.aZH()));
            return;
        }
        this.aQL = GC.B((float)this.aQL * this.RZ(n));
        if (((enk_0)this.bgC).fAn() > 2) {
            int n2 = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu);
            eNd eNd2 = eNd.ff((byte)n2);
            if (eNd2 == null) {
                bgA.error((Object)("Invalid element parameter " + n2 + " in effect id=" + this.aZH()));
                return;
            }
            if (eNd2.fAX()) {
                this.aQL = GC.B((float)this.aQL * this.l(eNd2));
            }
        }
        this.aQL = GC.B((float)this.aQL * this.Sa(n));
    }

    private static boolean RY(int n) {
        return n >= 0 && n <= 3;
    }

    private int fCD() {
        if (((enk_0)this.bgC).fAn() < 2) {
            return 3;
        }
        return ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
    }

    private float l(eNd eNd2) {
        int n = 0;
        exx_2 exx_22 = eNd2.fAU();
        if (this.bgE.a(exx_22)) {
            n += this.bgE.c(exx_22);
        }
        if (this.bgE.a(exx_2.rGw)) {
            n += this.bgE.c(exx_2.rGw);
        }
        if (this.bgC != null && ((enk_0)this.bgC).df(1L)) {
            if (this.bgE.a(exx_2.rGR)) {
                n += this.bgE.c(exx_2.rGR);
            }
        } else if (this.bgE.a(exx_2.rHy)) {
            n += this.bgE.c(exx_2.rHy);
        }
        if (this.a(eNi.qWJ) && this.bgE.a(exx_2.rHB)) {
            n += this.bgE.c(exx_2.rHB);
        }
        if (this.a(eNi.qWs) && this.bgE.a(exx_2.rHC)) {
            n += this.bgE.c(exx_2.rHC);
        }
        if (eqb_0.b(this.bgE, this.bgF, (enk_0)this.bgC) && this.bgE.a(exx_2.rHz)) {
            n += this.bgE.c(exx_2.rHz);
        }
        if (eqb_0.a(this.bgE, this.bgF, (enk_0)this.bgC) && this.bgE.a(exx_2.rHA)) {
            n += this.bgE.c(exx_2.rHA);
        }
        if (this.bgE.a(exx_2.rHD)) {
            int n2 = eqb_0.b(this.bgE, true);
            int n3 = eqb_0.a(this.bgE, true);
            float f2 = (float)n3 / (float)n2 * 100.0f;
            if (f2 < 50.0f) {
                n += this.bgE.c(exx_2.rHD);
            }
        }
        return Math.max(1.0f + (float)n / 100.0f, 0.0f);
    }

    private float RZ(int n) {
        if (n == 0) {
            return 1.0f;
        }
        int n2 = 0;
        if ((n == 1 || n == 3) && this.bgE.Sn() != this.bgF.Sn() && this.bgE.a(exx_2.rHQ)) {
            n2 += this.bgE.c(exx_2.rHQ);
        }
        if ((n == 2 || n == 3) && this.bgF.a(exx_2.rHR)) {
            n2 += this.bgF.c(exx_2.rHR);
        }
        return Math.max(1.0f + (float)n2 / 100.0f, 0.0f);
    }

    private float Sa(int n) {
        if (n == 0) {
            return 1.0f;
        }
        return Math.max(1.0f + (float)this.rbr / 100.0f, 0.0f);
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public int Sb(int n) {
        return this.rbr += n;
    }

    @Override
    public /* synthetic */ eON fCE() {
        return this.fCC();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCC();
    }
}

