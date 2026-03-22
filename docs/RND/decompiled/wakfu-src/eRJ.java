/*
 * Decompiled with CFR 0.152.
 */
abstract class eRJ
extends ero_0 {
    private int riy;
    private int riz;
    private int rep;

    eRJ() {
    }

    protected int fGZ() {
        return this.riy;
    }

    protected int fHa() {
        return this.riz;
    }

    protected int fHb() {
        return this.rep;
    }

    protected abstract boolean fEL();

    protected void i(ero_0 ero_02) {
        this.riy = 0;
        this.riz = 0;
        this.rep = 0;
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 == null) {
            bgA.error((Object)("Groupe d'effet inconnu" + ((enk_0)this.bgC).aZH()));
            this.fHg();
            return;
        }
        enq_0 enq_02 = this.d(ero_02, this.fEL());
        if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
            enq_02.RT(this.fHf());
        }
        for (enk_0 enk_02 : fqB2) {
            qs_0 qs_02 = null;
            if (this.bbB()) {
                qs_02 = enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.bgF, enq_02, true);
            } else if (this.bbC()) {
                qs_02 = enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), null, enq_02, true);
            } else {
                bgA.error((Object)("Pas de type de cible d\u00e9fini, on n'execute pas le groupe d'effet " + this.aZH()));
            }
            if (qs_02 != null) {
                ++this.riy;
                this.rep += qs_02.bau();
                if (qs_02.bau() == 0) {
                    ++this.riz;
                }
            }
            if (qs_02 == null) continue;
            qs_02.clear();
        }
        enq_02.aZp();
    }

    protected void a(ero_0 ero_02, qu_0 qu_02) {
        this.riy = 0;
        this.riz = 0;
        this.rep = 0;
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 == null) {
            bgA.error((Object)("Groupe d'effet inconnu" + ((enk_0)this.bgC).aZH()));
            this.fHg();
            return;
        }
        enq_0 enq_02 = this.d(ero_02, true);
        if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
            enq_02.RT(this.fHf());
        }
        for (enk_0 enk_02 : fqB2) {
            qs_0 qs_02 = enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), qu_02.bcC(), qu_02.bcD(), qu_02.bcE(), qu_02, enq_02, false);
            if (qs_02 == null) continue;
            ++this.riy;
            this.rep += qs_02.bau();
            if (qs_02.bau() != 0) continue;
            ++this.riz;
        }
        enq_02.aZp();
    }

    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = enq_0.a(bl, false, ero_02);
        enq_02.lR(false);
        return enq_02;
    }
}

