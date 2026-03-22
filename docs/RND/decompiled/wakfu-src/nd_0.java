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
 * Renamed from nD
 */
public final class nd_0 {
    static final Descriptors.Descriptor NZ;
    static final GeneratedMessageV3.FieldAccessorTable Oa;
    static final Descriptors.Descriptor Ob;
    private static final GeneratedMessageV3.FieldAccessorTable Oc;
    private static Descriptors.FileDescriptor M;

    private nd_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        nd_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001bmoderationPlayerInfos.proto\"\u00b1\u0006\n\u0010ProtoPlayerInfos\u0012\f\n\u0004name\u0018\u0001 \u0002(\t\u0012\u0011\n\taccountId\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bcharacterId\u0018\u0003 \u0002(\u0003\u0012\u0015\n\u0006online\u0018\u0004 \u0001(\b:\u0005false\u0012\u0018\n\nankamaName\u0018\u0005 \u0001(\t:\u0004null\u0012\u0013\n\tankamaTag\u0018\u0006 \u0001(\t:\u0000\u0012\u0012\n\u0007breedId\u0018\u0007 \u0001(\u0005:\u00010\u0012\u0010\n\u0005level\u0018\b \u0001(\u0005:\u00010\u0012\u0012\n\u0007guildId\u0018\t \u0001(\u0003:\u00010\u0012\u0011\n\u0006worldX\u0018\n \u0001(\u0005:\u00010\u0012\u0011\n\u0006worldY\u0018\u000b \u0001(\u0005:\u00010\u0012\u0011\n\u0006worldZ\u0018\f \u0001(\u0005:\u00010\u0012\u0015\n\ninstanceId\u0018\r \u0001(\u0003:\u00010\u0012\u0018\n\ngameServer\u0018\u000e \u0001(\t:\u0004null\u0012\u0013\n\brespawnX\u0018\u000f \u0001(\u0005:\u00010\u0012\u0013\n\brespawnY\u0018\u0010 \u0001(\u0005:\u00010\u0012\u0013\n\brespawnZ\u0018\u0011 \u0001(\u0005:\u00010\u0012\u001c\n\u0011respawnInstanceId\u0018\u0012 \u0001(\u0003:\u00010\u0012\u001f\n\u0011respawnGameServer\u0018\u0013 \u0001(\t:\u0004null\u0012\u001b\n\fvisiblyMuted\u0018\u0014 \u0001(\b:\u0005false\u0012\u001d\n\u0013visiblyMutedEndDate\u0018\u0015 \u0001(\t:\u0000\u0012\u001a\n\u000bhiddenMuted\u0018\u0016 \u0001(\b:\u0005false\u0012\u001c\n\u0012hiddenMutedEndDate\u0018\u0017 \u0001(\t:\u0000\u0012!\n\u0012languageRestricted\u0018\u0018 \u0001(\b:\u0005false\u0012!\n\u0015characterCreationDate\u0018\u0019 \u0001(\u0003:\u0002-1\u0012!\n\u0015characterLastSaveDate\u0018\u001a \u0001(\u0003:\u0002-1\u0012\u001c\n\u0011subscriptionLevel\u0018\u001b \u0001(\u0005:\u00010\u0012\u0015\n\ttotalCash\u0018\u001c \u0001(\u0003:\u0002-1\u00127\n\u000bcraftsLevel\u0018\u001d \u0003(\u000b2\".ProtoPlayerInfos.CraftsLevelEntry\u001a2\n\u0010CraftsLevelEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0005:\u00028\u0001BF\n/com.ankama.wakfu.protocol.moderationPlayerInfosB\u0013ProtobufPlayerInfos"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        NZ = (Descriptors.Descriptor)nd_0.j().getMessageTypes().get(0);
        Oa = new GeneratedMessageV3.FieldAccessorTable(NZ, new String[]{"Name", "AccountId", "CharacterId", "Online", "AnkamaName", "AnkamaTag", "BreedId", "Level", "GuildId", "WorldX", "WorldY", "WorldZ", "InstanceId", "GameServer", "RespawnX", "RespawnY", "RespawnZ", "RespawnInstanceId", "RespawnGameServer", "VisiblyMuted", "VisiblyMutedEndDate", "HiddenMuted", "HiddenMutedEndDate", "LanguageRestricted", "CharacterCreationDate", "CharacterLastSaveDate", "SubscriptionLevel", "TotalCash", "CraftsLevel"});
        Ob = (Descriptors.Descriptor)NZ.getNestedTypes().get(0);
        Oc = new GeneratedMessageV3.FieldAccessorTable(Ob, new String[]{"Key", "Value"});
    }
}

