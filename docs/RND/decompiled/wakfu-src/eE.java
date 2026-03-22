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

public final class eE {
    static final Descriptors.Descriptor nn;
    static final GeneratedMessageV3.FieldAccessorTable no;
    static final Descriptors.Descriptor np;
    static final GeneratedMessageV3.FieldAccessorTable nq;
    private static Descriptors.FileDescriptor M;

    private eE() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        eE.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0010buildSheet.proto\"{\n\u0012ProtoBuildSheetSet\u0012\u0018\n\u0010activeSheetIndex\u0018\u0001 \u0002(\u0005\u0012%\n\u000bbuildSheets\u0018\u0002 \u0003(\u000b2\u0010.ProtoBuildSheet\u0012\u001e\n\u0012previousSheetIndex\u0018\u0004 \u0001(\u0005:\u0002-2J\u0004\b\u0003\u0010\u0004\"|\n\u000fProtoBuildSheet\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ticonIndex\u0018\u0007 \u0002(\u0005\u0012\u0018\n\tpermanent\u0018\b \u0001(\b:\u0005falseJ\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007B:\n$com.ankama.wakfu.protocol.buildSheetB\u0012ProtobufBuildSheet"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        nn = (Descriptors.Descriptor)eE.j().getMessageTypes().get(0);
        no = new GeneratedMessageV3.FieldAccessorTable(nn, new String[]{"ActiveSheetIndex", "BuildSheets", "PreviousSheetIndex"});
        np = (Descriptors.Descriptor)eE.j().getMessageTypes().get(1);
        nq = new GeneratedMessageV3.FieldAccessorTable(np, new String[]{"Index", "Name", "Level", "IconIndex", "Permanent"});
    }
}

