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
 * Renamed from lS
 */
public final class ls_1 {
    static final Descriptors.Descriptor Jm;
    static final GeneratedMessageV3.FieldAccessorTable Jn;
    static final Descriptors.Descriptor Jo;
    static final GeneratedMessageV3.FieldAccessorTable Jp;
    private static Descriptors.FileDescriptor M;

    private ls_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ls_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u000bchest.proto\u001a\nitem.proto\"+\n\u0005Chest\u0012\"\n\fcompartments\u0018\u0001 \u0003(\u000b2\f.Compartment\"\u00ca\u0001\n\u000bCompartment\u0012\u0015\n\rcompartmentId\u0018\u0001 \u0002(\t\u0012\u0011\n\taccountId\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u0012\r\n\u0005color\u0018\u0004 \u0001(\t\u0012\r\n\u0005index\u0018\u0005 \u0001(\u0005\u0012\u0014\n\ffreeCapacity\u0018\u0006 \u0001(\u0005\u0012\u0010\n\bcapacity\u0018\u0007 \u0001(\u0005\u0012\u0012\n\nisReadonly\u0018\b \u0001(\b\u0012)\n\u0005items\u0018\t \u0001(\u000b2\u001a.ProtoItemWithPositionListB5\n$com.ankama.wakfu.protocol.item.chestB\rProtobufChest"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j()});
        Jm = (Descriptors.Descriptor)ls_1.j().getMessageTypes().get(0);
        Jn = new GeneratedMessageV3.FieldAccessorTable(Jm, new String[]{"Compartments"});
        Jo = (Descriptors.Descriptor)ls_1.j().getMessageTypes().get(1);
        Jp = new GeneratedMessageV3.FieldAccessorTable(Jo, new String[]{"CompartmentId", "AccountId", "Name", "Color", "Index", "FreeCapacity", "Capacity", "IsReadonly", "Items"});
        kF.j();
    }
}

