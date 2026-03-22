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
 * Renamed from hC
 */
public final class hc_0 {
    static final Descriptors.Descriptor vs;
    static final GeneratedMessageV3.FieldAccessorTable vt;
    static final Descriptors.Descriptor vu;
    static final GeneratedMessageV3.FieldAccessorTable vv;
    private static Descriptors.FileDescriptor M;

    private hc_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        hc_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0018accountData/emotes.proto\"\u0013\n\u0005Emote\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\" \n\u0006Emotes\u0012\u0016\n\u0006emotes\u0018\u0001 \u0003(\u000b2\u0006.EmoteB2\n com.ankama.wakfu.protocol.emotesB\u000eProtobufEmotes"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        vs = (Descriptors.Descriptor)hc_0.j().getMessageTypes().get(0);
        vt = new GeneratedMessageV3.FieldAccessorTable(vs, new String[]{"Id"});
        vu = (Descriptors.Descriptor)hc_0.j().getMessageTypes().get(1);
        vv = new GeneratedMessageV3.FieldAccessorTable(vu, new String[]{"Emotes"});
    }
}

