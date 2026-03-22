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
 * Renamed from fO
 */
public final class fo_1 {
    static final Descriptors.Descriptor qS;
    static final GeneratedMessageV3.FieldAccessorTable qT;
    static final Descriptors.Descriptor qU;
    private static final GeneratedMessageV3.FieldAccessorTable qV;
    static final Descriptors.Descriptor qW;
    static final GeneratedMessageV3.FieldAccessorTable qX;
    static final Descriptors.Descriptor qY;
    private static final GeneratedMessageV3.FieldAccessorTable qZ;
    private static Descriptors.FileDescriptor M;

    private fo_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        fo_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n accountData/cosmeticPreset.proto\u001a#accountData/cosmeticInventory.proto\"\u00c6\u0001\n\u001dProtoCosmeticPresetsInventory\u0012%\n\u0007presets\u0018\u0001 \u0003(\u000b2\u0014.ProtoCosmeticPreset\u0012H\n\ractivePresets\u0018\u0002 \u0003(\u000b21.ProtoCosmeticPresetsInventory.ActivePresetsEntry\u001a4\n\u0012ActivePresetsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0005:\u00028\u0001\"\u0093\u0002\n\u0013ProtoCosmeticPreset\u0012\u0010\n\bpresetId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fpresetIconId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\npresetName\u0018\u0003 \u0002(\t\u0012!\n\u0019lastModificationTimeStamp\u0018\u0004 \u0002(\u0003\u0012@\n\u000eitemByPosition\u0018\u0005 \u0003(\u000b2(.ProtoCosmeticPreset.ItemByPositionEntry\u0012\u0011\n\thatHidden\u0018\u0006 \u0002(\b\u001aH\n\u0013ItemByPositionEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012 \n\u0005value\u0018\u0002 \u0001(\u000b2\u0011.ProtoActiveItems:\u00028\u0001B=\n#com.ankama.wakfu.protocol.cosmeticsB\u0016ProtobufCosmeticPreset"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{fl_1.j()});
        qS = (Descriptors.Descriptor)fo_1.j().getMessageTypes().get(0);
        qT = new GeneratedMessageV3.FieldAccessorTable(qS, new String[]{"Presets", "ActivePresets"});
        qU = (Descriptors.Descriptor)qS.getNestedTypes().get(0);
        qV = new GeneratedMessageV3.FieldAccessorTable(qU, new String[]{"Key", "Value"});
        qW = (Descriptors.Descriptor)fo_1.j().getMessageTypes().get(1);
        qX = new GeneratedMessageV3.FieldAccessorTable(qW, new String[]{"PresetId", "PresetIconId", "PresetName", "LastModificationTimeStamp", "ItemByPosition", "HatHidden"});
        qY = (Descriptors.Descriptor)qW.getNestedTypes().get(0);
        qZ = new GeneratedMessageV3.FieldAccessorTable(qY, new String[]{"Key", "Value"});
        fl_1.j();
    }
}

