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
 * Renamed from fl
 */
public final class fl_1 {
    static final Descriptors.Descriptor pe;
    static final GeneratedMessageV3.FieldAccessorTable pf;
    static final Descriptors.Descriptor pg;
    private static final GeneratedMessageV3.FieldAccessorTable ph;
    static final Descriptors.Descriptor pi;
    static final GeneratedMessageV3.FieldAccessorTable pj;
    static final Descriptors.Descriptor pk;
    static final GeneratedMessageV3.FieldAccessorTable pl;
    static final Descriptors.Descriptor pm;
    static final GeneratedMessageV3.FieldAccessorTable pn;
    static final Descriptors.Descriptor po;
    static final GeneratedMessageV3.FieldAccessorTable pp;
    static final Descriptors.Descriptor pq;
    static final GeneratedMessageV3.FieldAccessorTable pr;
    static final Descriptors.Descriptor ps;
    private static final GeneratedMessageV3.FieldAccessorTable pt;
    private static Descriptors.FileDescriptor M;

    private fl_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        fl_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n#accountData/cosmeticInventory.proto\"\u00be\u0001\n\u0016ProtoCosmeticInventory\u0012K\n\u0012cosmeticCategories\u0018\u0001 \u0003(\u000b2/.ProtoCosmeticInventory.CosmeticCategoriesEntry\u001aQ\n\u0017CosmeticCategoriesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012%\n\u0005value\u0018\u0002 \u0001(\u000b2\u0016.ProtoCosmeticCategory:\u00028\u0001J\u0004\b\u0002\u0010\u0003\"g\n\u0015ProtoCosmeticCategory\u0012)\n\rcosmeticItems\u0018\u0001 \u0003(\u000b2\u0012.ProtoCosmeticItem\u0012\u0017\n\u000bnewsItemIds\u0018\u0003 \u0003(\u0005B\u0002\u0010\u0001J\u0004\b\u0002\u0010\u0003J\u0004\b\u0004\u0010\u0005\";\n\u0010ProtoActiveItems\u0012'\n\u000bactiveItems\u0018\u0001 \u0003(\u000b2\u0012.ProtoCosmeticItem\"N\n\u0011ProtoCosmeticItem\u0012\u0011\n\titemRefId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\u0012\u0011\n\taccessory\u0018\u0003 \u0001(\u0005J\u0004\b\u0004\u0010\u0005\"0\n\u0012ProtoCosmeticItems\u0012\u001a\n\u0012cosmeticItemRefIds\u0018\u0001 \u0003(\u0005\"\u00c9\u0001\n ProtoCosmeticItemsWithCategories\u0012U\n\u0012cosmeticCategories\u0018\u0001 \u0003(\u000b29.ProtoCosmeticItemsWithCategories.CosmeticCategoriesEntry\u001aN\n\u0017CosmeticCategoriesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\"\n\u0005value\u0018\u0002 \u0001(\u000b2\u0013.ProtoCosmeticItems:\u00028\u0001*\u00e6\u0002\n\fCosmeticType\u0012\u000e\n\nMOUNT_SKIN\u0010\u0001\u0012\f\n\bPET_SKIN\u0010\u0002\u0012\u0012\n\u000ePLAYER_COSTUME\u0010\u0003\u0012\u0011\n\rPLAYER_SPRINT\u0010\u0004\u0012\u0013\n\u000fPLAYER_FINISHER\u0010\u0005\u0012\u000f\n\u000bPLAYER_AURA\u0010\u0006\u0012\u0010\n\fPLAYER_TITLE\u0010\u0007\u0012\u0014\n\u0010PLAYER_HEAD_SKIN\u0010\b\u0012\u0015\n\u0011PLAYER_CHEST_SKIN\u0010\t\u0012\u0018\n\u0014PLAYER_SHOULDER_SKIN\u0010\n\u0012\u0014\n\u0010PLAYER_BACK_SKIN\u0010\u000b\u0012\u0015\n\u0011PLAYER_BOOTS_SKIN\u0010\f\u0012\u001c\n\u0018PLAYER_FIRST_WEAPON_SKIN\u0010\r\u0012\u001d\n\u0019PLAYER_SECOND_WEAPON_SKIN\u0010\u000e\u0012\u0012\n\u000eHAVEN_BAG_SKIN\u0010\u000f\u0012\u0014\n\u0010PLAYER_ACCESSORY\u0010\u0010B@\n#com.ankama.wakfu.protocol.cosmeticsB\u0019ProtobufCosmeticInventory"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        pe = (Descriptors.Descriptor)fl_1.j().getMessageTypes().get(0);
        pf = new GeneratedMessageV3.FieldAccessorTable(pe, new String[]{"CosmeticCategories"});
        pg = (Descriptors.Descriptor)pe.getNestedTypes().get(0);
        ph = new GeneratedMessageV3.FieldAccessorTable(pg, new String[]{"Key", "Value"});
        pi = (Descriptors.Descriptor)fl_1.j().getMessageTypes().get(1);
        pj = new GeneratedMessageV3.FieldAccessorTable(pi, new String[]{"CosmeticItems", "NewsItemIds"});
        pk = (Descriptors.Descriptor)fl_1.j().getMessageTypes().get(2);
        pl = new GeneratedMessageV3.FieldAccessorTable(pk, new String[]{"ActiveItems"});
        pm = (Descriptors.Descriptor)fl_1.j().getMessageTypes().get(3);
        pn = new GeneratedMessageV3.FieldAccessorTable(pm, new String[]{"ItemRefId", "Color", "Accessory"});
        po = (Descriptors.Descriptor)fl_1.j().getMessageTypes().get(4);
        pp = new GeneratedMessageV3.FieldAccessorTable(po, new String[]{"CosmeticItemRefIds"});
        pq = (Descriptors.Descriptor)fl_1.j().getMessageTypes().get(5);
        pr = new GeneratedMessageV3.FieldAccessorTable(pq, new String[]{"CosmeticCategories"});
        ps = (Descriptors.Descriptor)pq.getNestedTypes().get(0);
        pt = new GeneratedMessageV3.FieldAccessorTable(ps, new String[]{"Key", "Value"});
    }
}

