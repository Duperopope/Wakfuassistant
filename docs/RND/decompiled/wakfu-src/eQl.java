/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class eQl
extends eqc_0 {
    private static final aox_1 rfD = new enz_0(new eny_0("D\u00e9faut", new enx_0[0]), new eny_0("Transmet le niveau requis du donjon dans laquelle se trouve le lanceur ou la cible", new enx_0("Sur la cible (1= oui, 0=non, 0 valeur par d\u00e9faut)", eNA.qYD)), new eny_0("Transmet le niveau requis du donjon dans laquelle se trouve le lanceur ou la cible avec valeur de base et incr\u00e9ment", new enx_0("Sur la cible (1= oui, 0=non, 0 valeur par d\u00e9faut)", eNA.qYD), new enx_0("Niveau : Base", eNA.qYC), new enx_0("Niveau : Incr\u00e9ment par niveau de difficult\u00e9", eNA.qYC)));
    protected float rfn;
    protected float rfo;

    @Override
    public aox_1 bEt() {
        return rfD;
    }

    public eQl() {
        this.bby();
    }

    public eQl fFu() {
        return new eQl();
    }

    @Override
    public void E(QD qD) {
        qu_0 qu_02;
        if (this.bgC == null) {
            return;
        }
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 != null) {
            this.rfa = fqB2.ci(this.fHf());
        }
        boolean bl = true;
        if (((enk_0)this.bgC).fAn() >= 1) {
            boolean bl2 = bl = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 0;
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            this.rfn = ((enk_0)this.bgC).x(1, this.fHf());
            this.rfo = ((enk_0)this.bgC).x(2, this.fHf());
        } else {
            this.rfo = 1.0f;
        }
        qu_0 qu_03 = qu_02 = bl ? this.bgE : this.bgF;
        if (qu_02 instanceof ftf_0) {
            Optional<fte_0> optional = ((ftf_0)((Object)qu_02)).doa();
            this.aQL = optional.map(fte_0::rI).orElse(0);
        } else {
            this.aQL = 0;
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        enq_02.RT(Math.round(this.rfn + this.rfo * (float)this.aQL));
        return enq_02;
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
    public void aVH() {
        super.aVH();
        this.aQL = 0;
        this.rfn = 0.0f;
        this.rfo = 1.0f;
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFu();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFu();
    }
}

