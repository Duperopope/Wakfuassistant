/*
 * Decompiled with CFR 0.152.
 */
public final class aXX
implements afl {
    public static final aXX hxp = new aXX();

    private aXX() {
    }

    public void a(WL wL) {
        this.cYj();
        wL.b(this);
    }

    private void cYj() {
        aqb_1.bGD().a(new aLb(), aLb2 -> {
            int n = aLb2.tJ();
            int n2 = aLb2.bWc();
            int[] nArray = aLb2.cjX();
            int n3 = aLb2.aVt();
            int n4 = 0;
            if (nArray.length > 0) {
                n4 = nArray[0];
            }
            bep_2 bep_22 = new bep_2(n, n4, n2, n3);
            aXX.a(bep_22);
        });
    }

    private static void a(ehw_0 ehw_02) {
        int n = ehw_02.aZH();
        enk_0 enk_02 = bat_2.cZD().Ay(n);
        if (enk_02 != null) {
            eHI.qsU.a(enk_02);
        }
        eHJ.qsV.b(ehw_02);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.aptitudes", new Object[0]);
    }
}

