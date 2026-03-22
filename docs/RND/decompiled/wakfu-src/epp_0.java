/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from ePp
 */
public class epp_0
extends ero_0
implements esn_0 {
    private static final aox_1 rdg = new enz_0(new eny_0("Soins", new enx_0("Valeur", eNA.qYC)), new eny_0("Prise en compte des modificateurs (0=fixe + non-r\u00e9ductible, 1=non-r\u00e9ductible, 2=fixe, 3=default)", new enx_0("Valeur", eNA.qYC), new enx_0("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eNA.qYD)), new eny_0("Ratio de la valeur des PV max/courant/manquant de la cible/caster", new enx_0("Ratio (%)", eNA.qYC), new enx_0("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eNA.qYD), new enx_0("CASTER : 1=max 2=current 3=missing | TARGET : 4=max 5=current 6=missing", eNA.qYD)));
    private static final BitSet rdh = new BitSet();
    eNd rdi;
    eso_0 rdj;
    int rdk;
    private int rdl;

    @Override
    public aox_1 bEt() {
        return rdg;
    }

    epp_0() {
    }

    public epp_0(eNd eNd2, eso_0 eso_02) {
        this.rdj = eso_02;
        this.rdi = eNd2;
        this.bby();
    }

    public epp_0 fDO() {
        epp_0 epp_02 = new epp_0();
        this.a(epp_02);
        return epp_02;
    }

    @Override
    private void a(epp_0 epp_02) {
        epp_02.rdi = this.rdi;
        epp_02.rdj = this.rdj;
        epp_02.rdk = this.rdk;
        epp_02.rdl = this.rdl;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(1);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE == null || this.bgF == null || !this.bgF.a(exx_2.rGi)) {
            this.mk(true);
            return;
        }
        if (this.aQL < 0) {
            this.aQL = 0;
            bgA.warn((Object)("HPGain with negative value : " + ((enk_0)this.bgC).aZH()));
        }
        if (!this.bgF.a(exe_1.rDu) || this.a(eNi.qWU)) {
            this.fDP();
        } else {
            epq_0 epq_02 = epq_0.a(this.bgJ, this.rdi, eso_0.rjE, this.aQL, this.bgF);
            epq_02.a(enq_0.a(true, true, (ero_0)this.bbm()));
            this.a(epq_02);
            epq_02.g(this);
            epq_02.e(this.bgE);
            epq_02.bbK();
            this.mk(true);
        }
    }

    @Override
    private void a(epq_0 epq_02) {
        if (((enk_0)this.bgC).fAo()) {
            if (((enk_0)this.bgC).aZE()) {
                epq_02.b(eni_0.fBA().RX(-11));
            } else {
                epq_02.b(eni_0.fBA().RX(-3));
            }
        } else if (((enk_0)this.bgC).aZE()) {
            epq_02.b(eni_0.fBA().RX(-8));
        } else {
            epq_02.b(eni_0.fBA().RX(-12));
        }
    }

    private void fDP() {
        pr_0 pr_02 = this.bgF.b(exx_2.rGi);
        int n = this.aQL;
        int n2 = n - pr_02.nt(n);
        pr_0 pr_03 = this.bgF.b(exx_2.rHp);
        if (pr_03 != null && pr_03.aYD() > 0) {
            int n3 = pr_03.nt(n2);
            n2 -= n3;
        }
        this.aQL -= n2;
        if (this.bgF instanceof exP) {
            ((exP)this.bgF).OJ(this.aQL);
        }
    }

    @Override
    public void E(QD qD) {
        if (this.bgE == null || this.bgF == null || !this.bgF.a(exx_2.rGi)) {
            return;
        }
        this.fDQ();
        this.fDS();
    }

    public void fDQ() {
        this.fDR();
        if (this.bgC != null) {
            short s = this.fHf();
            switch (((enk_0)this.bgC).fAn()) {
                case 1: {
                    this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
                    break;
                }
                case 2: {
                    this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
                    this.rdk = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
                    break;
                }
                case 3: {
                    this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
                    this.rdk = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
                    this.rdj = eso_0.fi((byte)((enk_0)this.bgC).a(2, s, ene_0.qPu));
                    break;
                }
                default: {
                    bgA.error((Object)("Nombre de param\u00e9tres incorrect dans un HPGain : " + ((enk_0)this.bgC).fAn() + ", effectId : " + ((enk_0)this.bgC).aZH()));
                }
            }
        }
        this.aQL = eqb_0.a(this.aQL, this.rdj, this.bgE, this.bgF);
    }

    protected void fDR() {
        this.aQL = 0;
        this.rdj = eso_0.rjE;
        this.rdk = 3;
    }

    protected void fDS() {
        boolean bl = this.bgC != null && ((enk_0)this.bgC).df(1L);
        boolean bl2 = false;
        esq_0 esq_02 = new esq_0(this.bgE, this.bgF, this.rdi, (enk_0)this.bgC);
        esq_02.Sj(this.rdl);
        esq_02.setValue(this.aQL);
        esq_02.Si(this.rdk);
        esq_02.mm(false);
        esq_02.mg(bl);
        esq_02.Sk(0);
        esq_02.Sl(0);
        esq_02.fHM();
        this.aQL = esq_02.getValue();
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        super.a(n, f2, bl);
        switch (n) {
            case 0: {
                if (!bl) {
                    this.aQL = (int)((float)this.aQL + (float)this.aQL * f2 / 100.0f);
                    break;
                }
                this.aQL = (int)Math.floor((float)this.aQL * f2 / 100.0f);
                break;
            }
            case 1: {
                if (!bl) {
                    this.aQL = (int)((float)this.aQL + f2);
                    break;
                }
                this.aQL = (int)Math.floor(f2);
                break;
            }
        }
    }

    @Override
    public int Sb(int n) {
        return this.rdl += n;
    }

    @Override
    protected boolean fCv() {
        return this.fHp();
    }

    @Override
    public eNd dTh() {
        return this.rdi;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public BitSet bbx() {
        if (this.bgF != null && this.bgF.a(exe_1.rDu)) {
            return rdh;
        }
        return super.bbx();
    }

    @Override
    public void aVH() {
        this.rdj = eso_0.rjE;
        this.rdi = eNd.qOY;
        this.rdk = 3;
        this.rdl = 0;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDO();
    }
}

