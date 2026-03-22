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
 * Renamed from gC
 */
public final class gc_0 {
    static final Descriptors.Descriptor sx;
    static final GeneratedMessageV3.FieldAccessorTable sy;
    static final Descriptors.Descriptor sz;
    static final GeneratedMessageV3.FieldAccessorTable sA;
    private static Descriptors.FileDescriptor M;

    private gc_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gc_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013downscalingHP.proto\"F\n\u0012ProtoDownscalingHP\u00120\n\ncharacters\u0018\u0001 \u0003(\u000b2\u001c.ProtoDownscalingHPCharacter\"Q\n\u001bProtoDownscalingHPCharacter\u0012\u000e\n\u0006charId\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007hpValue\u0018\u0002 \u0002(\u0005\u0012\u0011\n\ttimestamp\u0018\u0003 \u0002(\u0003B@\n'com.ankama.wakfu.protocol.downscalingHPB\u0015ProtobufDownscalingHP"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        sx = (Descriptors.Descriptor)gc_0.j().getMessageTypes().get(0);
        sy = new GeneratedMessageV3.FieldAccessorTable(sx, new String[]{"Characters"});
        sz = (Descriptors.Descriptor)gc_0.j().getMessageTypes().get(1);
        sA = new GeneratedMessageV3.FieldAccessorTable(sz, new String[]{"CharId", "HpValue", "Timestamp"});
    }
}

