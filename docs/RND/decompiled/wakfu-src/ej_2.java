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
 * Renamed from ej
 */
public final class ej_2 {
    static final Descriptors.Descriptor mz;
    static final GeneratedMessageV3.FieldAccessorTable mA;
    static final Descriptors.Descriptor mB;
    static final GeneratedMessageV3.FieldAccessorTable mC;
    static final Descriptors.Descriptor mD;
    static final GeneratedMessageV3.FieldAccessorTable mE;
    static final Descriptors.Descriptor mF;
    static final GeneratedMessageV3.FieldAccessorTable mG;
    static final Descriptors.Descriptor mH;
    static final GeneratedMessageV3.FieldAccessorTable mI;
    private static Descriptors.FileDescriptor M;

    private ej_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ej_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n%basics/worldAndDispatchProtocol.proto\"@\n\u0016WorldConnectionMessage\u0012\u000f\n\u0007version\u0018\u0001 \u0002(\f\u0012\u0015\n\rconfiguration\u0018\u0002 \u0002(\f\"3\n\u001bWorldConnectionErrorMessage\u0012\u0014\n\fuselessField\u0018\u0001 \u0002(\u0005\"=\n\u0017WorldServerGroupMessage\u0012\u000f\n\u0007groupId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tserverIds\u0018\u0002 \u0003(\u0005\"6\n\u0012WorldStatusMessage\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006locked\u0018\u0002 \u0002(\b\"8\n\u001fWorldConfigurationChangeMessage\u0012\u0015\n\rconfiguration\u0018\u0001 \u0002(\fBM\n1com.ankama.wakfu.protocol.basics.worldAndDispatchB\u0018WorldAndDispatchProtocol"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        mz = (Descriptors.Descriptor)ej_2.j().getMessageTypes().get(0);
        mA = new GeneratedMessageV3.FieldAccessorTable(mz, new String[]{"Version", "Configuration"});
        mB = (Descriptors.Descriptor)ej_2.j().getMessageTypes().get(1);
        mC = new GeneratedMessageV3.FieldAccessorTable(mB, new String[]{"UselessField"});
        mD = (Descriptors.Descriptor)ej_2.j().getMessageTypes().get(2);
        mE = new GeneratedMessageV3.FieldAccessorTable(mD, new String[]{"GroupId", "ServerIds"});
        mF = (Descriptors.Descriptor)ej_2.j().getMessageTypes().get(3);
        mG = new GeneratedMessageV3.FieldAccessorTable(mF, new String[]{"ServerId", "Locked"});
        mH = (Descriptors.Descriptor)ej_2.j().getMessageTypes().get(4);
        mI = new GeneratedMessageV3.FieldAccessorTable(mH, new String[]{"Configuration"});
    }
}

