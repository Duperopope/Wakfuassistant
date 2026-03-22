/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class ePk
extends ero_0 {
    private static final aox_1 rcZ = new enz_0(new eny_0("Default", new enx_0[0]), new eny_0("Annulation de l'effet \u00e0 rediriger", new enx_0("Annulation de l'effet d\u00e9clencheur (1=oui, 0=non)", eNA.qYC)), new eny_0("Modificateur de la valeur recalcul\u00e9e en %", new enx_0("Annulation de l'effet d\u00e9clencheur (1=oui, 0=non)", eNA.qYC), new enx_0("Modificateur de la valeur recalcul\u00e9e en %", eNA.qYC)), new eny_0("Ex\u00e9cute sur les cibles", new enx_0("Annulation de l'effet d\u00e9clencheur (1=oui, 0=non)", eNA.qYC), new enx_0("Modificateur de la valeur recalcul\u00e9e en %", eNA.qYC), new enx_0("Ex\u00e9cute sur les cibles dans l'aoe (pas sur les cellules) (1=oui, 0=non (d\u00e9faut))", eNA.qYC)));
    private boolean rda;
    private boolean rdb;

    @Override
    public aox_1 bEt() {
        return rcZ;
    }

    public ePk() {
        this.bby();
    }

    public ePk fDE() {
        ePk ePk2 = new ePk();
        ePk2.rda = this.rda;
        return ePk2;
    }

    @Override
    public void E(QD qD) {
        this.rda = false;
        this.aQL = 100;
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            boolean bl = this.rda = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            this.aQL = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 3) {
            this.rdb = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        QD qD2 = this.L(qD);
        if (qD2 == null) {
            bgA.error((Object)("On ne peut pas executer un " + this.getClass().getSimpleName() + " sans effet declencheur, id = " + this.aZH()));
            return;
        }
        this.h((ero_0)qD2);
        if (this.rda) {
            enq_0 enq_02 = (enq_0)qD2.bbg();
            if (enq_02 == null) {
                enq_02 = enq_0.a(false, false, null);
                qD2.a(enq_02);
            }
            enq_02.fBi();
        }
    }

    private void h(ero_0 ero_02) {
        if (this.bgC == null || ((enk_0)this.bgC).aZS() == null) {
            return;
        }
        Object FX = ero_02.bba();
        if (FX == null) {
            return;
        }
        aoh_1 aoh_12 = ((enk_0)this.bgC).aZS();
        Iterable<qu_0> iterable = anv_1.bEg().a(this.bgF, this.bgJ.bae(), aoh_12, this.bgG.getX(), this.bgG.getY(), this.bgG.bdi());
        if (this.rdb) {
            for (qu_0 qu_02 : iterable) {
                FX.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), qu_02.bcC(), qu_02.bcD(), qu_02.bcE(), qu_02, this.d(ero_02, false), false);
            }
        } else {
            ArrayList<acd_1> arrayList = new ArrayList<acd_1>();
            for (qu_0 object : iterable) {
                acd_1 acd_12 = object.aZw();
                if (arrayList.contains(acd_12)) continue;
                arrayList.add(acd_12);
            }
            for (acd_1 acd_13 : arrayList) {
                FX.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), acd_13.getX(), acd_13.getY(), acd_13.bdi(), null, this.d(ero_02, false), false);
            }
        }
    }

    private enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = enq_0.a(bl, false, ero_02);
        enq_02.RT(ero_02.fHf());
        enq_02.a(this.aQL, eNr.qYn);
        enq_02.lR(false);
        return enq_02;
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
    public void aVH() {
        super.aVH();
        this.rda = false;
        this.rdb = false;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDE();
    }
}

