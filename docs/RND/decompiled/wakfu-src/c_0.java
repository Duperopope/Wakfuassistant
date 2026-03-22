/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FileDescriptor
 *  com.google.protobuf.ExtensionRegistry
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

/*
 * Renamed from C
 */
public final class c_0 {
    static final Descriptors.Descriptor aL;
    static final GeneratedMessageV3.FieldAccessorTable aM;
    static final Descriptors.Descriptor aN;
    static final GeneratedMessageV3.FieldAccessorTable aO;
    static final Descriptors.Descriptor aP;
    static final GeneratedMessageV3.FieldAccessorTable aQ;
    static final Descriptors.Descriptor aR;
    static final GeneratedMessageV3.FieldAccessorTable aS;
    static final Descriptors.Descriptor aT;
    static final GeneratedMessageV3.FieldAccessorTable aU;
    static final Descriptors.Descriptor aV;
    static final GeneratedMessageV3.FieldAccessorTable aW;
    static final Descriptors.Descriptor aX;
    static final GeneratedMessageV3.FieldAccessorTable aY;
    private static Descriptors.FileDescriptor M;

    private c_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        c_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013friend_invite.proto\u0012\rfriend_invite\u001a\nuser.proto\"\u0094\u0002\n\u0015CreateFriendInviteCmd\u0012\u0017\n\u000finviter_user_id\u0018\u0001 \u0001(\u0003\u0012\u001b\n\u0011recipient_user_id\u0018\u0002 \u0001(\u0003H\u0000\u0012\u001d\n\u0013recipient_user_name\u0018\u0003 \u0001(\tH\u0000\u0012c\n\u001brecipient_user_name_and_tag\u0018\u0004 \u0001(\u000b2<.friend_invite.CreateFriendInviteCmd.RecipientUserNameAndTagH\u0000\u001a4\n\u0017RecipientUserNameAndTag\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0002 \u0001(\tB\u000b\n\trecipient\"\u00bc\u0001\n\u0015DeleteFriendInviteCmd\u0012\u0017\n\u000finviter_user_id\u0018\u0001 \u0001(\u0003\u0012\u0019\n\u0011recipient_user_id\u0018\u0002 \u0001(\u0003\u0012;\n\u0006reason\u0018\u0003 \u0001(\u000e2+.friend_invite.DeleteFriendInviteCmd.Reason\"2\n\u0006Reason\u0012\f\n\bAccepted\u0010\u0000\u0012\f\n\bRejected\u0010\u0001\u0012\f\n\bCanceled\u0010\u0002\"E\n\u0016FriendInviteCreatedEvt\u0012+\n\u0006invite\u0018\u0001 \u0001(\u000b2\u001b.friend_invite.FriendInvite\"\u0082\u0001\n\u0016FriendInviteDeletedEvt\u0012+\n\u0006invite\u0018\u0001 \u0001(\u000b2\u001b.friend_invite.FriendInvite\u0012;\n\u0006reason\u0018\u0002 \u0001(\u000e2+.friend_invite.DeleteFriendInviteCmd.Reason\"J\n\fFriendInvite\u0012\u001b\n\u0007inviter\u0018\u0001 \u0001(\u000b2\n.user.User\u0012\u001d\n\trecipient\u0018\u0002 \u0001(\u000b2\n.user.User\"?\n\u0010FriendInviteList\u0012+\n\u0006values\u0018\u0001 \u0003(\u000b2\u001b.friend_invite.FriendInviteB/\n-com.ankama.wakfu.chat.endpoint.spin2.protocolb\u0006proto3"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{ae_1.j()});
        aL = (Descriptors.Descriptor)c_0.j().getMessageTypes().get(0);
        aM = new GeneratedMessageV3.FieldAccessorTable(aL, new String[]{"InviterUserId", "RecipientUserId", "RecipientUserName", "RecipientUserNameAndTag", "Recipient"});
        aN = (Descriptors.Descriptor)aL.getNestedTypes().get(0);
        aO = new GeneratedMessageV3.FieldAccessorTable(aN, new String[]{"Name", "Tag"});
        aP = (Descriptors.Descriptor)c_0.j().getMessageTypes().get(1);
        aQ = new GeneratedMessageV3.FieldAccessorTable(aP, new String[]{"InviterUserId", "RecipientUserId", "Reason"});
        aR = (Descriptors.Descriptor)c_0.j().getMessageTypes().get(2);
        aS = new GeneratedMessageV3.FieldAccessorTable(aR, new String[]{"Invite"});
        aT = (Descriptors.Descriptor)c_0.j().getMessageTypes().get(3);
        aU = new GeneratedMessageV3.FieldAccessorTable(aT, new String[]{"Invite", "Reason"});
        aV = (Descriptors.Descriptor)c_0.j().getMessageTypes().get(4);
        aW = new GeneratedMessageV3.FieldAccessorTable(aV, new String[]{"Inviter", "Recipient"});
        aX = (Descriptors.Descriptor)c_0.j().getMessageTypes().get(5);
        aY = new GeneratedMessageV3.FieldAccessorTable(aX, new String[]{"Values"});
        ae_1.j();
    }
}

