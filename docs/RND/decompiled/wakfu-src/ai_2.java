/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.zip.CRC32;

/*
 * Renamed from ai
 */
public final class ai_2
extends Enum<ai_2> {
    public static final /* enum */ ai_2 co = new ai_2(ai_2.l("channel.ChannelMessage"), (MessageLite)h.y());
    public static final /* enum */ ai_2 cp = new ai_2(ai_2.l("channel.ChannelMessageCreatedEvt"), (MessageLite)k.W());
    public static final /* enum */ ai_2 cq = new ai_2(ai_2.l("channel.ChannelMessageList"), (MessageLite)o.ao());
    public static final /* enum */ ai_2 cr = new ai_2(ai_2.l("channel.CreateChannelMessageCmd"), (MessageLite)t_0.aH());
    public static final /* enum */ ai_2 cs = new ai_2(ai_2.l("channel.ListChannelMessagesCmd"), (MessageLite)x.be());
    public static final /* enum */ ai_2 ct = new ai_2(ai_2.l("friend_invite.CreateFriendInviteCmd"), (MessageLite)d_0.bG());
    public static final /* enum */ ai_2 cu = new ai_2(ai_2.l("friend_invite.CreateFriendInviteCmd.RecipientUserNameAndTag"), (MessageLite)h_0.cb());
    public static final /* enum */ ai_2 cv = new ai_2(ai_2.l("friend_invite.DeleteFriendInviteCmd"), (MessageLite)M.cq());
    public static final /* enum */ ai_2 cw = new ai_2(ai_2.l("friend_invite.FriendInvite"), (MessageLite)S.cO());
    public static final /* enum */ ai_2 cx = new ai_2(ai_2.l("friend_invite.FriendInviteCreatedEvt"), (MessageLite)V.dj());
    public static final /* enum */ ai_2 cy = new ai_2(ai_2.l("friend_invite.FriendInviteDeletedEvt"), (MessageLite)Z.dx());
    public static final /* enum */ ai_2 cz = new ai_2(ai_2.l("friend_invite.FriendInviteList"), (MessageLite)ad_1.dK());
    public static final /* enum */ ai_2 cA = new ai_2(ai_2.l("user.CreateUserBlockedUserCmd"), (MessageLite)af_2.fI());
    public static final /* enum */ ai_2 cB = new ai_2(ai_2.l("user.CreateUserFriendGroupCmd"), (MessageLite)aj_2.fZ());
    public static final /* enum */ ai_2 cC = new ai_2(ai_2.l("user.DeleteUserBlockedUserCmd"), (MessageLite)an_1.gp());
    public static final /* enum */ ai_2 cD = new ai_2(ai_2.l("user.DeleteUserFriendCmd"), (MessageLite)ar_1.gE());
    public static final /* enum */ ai_2 cE = new ai_2(ai_2.l("user.DeleteUserFriendGroupCmd"), (MessageLite)av_2.gS());
    public static final /* enum */ ai_2 cF = new ai_2(ai_2.l("user.EndpointProperties"), (MessageLite)az_2.hm());
    public static final /* enum */ ai_2 cG = new ai_2(ai_2.l("user.Friend"), (MessageLite)be_2.hK());
    public static final /* enum */ ai_2 cH = new ai_2(ai_2.l("user.Friend.Group"), (MessageLite)bh_1.ib());
    public static final /* enum */ ai_2 cI = new ai_2(ai_2.l("user.FriendGroupList"), (MessageLite)bl_1.io());
    public static final /* enum */ ai_2 cJ = new ai_2(ai_2.l("user.FriendList"), (MessageLite)bp_1.iD());
    public static final /* enum */ ai_2 cK = new ai_2(ai_2.l("user.ListUserBlockedUsersCmd"), (MessageLite)bu_2.iS());
    public static final /* enum */ ai_2 cL = new ai_2(ai_2.l("user.ListUserFriendGroupsCmd"), (MessageLite)by_2.jf());
    public static final /* enum */ ai_2 cM = new ai_2(ai_2.l("user.ListUserFriendInvitesCmd"), (MessageLite)bc_2.js());
    public static final /* enum */ ai_2 cN = new ai_2(ai_2.l("user.ListUserFriendsCmd"), (MessageLite)bg_1.jF());
    public static final /* enum */ ai_2 cO = new ai_2(ai_2.l("user.UpdateUserEndpointPropertiesCmd"), (MessageLite)bk_2.jU());
    public static final /* enum */ ai_2 cP = new ai_2(ai_2.l("user.UpdateUserFriendCmd"), (MessageLite)bo_2.km());
    public static final /* enum */ ai_2 cQ = new ai_2(ai_2.l("user.UpdateUserStatusCmd"), (MessageLite)bs_1.kC());
    public static final /* enum */ ai_2 cR = new ai_2(ai_2.l("user.User"), (MessageLite)bw_2.kP());
    public static final /* enum */ ai_2 cS = new ai_2(ai_2.l("user.UserBlockedUserCreatedEvt"), (MessageLite)bz_2.lh());
    public static final /* enum */ ai_2 cT = new ai_2(ai_2.l("user.UserBlockedUserDeletedEvt"), (MessageLite)cd_2.lx());
    public static final /* enum */ ai_2 cU = new ai_2(ai_2.l("user.UserEndpointPropertiesUpdatedEvt"), (MessageLite)ch_2.lO());
    public static final /* enum */ ai_2 cV = new ai_2(ai_2.l("user.UserFriendCreatedEvt"), (MessageLite)cl_2.mh());
    public static final /* enum */ ai_2 cW = new ai_2(ai_2.l("user.UserFriendDeletedEvt"), (MessageLite)cp_2.mv());
    public static final /* enum */ ai_2 cX = new ai_2(ai_2.l("user.UserFriendGroupCreatedEvt"), (MessageLite)ct_2.mJ());
    public static final /* enum */ ai_2 cY = new ai_2(ai_2.l("user.UserFriendGroupDeletedEvt"), (MessageLite)cx_2.mX());
    public static final /* enum */ ai_2 cZ = new ai_2(ai_2.l("user.UserFriendUpdatedEvt"), (MessageLite)cb_1.nl());
    public static final /* enum */ ai_2 da = new ai_2(ai_2.l("user.UserList"), (MessageLite)cf_1.nz());
    public static final /* enum */ ai_2 db = new ai_2(ai_2.l("user.UserPresenceUpdatedEvt"), (MessageLite)cm_2.nS());
    public static final /* enum */ ai_2 dc = new ai_2(ai_2.l("user.UserStatusUpdatedEvt"), (MessageLite)cs_1.oi());
    private final int dd;
    private final MessageLite de;
    private static final /* synthetic */ ai_2[] df;

    public static ai_2[] values() {
        return (ai_2[])df.clone();
    }

    public static ai_2 valueOf(String string) {
        return Enum.valueOf(ai_2.class, string);
    }

    private ai_2(int n2, MessageLite messageLite) {
        this.dd = n2;
        this.de = messageLite;
    }

    private static int l(String string) {
        CRC32 cRC32 = new CRC32();
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        cRC32.update(byArray, 0, byArray.length);
        return Long.valueOf(cRC32.getValue()).intValue();
    }

    public static int a(MessageLite messageLite) {
        for (ai_2 ai_22 : ai_2.values()) {
            if (ai_22.de.getClass() != messageLite.getClass()) continue;
            return ai_22.dd;
        }
        return 0;
    }

    public static Optional<MessageLite> g(long l) {
        for (ai_2 ai_22 : ai_2.values()) {
            if ((long)ai_22.dd != l) continue;
            return Optional.of(ai_22.de);
        }
        return Optional.empty();
    }

    private static /* synthetic */ ai_2[] dU() {
        return new ai_2[]{co, cp, cq, cr, cs, ct, cu, cv, cw, cx, cy, cz, cA, cB, cC, cD, cE, cF, cG, cH, cI, cJ, cK, cL, cM, cN, cO, cP, cQ, cR, cS, cT, cU, cV, cW, cX, cY, cZ, da, db, dc};
    }

    static {
        df = ai_2.dU();
    }
}

