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
 * Renamed from aE
 */
public final class ae_1 {
    static final Descriptors.Descriptor ew;
    static final GeneratedMessageV3.FieldAccessorTable ex;
    static final Descriptors.Descriptor ey;
    static final GeneratedMessageV3.FieldAccessorTable ez;
    static final Descriptors.Descriptor eA;
    static final GeneratedMessageV3.FieldAccessorTable eB;
    static final Descriptors.Descriptor eC;
    static final GeneratedMessageV3.FieldAccessorTable eD;
    static final Descriptors.Descriptor eE;
    static final GeneratedMessageV3.FieldAccessorTable eF;
    static final Descriptors.Descriptor eG;
    static final GeneratedMessageV3.FieldAccessorTable eH;
    static final Descriptors.Descriptor eI;
    static final GeneratedMessageV3.FieldAccessorTable eJ;
    static final Descriptors.Descriptor eK;
    static final GeneratedMessageV3.FieldAccessorTable eL;
    static final Descriptors.Descriptor eM;
    static final GeneratedMessageV3.FieldAccessorTable eN;
    static final Descriptors.Descriptor eO;
    static final GeneratedMessageV3.FieldAccessorTable eP;
    static final Descriptors.Descriptor eQ;
    static final GeneratedMessageV3.FieldAccessorTable eR;
    static final Descriptors.Descriptor eS;
    static final GeneratedMessageV3.FieldAccessorTable eT;
    static final Descriptors.Descriptor eU;
    static final GeneratedMessageV3.FieldAccessorTable eV;
    static final Descriptors.Descriptor eW;
    static final GeneratedMessageV3.FieldAccessorTable eX;
    static final Descriptors.Descriptor eY;
    static final GeneratedMessageV3.FieldAccessorTable eZ;
    static final Descriptors.Descriptor fa;
    static final GeneratedMessageV3.FieldAccessorTable fb;
    static final Descriptors.Descriptor fc;
    static final GeneratedMessageV3.FieldAccessorTable fd;
    static final Descriptors.Descriptor fe;
    static final GeneratedMessageV3.FieldAccessorTable ff;
    static final Descriptors.Descriptor fg;
    static final GeneratedMessageV3.FieldAccessorTable fh;
    static final Descriptors.Descriptor fi;
    static final GeneratedMessageV3.FieldAccessorTable fj;
    static final Descriptors.Descriptor fk;
    static final GeneratedMessageV3.FieldAccessorTable fl;
    static final Descriptors.Descriptor fm;
    static final GeneratedMessageV3.FieldAccessorTable fn;
    static final Descriptors.Descriptor fo;
    static final GeneratedMessageV3.FieldAccessorTable fp;
    static final Descriptors.Descriptor fq;
    static final GeneratedMessageV3.FieldAccessorTable fr;
    static final Descriptors.Descriptor fs;
    private static final GeneratedMessageV3.FieldAccessorTable ft;
    static final Descriptors.Descriptor fu;
    static final GeneratedMessageV3.FieldAccessorTable fv;
    static final Descriptors.Descriptor fw;
    static final GeneratedMessageV3.FieldAccessorTable fx;
    static final Descriptors.Descriptor fy;
    static final GeneratedMessageV3.FieldAccessorTable fz;
    static final Descriptors.Descriptor fA;
    static final GeneratedMessageV3.FieldAccessorTable fB;
    static final Descriptors.Descriptor fC;
    static final GeneratedMessageV3.FieldAccessorTable fD;
    private static Descriptors.FileDescriptor M;

    private ae_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ae_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\nuser.proto\u0012\u0004user\"H\n\u0013UpdateUserStatusCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012 \n\u0006status\u0018\u0002 \u0001(\u000e2\u0010.user.UserStatus\"`\n\u001fUpdateUserEndpointPropertiesCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012,\n\nproperties\u0018\u0002 \u0001(\u000b2\u0018.user.EndpointProperties\"%\n\u0012ListUserFriendsCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\"D\n\u0013UpdateUserFriendCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u001c\n\u0006friend\u0018\u0002 \u0001(\u000b2\f.user.Friend\"+\n\u0018ListUserFriendInvitesCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\">\n\u0013DeleteUserFriendCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0016\n\u000efriend_user_id\u0018\u0002 \u0001(\u0003\"*\n\u0017ListUserFriendGroupsCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\"N\n\u0018CreateUserFriendGroupCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012!\n\u0005group\u0018\u0002 \u0001(\u000b2\u0012.user.Friend.Group\"9\n\u0018DeleteUserFriendGroupCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\"*\n\u0017ListUserBlockedUsersCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\"D\n\u0018CreateUserBlockedUserCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0017\n\u000fblocked_user_id\u0018\u0002 \u0001(\u0003\"D\n\u0018DeleteUserBlockedUserCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0017\n\u000fblocked_user_id\u0018\u0002 \u0001(\u0003\"O\n\u0016UserPresenceUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012$\n\bpresence\u0018\u0002 \u0001(\u000e2\u0012.user.UserPresence\"I\n\u0014UserStatusUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012 \n\u0006status\u0018\u0002 \u0001(\u000e2\u0010.user.UserStatus\"a\n UserEndpointPropertiesUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012,\n\nproperties\u0018\u0002 \u0003(\u000b2\u0018.user.EndpointProperties\"E\n\u0014UserFriendCreatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u001c\n\u0006friend\u0018\u0002 \u0001(\u000b2\f.user.Friend\"E\n\u0014UserFriendUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u001c\n\u0006friend\u0018\u0002 \u0001(\u000b2\f.user.Friend\"?\n\u0014UserFriendDeletedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0016\n\u000efriend_user_id\u0018\u0002 \u0001(\u0003\"O\n\u0019UserFriendGroupCreatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012!\n\u0005group\u0018\u0002 \u0001(\u000b2\u0012.user.Friend.Group\":\n\u0019UserFriendGroupDeletedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\"N\n\u0019UserBlockedUserCreatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012 \n\fblocked_user\u0018\u0002 \u0001(\u000b2\n.user.User\"E\n\u0019UserBlockedUserDeletedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0017\n\u000fblocked_user_id\u0018\u0002 \u0001(\u0003\"2\n\u0004User\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0003 \u0001(\t\"\u00ab\u0001\n\u0012EndpointProperties\u0012\u0016\n\u000eapplication_id\u0018\u0001 \u0001(\u0005\u0012\u0012\n\nactivities\u0018\u0002 \u0003(\t\u00128\n\bmetadata\u0018\u0003 \u0003(\u000b2&.user.EndpointProperties.MetadataEntry\u001a/\n\rMetadataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"j\n\u0006Friend\u0012\u0018\n\u0004user\u0018\u0001 \u0001(\u000b2\n.user.User\u0012!\n\u0005group\u0018\u0002 \u0001(\u000b2\u0012.user.Friend.Group\u0012\f\n\u0004note\u0018\u0003 \u0001(\t\u001a\u0015\n\u0005Group\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"&\n\bUserList\u0012\u001a\n\u0006values\u0018\u0001 \u0003(\u000b2\n.user.User\"*\n\nFriendList\u0012\u001c\n\u0006values\u0018\u0001 \u0003(\u000b2\f.user.Friend\"5\n\u000fFriendGroupList\u0012\"\n\u0006values\u0018\u0001 \u0003(\u000b2\u0012.user.Friend.Group*'\n\fUserPresence\u0012\n\n\u0006Online\u0010\u0000\u0012\u000b\n\u0007Offline\u0010\u0001*/\n\nUserStatus\u0012\r\n\tAvailable\u0010\u0000\u0012\b\n\u0004Away\u0010\u0001\u0012\b\n\u0004Busy\u0010\u0002B/\n-com.ankama.wakfu.chat.endpoint.spin2.protocolb\u0006proto3"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        ew = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(0);
        ex = new GeneratedMessageV3.FieldAccessorTable(ew, new String[]{"UserId", "Status"});
        ey = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(1);
        ez = new GeneratedMessageV3.FieldAccessorTable(ey, new String[]{"UserId", "Properties"});
        eA = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(2);
        eB = new GeneratedMessageV3.FieldAccessorTable(eA, new String[]{"UserId"});
        eC = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(3);
        eD = new GeneratedMessageV3.FieldAccessorTable(eC, new String[]{"UserId", "Friend"});
        eE = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(4);
        eF = new GeneratedMessageV3.FieldAccessorTable(eE, new String[]{"UserId"});
        eG = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(5);
        eH = new GeneratedMessageV3.FieldAccessorTable(eG, new String[]{"UserId", "FriendUserId"});
        eI = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(6);
        eJ = new GeneratedMessageV3.FieldAccessorTable(eI, new String[]{"UserId"});
        eK = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(7);
        eL = new GeneratedMessageV3.FieldAccessorTable(eK, new String[]{"UserId", "Group"});
        eM = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(8);
        eN = new GeneratedMessageV3.FieldAccessorTable(eM, new String[]{"UserId", "Name"});
        eO = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(9);
        eP = new GeneratedMessageV3.FieldAccessorTable(eO, new String[]{"UserId"});
        eQ = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(10);
        eR = new GeneratedMessageV3.FieldAccessorTable(eQ, new String[]{"UserId", "BlockedUserId"});
        eS = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(11);
        eT = new GeneratedMessageV3.FieldAccessorTable(eS, new String[]{"UserId", "BlockedUserId"});
        eU = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(12);
        eV = new GeneratedMessageV3.FieldAccessorTable(eU, new String[]{"UserId", "Presence"});
        eW = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(13);
        eX = new GeneratedMessageV3.FieldAccessorTable(eW, new String[]{"UserId", "Status"});
        eY = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(14);
        eZ = new GeneratedMessageV3.FieldAccessorTable(eY, new String[]{"UserId", "Properties"});
        fa = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(15);
        fb = new GeneratedMessageV3.FieldAccessorTable(fa, new String[]{"UserId", "Friend"});
        fc = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(16);
        fd = new GeneratedMessageV3.FieldAccessorTable(fc, new String[]{"UserId", "Friend"});
        fe = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(17);
        ff = new GeneratedMessageV3.FieldAccessorTable(fe, new String[]{"UserId", "FriendUserId"});
        fg = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(18);
        fh = new GeneratedMessageV3.FieldAccessorTable(fg, new String[]{"UserId", "Group"});
        fi = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(19);
        fj = new GeneratedMessageV3.FieldAccessorTable(fi, new String[]{"UserId", "Name"});
        fk = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(20);
        fl = new GeneratedMessageV3.FieldAccessorTable(fk, new String[]{"UserId", "BlockedUser"});
        fm = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(21);
        fn = new GeneratedMessageV3.FieldAccessorTable(fm, new String[]{"UserId", "BlockedUserId"});
        fo = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(22);
        fp = new GeneratedMessageV3.FieldAccessorTable(fo, new String[]{"UserId", "Name", "Tag"});
        fq = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(23);
        fr = new GeneratedMessageV3.FieldAccessorTable(fq, new String[]{"ApplicationId", "Activities", "Metadata"});
        fs = (Descriptors.Descriptor)fq.getNestedTypes().get(0);
        ft = new GeneratedMessageV3.FieldAccessorTable(fs, new String[]{"Key", "Value"});
        fu = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(24);
        fv = new GeneratedMessageV3.FieldAccessorTable(fu, new String[]{"User", "Group", "Note"});
        fw = (Descriptors.Descriptor)fu.getNestedTypes().get(0);
        fx = new GeneratedMessageV3.FieldAccessorTable(fw, new String[]{"Name"});
        fy = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(25);
        fz = new GeneratedMessageV3.FieldAccessorTable(fy, new String[]{"Values"});
        fA = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(26);
        fB = new GeneratedMessageV3.FieldAccessorTable(fA, new String[]{"Values"});
        fC = (Descriptors.Descriptor)ae_1.j().getMessageTypes().get(27);
        fD = new GeneratedMessageV3.FieldAccessorTable(fC, new String[]{"Values"});
    }
}

