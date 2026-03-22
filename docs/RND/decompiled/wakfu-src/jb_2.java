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
 * Renamed from jB
 */
public final class jb_2 {
    static final Descriptors.Descriptor CE;
    static final GeneratedMessageV3.FieldAccessorTable CF;
    static final Descriptors.Descriptor CG;
    static final GeneratedMessageV3.FieldAccessorTable CH;
    private static Descriptors.FileDescriptor M;

    private jb_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        jb_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001caccountData/furnitures.proto\"\u0017\n\tFurniture\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"/\n\u0012FurnitureInventory\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.FurnitureB8\n#com.ankama.wakfu.protocol.furnitureB\u0011ProtobufFurniture"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        CE = (Descriptors.Descriptor)jb_2.j().getMessageTypes().get(0);
        CF = new GeneratedMessageV3.FieldAccessorTable(CE, new String[]{"Id"});
        CG = (Descriptors.Descriptor)jb_2.j().getMessageTypes().get(1);
        CH = new GeneratedMessageV3.FieldAccessorTable(CG, new String[]{"Items"});
    }
}

