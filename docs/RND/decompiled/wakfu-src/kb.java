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

public final class kb {
    static final Descriptors.Descriptor Ev;
    static final GeneratedMessageV3.FieldAccessorTable Ew;
    static final Descriptors.Descriptor Ex;
    static final GeneratedMessageV3.FieldAccessorTable Ey;
    static final Descriptors.Descriptor Ez;
    static final GeneratedMessageV3.FieldAccessorTable EA;
    static final Descriptors.Descriptor EB;
    static final GeneratedMessageV3.FieldAccessorTable EC;
    static final Descriptors.Descriptor ED;
    static final GeneratedMessageV3.FieldAccessorTable EE;
    private static Descriptors.FileDescriptor M;

    private kb() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        kb.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013guild_storage.proto\u001a\nitem.proto\"S\n\u0011ProtoGuildStorage\u0012#\n\fcompartments\u0018\u0001 \u0003(\u000b2\r.Compartments\u0012\u0019\n\u0007history\u0018\u0002 \u0002(\u000b2\b.History\"^\n\fCompartments\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007enabled\u0018\u0002 \u0002(\b\u0012\u001c\n\u0005items\u0018\u0003 \u0003(\u000b2\r.ProtoBagItem\u0012\u0013\n\u000bbuildingUid\u0018\u0004 \u0001(\u0003\"\u00fd\u0001\n\u0007History\u0012*\n\u000bitemHistory\u0018\u0001 \u0003(\u000b2\u0015.History.HistoryEntry\u0012+\n\fmoneyHistory\u0018\u0002 \u0003(\u000b2\u0015.History.MoneyHistory\u001aW\n\fHistoryEntry\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\f\n\u0004date\u0018\u0002 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0003 \u0002(\u000b2\n.ProtoItem\u0012\u000b\n\u0003qty\u0018\u0004 \u0002(\u0005\u001a@\n\fMoneyHistory\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\f\n\u0004date\u0018\u0002 \u0002(\u0003\u0012\u000e\n\u0006amount\u0018\u0003 \u0002(\u0003B?\n'com.ankama.wakfu.protocol.guild.storageB\u0014ProtobufGuildStorage"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j()});
        Ev = (Descriptors.Descriptor)kb.j().getMessageTypes().get(0);
        Ew = new GeneratedMessageV3.FieldAccessorTable(Ev, new String[]{"Compartments", "History"});
        Ex = (Descriptors.Descriptor)kb.j().getMessageTypes().get(1);
        Ey = new GeneratedMessageV3.FieldAccessorTable(Ex, new String[]{"Id", "Enabled", "Items", "BuildingUid"});
        Ez = (Descriptors.Descriptor)kb.j().getMessageTypes().get(2);
        EA = new GeneratedMessageV3.FieldAccessorTable(Ez, new String[]{"ItemHistory", "MoneyHistory"});
        EB = (Descriptors.Descriptor)Ez.getNestedTypes().get(0);
        EC = new GeneratedMessageV3.FieldAccessorTable(EB, new String[]{"PlayerName", "Date", "Item", "Qty"});
        ED = (Descriptors.Descriptor)Ez.getNestedTypes().get(1);
        EE = new GeneratedMessageV3.FieldAccessorTable(ED, new String[]{"PlayerName", "Date", "Amount"});
        kF.j();
    }
}

