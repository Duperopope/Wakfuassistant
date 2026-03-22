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
 * Renamed from jK
 */
public final class jk_2 {
    static final Descriptors.Descriptor CQ;
    static final GeneratedMessageV3.FieldAccessorTable CR;
    static final Descriptors.Descriptor CS;
    static final GeneratedMessageV3.FieldAccessorTable CT;
    static final Descriptors.Descriptor CU;
    static final GeneratedMessageV3.FieldAccessorTable CV;
    static final Descriptors.Descriptor CW;
    static final GeneratedMessageV3.FieldAccessorTable CX;
    private static Descriptors.FileDescriptor M;

    private jk_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        jk_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0016guild/guildModel.proto\"\u00f6\u0002\n\u000fProtoGuildModel\u0012\u000f\n\u0007guildId\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006blazon\u0018\u0003 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0013\n\u000bdescription\u0018\u0006 \u0002(\t\u0012\u000f\n\u0007message\u0018\u0007 \u0002(\t\u0012\u001a\n\u0012currentGuildPoints\u0018\b \u0002(\u0005\u0012\u0018\n\u0010totalGuildPoints\u0018\t \u0002(\u0005\u0012\u0019\n\u0011weeklyPointsLimit\u0018\n \u0002(\u0005\u0012\u0019\n\u0011earnedPointsLimit\u0018\u000b \u0002(\u0005\u0012\u001c\n\u0014lastEarningPointWeek\u0018\f \u0002(\u0005\u0012\u001e\n\u0005ranks\u0018\r \u0003(\u000b2\u000f.ProtoGuildRank\u0012\"\n\u0007members\u0018\u000e \u0003(\u000b2\u0011.ProtoGuildMember\u0012!\n\u0007bonuses\u0018\u000f \u0003(\u000b2\u0010.ProtoGuildBonusJ\u0004\b\u0004\u0010\u0005R\bnationId\"T\n\u000eProtoGuildRank\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0016\n\u000eauthorizations\u0018\u0003 \u0002(\u0003\u0012\u0010\n\bposition\u0018\u0004 \u0002(\u0005\"\u008c\u0002\n\u0010ProtoGuildMember\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007ownerId\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bguildPoints\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0004 \u0002(\u0003\u0012\n\n\u0002xp\u0018\u0005 \u0002(\u0003\u0012\u0013\n\u000bisConnected\u0018\u0006 \u0002(\b\u0012\u000e\n\u0006smiley\u0018\u0007 \u0002(\f\u0012\u000b\n\u0003sex\u0018\b \u0002(\f\u0012\u000f\n\u0007breedId\u0018\t \u0002(\u0005\u0012\u0010\n\bnationId\u0018\n \u0002(\u0005\u0012\f\n\u0004name\u0018\u000b \u0002(\t\u0012\u0010\n\bsaveDate\u0018\f \u0002(\u0003\u0012\u001b\n\u0013serializedLanguages\u0018\r \u0002(\f\u0012\u001a\n\u0012accountCommunityId\u0018\u000e \u0002(\f\"F\n\u000fProtoGuildBonus\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eactivationDate\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007buyDate\u0018\u0003 \u0002(\u0003B0\n\u001fcom.ankama.wakfu.protocol.guildB\rProtobufGuild"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        CQ = (Descriptors.Descriptor)jk_2.j().getMessageTypes().get(0);
        CR = new GeneratedMessageV3.FieldAccessorTable(CQ, new String[]{"GuildId", "Level", "Blazon", "Name", "Description", "Message", "CurrentGuildPoints", "TotalGuildPoints", "WeeklyPointsLimit", "EarnedPointsLimit", "LastEarningPointWeek", "Ranks", "Members", "Bonuses"});
        CS = (Descriptors.Descriptor)jk_2.j().getMessageTypes().get(1);
        CT = new GeneratedMessageV3.FieldAccessorTable(CS, new String[]{"Id", "Name", "Authorizations", "Position"});
        CU = (Descriptors.Descriptor)jk_2.j().getMessageTypes().get(2);
        CV = new GeneratedMessageV3.FieldAccessorTable(CU, new String[]{"Id", "OwnerId", "GuildPoints", "Rank", "Xp", "IsConnected", "Smiley", "Sex", "BreedId", "NationId", "Name", "SaveDate", "SerializedLanguages", "AccountCommunityId"});
        CW = (Descriptors.Descriptor)jk_2.j().getMessageTypes().get(3);
        CX = new GeneratedMessageV3.FieldAccessorTable(CW, new String[]{"Id", "ActivationDate", "BuyDate"});
    }
}

