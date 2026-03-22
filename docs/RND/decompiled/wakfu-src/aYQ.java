/*
 * Decompiled with CFR 0.152.
 */
public class aYQ
implements afl {
    private static final aYQ hya = new aYQ();

    public static aYQ cYv() {
        return hya;
    }

    private aYQ() {
    }

    public void a(WL wL) {
        aqb_1.bGD().a(new aMn(), aMn2 -> {
            int n = aMn2.d();
            int n2 = aMn2.aHp();
            fdb.fSX().fM(n2, n);
        });
        aqb_1.bGD().a(new amo_0(), amo_02 -> buv_0.dIZ().a(new buu_0(amo_02.d(), amo_02.cnG())));
        fdb.fSX().fSY();
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.furniture", new Object[0]);
    }
}

