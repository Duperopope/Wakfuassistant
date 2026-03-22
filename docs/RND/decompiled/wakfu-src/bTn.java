/*
 * Decompiled with CFR 0.152.
 */
public class bTn
implements aeh_2 {
    public static final String lnn = "name";
    public static final String lno = "isMonster";
    public static final String lnp = "items";
    public static final String lnq = "hasItems";
    private final boolean lnr;
    private final aah_1<bTo> lns = new aah_1();

    public bTn(foP foP2, boolean bl) {
        this.lnr = bl;
        foS foS2 = foT.sMZ.Yl(foP2.d());
        if (this.lnr) {
            for (int n : foS2.gfW()) {
                this.lns.b(n, new bTm(n, foS2.Yd(n), foS2.Ye(n)));
            }
        } else {
            for (int n : foS2.gfX()) {
                this.lns.b(n, new bTq(n, foS2.Yh(n), foS2.Yi(n)));
            }
        }
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lnn)) {
            return this.lnr ? aum_0.cWf().c("protector.ecosystem.monster.category", new Object[0]) : aum_0.cWf().c("protector.ecosystem.resource.category", new Object[0]);
        }
        if (string.equals(lno)) {
            return this.lnr;
        }
        if (string.equals(lnp)) {
            return this.lns;
        }
        if (string.equals(lnq)) {
            return this.lns.bTR() != 0;
        }
        return null;
    }

    public bTo Jy(int n) {
        return this.lns.vK(n);
    }
}

