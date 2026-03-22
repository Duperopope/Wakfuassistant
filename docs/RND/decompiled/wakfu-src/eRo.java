/*
 * Decompiled with CFR 0.152.
 */
public class eRo
extends ero_0 {
    private static final aox_1 rhH = new enz_0(new eny_0("Invoque la cr\u00e9ature actuellement s\u00e9lectionn\u00e9e dans le symbiote", new enx_0[0]), new eny_0("Invoque la cr\u00e9ature s\u00e9lectionn\u00e9e dans le symbiote avec controle de sa puissance", new enx_0("Puissance des caracs principales (hp/dmg/res)", eNA.qYC), new enx_0("Puissance des caracs secondaires (init/tacle/esquive)", eNA.qYC)), new eny_0("Sp\u00e9cifie la timeline", new enx_0("Puissance des caracs principales (hp/dmg/res)", eNA.qYC), new enx_0("Puissance des caracs secondaires (init/tacle/esquive)", eNA.qYC), new enx_0("Spawn timeline relatif \u00e0 : 0 = currentFighter, 1 = d\u00e9but de la timeline, 2 = caster de l'effet", eNA.qYD), new enx_0("Offset timeline (Peut \u00eatre n\u00e9gatif pour partir de la fin)", eNA.qYD)));
    float rhI;
    float rhJ;
    private long rgq;
    ezw rhr;
    byte rhK = (byte)-1;
    private boolean rhL;
    tw_0 hvK;
    public final fi_1 rhM = new erp_0(this);

    @Override
    public aox_1 bEt() {
        return rhH;
    }

    public eRo() {
        this.bby();
    }

    public eRo fGF() {
        eRo eRo2 = new eRo();
        eRo2.rhL = false;
        eRo2.hvK = null;
        return eRo2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE == null) {
            return;
        }
        if (this.rhr == null) {
            return;
        }
        if (this.rhL) {
            bgA.error((Object)"Summoning not allowed");
            this.mk(true);
            return;
        }
        exP exP2 = null;
        if (this.bgE instanceof ezi_0 && this.bgE instanceof exP) {
            ezi_0 ezi_02 = (ezi_0)((Object)this.bgE);
            this.rhr.lM(this.rgq);
            Object t = ezi_02.dob();
            if (this.rhK != -1 && t != null) {
                ezw ezw2 = t.Pm(this.rhK);
                if (ezw2 == null) {
                    return;
                }
                ezw2.lM(this.rgq);
            }
            bgA.info((Object)("New summon with id " + this.rhr.fmB()));
            exP2 = ((exP)((Object)ezi_02)).b(this.rhr.fmB(), this.bgG, this.rhr.doG(), this.rhr, this.hvK, false, null);
            this.aB(exP2);
            exP2.lr(true);
            if (this.bbt()) {
                this.rhr.N(exP2.bcQ());
            }
            if (t != null) {
                t.X(this.rhK, false);
            }
        } else if (this.bgE instanceof exP) {
            exP2 = ((exP)this.bgE).b(this.rhr.fmB(), this.bgG, this.rhr.doG(), this.rhr, this.hvK, false, null);
            this.aB(exP2);
        }
        this.d(qD, bl);
        if (this.bbt() && ((exP)this.bgE).dlK() != null) {
            ((exP)this.bgE).dlK().bm(exP2);
        }
    }

    private void aB(exP exP2) {
        esk_0.rjv.a(exP2.fgM(), this.rhI, this.rhJ);
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (((enk_0)this.bgC).fAn() == 2) {
            this.rhI = (float)((enk_0)this.bgC).a(0, s, ene_0.qPu) / 100.0f;
            this.rhJ = (float)((enk_0)this.bgC).a(1, s, ene_0.qPu) / 100.0f;
        } else {
            this.rhI = 1.0f;
            this.rhJ = 1.0f;
        }
        this.rgq = this.bgJ.bah().bam();
        Object t = ((ezi_0)((Object)this.bgE)).dob();
        if (t.Pn(t.fmR())) {
            this.rhK = t.fmR();
            this.rhr = t.Pm(this.rhK);
            this.rhr.bw(((exP)this.bgE).cmL());
        } else {
            this.rhL = true;
        }
        if (this.hvK == null) {
            this.hvK = new tw_0();
            this.hvK.el(this.bgE != null ? this.bgE.Sn() : 0L);
        }
        if (((enk_0)this.bgC).fAn() > 2) {
            int n = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu);
            Tx tx = Tx.px(n);
            this.hvK.a(tx);
        }
        if (((enk_0)this.bgC).fAn() > 3) {
            this.hvK.pv(((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu));
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rhI = 1.0f;
        this.rhJ = 1.0f;
    }

    @Override
    public void bbG() {
        super.bbG();
        this.rhr = null;
        this.hvK = null;
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
        return this.rhM;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGF();
    }

    static /* synthetic */ qu_0 a(eRo eRo2) {
        return eRo2.bgE;
    }

    static /* synthetic */ qu_0 b(eRo eRo2) {
        return eRo2.bgE;
    }
}

