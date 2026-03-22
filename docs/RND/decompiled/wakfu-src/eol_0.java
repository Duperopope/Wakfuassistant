/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eOL
 */
public class eol_0
extends ero_0 {
    private static final aox_1 rcg = new enz_0(new eny_0("Debuff de Charac", new enx_0("valeur (-1 valeur du trigger, -2 vole la totalit\u00e9)", eNA.qYC)), new eny_0("Debuff de Charac avec proba d'application", new enx_0("valeur (-1 valeur du trigger, -2 vole la totalit\u00e9) ", eNA.qYC), new enx_0("Proba d'application en % (-1 = application forc\u00e9e)", eNA.qYD)), new eny_0("Debuff de charac param\u00e9tr\u00e9", new enx_0("Valeur (-1 valeur du trigger, -2 vole la totalit\u00e9) ", eNA.qYC), new enx_0("Proba d'application en % (-1 = application forc\u00e9e)", eNA.qYD), new enx_0("Augmente la valeur courante \u00e0 la d\u00e9sapplication (0 non / 1 oui (default))", eNA.qYD)), new eny_0("Diminue la valeur lors de l'application", new enx_0("Valeur (-1 valeur du trigger, -2 vole la totalit\u00e9) ", eNA.qYC), new enx_0("Proba d'application en % (-1 = application forc\u00e9e)", eNA.qYD), new enx_0("Augmente la valeur courante \u00e0 la d\u00e9sapplication (0 non / 1 oui (default))", eNA.qYD), new enx_0("Diminue la valeur courante \u00e0 l'application (0 non  / 1 oui (default))", eNA.qYD)));
    protected pt_0 rcf;
    protected boolean rch = true;
    private boolean rci = true;
    private final BitSet rcj = new BitSet();

    @Override
    public aox_1 bEt() {
        return rcg;
    }

    protected eol_0() {
    }

    public eol_0(pt_0 pt_02) {
        this.rcf = pt_02;
        this.bby();
    }

    public eol_0 fDa() {
        eol_0 eol_02 = new eol_0();
        eol_02.rcf = this.rcf;
        eol_02.rch = this.rch;
        eol_02.rci = this.rci;
        eol_02.rcj.clear();
        eol_02.rcj.or(super.bbx());
        return eol_02;
    }

    @Override
    public BitSet bbx() {
        return this.rcj;
    }

    public pt_0 fCY() {
        return this.rcf;
    }

    @Override
    public void bby() {
        super.bby();
        if (this.rcf == null) {
            return;
        }
        switch (this.rcf.aYW()) {
            case 0: {
                exx_2 exx_22 = (exx_2)this.rcf;
                if (!exx_22.fOI()) break;
                this.oC(exx_22.fOE());
                break;
            }
            case 1: {
                switch ((fga)this.rcf) {
                    case shH: {
                        this.oC(4);
                    }
                }
            }
        }
    }

    @Override
    public boolean bbI() {
        int n;
        int n2;
        if (this.bbt() && (n2 = this.fCs()) < 100 && n2 < (n = ve_0.pV(100))) {
            this.aQL = 0;
            return false;
        }
        return super.bbI();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.cXt() > 0) {
            return;
        }
        if (this.bgF != null && this.bgF.a(this.rcf)) {
            byte by = this.rcf.aJr();
            if (this.aQL == -1 && qD != null) {
                this.aQL = qD.getValue();
            }
            this.fg(by);
            this.fDb();
        } else {
            this.mk(true);
        }
    }

    private int fCs() {
        int n = this.bgC != null && ((enk_0)this.bgC).fAn() >= 2 ? ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) : 100;
        if (n < 0) {
            return 100;
        }
        return GC.a(n, 0, 100);
    }

    private void fg(byte by) {
        pr_0 pr_02;
        int n;
        if (this.bbt() && by == exx_2.rGi.aJr() && this.bba() != null && ((enk_0)this.bba()).aZG() != 2 && (n = (pr_02 = this.bgF.b(this.rcf)).aYD() - this.aQL) <= 0) {
            this.aQL += n - 1;
        }
    }

    private void fDb() {
        pr_0 pr_02 = this.bgF.b(this.rcf);
        int n = pr_02.aYB();
        if (pr_02.aYD() != Integer.MAX_VALUE) {
            pr_02.os(-this.aQL);
            pr_02.or(-this.aQL);
        }
        int n2 = pr_02.aYB();
        if (this.rci) {
            int n3 = this.aQL - (n - n2);
            pr_02.oq(n3);
            n2 = pr_02.aYB();
        }
        if (this.rcf.aYW() == 0) {
            exx_2 exx_22 = (exx_2)this.rcf;
            if (n2 != n && exx_22.fOK()) {
                this.rcj.set(exx_22.fOG());
            }
            if (exx_22.fOI()) {
                if (this.aQL != 0) {
                    this.rcj.set(exx_22.fOE());
                } else {
                    this.oD(exx_22.fOE());
                }
            }
        }
        if (this.rcf == exx_2.rGI && this.bgJ != null && this.bgJ.baf() != null) {
            this.bgJ.baf().bhI();
        }
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC == null) {
            return;
        }
        this.rci = true;
        this.rch = true;
        this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (((enk_0)this.bgC).fAn() > 2) {
            boolean bl = this.rch = ((enk_0)this.bgC).a(2, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() > 3) {
            boolean bl = this.rci = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu) == 1;
        }
        if (this.aQL == -1 && qD != null) {
            this.aQL = qD.getValue();
        } else if (this.aQL == -2 && this.bgF != null && this.bgF.a(this.rcf)) {
            this.aQL = this.bgF.c(this.rcf);
        }
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 0: {
                if (bl) break;
                this.aQL += VJ.bt((float)this.aQL * f2 / 100.0f);
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
        }
        if (this.aQL == 0) {
            this.fHg();
        }
    }

    @Override
    public void bbS() {
        if (this.rdU && this.bgF != null && this.bgF.a(this.rcf)) {
            this.bgF.b(this.rcf).or(this.aQL);
            this.bgF.b(this.rcf).os(this.aQL);
            if (this.rch) {
                this.bgF.b(this.rcf).nt(this.aQL);
            }
            if (this.rcf == exx_2.rGI && this.bgJ != null && this.bgJ.baf() != null) {
                this.bgJ.baf().bhI();
            }
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
        io_12.a(ii_1.MR().x(this.rch).y(this.rci));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rch = ii_12.MD();
            this.rci = ii_12.MF();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDa();
    }
}

