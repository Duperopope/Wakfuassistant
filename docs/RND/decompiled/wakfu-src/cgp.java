/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import java.util.ArrayList;
import java.util.List;

final class cgp
extends ceK<cqt_0, bsi_0> {
    private bgy hKl;

    cgp() {
    }

    public boolean a(cqt_0 cqt_02) {
        long l = cqt_02.eyw();
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.q(l, false);
            return false;
        }
        this.hKl = bgy2;
        String string2 = bgy2.getName();
        if (apd_0.cAO().cAR().ii(l) != null) {
            this.q(l, false);
            return false;
        }
        if (AwayCommand.eAb && !AwayCommand.eAc.isEmpty()) {
            aPd.Q(AwayCommand.eAc, bgy2.getName());
            this.q(l, false);
            return false;
        }
        String string3 = this.euT();
        Object object = cqt_02.exZ() == 2 ? aum_0.cWf().c("fight.arenaInvitation.dialog", string2) : aum_0.cWf().c("fight.invitation.dialog", string2);
        if (string3 != null) {
            object = (String)object + "\n" + string3;
        }
        fiq_2.gCw().d(fik_2.gBY().vE((String)object).vG(ccp_2.mRK.byf()).a((int n, String string) -> this.q(l, n == 400)));
        aPd.g("fight.invitation.dialog", string2);
        return false;
    }

    private String euT() {
        List<flv_0> list;
        List<flv_0> list2;
        fkc_0 fkc_02 = cpl_1.eLw();
        if (fkc_02 == null) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = this.euU();
        if (bl) {
            ahv_22.ceC().ih(awx_2.dnJ.bQk());
            ahv_22.c("\n").c(aum_0.cWf().c("desc.mru.illegalAction", new Object[0]));
            ahv_22.ceD();
        }
        List<flv_0> list3 = this.euV();
        if (fkc_02 == fkc_0.sAp && !list3.isEmpty()) {
            ahv_22.ceH().ceC().ih(cpm_1.nil);
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.good", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list3, cpm_1.nil, bl);
        }
        if (!(list2 = this.euX()).isEmpty()) {
            ahv_22.ceH().ceC().ih(cpm_1.nim);
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.bad", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list2, cpm_1.nim, bl);
        }
        List<flv_0> list4 = this.euW();
        if (fkc_02 == fkc_0.sAp && !list4.isEmpty()) {
            ahv_22.ceH().ceC().ih("9ed34b");
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.probablyGood", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list4, "9ed34b", bl);
        }
        if (!(list = this.euY()).isEmpty()) {
            ahv_22.ceH().ceC().ih("f48140");
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.probablyBad", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list, "f48140", bl);
        }
        return ahv_22.bXe() > 0 ? ahv_22.ceL() : null;
    }

    private boolean euU() {
        if (cpl_1.eLw() != fkc_0.sAo) {
            return false;
        }
        List<flv_0> list = this.euX();
        return !list.isEmpty();
    }

    private List<flv_0> euV() {
        return flv_0.bl(this.euZ());
    }

    private List<flv_0> euW() {
        return flv_0.bl(this.eva());
    }

    private List<flv_0> euX() {
        return flv_0.bm(this.euZ());
    }

    private List<flv_0> euY() {
        return flv_0.bm(this.eva());
    }

    private List<flv_0> euZ() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<bgy> arrayList = new ArrayList<bgy>();
        ArrayList<bgt_0> arrayList2 = new ArrayList<bgt_0>();
        ArrayList<flv_0> arrayList3 = new ArrayList<flv_0>();
        arrayList2.add(bgt_02);
        arrayList.add(this.hKl);
        fmO fmO2 = new fmO(bgt_02, eUw.ruS, bgt_02, this.hKl, null, arrayList);
        fmP fmP2 = new fmP(bgt_02, eUw.ruS, this.hKl, bgt_02, arrayList2);
        fmj_0 fmj_02 = new fmj_0(bgt_02, true);
        arrayList3.addAll(fmj_02.gdj());
        fmj_02 = new fmj_0(bgt_02, false);
        arrayList3.addAll(fmj_02.gdj());
        arrayList3.addAll(fmO2.gdj());
        arrayList3.addAll(fmP2.gdj());
        return arrayList3;
    }

    private List<flv_0> eva() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<flv_0> arrayList = new ArrayList<flv_0>();
        fmQ fmQ2 = new fmQ(bgt_02, this.hKl, 0, 1, eUw.ruS);
        arrayList.addAll(fmQ2.gdj());
        fmR fmR2 = new fmR(bgt_02, eUw.ruS, bgt_02);
        fmz_0 fmz_02 = new fmz_0(bgt_02, eUw.ruS);
        arrayList.addAll(fmR2.gdj());
        arrayList.addAll(fmz_02.gdj());
        return arrayList;
    }

    private void q(long l, boolean bl) {
        ckq ckq2 = new ckq();
        if (bl) {
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 == null) {
                ckq2.jk(false);
            } else {
                ckq2.jk(bl);
            }
        } else {
            ckq2.jk(false);
        }
        ckq2.bl(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb));
        ckq2.mY(l);
        aue_0.cVJ().etu().d(ckq2);
    }

    public String toString() {
        return "FightInvitationMessageHandler{m_characterInfo=" + String.valueOf(this.hKl) + "}";
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqt_0)aam_22);
    }
}

