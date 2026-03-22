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
 * Renamed from nJ
 */
public final class nj_2 {
    static final Descriptors.Descriptor Pg;
    static final GeneratedMessageV3.FieldAccessorTable Ph;
    static final Descriptors.Descriptor Pi;
    private static final GeneratedMessageV3.FieldAccessorTable Pj;
    static final Descriptors.Descriptor Pk;
    static final GeneratedMessageV3.FieldAccessorTable Pl;
    static final Descriptors.Descriptor Pm;
    static final GeneratedMessageV3.FieldAccessorTable Pn;
    private static Descriptors.FileDescriptor M;

    private nj_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        nj_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\raccount.proto\"\\\n\u0006Status\u0012#\n\u0006status\u0018\u0001 \u0003(\u000b2\u0013.Status.StatusEntry\u001a-\n\u000bStatusEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"-\n\u0018AccountConnectionMessage\u0012\u0011\n\taccountId\u0018\u0002 \u0002(\u0003\"0\n\u001bAccountDisconnectionMessage\u0012\u0011\n\taccountId\u0018\u0002 \u0002(\u0003B-\n\"com.ankama.wakfu.protocol.protobufB\u0007Account"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        Pg = (Descriptors.Descriptor)nj_2.j().getMessageTypes().get(0);
        Ph = new GeneratedMessageV3.FieldAccessorTable(Pg, new String[]{"Status"});
        Pi = (Descriptors.Descriptor)Pg.getNestedTypes().get(0);
        Pj = new GeneratedMessageV3.FieldAccessorTable(Pi, new String[]{"Key", "Value"});
        Pk = (Descriptors.Descriptor)nj_2.j().getMessageTypes().get(1);
        Pl = new GeneratedMessageV3.FieldAccessorTable(Pk, new String[]{"AccountId"});
        Pm = (Descriptors.Descriptor)nj_2.j().getMessageTypes().get(2);
        Pn = new GeneratedMessageV3.FieldAccessorTable(Pm, new String[]{"AccountId"});
    }
}

