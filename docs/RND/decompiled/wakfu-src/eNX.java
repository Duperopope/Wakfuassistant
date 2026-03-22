/*
 * Decompiled with CFR 0.152.
 */
abstract class eNX
extends ero_0 {
    protected int rad;
    protected boolean rae;
    private eNY raf;

    eNX() {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        exx_2 exx_22 = exx_2.c((byte)this.aQL);
        if (exx_22 == null) {
            this.fHg();
            bgA.error((Object)("Erreur de saisie, charac inexistante " + this.aQL));
            return;
        }
        exx_2 exx_23 = exx_2.c((byte)this.rad);
        if (exx_22 == null) {
            this.fHg();
            bgA.error((Object)("Erreur de saisie, charac inexistante " + this.aQL));
            return;
        }
        exf_2 exf_22 = (exf_2)(this.rae ? this.bgE.b(exx_22) : this.bgF.b(exx_22));
        exf_2 exf_23 = (exf_2)(this.rae ? this.bgF.b(exx_23) : this.bgE.b(exx_23));
        if (exf_23 == null || exf_22 == null) {
            this.fHg();
            return;
        }
        this.raf = this.a(exf_23, exf_22);
        exf_22.a(this.raf);
        this.raf.a(exf_22);
    }

    protected abstract eNY a(exf_2 var1, exf_2 var2);

    @Override
    public void bbS() {
        if (!this.Ty()) {
            return;
        }
        exx_2 exx_22 = exx_2.c((byte)this.aQL);
        if (exx_22 == null) {
            return;
        }
        if (this.raf != null) {
            this.raf.cancel();
            this.raf.bLt();
        }
        super.bbS();
    }

    @Override
    public void aVH() {
        if (this.raf != null) {
            this.raf.bLt();
        }
        this.raf = null;
        super.aVH();
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
}

