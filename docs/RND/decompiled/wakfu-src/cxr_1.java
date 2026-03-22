/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from cXr
 */
class cxr_1
implements WT {
    public static final String nWa = "fontNarrow28BoldBordered";
    public static final String nWb = "fontNarrow24BoldBordered";
    public static final float nWc = 0.5f;
    private final ArrayList<xv_0> nWd = new ArrayList();
    private final bgy nWe;
    final /* synthetic */ cxq_1 nWf;

    cxr_1(cxq_1 cxq_12, bgy bgy2) {
        this.nWf = cxq_12;
        this.nWe = bgy2;
        this.nWe.ddI().a(this);
        this.cl(this.nWe);
    }

    private void cl(bgy bgy2) {
        String string;
        if (bgy2 instanceof bhJ) {
            bhJ bhJ2 = (bhJ)bgy2;
            string = bhJ2.b(((bsg_1)aie_0.cfn().bmH()).enc());
            Optional<bnf_0> optional = bhJ2.dpz();
            if (optional.isPresent()) {
                this.a(bhJ2, string, nWa, 90);
                axb_2 axb_22 = bym_2.ms(bhJ2.Xi()) ? beo_0.d(optional.get().egk().gkb()) : awx_2.dnF;
                this.a(bhJ2, optional.get().cC(bhJ2.aWO()), nWb, 75, axb_22);
                return;
            }
        } else {
            string = bgy2.getName();
        }
        this.a(bgy2, string, nWa, 80);
    }

    private void a(bgy bgy2, String string, String string2, int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        axb_2 axb_22 = this.nWf.c(bgy2, bgt_02) ? aPl.exv.getColor() : (bgt_02.dpO() && bgt_02.dpI().jP(bgy2.Sn()) != null ? aPl.exw.getColor() : (this.nWf.cf(bgy2) ? aPl.exr.getColor() : aPl.exq.getColor()));
        this.a(bgy2, string, string2, n, axb_22);
    }

    private void a(bgy bgy2, String string, String string2, int n, axb_2 axb_22) {
        int n2 = -1;
        xe_0 xe_02 = new xe_0(0, n, 0.5f);
        awh_2 awh_22 = fyw_0.gqw().gqB().uG(string2).getFont();
        xv_0 xv_02 = new xv_0(awh_22, string, xe_02, -1);
        xv_02.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        bdj_2 bdj_22 = bgy2.ddI();
        xv_02.a(bdj_22);
        xd_0.bnv().a(xv_02);
        this.nWd.add(xv_02);
    }

    @Override
    public void b(boolean bl, WU wU) {
        if (!bl) {
            this.clean();
        }
    }

    public void clean() {
        for (xv_0 xv_02 : this.nWd) {
            xd_0.bnv().b(xv_02);
        }
        this.nWe.ddI().b(this);
        this.nWf.nVZ.remove(this.nWe.Sn());
    }
}

