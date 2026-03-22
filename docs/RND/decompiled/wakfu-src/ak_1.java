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
 * Renamed from ak
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ak_1 {
    static final Descriptors.Descriptor dl;
    static final GeneratedMessageV3.FieldAccessorTable dm;
    static final Descriptors.Descriptor dn;
    static final GeneratedMessageV3.FieldAccessorTable do;
    static final Descriptors.Descriptor dp;
    static final GeneratedMessageV3.FieldAccessorTable dq;
    static final Descriptors.Descriptor dr;
    static final GeneratedMessageV3.FieldAccessorTable ds;
    private static Descriptors.FileDescriptor M;

    private ak_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ak_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u000ftransport.proto\u0012\ttransport\"\u00eb\u0003\n\u0005Frame\u0012+\n\u0007request\u0018\u0001 \u0001(\u000b2\u0018.transport.Frame.RequestH\u0000\u0012-\n\bresponse\u0018\u0002 \u0001(\u000b2\u0019.transport.Frame.ResponseH\u0000\u0012)\n\u0005event\u0018\u0003 \u0001(\u000b2\u0018.transport.Frame.PayloadH\u0000\u001a#\n\u0007Payload\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004data\u0018\u0002 \u0001(\f\u001aL\n\u0007Request\u0012\u0016\n\u000ecorrelation_id\u0018\u0001 \u0001(\u0005\u0012)\n\u0007payload\u0018\u0002 \u0001(\u000b2\u0018.transport.Frame.Payload\u001a\u00dc\u0001\n\bResponse\u0012\u0016\n\u000ecorrelation_id\u0018\u0001 \u0001(\u0005\u00120\n\u0006status\u0018\u0002 \u0001(\u000e2 .transport.Frame.Response.Status\u0012)\n\u0007payload\u0018\u0003 \u0001(\u000b2\u0018.transport.Frame.Payload\"[\n\u0006Status\u0012\u000b\n\u0007Unknown\u0010\u0000\u0012\u000b\n\u0007Success\u0010\u0001\u0012\r\n\tForbidden\u0010\u0002\u0012\u000e\n\nBadRequest\u0010\u0003\u0012\u000b\n\u0007Timeout\u0010\u0004\u0012\u000b\n\u0007Failure\u0010\u0005B\t\n\u0007contentB/\n-com.ankama.wakfu.chat.endpoint.spin2.protocolb\u0006proto3"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        dl = (Descriptors.Descriptor)ak_1.j().getMessageTypes().get(0);
        dm = new GeneratedMessageV3.FieldAccessorTable(dl, new String[]{"Request", "Response", "Event", "Content"});
        dn = (Descriptors.Descriptor)dl.getNestedTypes().get(0);
        do = new GeneratedMessageV3.FieldAccessorTable(dn, new String[]{"Id", "Data"});
        dp = (Descriptors.Descriptor)dl.getNestedTypes().get(1);
        dq = new GeneratedMessageV3.FieldAccessorTable(dp, new String[]{"CorrelationId", "Payload"});
        dr = (Descriptors.Descriptor)dl.getNestedTypes().get(2);
        ds = new GeneratedMessageV3.FieldAccessorTable(dr, new String[]{"CorrelationId", "Status", "Payload"});
    }
}

