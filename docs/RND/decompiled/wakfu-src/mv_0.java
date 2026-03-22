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
 * Renamed from mV
 */
public final class mv_0 {
    static final Descriptors.Descriptor MG;
    static final GeneratedMessageV3.FieldAccessorTable MH;
    static final Descriptors.Descriptor MI;
    static final GeneratedMessageV3.FieldAccessorTable MJ;
    private static Descriptors.FileDescriptor M;

    private mv_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mv_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0011market_sale.proto\u001a\nitem.proto\u001a\u0012market_entry.proto\"f\n\u001bProtoMarketSaleSearchResult\u0012$\n\npagination\u0018\u0001 \u0002(\u000b2\u0010.ProtoPagination\u0012!\n\u0007entries\u0018\u0002 \u0003(\u000b2\u0010.ProtoMarketSale\"|\n\u000fProtoMarketSale\u0012\u0010\n\bsale_uid\u0018\u0001 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0002 \u0002(\u000b2\n.ProtoItem\u0012\u0010\n\bquantity\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nunit_price\u0018\u0005 \u0002(\u0003\u0012\u0011\n\tsell_time\u0018\u0006 \u0002(\u0003J\u0004\b\u0004\u0010\u0005B;\n%com.ankama.wakfu.protocol.item.marketB\u0012ProtobufMarketSale"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j(), mb_0.j()});
        MG = (Descriptors.Descriptor)mv_0.j().getMessageTypes().get(0);
        MH = new GeneratedMessageV3.FieldAccessorTable(MG, new String[]{"Pagination", "Entries"});
        MI = (Descriptors.Descriptor)mv_0.j().getMessageTypes().get(1);
        MJ = new GeneratedMessageV3.FieldAccessorTable(MI, new String[]{"SaleUid", "Item", "Quantity", "UnitPrice", "SellTime"});
        kF.j();
        mb_0.j();
    }
}

