/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eQx
 */
public final class eqx_0
extends eqc_0 {
    private static final aox_1 rfZ = new enz_0(new eny_0("Params", new enx_0("Sym\u00e9trie par rapport \u00e0 (0 = caster, 1 = target)", eNA.qYD)), new eny_0("Avec pr\u00e9cision d'angle", new enx_0("Sym\u00e9trie par rapport \u00e0 (0 = caster, 1 = target)", eNA.qYD), new enx_0("Angle de sym\u00e9trie (sens horaire) (0 = 90\u00b0, 1 = 180\u00b0 (default), 2 = 270\u00b0)", eNA.qYD)));
    private boolean rfi;
    private int rga;
    @Nullable
    private acd_1 rgb;

    public eqx_0() {
        this.bby();
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.rfa = null;
        if (this.bgC == null) {
            return;
        }
        if (fqC.giD() == null) {
            return;
        }
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 != null) {
            this.rfa = fqB2.ci(s);
        }
        this.rfi = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
        int n = ((enk_0)this.bgC).fAn() >= 2 ? ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) : 1;
        switch (n) {
            case 0: {
                this.rga = 90;
                break;
            }
            case 2: {
                this.rga = 270;
                break;
            }
            default: {
                this.rga = 180;
            }
        }
        this.fFE();
    }

    @Override
    public aox_1 bEt() {
        return rfZ;
    }

    public eqx_0 fFD() {
        return new eqx_0();
    }

    private void fFE() {
        int n;
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            return;
        }
        acd_1 acd_12 = this.rfi ? this.E(this.bgG.getX(), this.bgG.getY(), this.bgE.aZw().getX(), this.bgE.aZw().getY()) : this.E(this.bgE.aZw().getX(), this.bgE.aZw().getY(), this.bgG.getX(), this.bgG.getY());
        if (acd_12 == null) {
            return;
        }
        int n2 = acd_12.getX();
        if (rh_02.T(n2, n = acd_12.getY())) {
            acd_12.aM(rh_02.Z(acd_12.getX(), acd_12.getY()));
            this.rgb = acd_12;
        }
    }

    @Override
    @NotNull
    public acd_1 fFf() {
        if (this.rgb != null) {
            return this.rgb;
        }
        return super.fFf();
    }

    @Override
    public boolean fFg() {
        return true;
    }

    @Override
    public boolean bbI() {
        return super.bbI() && this.rgb != null;
    }

    @Nullable
    private acd_1 E(int n, int n2, int n3, int n4) {
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            return null;
        }
        acd_1 acd_12 = new acd_1();
        switch (this.rga) {
            case 90: {
                acd_12.setX(n - (n4 - n2));
                acd_12.setY(n2 + (n3 - n));
                break;
            }
            case 270: {
                acd_12.setX(n + (n4 - n2));
                acd_12.setY(n2 - (n3 - n));
                break;
            }
            default: {
                acd_12.setX(2 * n - n3);
                acd_12.setY(2 * n2 - n4);
            }
        }
        if (!rh_02.T(acd_12.getX(), acd_12.getY())) {
            return null;
        }
        acd_12.aM(rh_02.Z(acd_12.getX(), acd_12.getY()));
        return acd_12;
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
    boolean K(QD qD) {
        if (((enk_0)this.bgC).fAn() >= 2 && ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1) {
            return true;
        }
        return super.K(qD);
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFD();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFD();
    }
}

