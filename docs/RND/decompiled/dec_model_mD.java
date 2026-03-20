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

public final class mD {
    static final Descriptors.Descriptor Lw;
    static final GeneratedMessageV3.FieldAccessorTable Lx;
    static final Descriptors.Descriptor Ly;
    static final GeneratedMessageV3.FieldAccessorTable Lz;
    private static Descriptors.FileDescriptor M;

    private mD() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mD.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0012market_offer.proto\u001a\nitem.proto\u001a\u0012market_entry.proto\"\u0083\u0001\n\u001cProtoMarketOfferSearchResult\u0012$\n\npagination\u0018\u0001 \u0002(\u000b2\u0010.ProtoPagination\u0012!\n\u0006offers\u0018\u0002 \u0003(\u000b2\u0011.ProtoMarketOffer\u0012\u001a\n\u0012market_server_time\u0018\u0003 \u0002(\u0003\"\u0095\u0003\n\u0010ProtoMarketOffer\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\u0003\u0012\u0013\n\u000bitem_ref_id\u0018\u0002 \u0002(\u0005\u0012\u001c\n\u0014purchaser_account_id\u0018\u0003 \u0002(\u0003\u0012\u0016\n\u000epurchaser_name\u0018\u0004 \u0002(\t\u0012&\n\u001epurchaser_serialized_languages\u0018\u0005 \u0001(\u0005\u0012*\n\u001epurchaser_account_community_id\u0018\u0006 \u0001(\u0005:\u0002-1\u0012\u0012\n\nunit_price\u0018\u0007 \u0002(\u0003\u0012\u0010\n\bquantity\u0018\b \u0002(\u0005\u0012\u0018\n\u0010sell_duration_id\u0018\t \u0002(\u0005\u0012\u0017\n\u000fexpiration_date\u0018\n \u0001(\u0003\u0012\u0012\n\nitem_level\u0018\u000b \u0001(\u0005\u0012\u0016\n\u000eslot_color_ids\u0018\f \u0003(\u0005\u0012\u0018\n\u0010slot_fixed_order\u0018\r \u0001(\b\u0012\u0016\n\u000esublimation_id\u0018\u000e \u0001(\u0005\u0012\u001e\n\u0016special_sublimation_id\u0018\u000f \u0001(\u0005B<\n%com.ankama.wakfu.protocol.item.marketB\u0013ProtobufMarketOffer"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j(), mb.j()});
        Lw = (Descriptors.Descriptor)mD.j().getMessageTypes().get(0);
        Lx = new GeneratedMessageV3.FieldAccessorTable(Lw, new String[]{"Pagination", "Offers", "MarketServerTime"});
        Ly = (Descriptors.Descriptor)mD.j().getMessageTypes().get(1);
        Lz = new GeneratedMessageV3.FieldAccessorTable(Ly, new String[]{"Uid", "ItemRefId", "PurchaserAccountId", "PurchaserName", "PurchaserSerializedLanguages", "PurchaserAccountCommunityId", "UnitPrice", "Quantity", "SellDurationId", "ExpirationDate", "ItemLevel", "SlotColorIds", "SlotFixedOrder", "SublimationId", "SpecialSublimationId"});
        kF.j();
        mb.j();
    }
}
