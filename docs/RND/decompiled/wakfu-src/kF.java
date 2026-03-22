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

public final class kF {
    static final Descriptors.Descriptor FO;
    static final GeneratedMessageV3.FieldAccessorTable FP;
    static final Descriptors.Descriptor FQ;
    static final GeneratedMessageV3.FieldAccessorTable FR;
    static final Descriptors.Descriptor FS;
    static final GeneratedMessageV3.FieldAccessorTable FT;
    static final Descriptors.Descriptor FU;
    static final GeneratedMessageV3.FieldAccessorTable FV;
    static final Descriptors.Descriptor FW;
    static final GeneratedMessageV3.FieldAccessorTable FX;
    static final Descriptors.Descriptor FY;
    static final GeneratedMessageV3.FieldAccessorTable FZ;
    static final Descriptors.Descriptor Ga;
    static final GeneratedMessageV3.FieldAccessorTable Gb;
    static final Descriptors.Descriptor Gc;
    static final GeneratedMessageV3.FieldAccessorTable Gd;
    static final Descriptors.Descriptor Ge;
    static final GeneratedMessageV3.FieldAccessorTable Gf;
    static final Descriptors.Descriptor Gg;
    static final GeneratedMessageV3.FieldAccessorTable Gh;
    static final Descriptors.Descriptor Gi;
    static final GeneratedMessageV3.FieldAccessorTable Gj;
    static final Descriptors.Descriptor Gk;
    static final GeneratedMessageV3.FieldAccessorTable Gl;
    static final Descriptors.Descriptor Gm;
    static final GeneratedMessageV3.FieldAccessorTable Gn;
    static final Descriptors.Descriptor Go;
    static final GeneratedMessageV3.FieldAccessorTable Gp;
    static final Descriptors.Descriptor Gq;
    static final GeneratedMessageV3.FieldAccessorTable Gr;
    static final Descriptors.Descriptor Gs;
    static final GeneratedMessageV3.FieldAccessorTable Gt;
    private static Descriptors.FileDescriptor M;

    private kF() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        kF.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\nitem.proto\"\u00c2\u0002\n\tProtoItem\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005refId\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003qty\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u0003pet\u00182 \u0001(\u000b2\t.ProtoPet\u0012\u0018\n\u0002xp\u00183 \u0001(\u000b2\f.ProtoItemXp\u0012\u001a\n\u0005shard\u00184 \u0001(\u000b2\u000b.ProtoShard\u0012*\n\rcompanionInfo\u00186 \u0001(\u000b2\u0013.ProtoCompanionInfo\u0012\u001c\n\u0004bind\u00187 \u0001(\u000b2\u000e.ProtoItemBind\u0012$\n\belements\u00188 \u0001(\u000b2\u0012.ProtoItemElements\u0012&\n\u000bmergedItems\u00189 \u0001(\u000b2\u0011.ProtoMergedItems\u0012\u001b\n\u0013mimiSymbicSkinRefId\u0018: \u0001(\u0005J\u0004\b5\u00106\"\u00d6\u0001\n\bProtoPet\u0012\u0014\n\fdefinitionId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0016\n\u000ecolorItemRefId\u0018\u0003 \u0002(\u0005\u0012\u0019\n\u0011equippedRefItemId\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006health\u0018\u0005 \u0002(\u0005\u0012\n\n\u0002xp\u0018\u0006 \u0002(\u0005\u0012\u0014\n\flastMealDate\u0018\u0007 \u0002(\u0003\u0012\u0016\n\u000elastHungryDate\u0018\b \u0002(\u0003\u0012\u0016\n\u000esleepRefItemId\u0018\t \u0002(\u0005\u0012\u0011\n\tsleepdate\u0018\n \u0002(\u0003\"3\n\u000bProtoItemXp\u0012\u0014\n\fdefinitionId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemXp\u0018\u0002 \u0002(\u0003\"\u00fd\u0002\n\nProtoShard\u0012.\n\nshardSlots\u0018\u0001 \u0003(\u000b2\u001a.ProtoShard.ProtoShardSlot\u00127\n\u000eadditionalGems\u0018\u0002 \u0003(\u000b2\u001f.ProtoShard.ProtoAdditionalGems\u0012\u0019\n\u0011sublimationItemId\u0018\u0003 \u0001(\u0005\u0012 \n\u0018specialSublimationItemId\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u0007charges\u0018\t \u0001(\u0005:\u0002-1\u001ab\n\u000eProtoShardSlot\u0012\u0010\n\bposition\u0018\n \u0002(\u0005\u0012\u0015\n\rslottedItemId\u0018\u000b \u0002(\u0005\u0012\u0011\n\tslotColor\u0018\f \u0001(\u0005\u0012\u0014\n\fshardsAmount\u0018\u000e \u0001(\u0005\u001a8\n\u0013ProtoAdditionalGems\u0012\u0012\n\npropertyId\u0018\u0014 \u0002(\u0005\u0012\r\n\u0005refId\u0018\u0015 \u0002(\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007J\u0004\b\u0007\u0010\bJ\u0004\b\b\u0010\t\" \n\u0012ProtoCompanionInfo\u0012\n\n\u0002xp\u0018\u0001 \u0002(\u0003\".\n\rProtoItemBind\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007applied\u0018\u0002 \u0002(\b\"G\n\u0011ProtoItemElements\u0012\u0016\n\u000edamageElements\u0018\u0001 \u0002(\u0005\u0012\u001a\n\u0012resistanceElements\u0018\u0002 \u0002(\u0005\"-\n\u0010ProtoMergedItems\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.ProtoItem\":\n\fProtoBagItem\u0012\u0018\n\u0004item\u0018\u0001 \u0002(\u000b2\n.ProtoItem\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005\"\u0099\u0001\n\bProtoBag\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005refId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007maxSize\u0018\u0005 \u0002(\u0005\u0012\u001c\n\u0005items\u0018\u0006 \u0003(\u000b2\r.ProtoBagItem\u0012\u0016\n\u000elockedItemUids\u0018\u0007 \u0003(\u0003\u0012\u0013\n\bbindType\u0018\b \u0001(\u0005:\u00010\"-\n\u0012ProtoCharacterBags\u0012\u0017\n\u0004bags\u0018\u0001 \u0003(\u000b2\t.ProtoBag\"4\n\u0017ProtoTemporaryInventory\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.ProtoItem\"C\n\u0015ProtoItemWithPosition\u0012\u0018\n\u0004item\u0018\u0001 \u0002(\u000b2\n.ProtoItem\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005\"B\n\u0019ProtoItemWithPositionList\u0012%\n\u0005items\u0018\u0001 \u0003(\u000b2\u0016.ProtoItemWithPositionB.\n\u001ecom.ankama.wakfu.protocol.itemB\fProtobufItem"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        FO = (Descriptors.Descriptor)kF.j().getMessageTypes().get(0);
        FP = new GeneratedMessageV3.FieldAccessorTable(FO, new String[]{"UniqueId", "RefId", "Qty", "Pet", "Xp", "Shard", "CompanionInfo", "Bind", "Elements", "MergedItems", "MimiSymbicSkinRefId"});
        FQ = (Descriptors.Descriptor)kF.j().getMessageTypes().get(1);
        FR = new GeneratedMessageV3.FieldAccessorTable(FQ, new String[]{"DefinitionId", "Name", "ColorItemRefId", "EquippedRefItemId", "Health", "Xp", "LastMealDate", "LastHungryDate", "SleepRefItemId", "Sleepdate"});
        FS = (Descriptors.Descriptor)kF.j().getMessageTypes().get(2);
        FT = new GeneratedMessageV3.FieldAccessorTable(FS, new String[]{"DefinitionId", "ItemXp"});
        FU = (Descriptors.Descriptor)kF.j().getMessageTypes().get(3);
        FV = new GeneratedMessageV3.FieldAccessorTable(FU, new String[]{"ShardSlots", "AdditionalGems", "SublimationItemId", "SpecialSublimationItemId", "Charges"});
        FW = (Descriptors.Descriptor)FU.getNestedTypes().get(0);
        FX = new GeneratedMessageV3.FieldAccessorTable(FW, new String[]{"Position", "SlottedItemId", "SlotColor", "ShardsAmount"});
        FY = (Descriptors.Descriptor)FU.getNestedTypes().get(1);
        FZ = new GeneratedMessageV3.FieldAccessorTable(FY, new String[]{"PropertyId", "RefId"});
        Ga = (Descriptors.Descriptor)kF.j().getMessageTypes().get(4);
        Gb = new GeneratedMessageV3.FieldAccessorTable(Ga, new String[]{"Xp"});
        Gc = (Descriptors.Descriptor)kF.j().getMessageTypes().get(5);
        Gd = new GeneratedMessageV3.FieldAccessorTable(Gc, new String[]{"Type", "Applied"});
        Ge = (Descriptors.Descriptor)kF.j().getMessageTypes().get(6);
        Gf = new GeneratedMessageV3.FieldAccessorTable(Ge, new String[]{"DamageElements", "ResistanceElements"});
        Gg = (Descriptors.Descriptor)kF.j().getMessageTypes().get(7);
        Gh = new GeneratedMessageV3.FieldAccessorTable(Gg, new String[]{"Items"});
        Gi = (Descriptors.Descriptor)kF.j().getMessageTypes().get(8);
        Gj = new GeneratedMessageV3.FieldAccessorTable(Gi, new String[]{"Item", "Position"});
        Gk = (Descriptors.Descriptor)kF.j().getMessageTypes().get(9);
        Gl = new GeneratedMessageV3.FieldAccessorTable(Gk, new String[]{"UniqueId", "RefId", "Position", "MaxSize", "Items", "LockedItemUids", "BindType"});
        Gm = (Descriptors.Descriptor)kF.j().getMessageTypes().get(10);
        Gn = new GeneratedMessageV3.FieldAccessorTable(Gm, new String[]{"Bags"});
        Go = (Descriptors.Descriptor)kF.j().getMessageTypes().get(11);
        Gp = new GeneratedMessageV3.FieldAccessorTable(Go, new String[]{"Items"});
        Gq = (Descriptors.Descriptor)kF.j().getMessageTypes().get(12);
        Gr = new GeneratedMessageV3.FieldAccessorTable(Gq, new String[]{"Item", "Position"});
        Gs = (Descriptors.Descriptor)kF.j().getMessageTypes().get(13);
        Gt = new GeneratedMessageV3.FieldAccessorTable(Gs, new String[]{"Items"});
    }
}

