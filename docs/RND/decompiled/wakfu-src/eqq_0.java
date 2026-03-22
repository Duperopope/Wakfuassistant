/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eQQ
 */
public class eqq_0
extends eQN {
    private static final aox_1 rgJ = new enz_0(new eny_0("Param standard", new enx_0("id de la zone heure", eNA.qYB), new enx_0("heure", eNA.qYD)));
    private byte rgK = 0;

    @Override
    public aox_1 bEt() {
        return rgJ;
    }

    @Override
    public eQN fFK() {
        return new eqq_0();
    }

    public eqq_0 fFR() {
        eqq_0 eqq_02 = (eqq_0)super.fFQ();
        eqq_02.rgK = 0;
        return eqq_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        Iterable<QQ> iterable;
        if (this.odg == null) {
            iterable = eTo.fIZ().iV(this.aQL);
            if (iterable != null) {
                short s;
                if (this.rgK == 0 && this.bgC != null) {
                    s = this.fHf();
                    this.rgK = (byte)((enk_0)this.bgC).a(1, s, ene_0.qPu);
                }
                s = this.fHf();
                this.odg = ((eSS)iterable).b(new etj_0(this.rgq, this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), this.bgJ, this.bgE.Sn(), this.bgE, s, this.bgE.bcB()));
                ((eSW)this.odg).bc(this.rgK);
            } else {
                bgA.error((Object)("EffectArea inexistante pour l'id " + this.aQL));
                this.mk(true);
                return;
            }
        }
        iterable = new ArrayList();
        for (QQ qQ : this.bgJ.bai().bdh()) {
            if (qQ.aeV() != etm_0.rnr.aHp() || qQ.bci() != this.bgE || ((eSW)qQ).fIQ() != this.rgK) continue;
            ((ArrayList)iterable).add((QQ)qQ);
        }
        for (QQ qQ : iterable) {
            this.bgJ.bai().b(qQ);
        }
        if (this.odg != null) {
            this.d(qD, bl);
            this.bgJ.bai().a(this.odg);
        } else {
            this.mk(true);
        }
    }

    @Override
    public void E(QD qD) {
        super.E(qD);
        this.rgK = (byte)((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
    }

    @Override
    public /* synthetic */ eQN fFQ() {
        return this.fFR();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFR();
    }
}

