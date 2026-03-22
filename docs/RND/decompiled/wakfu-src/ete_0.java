/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTe
 */
final class ete_0 {
    private final eSQ rmF;
    private ezz pgy;

    ete_0(eSQ eSQ2) {
        this.rmF = eSQ2;
    }

    public boolean fhb() {
        return false;
    }

    public boolean c(ezz ezz2) {
        return ezz2.dlL() == this.rmF.bci();
    }

    public boolean buW() {
        return this.pgy != null;
    }

    public void a(ezz ezz2) {
        this.pgy = ezz2;
        rh_0 rh_02 = this.rmF.bbh().bag();
        if (rh_02 != null && this.rmF.bcR()) {
            rh_02.a(this.rmF, false);
        }
    }

    public void cZG() {
        this.pgy = null;
        this.rmF.bpP();
    }

    public ezz fgZ() {
        return this.pgy;
    }
}

