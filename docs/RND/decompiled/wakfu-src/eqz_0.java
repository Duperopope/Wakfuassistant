/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eQz
 */
public final class eqz_0
extends eqc_0 {
    private static final aox_1 rge = new enz_0(new eny_0("Param standard", new enx_0("Nb Cibles Max", eNA.qYD)), new eny_0("Check de critere sur les cibles", new enx_0("Nb Cibles Max", eNA.qYD), new enx_0("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", eNA.qYD)), new eny_0("Pas de shuffle sur la liste des cibles", new enx_0("Nb Cibles Max", eNA.qYD), new enx_0("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eNA.qYD)), new eny_0("Tri des cibles", new enx_0("Nb Cibles Max", eNA.qYD), new enx_0("Critere sur les cibles = 1, critere sur effet de base = 0 (defaut)", eNA.qYD), new enx_0("On m\u00e9lange les cibles avant d'appliquer la limite (oui = 1 (defaut), non = 0)", eNA.qYD), new enx_0("Tri des cellules, voir effet pour les valeurs, outrepasse le m\u00e9lange (0 pour le tri par d\u00e9faut)", eNA.qYD)));
    private int rgf;
    private boolean rgg;
    private boolean rgh = true;
    private int eQr;

    @Override
    public aox_1 bEt() {
        return rge;
    }

    @Override
    public eqc_0 fES() {
        eqz_0 eqz_02 = new eqz_0();
        eqz_02.rgf = this.rgf;
        eqz_02.rgh = this.rgh;
        eqz_02.rgg = this.rgg;
        return eqz_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        if (this.rfa == null && this.bbt()) {
            return;
        }
        List<qu_0> list = eqb_0.e(this, this.rgg);
        if (this.rgh) {
            Collections.shuffle(list);
        }
        if (this.eQr > 0) {
            this.aO(list);
        }
        this.rgf = Math.min(list.size(), this.rgf);
        for (int i = 0; i < this.rgf; ++i) {
            this.a(this.rfa.iterator(), qD, false, list.get(i));
        }
    }

    private void aO(List<qu_0> list) {
        eSc eSc2 = eSc.Sh(this.eQr);
        eSg eSg2 = eSc2.at(this.bgE.aZw());
        Ordering ordering = Ordering.from((Comparator)eSg2).onResultOf((Function)new eqa_0(this));
        list.sort((Comparator<qu_0>)ordering);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Iterator<enk_0> iterator, QD qD, boolean bl, qu_0 qu_02) {
        enq_0 enq_02 = enq_0.a(bl, false, (ero_0)qD);
        if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
            enq_02.RT(this.fHf());
        }
        try {
            this.a(iterator, enq_02, qu_02);
        }
        catch (Exception exception) {
            bgA.error((Object)("Exception levee lors de l'execution d'un groupe d'effets id " + ((enk_0)this.bgC).aZH()), (Throwable)exception);
        }
        finally {
            enq_02.aZp();
        }
    }

    private void a(Iterator<enk_0> iterator, qr_0 qr_02, qu_0 qu_02) {
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), qu_02.bcC(), qu_02.bcD(), qu_02.bcE(), qu_02, qr_02, false);
        }
    }

    @Override
    public void E(QD qD) {
        fqB fqB2;
        if (this.bgC == null) {
            return;
        }
        this.rgg = false;
        this.rgh = true;
        this.eQr = 0;
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.rgf = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            boolean bl = this.rgg = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 3) {
            boolean bl = this.rgh = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 4) {
            this.eQr = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu);
        }
        if ((fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH())) != null) {
            this.rfa = fqB2.ci(this.fHf());
        }
    }

    @Override
    boolean K(QD qD) {
        if (((enk_0)this.bgC).fAn() >= 2 && ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1) {
            return true;
        }
        return super.K(qD);
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
    public void aVH() {
        super.aVH();
        this.rgf = -1;
        this.rgg = false;
        this.rgh = true;
        this.eQr = 0;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fES();
    }
}

