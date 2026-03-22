/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.commonIn.SwitchHeroCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cGC
 */
@fyf_0
public class cgc_2 {
    public static final String PACKAGE = "wakfu.partyList";
    private static final Logger mYI = Logger.getLogger(cgc_2.class);

    public static void onPlayerClick(flp_2 flp_22, bvl_0 bvl_02) {
        boolean bl;
        long l;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bvl_02.Sn() == bgt_02.Sn()) {
            return;
        }
        if (flp_22.gEk() && bvl_02.dKY() != -1) {
            SwitchHeroCommand.ip(bvl_02.Sn());
            return;
        }
        if (!flp_22.gEm()) {
            return;
        }
        fcb_2 fcb_22 = fyw_0.gqw().gqJ();
        fcb_22.setHotSpotPosition(faa_2.tLN);
        exz_1 exz_12 = bvl_02.dKX();
        fcb_22.a(exz_12.getName(), (awg_1)null);
        boolean bl2 = bvl_02.dKX().aXd();
        boolean bl3 = bvl_02.dKX().dmc();
        bgt_0 bgt_03 = bvz_0.dLl();
        long l2 = l = bgt_03 != null ? bgt_03.Sn() : 0L;
        if (bgt_02.dnQ().dKL().fmo() == bgt_02.Sn() || (bl2 || bl3) && bvl_02.dKX().aZj() == aue_0.cVJ().cVO().xl()) {
            fcb_22.a(aum_0.cWf().c("party.deleteMember", new Object[0]), "negativeMedium", new cgd_2(bvl_02), !exz_12.fmm());
        }
        if (bgt_02.dnQ().dKL().fmo() == bgt_02.Sn() && !bl2 && !bl3) {
            fcb_22.a(aum_0.cWf().c("party.giveLead", new Object[0]), "primaryMedium", new cge_2(bvl_02), !exz_12.fmm());
        }
        boolean bl4 = bl = apd_0.cAO().cAQ().ii(exz_12.aZj()) != null;
        if (!(bl || bl2 || bl3)) {
            fcb_22.a(aum_0.cWf().c("chat.addToFriendList", new Object[0]), new cgf_1(exz_12), true);
        }
        if (!bl2 && !bl3) {
            boolean bl5 = bir_1.dZt().j(0, exz_12.KU());
            if (bl5) {
                fcb_22.a(aum_0.cWf().c("group.party.unFollowMember", new Object[0]), new cgg_1(exz_12), exz_12.aqZ() == bgt_02.aqZ());
            } else {
                fcb_22.a(aum_0.cWf().c("group.party.followMember", new Object[0]), new cgh_1(exz_12), exz_12.aqZ() == bgt_02.aqZ());
            }
        }
        if (!(bl2 || bl3 && bvl_02.aZj() != bgt_02.aZj())) {
            bhJ bhJ2 = bgg_0.dlO().ju(exz_12.KU()) != null ? (bhJ)bgg_0.dlO().ju(exz_12.KU()) : (bhJ)fcL.rUh.sw(exz_12.KU());
            bvk bvk2 = bvk.dJZ();
            if (bvk2.ai(bhJ2)) {
                fcb_22.a(aum_0.cWf().c("desc.mru.inviteToJoinGuild", exz_12.getName()), new cgi_2(exz_12), true);
            }
        }
        fyw_0.gqw().a(fcb_22, fhz_2.gAS().getX() + 20, fhz_2.gAS().getY());
    }

    public static void openInviteDialog(fiq_1 fiq_12) {
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string != null) {
                aue_0.cVJ().cVK().dnQ().mz(string);
            }
        }).l("group.party.invite.action", new Object[0]).pe(true));
    }

    public static void leaveParty(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19043);
        dae_02.gj(aue_0.cVJ().cVK().Sn());
        aaw_1.bUq().h(dae_02);
    }

    public static void togglePartyList(flv_2 flv_22, faw_2 faw_22) {
        faw_22.setVisible(!flv_22.bqr());
    }
}

