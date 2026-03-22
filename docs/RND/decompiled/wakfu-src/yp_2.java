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
 * Renamed from yP
 */
public final class yp_2 {
    static final Descriptors.Descriptor amB;
    static final GeneratedMessageV3.FieldAccessorTable amC;
    static final Descriptors.Descriptor amD;
    static final GeneratedMessageV3.FieldAccessorTable amE;
    static final Descriptors.Descriptor amF;
    static final GeneratedMessageV3.FieldAccessorTable amG;
    static final Descriptors.Descriptor amH;
    static final GeneratedMessageV3.FieldAccessorTable amI;
    private static Descriptors.FileDescriptor M;

    private yp_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        yp_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0019resources/resources.proto\"Q\n\u0016ProtoResourcePartition\u0012\t\n\u0001x\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0002 \u0002(\u0005\u0012!\n\tresources\u0018\u0003 \u0003(\u000b2\u000e.ProtoResource\"\u008d\u0001\n\rProtoResource\u0012\r\n\u0005refId\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001x\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0003 \u0002(\u0005\u0012\t\n\u0001z\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004step\u0018\u0005 \u0002(\u0005\u0012\u0013\n\u000bautoRespawn\u0018\u0006 \u0002(\b\u0012\u0014\n\fownerAccount\u0018\u0007 \u0001(\u0003\u0012\u0013\n\u000bownerNation\u0018\b \u0001(\u0005\"D\n\u001aActorCollectRequestMessage\u0012\u0010\n\bactionId\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001x\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0003 \u0002(\u0005\"H\n!ActorCollectMonsterRequestMessage\u0012\u0010\n\bactionId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tmonsterId\u0018\u0002 \u0002(\u0003B8\n#com.ankama.wakfu.protocol.resourcesB\u0011ProtobufResources"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        amB = (Descriptors.Descriptor)yp_2.j().getMessageTypes().get(0);
        amC = new GeneratedMessageV3.FieldAccessorTable(amB, new String[]{"X", "Y", "Resources"});
        amD = (Descriptors.Descriptor)yp_2.j().getMessageTypes().get(1);
        amE = new GeneratedMessageV3.FieldAccessorTable(amD, new String[]{"RefId", "X", "Y", "Z", "Step", "AutoRespawn", "OwnerAccount", "OwnerNation"});
        amF = (Descriptors.Descriptor)yp_2.j().getMessageTypes().get(2);
        amG = new GeneratedMessageV3.FieldAccessorTable(amF, new String[]{"ActionId", "X", "Y"});
        amH = (Descriptors.Descriptor)yp_2.j().getMessageTypes().get(3);
        amI = new GeneratedMessageV3.FieldAccessorTable(amH, new String[]{"ActionId", "MonsterId"});
    }
}

