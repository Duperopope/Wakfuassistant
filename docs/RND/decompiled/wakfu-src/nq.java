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

public final class nq {
    static final Descriptors.Descriptor Nt;
    static final GeneratedMessageV3.FieldAccessorTable Nu;
    static final Descriptors.Descriptor Nv;
    static final GeneratedMessageV3.FieldAccessorTable Nw;
    static final Descriptors.Descriptor Nx;
    static final GeneratedMessageV3.FieldAccessorTable Ny;
    private static Descriptors.FileDescriptor M;

    private nq() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        nq.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001amoderationGuildInfos.proto\"\u00be\u0001\n\u000fProtoGuildInfos\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0013\n\u000bdescription\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007message\u0018\u0004 \u0002(\t\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\u0012\u000e\n\u0006blazon\u0018\u0006 \u0002(\u0003\u0012#\n\u0005ranks\u0018\u0007 \u0003(\u000b2\u0014.ProtoGuildRankInfos\u0012'\n\u0007members\u0018\b \u0003(\u000b2\u0016.ProtoGuildMemberInfos\"A\n\u0013ProtoGuildRankInfos\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\"c\n\u0015ProtoGuildMemberInfos\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\u0012\n\naccount_id\u0018\u0002 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\f\n\u0004rank\u0018\u0004 \u0002(\u0003\u0012\u000e\n\u0006online\u0018\u0005 \u0002(\bBD\n.com.ankama.wakfu.protocol.moderationGuildInfosB\u0012ProtobufGuildInfos"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        Nt = (Descriptors.Descriptor)nq.j().getMessageTypes().get(0);
        Nu = new GeneratedMessageV3.FieldAccessorTable(Nt, new String[]{"Id", "Name", "Description", "Message", "Level", "Blazon", "Ranks", "Members"});
        Nv = (Descriptors.Descriptor)nq.j().getMessageTypes().get(1);
        Nw = new GeneratedMessageV3.FieldAccessorTable(Nv, new String[]{"Id", "Name", "Position"});
        Nx = (Descriptors.Descriptor)nq.j().getMessageTypes().get(2);
        Ny = new GeneratedMessageV3.FieldAccessorTable(Nx, new String[]{"Id", "AccountId", "Name", "Rank", "Online"});
    }
}

