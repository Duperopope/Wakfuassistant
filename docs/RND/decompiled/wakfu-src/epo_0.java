/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePo
 */
public class epo_0
extends ero_0 {
    private static final aox_1 rdf = new enz_0(new eny_0("Boost de HP en fonction du bonus dmg d'un element", new enx_0("Element (0=neutre, 1=feu, 2=eau, 3=terre, 4=air, 5=stasis, 6=lumi\u00e8re)", eNA.qYC), new enx_0("% de la valeur \u00e0 ajouter", eNA.qYC), new enx_0("Augmente la valeur courante (0 non 1 oui)", eNA.qYD), new enx_0("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eNA.qYD)));
    private boolean rcb = true;
    private boolean rcc = true;
    private int rcd;

    @Override
    public aox_1 bEt() {
        return rdf;
    }

    public epo_0() {
        this.bby();
    }

    public epo_0 fDN() {
        epo_0 epo_02 = new epo_0();
        return epo_02;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(3);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || !this.bgF.a(exx_2.rGi)) {
            this.mk(true);
            return;
        }
        pr_0 pr_02 = this.bgF.b(exx_2.rGi);
        int n = pr_02.aYD();
        int n2 = pr_02.aYE();
        pr_02.or(this.aQL);
        if (this.bbt()) {
            this.aQL = pr_02.aYE() - n2;
            this.rcd = pr_02.aYD() - n;
        }
        if (this.rcb) {
            pr_02.nt(this.rcd);
            this.rdU = true;
        }
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        int n = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        int n2 = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
        if (((enk_0)this.bgC).a(2, s, ene_0.qPu) == 0) {
            this.rcb = false;
        }
        if (((enk_0)this.bgC).a(3, s, ene_0.qPu) == 0) {
            this.rcc = false;
        }
        this.aQL = 0;
        eNd eNd2 = eNd.ff((byte)n);
        if (eNd2 == eNd.qPe || eNd2 == eNd.qPd) {
            eNd2 = eqb_0.a(this.bgE);
        }
        if (eNd2 != null) {
            this.aQL += eqb_0.a(eNd2.fAU(), this.bgE);
        }
        if (this.bgE.a(exx_2.rGw)) {
            this.aQL += this.bgE.c(exx_2.rGw);
        }
        if (this.bgE.a(exx_2.rHB)) {
            this.aQL += this.bgE.c(exx_2.rHB);
        }
        if (this.bgE.a(exx_2.rHz)) {
            this.aQL += this.bgE.c(exx_2.rHz);
        }
        if (this.bgE.a(exx_2.rHy)) {
            this.aQL += this.bgE.c(exx_2.rHy);
        }
        this.aQL = (this.aQL + 100) * n2 / 100;
    }

    @Override
    public void bbS() {
        if (this.rdU && this.bgF != null && this.bgF.a(exx_2.rGi)) {
            int n;
            int n2 = this.bgF.c(exx_2.rGi);
            int n3 = n = this.rcd > n2 ? n2 - 1 : this.rcd;
            if (this.rcc) {
                this.bgF.b(exx_2.rGi).oq(n);
            }
            this.bgF.b(exx_2.rGi).or(-this.aQL);
        }
        super.bbS();
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
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().u(this.rcb).v(this.rcc).ek(this.rcd));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rcb = ii_12.Mx();
            this.rcc = ii_12.Mz();
            this.rcd = ii_12.getValue();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDN();
    }
}

