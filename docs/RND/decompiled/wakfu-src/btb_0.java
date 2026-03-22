/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.Collection;

/*
 * Renamed from btb
 */
public final class btb_0 {
    private final bsj_0 jkD;

    public btb_0(bsj_0 bsj_02) {
        this.jkD = bsj_02;
    }

    public bsi_0 dHD() {
        bgy bgy222;
        bsi_0 bsi_02 = new bsi_0(this.jkD.dGo(), this.jkD.fKy().bjB(), this.jkD.dGV(), this.jkD.dGW());
        bsi_02.lK(this.jkD.d());
        bsi_02.a(this.jkD.dGp());
        rh_0 rh_02 = this.jkD.bag();
        bsi_02.d(rh_02);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        for (bgy bgy222 : this.jkD.fKr()) {
            if (bgy222 != bgt_02) {
                bsi_02.a(bgy222, bgy222.bcP());
            }
            bgy222.ddI().ddf();
        }
        bgy bgy3 = (bgy)this.jkD.fA((byte)1);
        bgy222 = (bgy)this.jkD.fA((byte)0);
        if (bgy3 != null) {
            bsi_02.aW(bgy3);
            bsi_02.kr(bgy3.Sn());
        }
        if (bgy222 != null) {
            bsi_02.aX(bgy222);
            bsi_02.ks(bgy222.Sn());
        }
        bsi_02.bK(this.jkD.dGQ().bhJ());
        Collection<QQ> collection = this.jkD.bdh();
        for (QQ object : collection) {
            akj_0.ciY().o(object);
        }
        akj_0.ciY().o(this.jkD.fhK());
        bua bua2 = this.jkD.dGQ();
        if (bua2 != null) {
            bua2.bhk();
            bua2.bhO();
        }
        this.jkD.dGH();
        rh_02.a(true, false);
        bsU.dHk().q(bsi_02);
        this.g(bsi_02);
        for (bgy bgy2 : bsi_02.dGs()) {
            bgy2.CI(-1);
            ers_0 ers_02 = bgy2.doc();
            for (QD qD : ers_02) {
                qD.a(bsi_02.bbh());
            }
            bgy2.a((bsz_0)null);
            bgy2.f(bsi_02);
            bgy2.CI(bsi_02.d());
        }
        return bsi_02;
    }

    private void g(bsi_0 bsi_02) {
        acd_1 acd_12 = bsi_02.bag().bdO();
        bze_2 bze_22 = (bze_2)bzj_2.eqi().aF(acd_12.getX(), acd_12.getY());
        if (bze_22 == null) {
            return;
        }
        azx_1<Short, Short> azx_12 = new azx_1<Short, Short>((short)bze_22.getX(), (short)bze_22.getY());
        bsi_02.F(Lists.newArrayList((Object[])new azx_1[]{azx_12}));
        bzj_2.eqi().l(bsi_02);
    }
}

