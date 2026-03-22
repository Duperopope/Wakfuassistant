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
 * Renamed from zN
 */
public final class zn_2 {
    static final Descriptors.Descriptor aoW;
    static final GeneratedMessageV3.FieldAccessorTable aoX;
    private static Descriptors.FileDescriptor M;

    private zn_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zn_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001aaccountData/tutorial.proto\":\n\bTutorial\u0012\u0018\n\u0010discoveredGuides\u0018\u0001 \u0003(\u0005\u0012\u0014\n\funreadGuides\u0018\u0002 \u0003(\u0005B6\n\"com.ankama.wakfu.protocol.tutorialB\u0010ProtobufTutorial"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        aoW = (Descriptors.Descriptor)zn_2.j().getMessageTypes().get(0);
        aoX = new GeneratedMessageV3.FieldAccessorTable(aoW, new String[]{"DiscoveredGuides", "UnreadGuides"});
    }
}

