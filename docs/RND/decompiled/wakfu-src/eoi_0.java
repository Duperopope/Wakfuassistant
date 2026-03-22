/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOI
 */
public final class eoi_0
extends ero_0 {
    private static final aox_1 rbX = new enz_0(new eny_0("D\u00e9sactive le calcul de temps de tour (garde le temps du personnage pr\u00e9c\u00e9dent - NOOP si premier combattant)", new enx_0[0]), new eny_0("Modifie le mode de calcule de dur\u00e9e de tour", new enx_0("Garde le temps pr\u00e9c\u00e9dent (0) ; Additionne au temps pr\u00e9c\u00e9dent (1)", eNA.qYC)));
    private boolean rbY = false;

    @Override
    public aox_1 bEt() {
        return rbX;
    }

    public eoi_0() {
        this.bby();
    }

    public eoi_0 fCU() {
        return new eoi_0();
    }

    @Override
    public void E(QD qD) {
        int n;
        if (!(this.bgF instanceof exP) || !((exP)this.bgF).djT()) {
            return;
        }
        if (((enk_0)this.bgC).fAn() == 1 && (n = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu)) == 1) {
            this.rbY = true;
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
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

    public boolean fCV() {
        return this.rbY;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCU();
    }
}

