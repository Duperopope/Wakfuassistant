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
 * Renamed from kw
 */
public final class kw_2 {
    static final Descriptors.Descriptor Fy;
    static final GeneratedMessageV3.FieldAccessorTable Fz;
    static final Descriptors.Descriptor FA;
    static final GeneratedMessageV3.FieldAccessorTable FB;
    private static Descriptors.FileDescriptor M;

    private kw_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        kw_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001bhavenworld/havenworld.proto\"O\n\u0014ProtoHavenWorldLight\u0012\u000f\n\u0007guildId\u0018\u0002 \u0001(\u0003\u0012\u0013\n\u000bguildBlazon\u0018\u0003 \u0001(\u0003\u0012\u0011\n\tguildName\u0018\u0004 \u0001(\t\"E\n\u0018ProtoHavenWorldLightList\u0012)\n\nhavenWorld\u0018\u0001 \u0003(\u000b2\u0015.ProtoHavenWorldLightB:\n$com.ankama.wakfu.protocol.havenworldB\u0012ProtobufHavenWorld"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        Fy = (Descriptors.Descriptor)kw_2.j().getMessageTypes().get(0);
        Fz = new GeneratedMessageV3.FieldAccessorTable(Fy, new String[]{"GuildId", "GuildBlazon", "GuildName"});
        FA = (Descriptors.Descriptor)kw_2.j().getMessageTypes().get(1);
        FB = new GeneratedMessageV3.FieldAccessorTable(FA, new String[]{"HavenWorld"});
    }
}

