/*
 * Decompiled with CFR 0.152.
 */
public class dcJ
implements adi_1 {
    private static final int ofB = 5;
    private static final dcJ ofC = new dcJ();
    private long bhR;
    private int ofD;
    private ady_0<ads_0> ofE;
    private euf_1 ofF;

    public static dcJ fce() {
        return ofC;
    }

    private dcJ() {
    }

    public void fg(long l) {
        this.bhR = l;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgy bgy2 = bgg_0.dlO().ju(this.bhR);
        if (bgy2 == null || bgy2.doP() || bgy2.djT()) {
            aue_0.cVJ().b(this);
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.ofE = (ads_02, n, n2, s) -> {
            bgy bgy2 = ((bdj_2)ads_02).dcP();
            if (bgy2.djT()) {
                aue_0.cVJ().b(this);
                return;
            }
            if (bgt_02.ddI().bvT()) {
                return;
            }
            if (bgt_02.eap().P(n, n2, s) > 1) {
                acd_1 acd_12 = new acd_1(n, n2, s);
                boolean bl = bgt_02.a(bgy2, true, true);
                if (!bl) {
                    bl = bgt_02.b(acd_12, true, true);
                }
                int n3 = this.ofD = bl ? 0 : this.ofD + 1;
                if (this.ofD >= 5) {
                    aue_0.cVJ().b(this);
                }
            }
        };
        this.ofF = new dck_0(this);
        bgy2.ddI().a(this.ofE);
        bgt_02.a(this.ofF);
        this.ofD = 0;
        this.rk("chat.notify.follow.start");
    }

    private void rk(String string) {
        bgy bgy2 = bgg_0.dlO().ju(this.bhR);
        if (bgy2 == null) {
            return;
        }
        aPd.f(string, bgy2.getName());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        bgt_0 bgt_02;
        if (bl) {
            return;
        }
        bgy bgy2 = bgg_0.dlO().ju(this.bhR);
        if (bgy2 != null) {
            bgy2.ddI().c(this.ofE);
        }
        if ((bgt_02 = aue_0.cVJ().cVK()) != null) {
            bgt_02.b(this.ofF);
        }
        this.ofE = null;
        this.ofF = null;
        this.rk("chat.notify.follow.stop");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16902: 
            case 16990: {
                aue_0.cVJ().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public static boolean aI(bhJ bhJ2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnj()) {
            return false;
        }
        if (bgt_02.djT()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        if (bgt_02.a(ezj_0.ptm)) {
            return false;
        }
        if (bhJ2.djT() || bhJ2.doP()) {
            return false;
        }
        return !bhJ2.a(ezj_0.ptm);
    }
}

