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
 * Renamed from zC
 */
public final class zc_2 {
    static final Descriptors.Descriptor aoy;
    static final GeneratedMessageV3.FieldAccessorTable aoz;
    static final Descriptors.Descriptor aoA;
    static final GeneratedMessageV3.FieldAccessorTable aoB;
    private static Descriptors.FileDescriptor M;

    private zc_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zc_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u001caccountData/transports.proto\"9\n\u000eTransportation\u0012'\n\u000fknownTransports\u0018\u0001 \u0003(\u000b2\u000e.TravelDetails\"?\n\rTravelDetails\u0012\u001c\n\u0004type\u0018\u0001 \u0002(\u000e2\u000e.TransportType\u0012\u0010\n\bknownIds\u0018\u0002 \u0003(\u0005*$\n\rTransportType\u0012\b\n\u0004ZAAP\u0010\u0001\u0012\t\n\u0005DRAGO\u0010\u0002B=\n#com.ankama.wakfu.protocol.transportB\u0016ProtobufTransportation"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        aoy = (Descriptors.Descriptor)zc_2.j().getMessageTypes().get(0);
        aoz = new GeneratedMessageV3.FieldAccessorTable(aoy, new String[]{"KnownTransports"});
        aoA = (Descriptors.Descriptor)zc_2.j().getMessageTypes().get(1);
        aoB = new GeneratedMessageV3.FieldAccessorTable(aoA, new String[]{"Type", "KnownIds"});
    }
}

