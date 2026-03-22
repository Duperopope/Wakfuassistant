/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIR
 */
public class bir_1
extends afn_0
implements ady_0<ads_0> {
    private static final bir_1 kij = new bir_1();

    private bir_1() {
        this.bkZ();
    }

    public static bir_1 dZt() {
        return kij;
    }

    private void bkZ() {
        this.a(fau_2.tQS);
    }

    @Override
    protected afQ a(int n, afS afS2, Object object, int n2, int n3, int n4, int n5, boolean bl) {
        afQ afQ2 = new afQ(afS2, object, n2, n3, n4, n5, bl);
        afQ2.setIconUrl(auc_0.cVq().a("compassTypePath", "defaultIconPath", n));
        return afQ2;
    }

    @Override
    public void a(int n, long l, int n2, int n3, int n4, Object object, afR afR2, boolean bl) {
        fau_2.tQS.setTarget(aue_0.cVJ().cVK().ddI());
        super.a(n, l, n2, n3, n4, object, afR2, bl);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null) {
            this.a(0, bgy2.Sn(), bgy2.ddI());
        }
    }

    public void a(ads_0 ads_02) {
        if (ads_02 != null) {
            this.a(0, ads_02.Sn(), ads_02);
        }
    }

    public void b(ads_0 ads_02) {
        if (ads_02 != null) {
            this.a(0, ads_02.Sn(), null);
        }
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
        this.a(0, ads_02.Sn(), n, n2, s);
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }
}

