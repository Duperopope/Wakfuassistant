/*
 * Decompiled with CFR 0.152.
 */
public final class bbp
extends eTo {
    private final aqd_1<ale_0> hAg;

    public bbp(aqd_1<ale_0> aqd_12) {
        this.hAg = aqd_12;
    }

    @Override
    public eSZ iP(long l) {
        if (super.iP(l) == null) {
            this.iQ(l);
        }
        return super.iP(l);
    }

    private void iQ(long l) {
        if (l <= 0L) {
            return;
        }
        ale_0 ale_02 = this.hAg.tE((int)l);
        if (ale_02 == null) {
            return;
        }
        eSS eSS2 = bbf.hzU.a(ale_02);
        if (eSS2 == null) {
            return;
        }
        eSS2.ba(false);
        this.e(eSS2);
        if (ale_02.cjX() == null) {
            return;
        }
        for (int n : ale_02.cjX()) {
            enk_0 enk_02 = bat_2.cZD().Ay(n);
            if (enk_02 != null) {
                eSS2.a(enk_02);
                continue;
            }
            rnV.error((Object)("Probl\u00e8me de chargmeent de effectArea " + ale_02.d()));
        }
    }

    @Override
    public eSV iR(long l) {
        if (super.iR(l) == null) {
            this.iQ(l);
        }
        return super.iR(l);
    }

    @Override
    public eSN iS(long l) {
        if (super.iS(l) == null) {
            this.iQ(l);
        }
        return super.iS(l);
    }

    @Override
    public eSK iT(long l) {
        if (super.iT(l) == null) {
            this.iQ(l);
        }
        return super.iT(l);
    }

    @Override
    public eSM iU(long l) {
        if (super.iU(l) == null) {
            this.iQ(l);
        }
        return super.iU(l);
    }

    @Override
    public eSW iV(long l) {
        if (super.iV(l) == null) {
            this.iQ(l);
        }
        return super.iV(l);
    }

    @Override
    public eta_0 iW(long l) {
        if (super.iW(l) == null) {
            this.iQ(l);
        }
        return super.iW(l);
    }

    @Override
    public etb_0 iX(long l) {
        if (super.iX(l) == null) {
            this.iQ(l);
        }
        return super.iX(l);
    }

    @Override
    public eSS iY(long l) {
        if (super.iY(l) == null) {
            this.iQ(l);
        }
        return super.iY(l);
    }

    @Override
    public eSP iZ(long l) {
        eSP eSP2 = super.iZ(l);
        if (eSP2 != null) {
            return eSP2;
        }
        this.iQ(l);
        return super.iZ(l);
    }

    @Override
    public eSJ ja(long l) {
        eSJ eSJ2 = super.ja(l);
        if (eSJ2 != null) {
            return eSJ2;
        }
        this.iQ(l);
        return super.ja(l);
    }
}

