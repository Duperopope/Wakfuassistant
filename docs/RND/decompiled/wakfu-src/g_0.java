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
 * Renamed from g
 */
public final class g_0 {
    static final Descriptors.Descriptor C;
    static final GeneratedMessageV3.FieldAccessorTable D;
    static final Descriptors.Descriptor E;
    static final GeneratedMessageV3.FieldAccessorTable F;
    static final Descriptors.Descriptor G;
    static final GeneratedMessageV3.FieldAccessorTable H;
    static final Descriptors.Descriptor I;
    static final GeneratedMessageV3.FieldAccessorTable J;
    static final Descriptors.Descriptor K;
    static final GeneratedMessageV3.FieldAccessorTable L;
    private static Descriptors.FileDescriptor M;

    private g_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        g_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\rchannel.proto\u0012\u0007channel\u001a\nuser.proto\"V\n\u0017CreateChannelMessageCmd\u0012\u0012\n\nchannel_id\u0018\u0001 \u0001(\t\u0012\u0016\n\u000eauthor_user_id\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007content\u0018\u0003 \u0001(\t\"k\n\u0016ListChannelMessagesCmd\u0012\u0012\n\nchannel_id\u0018\u0001 \u0001(\t\u0012\r\n\u0005limit\u0018\u0002 \u0001(\u0005\u0012\u0010\n\u0006before\u0018\u0003 \u0001(\tH\u0000\u0012\u000f\n\u0005after\u0018\u0004 \u0001(\tH\u0000B\u000b\n\tdirection\"D\n\u0018ChannelMessageCreatedEvt\u0012(\n\u0007message\u0018\u0001 \u0001(\u000b2\u0017.channel.ChannelMessage\"\u0080\u0001\n\u000eChannelMessage\u0012\u0012\n\nmessage_id\u0018\u0001 \u0001(\t\u0012\u0012\n\nchannel_id\u0018\u0002 \u0001(\t\u0012\u0019\n\u0011created_timestamp\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u001a\n\u0006author\u0018\u0005 \u0001(\u000b2\n.user.User\"=\n\u0012ChannelMessageList\u0012'\n\u0006values\u0018\u0001 \u0003(\u000b2\u0017.channel.ChannelMessageB/\n-com.ankama.wakfu.chat.endpoint.spin2.protocolb\u0006proto3"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{ae_1.j()});
        C = (Descriptors.Descriptor)g_0.j().getMessageTypes().get(0);
        D = new GeneratedMessageV3.FieldAccessorTable(C, new String[]{"ChannelId", "AuthorUserId", "Content"});
        E = (Descriptors.Descriptor)g_0.j().getMessageTypes().get(1);
        F = new GeneratedMessageV3.FieldAccessorTable(E, new String[]{"ChannelId", "Limit", "Before", "After", "Direction"});
        G = (Descriptors.Descriptor)g_0.j().getMessageTypes().get(2);
        H = new GeneratedMessageV3.FieldAccessorTable(G, new String[]{"Message"});
        I = (Descriptors.Descriptor)g_0.j().getMessageTypes().get(3);
        J = new GeneratedMessageV3.FieldAccessorTable(I, new String[]{"MessageId", "ChannelId", "CreatedTimestamp", "Content", "Author"});
        K = (Descriptors.Descriptor)g_0.j().getMessageTypes().get(4);
        L = new GeneratedMessageV3.FieldAccessorTable(K, new String[]{"Values"});
        ae_1.j();
    }
}

