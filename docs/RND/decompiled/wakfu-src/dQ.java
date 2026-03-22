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

public final class dQ {
    static final Descriptors.Descriptor lm;
    static final GeneratedMessageV3.FieldAccessorTable ln;
    private static Descriptors.FileDescriptor M;

    private dQ() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        dQ.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0010appearance.proto\"\u00e2\u0002\n\u000fProtoAppearance\u0012\u0011\n\tskinColor\u0018\u0001 \u0002(\u0005\u0012\u0011\n\thairColor\u0018\u0002 \u0002(\u0005\u0012\u0012\n\npupilColor\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rcostumeColor1\u0018\u0004 \u0002(\u0005\u0012\u0015\n\rcostumeColor2\u0018\u0005 \u0002(\u0005\u0012\u0015\n\rcostumeColor3\u0018\u0006 \u0002(\u0005\u0012\u0015\n\rcostumeColor4\u0018\u0007 \u0002(\u0005\u0012\u0015\n\rcostumeColor5\u0018\b \u0002(\u0005\u0012\u0015\n\rcostumeColor6\u0018\t \u0002(\u0005\u0012\u0012\n\nclothIndex\u0018\n \u0002(\u0005\u0012\u0011\n\tfaceIndex\u0018\u000b \u0002(\u0005\u0012\u000b\n\u0003sex\u0018\f \u0002(\u0005\u0012\u0018\n\fcurrentTitle\u0018\r \u0001(\u0005B\u0002\u0018\u0001\u0012\u0011\n\theadRefId\u0018\u000e \u0001(\u0005\u0012\u0016\n\u000eshouldersRefId\u0018\u000f \u0001(\u0005\u0012\u0012\n\nchestRefId\u0018\u0010 \u0001(\u0005B:\n$com.ankama.wakfu.protocol.appearanceB\u0012ProtobufAppearance"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        lm = (Descriptors.Descriptor)dQ.j().getMessageTypes().get(0);
        ln = new GeneratedMessageV3.FieldAccessorTable(lm, new String[]{"SkinColor", "HairColor", "PupilColor", "CostumeColor1", "CostumeColor2", "CostumeColor3", "CostumeColor4", "CostumeColor5", "CostumeColor6", "ClothIndex", "FaceIndex", "Sex", "CurrentTitle", "HeadRefId", "ShouldersRefId", "ChestRefId"});
    }
}

