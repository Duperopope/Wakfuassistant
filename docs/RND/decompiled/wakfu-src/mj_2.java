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
 * Renamed from Mj
 */
public final class mj_2 {
    static final Descriptors.Descriptor aRV;
    static final GeneratedMessageV3.FieldAccessorTable aRW;
    private static Descriptors.FileDescriptor M;

    private mj_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mj_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\rwrapper.proto\"-\n\u0007Wrapper\u0012\f\n\u0004guid\u0018\u0001 \u0002(\u0012\u0012\u0014\n\finnerMessage\u0018\u0002 \u0002(\fB1\n\u001fcom.ankama.wakfu.utils.protobufB\u000eMessageWrapper"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        aRV = (Descriptors.Descriptor)mj_2.j().getMessageTypes().get(0);
        aRW = new GeneratedMessageV3.FieldAccessorTable(aRV, new String[]{"Guid", "InnerMessage"});
    }
}

