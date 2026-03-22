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
 * Renamed from Ma
 */
public final class ma_2 {
    static final Descriptors.Descriptor aRD;
    static final GeneratedMessageV3.FieldAccessorTable aRE;
    static final Descriptors.Descriptor aRF;
    static final GeneratedMessageV3.FieldAccessorTable aRG;
    private static Descriptors.FileDescriptor M;

    private ma_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ma_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\fbasics.proto\"T\n\u0015IdentificationMessage\u0012\u0014\n\fplatformName\u0018\u0001 \u0002(\t\u0012\u0013\n\u000bserviceName\u0018\u0002 \u0002(\t\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005\"Z\n\u001bIdentificationResultMessage\u0012\u0014\n\fplatformName\u0018\u0001 \u0002(\t\u0012\u0013\n\u000bserviceName\u0018\u0002 \u0002(\t\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005B0\n\u001fcom.ankama.wakfu.utils.protobufB\rBasicMessages"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        aRD = (Descriptors.Descriptor)ma_2.j().getMessageTypes().get(0);
        aRE = new GeneratedMessageV3.FieldAccessorTable(aRD, new String[]{"PlatformName", "ServiceName", "ServerId"});
        aRF = (Descriptors.Descriptor)ma_2.j().getMessageTypes().get(1);
        aRG = new GeneratedMessageV3.FieldAccessorTable(aRF, new String[]{"PlatformName", "ServiceName", "ServerId"});
    }
}

