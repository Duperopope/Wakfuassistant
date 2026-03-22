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

public final class ok {
    static final Descriptors.Descriptor Qv;
    static final GeneratedMessageV3.FieldAccessorTable Qw;
    static final Descriptors.Descriptor Qx;
    static final GeneratedMessageV3.FieldAccessorTable Qy;
    static final Descriptors.Descriptor Qz;
    static final GeneratedMessageV3.FieldAccessorTable QA;
    private static Descriptors.FileDescriptor M;

    private ok() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ok.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0012pvpInventory.proto\"C\n\fPvpInventory\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012 \n\u0005items\u0018\u0002 \u0001(\u000b2\u0011.InventoryContent\"\u0098\u0001\n\u0010InventoryContent\u00123\n\u0007content\u0018\u0001 \u0003(\u000b2\".InventoryContent.InventoryElement\u001aO\n\u0010InventoryElement\u0012\u0014\n\u0006locked\u0018\u0001 \u0001(\b:\u0004true\u0012\u0013\n\u000breferenceId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bquantity\u0018\u0003 \u0002(\u0005B5\n\u001dcom.ankama.wakfu.protocol.pvpB\u0014ProtobufPvpInventory"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        Qv = (Descriptors.Descriptor)ok.j().getMessageTypes().get(0);
        Qw = new GeneratedMessageV3.FieldAccessorTable(Qv, new String[]{"AccountId", "Items"});
        Qx = (Descriptors.Descriptor)ok.j().getMessageTypes().get(1);
        Qy = new GeneratedMessageV3.FieldAccessorTable(Qx, new String[]{"Content"});
        Qz = (Descriptors.Descriptor)Qx.getNestedTypes().get(0);
        QA = new GeneratedMessageV3.FieldAccessorTable(Qz, new String[]{"Locked", "ReferenceId", "Quantity"});
    }
}

