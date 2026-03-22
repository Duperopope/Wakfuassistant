/*
 * Decompiled with CFR 0.152.
 */
final class bie
extends eyj_0 {
    private final rc_2 ijY;
    final /* synthetic */ bhJ ijZ;

    bie(bhJ bhJ2, rc_2 rc_22) {
        this.ijZ = bhJ2;
        this.ijY = rc_22;
        this.ijY.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.doh().error((Object)"L'occupation en cours ne devrait pas \u00e9tre envoy\u00e9e par le client");
    }

    @Override
    public void zm() {
        if (this.ijY.Wg != null) {
            short s = this.ijY.Wg.Wk;
            switch (s) {
                case 4: {
                    bkk_2 bkk_22 = new bkk_2(this.ijZ);
                    bkk_22.dX(this.ijY.Wg.Wl);
                    bkk_22.bIH();
                    break;
                }
                case 20: {
                    bko_1 bko_12 = new bko_1(this.ijZ);
                    bko_12.dX(this.ijY.Wg.Wl);
                    bko_12.bIH();
                    break;
                }
                case 1: {
                    bkd_1 bkd_12 = new bkd_1(this.ijZ);
                    bkd_12.bIH();
                    break;
                }
                case 16: {
                    bkg_2 bkg_22 = new bkg_2(this.ijZ);
                    bkg_22.dX(this.ijY.Wg.Wl);
                    this.ijZ.a(bkg_22);
                    break;
                }
                default: {
                    bhJ.doi().error((Object)("Occupation inconnue : id=" + s));
                }
            }
        }
    }
}

