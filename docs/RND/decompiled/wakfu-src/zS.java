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

public final class zS {
    static final Descriptors.Descriptor apf;
    static final GeneratedMessageV3.FieldAccessorTable apg;
    static final Descriptors.Descriptor aph;
    static final GeneratedMessageV3.FieldAccessorTable api;
    static final Descriptors.Descriptor apj;
    static final GeneratedMessageV3.FieldAccessorTable apk;
    static final Descriptors.Descriptor apl;
    static final GeneratedMessageV3.FieldAccessorTable apm;
    static final Descriptors.Descriptor apn;
    static final GeneratedMessageV3.FieldAccessorTable apo;
    static final Descriptors.Descriptor app;
    static final GeneratedMessageV3.FieldAccessorTable apq;
    static final Descriptors.Descriptor apr;
    static final GeneratedMessageV3.FieldAccessorTable aps;
    static final Descriptors.Descriptor apt;
    static final GeneratedMessageV3.FieldAccessorTable apu;
    static final Descriptors.Descriptor apv;
    static final GeneratedMessageV3.FieldAccessorTable apw;
    static final Descriptors.Descriptor apx;
    static final GeneratedMessageV3.FieldAccessorTable apy;
    static final Descriptors.Descriptor apz;
    static final GeneratedMessageV3.FieldAccessorTable apA;
    static final Descriptors.Descriptor apB;
    static final GeneratedMessageV3.FieldAccessorTable apC;
    static final Descriptors.Descriptor apD;
    static final GeneratedMessageV3.FieldAccessorTable apE;
    private static Descriptors.FileDescriptor M;

    private zS() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zS.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\rrewards.proto\u001a\nitem.proto\"\u00a2\u0001\n\u0011AddRewardsMessage\u0012;\n\u0007rewards\u0018\u0001 \u0003(\u000b2*.AddRewardsMessage.RewardsAccountContainer\u001aP\n\u0017RewardsAccountContainer\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\"\n\u0007rewards\u0018\u0002 \u0002(\u000b2\u0011.RewardsContainer\"=\n\u0015ConsultRewardsMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bcharacterId\u0018\u0002 \u0001(\u0003\"I\n\u001bConsultRewardsResultMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0019\n\u0007rewards\u0018\u0002 \u0002(\u000b2\b.Rewards\"c\n\u0014ConsumeRewardMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bcontainerId\u0018\u0002 \u0002(\t\u0012\u0010\n\brewardId\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bcharacterId\u0018\u0004 \u0001(\u0003\"\u00ac\u0001\n\u0018ConsumeAllRewardsMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bcharacterId\u0018\u0002 \u0002(\u0003\u0012&\n\ncategories\u0018\u0003 \u0003(\u000e2\u0012.RewardsCategories\u0012\u001c\n\u0005types\u0018\u0004 \u0003(\u000e2\r.RewardsTypes\u0012\r\n\u0005limit\u0018\u0005 \u0001(\u0005\u0012\u0015\n\rcharacterOnly\u0018\u0006 \u0002(\b\"h\n\u001aConsumeRewardResultMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012$\n\tcontainer\u0018\u0002 \u0002(\u000b2\u0011.RewardsContainer\u0012\u0013\n\u000bcharacterId\u0018\u0003 \u0001(\u0003\"&\n\u0013ClearRewardsMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\"-\n\u0007Rewards\u0012\"\n\u0007rewards\u0018\u0001 \u0003(\u000b2\u0011.RewardsContainer\"\u00b6\u0001\n\u0010RewardsContainer\u0012\u0012\n\u0006OLD_id\u0018\u0001 \u0001(\u0003B\u0002\u0018\u0001\u0012'\n\u000bdescription\u0018\u0002 \u0002(\u000b2\u0012.ContainerMetadata\u0012\u001f\n\nitemReward\u0018\u0003 \u0003(\u000b2\u000b.ItemReward\u0012\u0013\n\u000bcharacterId\u0018\u0004 \u0001(\u0003\u0012!\n\fotherRewards\u0018\u0005 \u0003(\u000b2\u000b.BaseReward\u0012\f\n\u0004uuid\u0018\u0006 \u0001(\t\"8\n\nItemReward\u0012\r\n\u0005refId\u0018\u0001 \u0001(\u0005\u0012\u001b\n\u0006reward\u0018\u0002 \u0001(\u000b2\u000b.BaseReward\"w\n\nBaseReward\u0012\u0012\n\u0006OLD_id\u0018\u0001 \u0001(\u0003B\u0002\u0018\u0001\u0012\u001b\n\u0004type\u0018\u0002 \u0002(\u000e2\r.RewardsTypes\u0012\u0010\n\bquantity\u0018\u0004 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0005 \u0001(\u000b2\n.ProtoItem\u0012\f\n\u0004uuid\u0018\u0006 \u0001(\t\"O\n\u0011ContainerMetadata\u0012$\n\bcategory\u0018\u0001 \u0002(\u000e2\u0012.RewardsCategories\u0012\u0014\n\fseasonNumber\u0018\u0002 \u0001(\u0005*X\n\u0011RewardsCategories\u0012\u0012\n\u000eDUNGEON_LADDER\u0010\u0001\u0012\u0010\n\fBATTLEGROUND\u0010\u0002\u0012\u000b\n\u0007COMMAND\u0010\u0003\u0012\u0010\n\fOGRINE_TOKEN\u0010\u0004*D\n\fRewardsTypes\u0012\b\n\u0004ITEM\u0010\u0001\u0012\u0006\n\u0002XP\u0010\u0002\u0012\t\n\u0005MERIT\u0010\u0003\u0012\r\n\tGLORY_ORB\u0010\u0004\u0012\b\n\u0004KAMA\u0010\u0005B4\n!com.ankama.wakfu.rewards.protocolB\u000fRewardsProtocol"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j()});
        apf = (Descriptors.Descriptor)zS.j().getMessageTypes().get(0);
        apg = new GeneratedMessageV3.FieldAccessorTable(apf, new String[]{"Rewards"});
        aph = (Descriptors.Descriptor)apf.getNestedTypes().get(0);
        api = new GeneratedMessageV3.FieldAccessorTable(aph, new String[]{"AccountId", "Rewards"});
        apj = (Descriptors.Descriptor)zS.j().getMessageTypes().get(1);
        apk = new GeneratedMessageV3.FieldAccessorTable(apj, new String[]{"OwnerId", "CharacterId"});
        apl = (Descriptors.Descriptor)zS.j().getMessageTypes().get(2);
        apm = new GeneratedMessageV3.FieldAccessorTable(apl, new String[]{"OwnerId", "Rewards"});
        apn = (Descriptors.Descriptor)zS.j().getMessageTypes().get(3);
        apo = new GeneratedMessageV3.FieldAccessorTable(apn, new String[]{"OwnerId", "ContainerId", "RewardId", "CharacterId"});
        app = (Descriptors.Descriptor)zS.j().getMessageTypes().get(4);
        apq = new GeneratedMessageV3.FieldAccessorTable(app, new String[]{"OwnerId", "CharacterId", "Categories", "Types", "Limit", "CharacterOnly"});
        apr = (Descriptors.Descriptor)zS.j().getMessageTypes().get(5);
        aps = new GeneratedMessageV3.FieldAccessorTable(apr, new String[]{"OwnerId", "Container", "CharacterId"});
        apt = (Descriptors.Descriptor)zS.j().getMessageTypes().get(6);
        apu = new GeneratedMessageV3.FieldAccessorTable(apt, new String[]{"OwnerId"});
        apv = (Descriptors.Descriptor)zS.j().getMessageTypes().get(7);
        apw = new GeneratedMessageV3.FieldAccessorTable(apv, new String[]{"Rewards"});
        apx = (Descriptors.Descriptor)zS.j().getMessageTypes().get(8);
        apy = new GeneratedMessageV3.FieldAccessorTable(apx, new String[]{"OLDId", "Description", "ItemReward", "CharacterId", "OtherRewards", "Uuid"});
        apz = (Descriptors.Descriptor)zS.j().getMessageTypes().get(9);
        apA = new GeneratedMessageV3.FieldAccessorTable(apz, new String[]{"RefId", "Reward"});
        apB = (Descriptors.Descriptor)zS.j().getMessageTypes().get(10);
        apC = new GeneratedMessageV3.FieldAccessorTable(apB, new String[]{"OLDId", "Type", "Quantity", "Item", "Uuid"});
        apD = (Descriptors.Descriptor)zS.j().getMessageTypes().get(11);
        apE = new GeneratedMessageV3.FieldAccessorTable(apD, new String[]{"Category", "SeasonNumber"});
        kF.j();
    }
}

