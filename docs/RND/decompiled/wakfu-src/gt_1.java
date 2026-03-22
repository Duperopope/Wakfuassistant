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
 * Renamed from gt
 */
@Deprecated
public final class gt_1 {
    static final Descriptors.Descriptor sd;
    static final GeneratedMessageV3.FieldAccessorTable se;
    static final Descriptors.Descriptor sf;
    static final GeneratedMessageV3.FieldAccessorTable sg;
    private static Descriptors.FileDescriptor M;

    private gt_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gt_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n#dimensionalBag/dimensionalBag.proto\"\u0089\u0001\n\u001bProtoDimensionalBagCraftFee\u00124\n\u000bcategoryFee\u0018\u0001 \u0003(\u000b2\u001f.ProtoDimensionalBagCategoryFee\u0012\u0018\n\u0010isFreeForFriends\u0018\u0002 \u0002(\b\u0012\u0016\n\u000eisFreeForGuild\u0018\u0003 \u0002(\b:\u0002\u0018\u0001\"q\n\u001eProtoDimensionalBagCategoryFee\u0012\u0015\n\rcategoryIndex\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011equipmentCraftFee\u0018\u0002 \u0002(\u0005\u0012\u0019\n\u0011componentCraftFee\u0018\u0003 \u0002(\u0005:\u0002\u0018\u0001BE\n(com.ankama.wakfu.protocol.dimensionalBagB\u0016ProtobufDimensionalBag\u00b8\u0001\u0001"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        sd = (Descriptors.Descriptor)gt_1.j().getMessageTypes().get(0);
        se = new GeneratedMessageV3.FieldAccessorTable(sd, new String[]{"CategoryFee", "IsFreeForFriends", "IsFreeForGuild"});
        sf = (Descriptors.Descriptor)gt_1.j().getMessageTypes().get(1);
        sg = new GeneratedMessageV3.FieldAccessorTable(sf, new String[]{"CategoryIndex", "EquipmentCraftFee", "ComponentCraftFee"});
    }
}

