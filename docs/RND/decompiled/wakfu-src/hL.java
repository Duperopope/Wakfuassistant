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

public final class hL {
    static final Descriptors.Descriptor vG;
    static final GeneratedMessageV3.FieldAccessorTable vH;
    static final Descriptors.Descriptor vI;
    static final GeneratedMessageV3.FieldAccessorTable vJ;
    static final Descriptors.Descriptor vK;
    static final GeneratedMessageV3.FieldAccessorTable vL;
    static final Descriptors.Descriptor vM;
    private static final GeneratedMessageV3.FieldAccessorTable vN;
    static final Descriptors.Descriptor vO;
    static final GeneratedMessageV3.FieldAccessorTable vP;
    static final Descriptors.Descriptor vQ;
    static final GeneratedMessageV3.FieldAccessorTable vR;
    private static Descriptors.FileDescriptor M;

    private hL() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        hL.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u000fequipment.proto\u001a\nitem.proto\"\u009d\u0001\n\u0013ProtoEquipmentSheet\u00126\n\u0005items\u0018\u0001 \u0003(\u000b2'.ProtoEquipmentSheet.ProtoEquipmentItem\u0012\r\n\u0005level\u00185 \u0001(\u0005\u001a3\n\u0012ProtoEquipmentItem\u0012\u000b\n\u0003uid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005J\u0004\b3\u00104J\u0004\b4\u00105\"\u009d\u0001\n\u0011ProtoEquipmentSet\u0012.\n\u0006sheets\u0018\u0001 \u0003(\u000b2\u001e.ProtoEquipmentSet.SheetsEntry\u0012\u0013\n\u000bcharacterId\u0018\u0002 \u0001(\u0003\u001aC\n\u000bSheetsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012#\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.ProtoEquipmentSheet:\u00028\u0001\"9\n\u0015ProtoEquipmentAccount\u0012 \n\u0004sets\u0018\u0001 \u0003(\u000b2\u0012.ProtoEquipmentSet\"4\n\u0017ProtoEquipmentInventory\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.ProtoItemB8\n#com.ankama.wakfu.protocol.equipmentB\u0011ProtobufEquipment"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j()});
        vG = (Descriptors.Descriptor)hL.j().getMessageTypes().get(0);
        vH = new GeneratedMessageV3.FieldAccessorTable(vG, new String[]{"Items", "Level"});
        vI = (Descriptors.Descriptor)vG.getNestedTypes().get(0);
        vJ = new GeneratedMessageV3.FieldAccessorTable(vI, new String[]{"Uid", "Position"});
        vK = (Descriptors.Descriptor)hL.j().getMessageTypes().get(1);
        vL = new GeneratedMessageV3.FieldAccessorTable(vK, new String[]{"Sheets", "CharacterId"});
        vM = (Descriptors.Descriptor)vK.getNestedTypes().get(0);
        vN = new GeneratedMessageV3.FieldAccessorTable(vM, new String[]{"Key", "Value"});
        vO = (Descriptors.Descriptor)hL.j().getMessageTypes().get(2);
        vP = new GeneratedMessageV3.FieldAccessorTable(vO, new String[]{"Sets"});
        vQ = (Descriptors.Descriptor)hL.j().getMessageTypes().get(3);
        vR = new GeneratedMessageV3.FieldAccessorTable(vQ, new String[]{"Items"});
        kF.j();
    }
}

