/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aWf
 */
public class awf_0
extends aUV {
    private static final int huh = 3;
    private static final int hui = 1200;
    anp_2 huj;
    private final abi_1 huk;
    private final boolean hul;
    private final euz_1 hum;

    public awf_0(int n, int n2, int n3, int n4, long l, euz_1 euz_12, anp_2 anp_22, abi_1 abi_12, boolean bl) {
        super(n, n2, n3, n4);
        this.fg(l);
        this.hum = euz_12;
        this.huj = anp_22;
        this.huk = abi_12;
        this.hul = bl;
    }

    @Override
    public long cbk() {
        int n;
        if (this.huj == null) {
            return 0L;
        }
        bgy bgy2 = this.iD(this.Qy());
        if (bgy2 == null) {
            return 0L;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.ddf();
        ezz ezz2 = this.b(bgy2, bdj_22);
        if (ezz2 instanceof bgy) {
            bdj_2 bdj_23 = ((bgy)ezz2).ddI();
            bdj_23.a(new awg_0(this, bgy2, bdj_22));
            n = bdj_23.dY("Anim04Porte");
            if (n == Integer.MAX_VALUE || n < 500) {
                n = 500;
            }
            this.huj = this.huj.bP(1, this.huj.bDU());
        } else {
            this.a(bgy2, bdj_22);
            n = 0;
        }
        int n2 = bdj_22.bvD().c(bdj_22, this.huj.bDU()).a(bdj_22);
        if (bgy2.fgX() != null && ((bgy)bgy2.fgX()).ddI().bvF() == null) {
            return 0L;
        }
        return Math.max(0, this.a(bgy2, n, n2));
    }

    private int a(bgy bgy2, int n, int n2) {
        if (this.O(bgy2)) {
            bdj_2 bdj_22 = bgy2.ddI();
            int n3 = bdj_22.dY("AnimCourseTp02") + bdj_22.dY("AnimCourseTp02-Fin");
            if (n3 == 0 || n3 == Integer.MAX_VALUE) {
                return 1200;
            }
            return n3;
        }
        return n + (this.huj.bDU() - 1) * n2;
    }

    void a(bgy bgy2, bdj_2 bdj_22) {
        if (this.huj.bDU() == 0) {
            return;
        }
        if (this.hum == euz_1.rwt) {
            bdj_22.a(aew_0.a(true, bdj_22, ajk_0.chs(), ajk_0.chs()));
        }
        if (this.hum == euz_1.rwu) {
            bdj_22.a(aew_0.a(true, bdj_22, ajl_0.cht(), ajl_0.cht()));
        }
        if (this.O(bgy2)) {
            bdj_22.dT("AnimCourseTp02");
            bdj_22.a(new awi_0(this, bdj_22, bgy2));
            return;
        }
        bdj_22.a(this.huj, true, bgy2.dkZ() == null);
        if (bgy2.djT()) {
            this.c(bgy2, bdj_22);
        }
        if (this.hul) {
            cuu_1.eRU().ca(bgy2);
        }
        this.cXi();
    }

    private void cXi() {
        cuk_2 cuk_22 = cuk_2.eSS();
        boolean bl = aue_0.cVJ().c(cuk_22);
        if (!bl) {
            return;
        }
        cuk_22.eNa();
        cuk_22.eNk();
    }

    private boolean O(bgy bgy2) {
        return bgy2.doV() == eym.pin && this.hum == euz_1.rwp && this.huj.bDU() > 3;
    }

    private ezz b(bgy bgy2, bdj_2 bdj_22) {
        boolean bl;
        ezz ezz2 = bgy2.fgZ();
        if (ezz2 == null) {
            return null;
        }
        int[] nArray = this.huj.bDW();
        acd_1 acd_12 = new acd_1(nArray[0], nArray[1], (short)nArray[2]);
        if (acd_12.equals(bgy2.aZw()) && this.huj.bDU() > 1) {
            nArray = this.huj.tj(1);
            acd_12.u(nArray);
        }
        if (!(bl = ezz2.R(acd_12))) {
            dJP.error((Object)("[FIGHT] " + String.valueOf(ezz2) + " failed to uncarry " + String.valueOf(bgy2) + " to " + String.valueOf(acd_12)));
        }
        cue_2.eSA().eSE();
        return ezz2;
    }

    private void c(bgy bgy2, bdj_2 bdj_22) {
        awh_0 awh_02 = new awh_0(this, bgy2);
        bdj_22.b(awh_02);
    }

    void a(ads_0 ads_02, bgy bgy2) {
        this.b(ads_02, bgy2);
        this.K(bgy2);
        this.P(bgy2);
    }

    private void P(bgy bgy2) {
        if (aue_0.cVJ().cVK() == bgy2) {
            bqm_0.jbp.b(new brb_0());
        }
    }

    private void b(ads_0 ads_02, bgy bgy2) {
        abi_1 abi_12 = bgy2.bcB();
        if (abi_12.bVO()) {
            ads_02.a(abi_12);
        } else {
            dJP.error((Object)"LE MOBILE SE TROUVE DANS UNE DIRECTION 8 A LA FIN D'UN MOUVEMENT");
            ads_02.a(abi_12.wI(0));
        }
    }

    private void K(bgy bgy2) {
        if (bgy2.dkQ() && !bgy2.fgk()) {
            cue_2.eSA().eSE();
        }
    }

    @Override
    protected void caV() {
        bgy bgy2;
        if (this.cja() instanceof bsj_0) {
            ((bsj_0)this.cja()).a(this.iD(this.Qy()), (List<int[]>)null, euz_1.rwp);
        }
        if ((bgy2 = this.iD(this.Qy())) != null) {
            bgy2.j(this.huk);
        }
        super.caV();
    }
}

