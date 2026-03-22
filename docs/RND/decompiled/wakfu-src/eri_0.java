/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRi
 */
public class eri_0
extends ero_0 {
    private static final aox_1 rhp = new enz_0(new eny_0("Standard avec level du sort pour la creature", new enx_0("id du monstre \u00e0 invoquer", eNA.qYB)), new eny_0("Standard", new enx_0("id du monstre \u00e0 invoquer", eNA.qYB), new enx_0("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eNA.qYD)), new eny_0("Sp\u00e9cifie que l'invocation est son propre controlleur (attention)", new enx_0("id du monstre \u00e0 invoquer", eNA.qYB), new enx_0("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eNA.qYD), new enx_0("controlleur = invocation : 1 sinon 0", eNA.qYD)), new eny_0("Sp\u00e9cifie la direction (par defaut celle du caster", new enx_0("id du monstre \u00e0 invoquer", eNA.qYB), new enx_0("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eNA.qYD), new enx_0("controlleur = invocation : 1 sinon 0", eNA.qYD), new enx_0("Direction (-1 par d\u00e9faut)", eNA.qYD)), new eny_0("Sp\u00e9cifie l'equipe", new enx_0("id du monstre \u00e0 invoquer", eNA.qYB), new enx_0("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eNA.qYD), new enx_0("controlleur = invocation : 1 sinon 0", eNA.qYD), new enx_0("Direction (-1 par d\u00e9faut)", eNA.qYD), new enx_0("Equipe (0 = rouge, 1=bleue)", eNA.qYD)), new eny_0("Sp\u00e9cifie la timeline", new enx_0("id du monstre \u00e0 invoquer", eNA.qYB), new enx_0("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eNA.qYD), new enx_0("controlleur = invocation : 1 sinon 0", eNA.qYD), new enx_0("Direction (-1 par d\u00e9faut)", eNA.qYD), new enx_0("Equipe (0 = rouge, 1=bleue)", eNA.qYD), new enx_0("Spawn timeline relatif \u00e0 : 0 = currentFighter, 1 = d\u00e9but de la timeline, 2 = caster de l'effet", eNA.qYD), new enx_0("Offset timeline (Peut \u00eatre n\u00e9gatif pour partir de la fin)", eNA.qYD)));
    private static final int rhq = 3251;
    private long rgq;
    ezw rhr;
    tw_0 hvK;
    ezg_0<exe_1> rhs;
    byte ebP;
    boolean rht = false;
    public final fi_1 rhu = new erj_0(this);

    @Override
    public aox_1 bEt() {
        return rhp;
    }

    public eri_0() {
        this.bby();
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2130);
    }

    public eri_0 fGv() {
        eri_0 eri_02 = new eri_0();
        eri_02.rhr = null;
        eri_02.hvK = null;
        eri_02.rhs = null;
        eri_02.rht = false;
        return eri_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.rhr != null && this.bgE instanceof exP) {
            bgA.info((Object)("Instanciation d'une nouvelle invocation avec un id de " + this.rgq));
            exP exP2 = (exP)this.bgE;
            exP exP3 = exP2.b(this.rhr.fmB(), this.bgG, this.rhr.doG(), this.rhr, this.hvK, this.rht, this.rhs);
            if (this.bbt()) {
                this.rhr.N(exP3.bcQ());
            }
            exP3.lk(true);
            if (this.rhr.doG() == 3251 && this.bgE instanceof exP) {
                exP3.OE(((exP)this.bgE).doZ());
            }
            this.d(qD, bl);
            if (this.bbt() && ((exP)this.bgE).dlK() != null) {
                ((exP)this.bgE).dlK().bm(exP3);
            }
        }
    }

    @Override
    public void E(QD qD) {
        int n;
        Object object;
        short s = -1;
        this.rgq = this.bgJ.bah().bam();
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        int n2 = ((enk_0)this.bgC).fAn() > 1 ? ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) : -1;
        eyg_0 eyg_02 = eyu.fif();
        switch (n2) {
            case -1: {
                if (this.bgD != null) {
                    s = this.fHf();
                    break;
                }
                bgA.error((Object)"[Summon] Impossible d'invoquer une creature avec le mm niveau que le sort : l'effectContainer est null");
                return;
            }
            case -2: {
                if (this.bgE != null) {
                    s = ((exP)this.bgE).cmL();
                    break;
                }
                bgA.error((Object)"[Summon] Impossible d'invoquer une creature avec le mm niveau que le caster car celui-ci est null");
                return;
            }
            case -3: {
                if (eyg_02 != null && (object = eyg_02.bD((short)this.aQL)) != null) {
                    s = ((eyi)object).cqz();
                }
                if (s != -1) break;
                bgA.error((Object)"[Summon] Impossible d'invoquer une creature, on ne peut pas recup\u00e9rer son niveau");
                return;
            }
            default: {
                if (n2 > 0) {
                    s = (short)n2;
                    break;
                }
                bgA.error((Object)("[Summon] Erreur de saisie : le levelType doit etre positif ou -1 ou -2, l\u00e9 il vaut " + n2));
                return;
            }
        }
        boolean bl = this.rht = ((enk_0)this.bgC).fAn() > 2 && ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) >= 1;
        if (((enk_0)this.bgC).fAn() > 3) {
            n = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu);
            object = abi_1.wG(n);
        } else {
            object = abi_1.dzt;
        }
        if (((enk_0)this.bgC).fAn() > 4) {
            this.ebP = (byte)((enk_0)this.bgC).a(4, this.fHf(), ene_0.qPu);
        } else if (this.bgE instanceof exP) {
            this.ebP = ((exP)this.bgE).bcP();
        }
        if (this.rhr == null) {
            this.rhr = new ezw((short)this.aQL, "", -1, s);
        }
        if (this.hvK == null) {
            this.hvK = new tw_0();
            this.hvK.el(this.bgE != null ? this.bgE.Sn() : 0L);
        }
        if (((enk_0)this.bgC).fAn() > 5) {
            n = ((enk_0)this.bgC).a(5, this.fHf(), ene_0.qPu);
            Tx object2 = Tx.px(n);
            this.hvK.a(object2);
        }
        if (((enk_0)this.bgC).fAn() > 6) {
            this.hvK.pv(((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu));
        }
        this.rhr.lM(this.rgq);
        this.rhr.a((abi_1)object);
        this.rhr.az(this.ebP);
        if (this.rhs == null) {
            this.rhs = new ezg_0();
        }
        if (eyg_02 != null) {
            Object b2 = eyg_02.bD((short)this.aQL);
            for (int n3 : b2.fhN()) {
                this.rhs.a(exe_1.Te(n3), (byte)1);
            }
        }
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public boolean fCn() {
        return false;
    }

    @Override
    public void bbG() {
        super.bbG();
        this.rhr = null;
        this.rhs = null;
        this.hvK = null;
    }

    @Override
    protected void a(io_1 io_12) {
        super.a(io_12);
        io_12.a(iq_1.RF().aq(this.rgq).RL());
    }

    @Override
    protected void e(im_1 im_12) {
        super.e(im_12);
        if (im_12.QJ()) {
            iq_1 iq_12 = im_12.QK();
            this.rgq = iq_12.RD();
            this.bgF = null;
        }
    }

    @Override
    public fi_1 bcc() {
        return this.rhu;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGv();
    }
}

