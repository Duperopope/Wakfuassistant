/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from bte
 */
public final class bte_0 {
    final cqA jkN;

    public bte_0(cqA cqA2) {
        this.jkN = cqA2;
    }

    public void bGy() {
        bgy bgy2;
        bsS bsS2 = bsU.dHk().Ft(this.jkN.bha());
        if (!(bsS2 instanceof bsi_0)) {
            return;
        }
        bsi_0 bsi_02 = (bsi_0)bsS2;
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            return;
        }
        if (bgt_02.i(ezj_0.ptB)) {
            return;
        }
        bvi_0 bvi_02 = bgt_02.dnQ();
        if (!bvi_02.dfG()) {
            return;
        }
        eyp_1 eyp_12 = bvi_02.dKL();
        Iterator<bgy> iterator = bsi_02.dGs().iterator();
        while (!(!iterator.hasNext() || eyp_12.fa((bgy2 = iterator.next()).Sn()) && this.a(bsi_02, bgy2))) {
        }
    }

    private boolean a(bsi_0 bsi_02, bgy bgy2) {
        btd_1 btd_12 = btb_1.e(bsi_02, bgy2);
        if (btd_12.dHU() != euf_0.rxi) {
            aPd.g("party.notice.partyMemberJoinIFight.error", bgy2.getName());
            return false;
        }
        if (btd_12.dHW()) {
            this.h(bsi_02);
            return true;
        }
        if (((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljY)) {
            euf_0 euf_02 = btd_12.dHT();
            if (euf_02 == euf_0.rxi) {
                aPd.g("fight.autojoin.confirm", new Object[0]);
                return true;
            }
            bNG.egl();
            bNG.a(euf_02.bku(), bgy2);
        } else {
            byte by = bsi_02.dGo().aZv();
            Object object = aum_0.cWf().c("party.question.joinPartyMemberInFight", String.format("<b>%s</b>", bgy2.getName()), by);
            cqi_1 cqi_12 = new cqi_1();
            cqi_12.aH(bgy2);
            String string2 = cqi_12.eLv();
            if (string2 != null) {
                object = (String)object + "\n" + string2;
            }
            fik_2 fik_22 = fik_2.gBY().vE((String)object).vG(ccp_2.mRJ.byf()).abQ(1);
            fik_22.a((n, string) -> {
                bsi_02.b(fik_22);
                if (n != 400) {
                    return;
                }
                euf_0 euf_02 = btd_12.dHT();
                if (euf_02 == euf_0.rxi) {
                    return;
                }
                bNG.egl();
                bNG.a(euf_02.bku(), bgy2);
            });
            bsi_02.c(fik_22);
            fiq_2.gCw().d(fik_22);
        }
        return true;
    }

    private void h(bsi_0 bsi_02) {
        Collection<bgy> collection = bsi_02.dGs();
        for (bgy bgy2 : collection) {
            bhx_0 bhx_02;
            bJr bJr2;
            if (bgy2.aFW() != 1 || !(bgy2 instanceof bhx_0) || (bJr2 = (bhx_02 = (bhx_0)bgy2).doD()) == null) continue;
            cny cny2 = new cny(bJr2.d());
            aue_0.cVJ().etu().d(cny2);
            return;
        }
    }
}

