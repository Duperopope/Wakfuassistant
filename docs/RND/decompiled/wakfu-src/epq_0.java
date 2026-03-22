/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePq
 */
public class epq_0
extends ero_0
implements eov_0,
esn_0 {
    private static final aox_1 rdm = new enz_0(new eny_0("Dommages", new enx_0("Valeur", eNA.qYC)), new eny_0("Prise en compte des modificateurs (0=fixe + non-r\u00e9ductible, 1=non-r\u00e9ductible, 2=fixe, 3=default)", new enx_0("Valeur", eNA.qYC), new enx_0("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eNA.qYD)), new eny_0("Ratio de la valeur des PV max/courant/manquant de la cible/caster", new enx_0("Ratio (%)", eNA.qYC), new enx_0("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eNA.qYD), new enx_0("CASTER : 1=max 2=current 3=missing | TARGET : 4=max 5=current 6=missing", eNA.qYD)));
    eNd rdi;
    eso_0 rdj;
    int rdk;
    private int rdn;
    private int rdo;
    private int huX;
    private int huY;
    private int rdl;
    private boolean rdp;
    private boolean rdq;

    @Override
    public aox_1 bEt() {
        return rdm;
    }

    epq_0() {
    }

    public epq_0(eNd eNd2, eso_0 eso_02) {
        this.rdi = eNd2;
        this.rdj = eso_02;
        this.bby();
    }

    public static epq_0 a(qm_0<enk_0> qm_02, eNd eNd2, eso_0 eso_02, int n, qu_0 qu_02) {
        epq_0 epq_02 = new epq_0(eNd2, eso_02);
        epq_02.b(qm_02, eNd2, eso_02, n, qu_02);
        return epq_02;
    }

    void b(qm_0<enk_0> qm_02, eNd eNd2, eso_0 eso_02, int n, qu_0 qu_02) {
        this.o = enf_0.qSJ.d();
        this.bgM = ((ero_0)enf_0.qSJ.bkx()).baZ();
        this.rdi = eNd2;
        this.rdj = eso_02;
        this.bgF = qu_02;
        this.aQL = n;
        this.bgO = -1;
        this.rdk = 3;
        this.bgJ = qm_02;
        this.rdo = 0;
        this.rdn = 0;
        this.huX = 0;
        this.huY = 0;
        this.rdl = 0;
        this.rdp = false;
        this.rdq = false;
        this.bby();
    }

    public epq_0 fDT() {
        epq_0 epq_02 = new epq_0();
        this.b(epq_02);
        return epq_02;
    }

    @Override
    private void b(epq_0 epq_02) {
        epq_02.rdn = this.rdn;
        epq_02.rdo = this.rdo;
        epq_02.huX = this.huX;
        epq_02.huY = this.huY;
        epq_02.rdl = this.rdl;
        epq_02.rdp = this.rdp;
        epq_02.rdj = this.rdj;
        epq_02.rdi = this.rdi;
        epq_02.rdk = this.rdk;
        epq_02.rdq = this.rdq;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2);
        this.n(this.rdi);
        if (this.a(eNi.qWs)) {
            this.oC(2215);
        }
        if (this.a(eNi.qWK)) {
            this.oC(2218);
        }
        if (this.a(eNi.qWL)) {
            this.oC(2217);
        }
        if (this.a(eNi.qWJ)) {
            this.oC(2216);
        }
        if (this.fDV()) {
            this.oC(2268);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE == null || this.bgF == null) {
            this.mk(true);
            return;
        }
        if (!this.bgF.a(exx_2.rGi) && !this.bgF.a(exx_2.rHu)) {
            this.mk(true);
            return;
        }
        if (this.fDX() && this.rdp) {
            this.aQL = (int)Math.ceil((float)this.aQL * 0.8f);
            if (this.bbh() instanceof ent_0) {
                this.oC(2233);
            }
        }
        if (this.aQL < 0) {
            this.aQL = 0;
            bgA.warn((Object)("HPLoss with negative value : " + ((enk_0)this.bgC).aZH()));
        }
        if (!this.bgF.baI()) {
            this.a(this.aQL, this.bgE, this.bgF);
        } else if (this.bgF.a(exx_2.rGs)) {
            this.aQL = 1;
            this.bgF.b(exx_2.rGs).oq(this.aQL);
        } else {
            this.mk(true);
        }
        this.fDU();
    }

    private void a(int n, qu_0 qu_02, qu_0 qu_03) {
        pr_0 pr_02;
        if (this.bgC == null || !((enk_0)this.bgC).a(eNi.qWP)) {
            pr_0 pr_03;
            pr_02 = qu_02.b(exx_2.rHw);
            if (pr_02 != null && pr_02.aYD() > 0 && pr_02.aYL()) {
                int n2 = pr_02.oq(n / 2);
                n -= n2;
                if (this.bbt()) {
                    this.huY = n2;
                }
            }
            if ((pr_03 = qu_03.b(exx_2.rHu)) != null && pr_03.aYD() > 0 && pr_03.aYL()) {
                int n3 = pr_03.oq(n);
                n -= n3;
                if (this.bbt()) {
                    this.huX = n3;
                }
            }
        }
        if ((pr_02 = qu_03.b(exx_2.rHp)) != null && pr_02.aYD() > 0 && pr_02.aYL()) {
            int n4 = pr_02.oq(n);
            n -= n4;
        }
        if (n > 0) {
            qu_03.b(exx_2.rGi).oq(n);
        }
    }

    private void fDU() {
        sp_0 sp_02 = this.bgF.baD();
        if (sp_02 == null || this.bgE == null) {
            return;
        }
        so_0 so_02 = sp_02.o(this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE());
        if (so_02 == so_0.bpF) {
            this.oC(29);
        }
    }

    @Override
    public void E(QD qD) {
        if (this.bgE == null || this.bgF == null) {
            return;
        }
        if (!this.bgF.a(exx_2.rGi) && !this.bgF.a(exx_2.rHu)) {
            return;
        }
        if (this.bgF.baI()) {
            this.aQL = 1;
            return;
        }
        this.rdq = this.fDV();
        this.fDQ();
        this.fDS();
    }

    private boolean fDV() {
        if (this.bgC != null && ((enk_0)this.bgC).a(eNi.qWV)) {
            return false;
        }
        if (this.bbf() == null) {
            return true;
        }
        return ((eNl)this.bbf()).bab() != 12 && ((eNl)this.bbf()).bab() != 11;
    }

    private void fDQ() {
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
                    bgA.error((Object)("Nombre de param\u00e9tres incorrect dans un HPLoss : " + ((enk_0)this.bgC).fAn() + ", effectId : " + ((enk_0)this.bgC).aZH()));
                }
            }
        }
        this.aQL = eqb_0.a(this.aQL, this.rdj, this.bgE, this.bgF);
    }

    public void fDR() {
        this.aQL = 0;
        this.rdj = eso_0.rjE;
        this.rdk = 3;
    }

    void fDS() {
        boolean bl = this.bgC != null && ((enk_0)this.bgC).df(1L);
        boolean bl2 = this.bgC != null && ((enk_0)this.bgC).aZT();
        esr_0 esr_02 = new esr_0(this.bgE, this.bgF, this.rdi, (enk_0)this.bgC);
        esr_02.Sj(this.rdl);
        esr_02.setValue(this.aQL);
        esr_02.Si(this.rdk);
        esr_02.mm(bl2);
        esr_02.mg(bl);
        esr_02.mn(this.bgF.a(exe_1.rDj));
        esr_02.Sk(this.rdn);
        esr_02.Sl(this.rdo);
        esr_02.mo(this.rdq);
        esr_02.fHM();
        this.n(esr_02.fHN());
        this.aQL = esr_02.getValue();
        if (this.fDX()) {
            this.fDW();
        }
    }

    private void fDW() {
        pr_0 pr_02 = this.bgF.b(exx_2.rHm);
        if (pr_02 == null) {
            return;
        }
        int n = pr_02.aYB();
        if (n > 0 && ve_0.pV(100) <= n) {
            this.rdp = true;
            this.fh((byte)7);
        }
    }

    private boolean fDX() {
        return this.bbt() && this.bgF != null && this.bgE != null && (this.bgC == null || !((enk_0)this.bgC).a(eNi.qWq));
    }

    @Override
    public boolean bbA() {
        return false;
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
    protected boolean bce() {
        return true;
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        super.a(n, f2, bl);
        switch (n) {
            case 0: {
                if (!bl) {
                    this.aQL += VJ.bt((float)this.aQL * f2 / 100.0f);
                    break;
                }
                this.aQL = VJ.bt((float)this.aQL * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.aQL = VJ.bt(f2);
                    break;
                }
                this.aQL = (int)((float)this.aQL + f2);
                break;
            }
            case 6: {
                this.rdo = VJ.bt(f2);
                break;
            }
            case 5: {
                this.rdn = VJ.bt(f2);
                break;
            }
        }
        this.aQL = Math.max(0, this.aQL);
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
    public int fCF() {
        return this.huX;
    }

    @Override
    public int fCG() {
        return this.huY;
    }

    @Override
    public eNd dTh() {
        return this.rdi;
    }

    @Override
    public void aVH() {
        this.rdn = 0;
        this.rdo = 0;
        this.huX = 0;
        this.huY = 0;
        this.rdl = 0;
        this.rdp = false;
        this.rdj = eso_0.rjE;
        this.rdi = eNd.qOY;
        this.rdk = 3;
        this.rdq = false;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().ek(this.huX).ep(this.huY));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.huX = ii_12.getValue();
            this.huY = ii_12.Mg();
        }
    }

    private void n(eNd eNd2) {
        if (eNd2 == null) {
            return;
        }
        switch (eNd2) {
            case qOY: {
                break;
            }
            case qPb: {
                this.oC(8);
                break;
            }
            case qOZ: {
                this.oC(5);
                break;
            }
            case qPa: {
                this.oC(6);
                break;
            }
            case qPc: {
                this.oC(7);
                break;
            }
            case qPd: {
                this.oC(9);
                break;
            }
            case qPe: {
                this.oC(11);
            }
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDT();
    }
}

