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
 * Renamed from cW
 */
public final class cw_1 {
    static final Descriptors.Descriptor jd;
    static final GeneratedMessageV3.FieldAccessorTable je;
    static final Descriptors.Descriptor jf;
    static final GeneratedMessageV3.FieldAccessorTable jg;
    private static Descriptors.FileDescriptor M;

    private cw_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        cw_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\"accountData/accountInventory.proto\"9\n\u0015ProtoAccountInventory\u0012 \n\u0005items\u0018\u0001 \u0003(\u000b2\u0011.ProtoAccountItem\"0\n\u0010ProtoAccountItem\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\u0010\n\bquantity\u0018\u0002 \u0002(\rBA\n%com.ankama.wakfu.protocol.accountDataB\u0018ProtobufAccountInventory"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        jd = (Descriptors.Descriptor)cw_1.j().getMessageTypes().get(0);
        je = new GeneratedMessageV3.FieldAccessorTable(jd, new String[]{"Items"});
        jf = (Descriptors.Descriptor)cw_1.j().getMessageTypes().get(1);
        jg = new GeneratedMessageV3.FieldAccessorTable(jf, new String[]{"Id", "Quantity"});
    }
}

